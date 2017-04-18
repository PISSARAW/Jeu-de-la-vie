package game;


public interface Cellule
{
  /**
 * @param nombreDeVoisins
 * @return la cellule de génération suivante en fonction du nombre de voisins
 */
Cellule nouvelleGeneration(int nombreDeVoisins);
  /**
 * @return une chaîne représentant l’état de la cellule
 */
String getAsString();
  /**
 * @return Si la cellule est actuellement active ou non.
 */
boolean estVivante();
}
