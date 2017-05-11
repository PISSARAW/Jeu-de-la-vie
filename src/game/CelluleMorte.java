package game;

public class CelluleMorte implements Cellule
{

	public boolean estVivante(){
		return false;
	}

    @Override
    public Cellule nouvelleGeneration(int nombreDeVoisins) {
        if (nombreDeVoisins == 3) {
            return new CelluleVivante();
        } else {
            return this;
        }
    }

    public String getAsString(){
		String s="-";
		return s;
	}
}
