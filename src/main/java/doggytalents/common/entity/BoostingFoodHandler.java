package doggytalents.common.entity;

import javax.annotation.Nullable;

import doggytalents.DoggyItems;
import doggytalents.DoggyTags;
import doggytalents.api.inferface.AbstractDog;
import doggytalents.api.inferface.IDogFoodHandler;
import doggytalents.common.network.packet.ParticlePackets;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;

public class BoostingFoodHandler implements IDogFoodHandler  {

    @Override
    public boolean isFood(ItemStack stackIn) {
        return stackIn.is(DoggyTags.DOG_BOOSTING_FOOD);
    }

    @Override
    public boolean canConsume(AbstractDog dogIn, ItemStack stackIn, @Nullable Entity entityIn) {
        return this.isFood(stackIn);
    }

    @Override
    public InteractionResult consume(AbstractDog dog, ItemStack stack, @Nullable Entity entityIn) {
        if (!dog.level().isClientSide) {
            
            var item = stack.getItem();

            var props = item.getFoodProperties();
            
            if (props == null) return InteractionResult.FAIL;

            int heal = props.getNutrition() * 5;

            dog.addHunger(heal);
            dog.consumeItemFromStack(entityIn, stack);

            for(var pair : props.getEffects()) {
                if (pair.getFirst() != null && dog.getRandom().nextFloat() < pair.getSecond()) {
                   dog.addEffect(new MobEffectInstance(pair.getFirst()));
                }
             }

            if (dog.level() instanceof ServerLevel) {
                ParticlePackets.DogEatingParticlePacket.sendDogEatingParticlePacketToNearby(
                    dog, new ItemStack(item));
            }
            dog.playSound(
                SoundEvents.GENERIC_EAT, 
                dog.getSoundVolume(), 
                (dog.getRandom().nextFloat() - dog.getRandom().nextFloat()) * 0.2F + 1.0F
            );
        }

        return InteractionResult.SUCCESS;
    }
    
}
