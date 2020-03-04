import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Button;

public class VuePropositions extends Canvas {
	Button lb[];
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VuePropositions() {
		super();
		this.setSize(50*Modele.DIFFICULTE,50*Modele.N_TENTATIVES);
		this.setVisible(true);
		this.setBackground(Color.WHITE);
		
		
	}


}


