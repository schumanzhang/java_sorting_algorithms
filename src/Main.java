import java.util.Arrays;
import java.util.Scanner;

import userinterface.UserInput;
import validation.Validators;

public class Main {
	
	static Scanner userScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		UserInput userInterface = new UserInput();
		SortingAlgorithm sorting = new SortingAlgorithm();
		Validators validator = new Validators();
		
		if (validator.isFirstRun() == true) {
			handleQuestionOne(userInterface, sorting, validator);
		} 
			
	}
	
	public static void startFromQuestion(String question, UserInput userInterface, SortingAlgorithm sorting, Validators validator) {
		validator.resetValidator();
		if (question == "one") {
			userInterface.resetUserInputOne();
			sorting.resetSortingOne();
			handleQuestionOne(userInterface, sorting, validator);
		} else if (question == "two") {
			userInterface.resetUserInputTwo();
			sorting.resetSortingTwo();
			handleQuestionTwo(userInterface, sorting, validator);
		} else if (question == "three") {
			userInterface.resetUserInputThree();
			sorting.resetSortingThree();
			handleQuestionThree(userInterface, sorting, validator);
		}
	}
	
	public static void handleQuestionOne(UserInput userInterface, SortingAlgorithm sorting, Validators validator) {
		validator.setFirstRun(false);
		System.out.println(userInterface.getQuestionOne());
		if (userScanner.hasNextInt()) {
			int optionEntered = userScanner.nextInt();
			userInterface.setResponseOne(optionEntered);
			if (userInterface.getResponseOne() == 1) {
				sorting.setSortingType("bubbleSort");
				System.out.println("You have chosen " + sorting.getSortingType());
				startFromQuestion("two", userInterface, sorting, validator);
			} else if (userInterface.getResponseOne() == 2) {
				sorting.setSortingType("selectionSort");
				System.out.println("You have chosen " + sorting.getSortingType());
				startFromQuestion("two", userInterface, sorting, validator);
			} else if (userInterface.getResponseOne() == 3) {
				sorting.setSortingType("insertionSort");
				System.out.println("You have chosen " + sorting.getSortingType());
				startFromQuestion("two", userInterface, sorting, validator);
			} else if (userInterface.getResponseOne() == 4) {
				sorting.setSortingType("mergeSort");
				System.out.println("You have chosen " + sorting.getSortingType());
				startFromQuestion("two", userInterface, sorting, validator);
			} else {	
				validator.setfirstQuestionInvalid(true);
				validator.setInvalidReason("You must make a valid selection");
				System.out.println("Invalid input: " + validator.getInvalidReason());
				userScanner.nextLine();
				startFromQuestion("one", userInterface, sorting, validator);
			}
		} else {
			validator.setfirstQuestionInvalid(true);
			validator.setInvalidReason("You must enter a number");
			System.out.println("Invalid input: " + validator.getInvalidReason());
			userScanner.nextLine();
			startFromQuestion("one", userInterface, sorting, validator);
		}
	}
	
	public static void handleQuestionTwo(UserInput userInterface, SortingAlgorithm sorting, Validators validator) {
		System.out.println(userInterface.getQuestionTwo());
		int counter = 0;
		int[] vars = new int[10];
		
		do {
			if (userScanner.hasNextInt()) {
				vars[counter] = userScanner.nextInt();
				counter++;
			} else {
				validator.setSecondQuestionInvalid(true);
				validator.setInvalidReason("You must enter a number");
				userScanner.nextLine();
				startFromQuestion("two", userInterface, sorting, validator);
			}
		} while (counter < 10); 
		
		//go to question three
		System.out.println("You entered these numbers:" + Arrays.toString(vars));
		sorting.setOriginalArray(vars);
		userInterface.setResponseTwo(vars);
		userScanner.nextLine();
		startFromQuestion("three", userInterface, sorting, validator);
	}
	
	public static void handleQuestionThree(UserInput userInterface, SortingAlgorithm sorting, Validators validator) {
		System.out.println(userInterface.getQuestionThree());
		if(userScanner.hasNextInt()) {
			int optionEntered = userScanner.nextInt();
			userInterface.setResponseThree(optionEntered);
			if (userInterface.getResponseThree() == 1) {
				sorting.setSortingRule("Smallest to largest");
				System.out.println("You have chosen " + sorting.getSortingRule());
				runSortingAlgorithm(userInterface, sorting, validator);
			} else if (userInterface.getResponseThree() == 2) {
				sorting.setSortingRule("Largest to smallest");
				System.out.println("You have chosen " + sorting.getSortingRule());
				runSortingAlgorithm(userInterface, sorting, validator);
			} else {	
				validator.setThirdQuestionInvalid(true);
				validator.setInvalidReason("You must make a valid selection");
				System.out.println("Invalid input: " + validator.getInvalidReason());
				userScanner.nextLine();
				startFromQuestion("three", userInterface, sorting, validator);
			}
		} else {
			validator.setThirdQuestionInvalid(true);
			validator.setInvalidReason("You must enter a number");
			System.out.println("Invalid input: " + validator.getInvalidReason());
			userScanner.nextLine();
			startFromQuestion("three", userInterface, sorting, validator);
		}
	}
	
	public static void runSortingAlgorithm(UserInput userInterface, SortingAlgorithm sorting, Validators validator) {
		int[] answer;
		switch(sorting.getSortingType()) {
			case "bubbleSort":
				BubbleSort bubbleSort = new BubbleSort();
				answer = bubbleSort.initSortingAlgorithm(sorting.getOriginalArray(), sorting.getSortingRule());
				System.out.println("answer: " + Arrays.toString(answer));
				break;
			case "selectionSort":
				SelectionSort selectionSort = new SelectionSort();
				answer = selectionSort.initSortingAlgorithm(sorting.getOriginalArray(), sorting.getSortingRule());
				System.out.println("answer: " + Arrays.toString(answer));
			case "insertionSort":
				InsertionSort insertionSort = new InsertionSort();
				answer = insertionSort.initSortingAlgorithm(sorting.getOriginalArray(), sorting.getSortingRule());
				System.out.println("answer: " + Arrays.toString(answer));
			case "mergeSort":
				MergeSort mergeSort = new MergeSort();
				answer = mergeSort.initSortingAlgorithm(sorting.getOriginalArray(), sorting.getSortingRule());
				System.out.println("answer: " + Arrays.toString(answer));
		}	
	}
}
