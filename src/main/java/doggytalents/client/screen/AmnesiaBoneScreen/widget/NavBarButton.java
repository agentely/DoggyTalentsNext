package doggytalents.client.screen.AmnesiaBoneScreen.widget;

import com.mojang.blaze3d.vertex.PoseStack;

import doggytalents.client.screen.AmnesiaBoneScreen.store.slice.ActiveTabSlice;
import doggytalents.client.screen.AmnesiaBoneScreen.store.slice.ActiveTabSlice.Tab;
import doggytalents.client.screen.framework.Store;
import doggytalents.client.screen.framework.widget.TextOnlyButton;
import doggytalents.common.entity.Dog;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.components.AbstractButton;
import net.minecraft.client.gui.narration.NarrationElementOutput;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import doggytalents.common.forward_imitate.ComponentUtil;

public class NavBarButton extends TextOnlyButton {
    protected final Tab tab;
    private Screen screen;
    private Dog dog;

    public NavBarButton(int x, int y, Component text, Tab tab,
            Font font, Screen screen, Dog dog) {
        super(x, y, font.width(text), font.lineHeight, text, $ -> {}, font);
        this.tab = tab;
        this.screen = screen;
        this.dog = dog;
    }

    public void onPress() {
        Store.get(screen)
        //dispatch all to notify all slice of changetab so they can do setup before
        //appearing in the tab.
        .dispatchAll(
            ActiveTabSlice.UIActionCreator(dog, tab)
        );
    }

    @Override
    public void updateNarration(NarrationElementOutput p_169152_) {
        return; // TODO
    }
}
