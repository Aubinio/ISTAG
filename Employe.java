package cours;

public class Employe extends Personne
{
	
	private int matriculeEmploye;

	public int getMatriculeEmploye() {
		return matriculeEmploye;
	}

	public void setMatriculeEmploye(int matriculeEmploye) {
		this.matriculeEmploye = matriculeEmploye;
	}
	
	@Override
	public void calculPrime() {
		// TODO Auto-generated method stub
		
		int primeEmploye = 	100;
		 int salaire = 250;
		 
		 int salaireTotal = primeEmploye + salaire;
		 
		 System.out.println("En fin du mois cet employé recevra "+salaireTotal+ "FCFA");
		
		super.calculPrime();
	}

}
