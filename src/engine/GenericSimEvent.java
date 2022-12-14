package engine;

import enstabretagne.base.time.LogicalDateTime;

public class GenericSimEvent extends SimEvent {

	private final Runnable behaviour;
	
	public GenericSimEvent(LogicalDateTime scheduleTime, Runnable behaviour) {
		super(scheduleTime);
		this.behaviour = behaviour;
	}

	@Override
	public void process() {
		behaviour.run();
	}

}
