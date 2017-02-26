
//parent class for all sorting algorithms
public class SortingAlgorithm {
	
	private String sortingType;
	private String sortingRule;
	private int[] originalArray;
	private int[] sortedArray;
		
	public SortingAlgorithm() {
	}
	
	public SortingAlgorithm(int[] originalArray, int[] sortedArray) {
		this.originalArray = originalArray;
		this.sortedArray = sortedArray;
	}
	
	public void resetSortingOne() {
		this.sortingType = null;
		this.sortingRule = null;
		this.originalArray = null;
		this.sortedArray = null;
	}
	
	public void resetSortingTwo() {
		this.sortingRule = null;
		this.originalArray = null;
		this.sortedArray = null;
	}
	
	public void resetSortingThree() {
		this.sortingRule = null;
		this.sortedArray = null;
	}
	
	//getters and setters
	public String getSortingType() {
		return sortingType;
	}

	public void setSortingType(String sortingType) {
		this.sortingType = sortingType;
	}

	public int[] getOriginalArray() {
		return originalArray;
	}

	public void setOriginalArray(int[] originalArray) {
		this.originalArray = originalArray;
	}

	public int[] getSortedArray() {
		return sortedArray;
	}

	public void setSortedArray(int[] sortedArray) {
		this.sortedArray = sortedArray;
	}

	public String getSortingRule() {
		return sortingRule;
	}

	public void setSortingRule(String sortingRule) {
		this.sortingRule = sortingRule;
	}

}
