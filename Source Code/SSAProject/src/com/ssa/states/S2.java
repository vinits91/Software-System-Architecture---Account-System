package com.ssa.states;
//S2 temp state
public class S2 extends State {

	@Override
	public void open() {
		//Do Nothing
		
	}

	@Override
	public void login() {
		//Do Nothing
		
	}

	@Override
	public void loginIncorrect() {
		//Do Nothing
		
	}

	@Override
	public void incorrectPin(int max) {
		//Do Nothing
		
	}

	@Override
	public void correctPinAboveMin() {
		//Do Nothing
		
	}

	@Override
	public void correctPinBelowMin() {
		//Do Nothing
		
	}

	@Override
	public void logout() {
		//Do Nothing
		
	}

	@Override
	public void deposit() {
		//Do Nothing
		
	}

	@Override
	public void depositAboveMin() {
		//Do Nothing
		
	}

	@Override
	public void depositBelowMin() {
		//Do Nothing
		
	}

	@Override
	public void balance() {
		//Do Nothing
		
	}

	@Override
	public void withdraw() {
		//Do Nothing
		
	}

	@Override
	public void withdrawAboveMin() {
		//Do Nothing
		
	}

	@Override
	public void withdrawBelowMin() {
		createOutputProcessor().penalty();
		
	}

	@Override
	public void withdrawBelowRequired() {
		
		
	}

	@Override
	public void lock() {
		//Do Nothing
		
	}

	@Override
	public void lockIncorrectPin() {
		//Do Nothing
		
	}

	@Override
	public void unlockIncorrectPin() {
		//Do Nothing
		
	}

	@Override
	public void unlock() {
		//Do Nothing
		
	}

	@Override
	public void unlockAboveMin() {
		//Do Nothing
		
	}

	@Override
	public void unlockBelowMin() {
		//Do Nothing
		
	}

	@Override
	public void suspend() {
		//Do Nothing
		
	}

	@Override
	public void activate() {
		//Do Nothing
		
	}

	@Override
	public void close() {
		//Do Nothing
		
	}

	@Override
	public int getStateId() {
		//Do Nothing
		return 8;
	}

	
}
