package validation;

public class Validators {
	
	private String invalidReason;
	private boolean firstQuestionInvalid;
	private boolean secondQuestionInvalid;
	private boolean thirdQuestionInvalid;
	private boolean firstRun;
	
	public Validators() {
		this.firstQuestionInvalid = false;
		this.secondQuestionInvalid = false;
		this.thirdQuestionInvalid = false;
		this.firstRun = true;
	}
	
	
	public void resetValidator() {
		this.firstRun = false;
		this.firstQuestionInvalid = false;
		this.secondQuestionInvalid = false;
		this.thirdQuestionInvalid = false;
	}

	//getters and setters
	public String getInvalidReason() {
		return invalidReason;
	}

	public void setInvalidReason(String invalidReason) {
		this.invalidReason = invalidReason;
	}

	public boolean firstQuestionInvalid() {
		return firstQuestionInvalid;
	}

	public void setfirstQuestionInvalid(boolean isInvalid) {
		this.firstQuestionInvalid = isInvalid;
	}

	public boolean isFirstRun() {
		return firstRun;
	}

	public void setFirstRun(boolean firstRun) {
		this.firstRun = firstRun;
	}


	public boolean isFirstQuestionInvalid() {
		return firstQuestionInvalid;
	}


	public void setFirstQuestionInvalid(boolean firstQuestionInvalid) {
		this.firstQuestionInvalid = firstQuestionInvalid;
	}


	public boolean isSecondQuestionInvalid() {
		return secondQuestionInvalid;
	}


	public void setSecondQuestionInvalid(boolean secondQuestionInvalid) {
		this.secondQuestionInvalid = secondQuestionInvalid;
	}


	public boolean isThirdQuestionInvalid() {
		return thirdQuestionInvalid;
	}


	public void setThirdQuestionInvalid(boolean thirdQuestionInvalid) {
		this.thirdQuestionInvalid = thirdQuestionInvalid;
	}
	
}
