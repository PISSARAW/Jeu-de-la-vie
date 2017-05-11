package game;

public interface Cellule
{
	Cellule nouvelleGeneration(int nombreDeVoisins);
	String getAsString();
	public boolean estVivante();
	
}
