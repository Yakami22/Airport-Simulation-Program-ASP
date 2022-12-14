package entity;

import java.util.List;
import java.util.function.Predicate;

import engine.EntiteSimulee;
import engine.GenericSimEvent;
import engine.InitData;
import engine.SimEvent;
import engine.SimuEngine;
import enstabretagne.base.math.MoreRandom;
import enstabretagne.base.time.LogicalDateTime;

public class Airplane extends EntiteSimulee {

	private boolean flying;
	
	public Airplane(SimuEngine engine, InitData ini) {
		super(engine, ini);
		flying = false;
		
	}
	
	void takeOff( ) {
		flying = true;
		// reposter un evenement pour atterrir
	}
	
	static public void main(String[] args) {
		Airplane airplane = new Airplane(null, null);
		// SimEvent event = new GenericSimEvent(LogicalDateTime.Zero, this::takeOff);
		Runnable behaviour = airplane::takeOff;
		behaviour = () -> airplane.takeOff();
		
		behaviour = new Runnable() {

			@Override
			public void run() {
				airplane.takeOff();
			}
			
		};
		
		SimEvent event = new GenericSimEvent(LogicalDateTime.Zero, behaviour);
	}

}
