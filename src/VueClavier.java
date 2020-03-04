import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.image.ImageProducer;
import java.util.ArrayList;

public class VueClavier extends Panel{	

	Button lb[];
	
	public VueClavier() {
		super();
		this.setVisible(true);
		this.setBackground(Color.MAGENTA);
		
		lb = new Button[Modele.COULEURS.length];
		
		for(int i=0;i<Modele.COULEURS.length;i++) {
			lb[i]= new Button();
			lb[i].setBackground(Modele.COULEURS[i]);
			lb[i].setPreferredSize(new Dimension(40,40));
			this.add(lb[i]);
			
		}
			
		
		
		
	}
	
}
