package engine;

import enstabretagne.base.time.LogicalDateTime;
import enstabretagne.engine.EntiteSimulee;
import enstabretagne.engine.ScenarioInitData;
import enstabretagne.engine.SimuEngine;
import enstabretagne.simulation.basics.ScenarioId;
import entity.Airplane;

public abstract class Scenario extends Airplane{

	public LogicalDateTime getDebut() {
		return ((ScenarioInitData) getInit()).getDebut();
	}
	public LogicalDateTime getFin() {
		return ((ScenarioInitData) getInit()).getFin();
	}
	
	
	public Scenario(SimuEngine engine,ScenarioInitData init) {
		super(engine,init);
		id = new ScenarioId(init.getName(),init.getGraine());
		graine = ((ScenarioInitData) getInit()).getGraine();
	}

	//gestion de la graine
	private int graine;
	public int getGraine() {
		return graine;
	}
	public void setGraine(int graine) {
		id.setRepliqueNumber(graine);
		this.graine = graine;
	}

	//identifiant du sc�nario
	//on l'identifie par un nom sous forme de chaine de caract�re
	//il est porteur de la graine utilis�e dans le cadre d'une r�plique
	ScenarioId id;
	ScenarioId getID() {
		return id;
	}
	
	public abstract void creerEntitesSimulees();

}
