package tritechgemini.swing;

import PamView.GeneralProjector;
import PamView.symbol.PamSymbolChooser;
import PamView.symbol.PamSymbolManager;
import PamguardMVC.PamDataBlock;
import tritechgemini.GeminiControl;
import tritechgemini.tritech.ECDDataBlock;

public class ECDSymbolManager extends PamSymbolManager {

	private GeminiControl geminiControl;
	private ECDDataBlock ecdDataBlock;

	public ECDSymbolManager(GeminiControl geminiControl, ECDDataBlock ecdDataBlock) {
		super(ecdDataBlock);
		this.geminiControl = geminiControl;
		this.ecdDataBlock = ecdDataBlock;
	}

	@Override
	protected PamSymbolChooser createSymbolChooser(String displayName, GeneralProjector projector) {
		return new ECDSymbolChooser(this, ecdDataBlock, displayName, projector);
	}

}
