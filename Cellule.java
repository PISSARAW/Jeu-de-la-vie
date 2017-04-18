packages game;

public interface Cellule
{
  Cellule nouvelleGeneration(int nombreDeVoisins);
  String getAsString();
  boolean estVivante();
}
