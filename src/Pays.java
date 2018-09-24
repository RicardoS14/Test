public class Pays {
	private String nom;
	private String langue;
	private String monnaie;
	private static int compteurPays = 0;
	private static int nbVilles = 0;
	private static int MAXVILLE = 5;
	private Capitale saCapitale;
	private Ville[] lesVilles;
	
	
	
	/**
	 * Constructeur de la class Pays
	 * 
	 * @param nom 
	 * @param langue
	 * @param monnaie
	 * @param capitale
	 * 
	 * 
	 */
	public Pays(String nom, String langue, String monnaie, String nomCapitale, int nbHCapitale, float superficieCapitale) {
		this.nom = nom;
		this.langue = langue;
		this.monnaie = monnaie;
		compteurPays++;
		this.saCapitale = new Capitale(nomCapitale, nbHCapitale, superficieCapitale);
		this.lesVilles = new Ville[MAXVILLE];
	}
	
	/**
	 * 
	 * @return Le nom du pays.
	 * 
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * 
	 * @return Le nom du pays en majuscule.
	 * 
	 */
	public String getNomMaj() {
		return this.nom.toUpperCase();
	}
	
	/**
	 * 
	 * @return Le nom du pays avec une majuscule en première lettre.
	 * 
	 */
	public String getNomCap() {
		String text = "" + this.nom.toUpperCase().charAt(0) + this.nom.substring(1,this.nom.length());
		return text;
	}
	
	/**
	 * 
	 * @param unNom
	 * 
	 */
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	/**
	 * 
	 * @return le nombre d'objet Pays créé.
	 */
	public static int getCompteurPays() {
		return compteurPays;
	}
	
	public Capitale getSaCapitale() {
		return this.saCapitale;
	}
	
	public void ajouterUneVille(Ville ville) {
		if(nbVilles < MAXVILLE) {
			this.lesVilles[nbVilles] = ville;
			nbVilles++;
		}
	}
	
	public boolean rechercherUneVille(String nom) {
		int i = 0;
		while(i < nbVilles && !nom.equals(this.lesVilles[i].getNom())) {
			i++;
		}
		if(i < nbVilles && nom.equals(this.lesVilles[i].getNom())) return true;
		else return false;
	}
	
	public int getIndiceVille(String nom) {
		int i = 0;
		while(i < nbVilles && !nom.equals(this.lesVilles[i].getNom())) {
			i++;
		}
		if(i < nbVilles && nom.equals(this.lesVilles[i].getNom())) return i;
		else return -1;
	}
	
	public void supprimerUneVille(int index) {
		int i = index;
		while(i < nbVilles) {
			if(i + 1 < nbVilles) this.lesVilles[i] = lesVilles[i+1];
			else this.lesVilles[i] = null;
			i++;
		}
		if(index < nbVilles) {
			nbVilles--;
		}
	}
	
	public void supprimerUneVille(String nom) {
		int i = getIndiceVille(nom);
		while(i < nbVilles) {
			if(i + 1 < nbVilles) this.lesVilles[i] = lesVilles[i+1];
			else this.lesVilles[i] = null;
			i++;
		}
		if(getIndiceVille(nom) < nbVilles) {
			nbVilles--;
		}
	}
	
	public Ville[] getLesVilles() {
		return this.lesVilles;
	}

	public String toString() {
		String chaine = "*** Le Pays ***\n" +
				"\nNom : " + this.nom + 
				"\nLangue : " + this.langue +
				"\nMonnaie : " + this.monnaie +
				"\n\n" + this.saCapitale.toString() +
				"\n\n*** Les Villes ***\n"
				+ "\n Moi";
		for(int i = 0; i < nbVilles; i++) {
			chaine += "\n" + lesVilles[i].toString();
		}
		return chaine;
	}

} //Romain Chevrier vous dis coucou!
//COUCOU ROMAIN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!