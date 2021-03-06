package Akuto2Mod.Pattern;

import Akuto2Mod.TileEntity.TileFillerEX;
import net.minecraft.item.ItemStack;

public class FillerRemover extends FillerPatternCore{

	public FillerRemover() {
		super(2);
	}

	@Override
	public boolean iteratePattern(TileFillerEX fillerEX, ItemStack stack) {
		return emptyDU(fillerEX, stack);
	}

	@Override
	public void initialize(TileFillerEX fillerEX) {
		fillerEX.initRotationPosition();
		fillerEX.setPower(32, 2);
	}
}
