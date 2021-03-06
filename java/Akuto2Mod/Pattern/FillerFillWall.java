package Akuto2Mod.Pattern;

import Akuto2Mod.TileEntity.TileFillerEX;
import net.minecraft.item.ItemStack;

public class FillerFillWall extends FillerPatternCore{
	public FillerFillWall() {
		super(8);
	}

	@Override
	public boolean iteratePattern(TileFillerEX fillerEX, ItemStack stack) {
		if(fillerEX.now == 0 && fill(fillerEX.sx, fillerEX.sy, fillerEX.sz, fillerEX.sx, fillerEX.ey, fillerEX.ez, fillerEX, stack)) {
			modeChange(fillerEX, fillerEX.sx, fillerEX.sy, fillerEX.sz);
		}
		if(fillerEX.now == 1 && fill(fillerEX.sx, fillerEX.sy, fillerEX.sz, fillerEX.ex, fillerEX.ey, fillerEX.sz, fillerEX, stack)) {
			modeChange(fillerEX, fillerEX.ex, fillerEX.sy, fillerEX.sz);
		}
		if(fillerEX.now == 2 && fill(fillerEX.ex, fillerEX.sy, fillerEX.sz, fillerEX.ex, fillerEX.ey, fillerEX.ez, fillerEX, stack)) {
			modeChange(fillerEX, fillerEX.sx, fillerEX.sy, fillerEX.ez);
		}
		if(fillerEX.now == 3 && fill(fillerEX.sx, fillerEX.sy, fillerEX.ez, fillerEX.ex, fillerEX.ey, fillerEX.ez, fillerEX, stack)) {
			return true;
		}
		return false;
	}

	@Override
	public void initialize(TileFillerEX fillerEX) {
		super.initialize(fillerEX);
		fillerEX.setPower(16, 512);
	}

	protected void modeChange(TileFillerEX fillerEX, int x, int y, int z) {
		fillerEX.cx = x;
		fillerEX.cy = y;
		fillerEX.cz = z;
		fillerEX.now++;
	}
}
