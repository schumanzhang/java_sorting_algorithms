package userinterface;

public class UserInput {
	
	private String questionOne;
	private String questionTwo;
	private String questionThree;
	
	private int responseOne = 0;
	private int[] responseTwo;
	private int responseThree = 0;
	
	public UserInput() {
		this.questionOne = "Select a sorting algorithm: 1) Bubble Sort, 2) Selection Sort, 3) Insertion Sort, 4) Merge Sort";
		this.questionTwo = "Please enter 10 random integers...";
		this.questionThree = "Please select a sorting rule 1) Sort smallest to largest, 2) Sort largest to smallest";
	}
	
	public void resetUserInputOne() {
		this.responseOne = 0;
		this.responseTwo = null;
		this.responseThree = 0;
	}
	
	public void resetUserInputTwo() {
		this.responseTwo = null;
		this.responseThree = 0;
	}
	
	public void resetUserInputThree() {
		this.responseThree = 0;
	}
	
	//getters and setters
	public String getQuestionOne() {
		return questionOne;
	}

	public void setQuestionOne(String questionOne) {
		this.questionOne = questionOne;
	}

	public String getQuestionTwo() {
		return questionTwo;
	}

	public void setQuestionTwo(String questionTwo) {
		this.questionTwo = questionTwo;
	}

	public String getQuestionThree() {
		return questionThree;
	}

	public void setQuestionThree(String questionThree) {
		this.questionThree = questionThree;
	}

	public int getResponseOne() {
		return responseOne;
	}

	public void setResponseOne(int responseOne) {
		this.responseOne = responseOne;
	}

	public int[] getResponseTwo() {
		return responseTwo;
	}

	public void setResponseTwo(int[] responseTwo) {
		this.responseTwo = responseTwo;
	}

	public int getResponseThree() {
		return responseThree;
	}

	public void setResponseThree(int responseThree) {
		this.responseThree = responseThree;
	}
}
