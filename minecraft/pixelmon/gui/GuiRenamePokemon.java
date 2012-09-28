package pixelmon.gui;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.common.network.PacketDispatcher;

import pixelmon.comm.EnumPackets;
import pixelmon.comm.PacketCreator;
import pixelmon.comm.PixelmonDataPacket;
import pixelmon.entities.pixelmon.EntityPixelmon;

import net.minecraft.client.Minecraft;
import net.minecraft.src.*;

public class GuiRenamePokemon extends GuiScreen {

	private GuiScreen parentGuiScreen;
	private GuiTextField theGuiTextField;
	private PixelmonDataPacket targetPacket;

	public GuiRenamePokemon(PixelmonDataPacket targetPacket, GuiScreenPokeChecker parent) {
		this.targetPacket = targetPacket;
		parentGuiScreen = parent;
	}

	@SuppressWarnings("unchecked")
	public void initGui() {
		super.initGui();
		StringTranslate stringtranslate = StringTranslate.getInstance();
		Keyboard.enableRepeatEvents(true);
		controlList.clear();
		controlList.add(new GuiButton(0, width / 2 - 100, height / 4 + 96 + 12, stringtranslate.translateKey("selectWorld.renameButton")));
		controlList.add(new GuiButton(1, width / 2 - 100, height / 4 + 120 + 12, stringtranslate.translateKey("gui.cancel")));
		theGuiTextField = new GuiTextField(fontRenderer, width / 2 - 100, 60, 200, 20);
		theGuiTextField.setFocused(true);
		theGuiTextField.setText(targetPacket.nickname);
	}

	public void updateScreen() {
		theGuiTextField.updateCursorCounter();
	}

	public void onGuiClosed() {
		Keyboard.enableRepeatEvents(false);
	}

	protected void actionPerformed(GuiButton par1GuiButton) {
		if (!par1GuiButton.enabled) {
			return;
		}

		switch (par1GuiButton.id) {
		case 1:
			mc.displayGuiScreen(parentGuiScreen);
		case 0:
				PacketDispatcher.sendPacketToServer(PacketCreator.createStringPacket(EnumPackets.RenamePokemon, targetPacket.pokemonID, theGuiTextField.getText()));
				targetPacket.nickname = theGuiTextField.getText();
			parentGuiScreen.initGui();
			mc.displayGuiScreen(parentGuiScreen);
		}
	}

	protected void keyTyped(char par1, int par2) {
		theGuiTextField.textboxKeyTyped(par1, par2);
		((GuiButton) controlList.get(0)).enabled = theGuiTextField.getText().trim().length() > 0;

		if (par1 == '\r') {
			actionPerformed((GuiButton) controlList.get(0));
		}
	}

	protected void mouseClicked(int par1, int par2, int par3) {
		super.mouseClicked(par1, par2, par3);
		theGuiTextField.mouseClicked(par1, par2, par3);
	}

	public void drawScreen(int par1, int par2, float par3) {
		StringTranslate stringtranslate = StringTranslate.getInstance();
		drawDefaultBackground();
		drawCenteredString(fontRenderer, stringtranslate.translateKey("Rename Pokemon"), width / 2, (height / 4 - 60) + 20, 0xffffff);
		drawString(fontRenderer, stringtranslate.translateKey("Nickname"), width / 2 - 100, 47, 0xa0a0a0);
		theGuiTextField.drawTextBox();
		super.drawScreen(par1, par2, par3);
	}
}