package engine;

//le plan tel que propos� dans ce TD est d�fini comme un g�n�rateur de sc�narii
//il comprend 3 m�thodes abstraites � sp�cialiser
public abstract class Plan {
	
	//nombre de fois qu'un m�me sc�nario sera ex�cut� mais avec une graine diff�rente
	private int nbReplique;
	public int getNbReplique() {
		return nbReplique;
	}
	
	protected SimuEngine engine;
	public SimuEngine getEngine() {
		return engine;
	}
	
	//num�ro de la r�plique actuelle
	private int currentRepliqueNumber;
	public int getCurrentRepliqueNumber() {
		return currentRepliqueNumber;
	}
	
	public Plan(int nbReplique) {
		this.nbReplique=nbReplique;
	}
	//cette m�thode permet de d�finir chaque sc�nario � ex�cuter
	//elle pr�suppose que votre impl�mentation saura stocker la d�finition de chaque sc�nario
	public abstract void initScenarii();
	
	//cette m�thode permet de savoir s'il y a encore un sc�nario � ex�cuter
	public abstract boolean hasNextScenario();
	
	//cette m�thode permet de r�cup�rer le prochain sc�nario. 
	//renvoie null sinon
	public abstract Scenario nextScenario(); 

}
