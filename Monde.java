package game;

/**
 * @author 11610806
 *
 */
public class Monde {
	/**
	 * @param nbColonnes
	 * @param nblignes
	 * Initialise un monde aléatoire avec la taille spécifiée
	 */
	public Monde (int nbColonnes, int nblignes){}
	/**
	 * @param monde
	 * Utilise le tableau bidimensionnels a reçu en paramètre en état initial du monde
	 */
	public Monde (Cellule[][] monde){}

	/**
	 * Change le monde à la prochaine génération.
	 */
	public void nouvelleGeneration(){}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * Retourne une valeur de chaîne contenant le numéro de génération actuelle et le contenu du monde avec toutes ses cellules.
	 */
	public String toString(){return "";}
}
