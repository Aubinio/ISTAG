package cours;

public class Etudiant extends Personne
{
	
	private int matriculEtudiant;

	public int getMatriculEtudiant() {
		return matriculEtudiant;
	}

	public void setMatriculEtudiant(int matriculEtudiant) {
		this.matriculEtudiant = matriculEtudiant;
	}
	
	@Override
	public void calculPrime() {
		// TODO Auto-generated method stub
		
		int primeEtudiant = 50;
		
		System.out.println("Sa prime d'excellence est de "+primeEtudiant+" FCFA");
		
		
		super.calculPrime();
	}

}
