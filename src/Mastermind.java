import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.LayoutManager;

public class Mastermind extends Frame{

	public Mastermind() {
		super();
		 
		Modele m = new Modele();
		
		VueClavier vueClavier = new VueClavier();
		
		LayoutManager layout = new BorderLayout();
		this.setLayout(layout);
		this.add(vueClavier,BorderLayout.PAGE_END);
		
		this.setVisible(true);
		this.setSize(400,720);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Mastermind();
	}

}
