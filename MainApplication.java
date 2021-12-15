package cours;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Etudiant etudiant = new Etudiant();
		
		etudiant.setNom("JAURES");
		etudiant.setPrenom("dfhjfjfgj");
		etudiant.setTelephone("frfrkj");
		etudiant.setMatriculEtudiant(3546);
		etudiant.setAdrersse("Essos camp Sonel");
		
		System.out.println("le nom est "+etudiant.getNom()+"le prenom"+etudiant.getPrenom()+"la date est"+etudiant.getDateNaissance()+"");
		
		etudiant.calculPrime();
		

	}

}
