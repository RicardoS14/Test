public class Ville {
	private String nom;
	private int nbHabitants;
	private float superficie;
	
	public Ville(String nom, int nbHabitants, float superficie) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.superficie = superficie;
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNbHabitants() {
		return nbHabitants;
	}


	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}


	public float getSuperficie() {
		return superficie;
	}


	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}
	
	public String toString() {
		return "\nNom : " + this.getNom() +
			"\nNombre d'habitant : " + this.getNbHabitants() +
			"\nSuperficie : " + this.getSuperficie() + "\n";
	}
}
