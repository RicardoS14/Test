
public class Main {
	
	
	public static void main(String[] args) {
		
		//implementation
		Pays pays = new Pays("toto", "Français", "Euro", "TuuLand", 500, 50);
		
		//System.out.println(pays.getSaCapitale().getNom());
		
		pays.ajouterUneVille(new Ville("La Ferté-Alais", 4000, 45));
		pays.ajouterUneVille(new Ville("TAAAAAAH", 74, 478));
		System.out.println(pays.rechercherUneVille("La Ferté-Alais"));
		System.out.println(pays.rechercherUneVille("TAAAAAAH"));
		System.out.println(pays.rechercherUneVille("Ltezrgrger"));
		pays.supprimerUneVille(1);
		System.out.println(pays.rechercherUneVille("TAAAAAAH")); 
		pays.ajouterUneVille(new Ville("Cerny", 454, 15));
		System.out.println(pays.toString());
	}
}

