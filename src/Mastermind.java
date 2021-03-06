import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.LayoutManager;

public class Mastermind extends Frame{

	
	public Mastermind() {
		super();
		 
		Modele m = new Modele();
		
		VueClavier vueClavier = new VueClavier();
		VuePropositions vueProposition = new VuePropositions();
		
		LayoutManager layout = new BorderLayout();
		this.setLayout(layout);
		this.add(vueProposition,BorderLayout.PAGE_START);
		this.add(vueClavier,BorderLayout.PAGE_END);
		this.pack();
		this.setVisible(true);
		m.ChoixCode();
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				dispose();			
				System.exit(0);	
				}
			}
		);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Mastermind();
	}

}
