package game;

public class CelluleVivante implements Cellule
{
	private int age=0;
	private boolean naissance;

	public CelluleVivante() {
		this.naissance = true;
	}

	public boolean estVivante(){
		return true;
	}
	
	public Cellule nouvelleGeneration(int nombreDeVoisins){}
	
	public String getAsString(){
		return age>0?"+":"0";
	}
}
