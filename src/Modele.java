import java.awt.Color;

public class Modele {
	public static Color COULEURS[]= {Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.RED, Color.ORANGE, Color.WHITE, Color.BLACK};
	public static int N_TENTATIVES=10, DIFFICULTE=4;
	public static enum Etat {EN_COURS,GAGNE,PERDU};
	
	public Etat etat;
	public Rangee combinaison;
	public Rangee[] proposition[];

	public int tentative;
	
	public void ChoixCode() {
		for(int i=0;i<DIFFICULTE;i++) {
			int x=(int) Math.random()*COULEURS.length-1;

			this.combinaison.jetons[i]=COULEURS[x];
		}
		System.out.println(this.combinaison.jetons[0]);
	}
	
	

}
