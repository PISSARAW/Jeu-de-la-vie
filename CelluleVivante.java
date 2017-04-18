package game;

/**
 * @author 11610806
 *
 */
public class CelluleVivante implements Cellule {

	private int age=0;
	
	/* (non-Javadoc)
	 * @see game.Cellule#nouvelleGeneration(int)
	 */

	public Cellule nouvelleGeneration(int nombreDeVoisins) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see game.Cellule#getAsString()
	 */
	public String getAsString() {
		return age>0?"+":"0";
	}

	/* (non-Javadoc)
	 * @see game.Cellule#estVivante()
	 */
	public boolean estVivante() {
		return true;
	}

}
