package doggytalents.common.talent;

import java.util.Map;

import doggytalents.api.inferface.AbstractDog;
import doggytalents.api.registry.Talent;
import doggytalents.api.registry.TalentInstance;
import doggytalents.common.Screens;
import doggytalents.common.entity.Dog;
import doggytalents.common.inventory.DogArmorItemHandler;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.MendingEnchantment;
import net.minecraft.world.level.Level;

/**
 * @author DashieDev
 */
public class DoggyArmorTalent extends TalentInstance {

    private static final EquipmentSlot[] SLOT_IDS = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};

    protected DogArmorItemHandler armors;

    protected int tickUntilXPSearch;

    protected final int SEARCH_RADIUS = 2; //TODO

    protected int spareValue;

    public DoggyArmorTalent(Talent talentIn, int levelIn) {
        super(talentIn, levelIn);
        armors = new DogArmorItemHandler();
    }

    @Override
    public boolean hasRenderer() {
        return true;
    }

    @Override
    public void init(AbstractDog dogIn) {
        if (dogIn.level().isClientSide) return;
        for (int i = 0; i < this.armors.getSlots(); ++i) {
            var stack = this.armors.getStackInSlot(i);
            var slot = Dog.getEquipmentSlotForItem(stack);
            dogIn.setItemSlot(slot, stack);
        }
    }

    @Override
    public void set(AbstractDog dog, int levelBefore) {
        if (dog.level().isClientSide) return;
        if (levelBefore > 0 && this.level() <= 0) {
            this.dropArmor(dog);
        }
    }

    @Override
    public void onRead(AbstractDog dogIn, CompoundTag compound) {
        
        this.armors.deserializeNBT(compound);
        this.spareValue = compound.getInt("armors_spareXp");

        for (int i = 0; i < this.armors.getSlots(); ++i) {
            var stack = this.armors.getStackInSlot(i);
            var slot = Dog.getEquipmentSlotForItem(stack);
            dogIn.setItemSlot(slot, stack);
        }
    }

    @Override
    public void onWrite(AbstractDog dogIn, CompoundTag compound) {
        compound.merge(this.armors.serializeNBT());
        compound.putInt("armors_spareXp", level);
    }

    @Override
    public void remove(AbstractDog dogIn) {
        if (dogIn.level().isClientSide) return;
        for (var slot : SLOT_IDS) {
            dogIn.setItemSlot(slot, ItemStack.EMPTY);
        }
    }

    private void dropArmor(AbstractDog dogIn) {
        
        for (int i = 0; i < this.armors.getSlots(); ++i) {
            Containers.dropItemStack(dogIn.level(), dogIn.getX(), dogIn.getY(), dogIn.getZ(), 
                this.armors.getStackInSlot(i));
            this.armors.setStackInSlot(i, ItemStack.EMPTY);
        }
    }   

    public DogArmorItemHandler getArmors() {
        return this.armors;
    }

    @Override
    public InteractionResult processInteract(AbstractDog dogIn, Level worldIn, Player playerIn,
            InteractionHand handIn) {
        if (playerIn.getMainHandItem().getItem() instanceof ArmorItem) {
            if (!(dogIn instanceof Dog)) return InteractionResult.PASS;
            if (!worldIn.isClientSide) {
                var owner = dogIn.getOwner();
                if (owner instanceof ServerPlayer sOwner) {
                    Screens.openArmorScreen(sOwner, (Dog) dogIn);
                }
            }
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }

    @Override
    public void tick(AbstractDog dog) {

        if (!dog.level().isClientSide) {
            validateAndSync(dog);
        }
            

        if (this.level() >= 3) {
            this.scanForXpAndRepair(dog);
        }
    }
    
    private void validateAndSync(AbstractDog dog) {
        for (var slot : SLOT_IDS) {
            var pStack = dog.getItemBySlot(slot);
            var insStack = this.armors.getArmorWithSlot(slot);
            if (pStack != insStack) {
                dog.setItemSlot(slot, insStack);
            }
        }
    }

    private void scanForXpAndRepair(AbstractDog dog) {
        if (dog.level().isClientSide) return;
        if (--this.tickUntilXPSearch <= 0) {
            this.tickUntilXPSearch = 10;

            var entry = EnchantmentHelper.getRandomItemWith(
                Enchantments.MENDING, dog, ItemStack::isDamaged
            );

            if (entry == null) return;

            var itemstack = entry.getValue();

            if (spareValue > 0) {
                
                int i = Math.min((int) (spareValue * itemstack.getXpRepairRatio()), itemstack.getDamageValue());
                itemstack.setDamageValue(itemstack.getDamageValue() - i);

                spareValue -= i / itemstack.getXpRepairRatio();
            }

            if (!itemstack.isDamaged()) return;
            

            var orbs = dog.level().getEntitiesOfClass(
                ExperienceOrb.class, 
                dog.getBoundingBox().inflate(SEARCH_RADIUS)
            );

            //TODO : In the future check if XP Collector Talent is present and ONLY get xp from there
            for (var x : orbs) {
                if (itemstack.getDamageValue() <= 0) break;
                
                int j = Math.min((int) (x.getValue() * itemstack.getXpRepairRatio()), itemstack.getDamageValue());
                itemstack.setDamageValue(itemstack.getDamageValue() - j);
                dog.take(x, 1);
                this.spareValue += j / itemstack.getXpRepairRatio();
                x.discard();
            }
                
        }
    }

}
