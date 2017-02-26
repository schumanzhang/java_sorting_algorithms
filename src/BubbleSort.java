
public class BubbleSort extends SortingAlgorithm {
	
	private int[] tempArray;
	
	public BubbleSort() {
	}
	
	public int[] initSortingAlgorithm(int[] originalArray, String sortingRule) {
		this.tempArray = originalArray;
		if (sortingRule == "Smallest to largest") {
			while (isArraySortedSmallestToLargest(this.tempArray) == false) {
				this.tempArray = bubbleSortSmallToLarge(this.tempArray);
			}
		} else {
			while (isArraySortedLargestToSmallest(this.tempArray) == false) {
				this.tempArray = bubbleSortLargeToSmall(this.tempArray);
			}	
		}
		return this.tempArray;
	}
	
	private int[] bubbleSortSmallToLarge(int[] originalArray) {
		for (int i = 0; i < originalArray.length; i++) {
			if (i == originalArray.length - 1) {
				break;
			}
			int y = originalArray[i + 1];
			int x = originalArray[i];
			if (y < x) {
				originalArray[i] = y;
				originalArray[i + 1] = x;
			}
		}
		this.tempArray = originalArray;
		return this.tempArray;
	}
	
	private int[] bubbleSortLargeToSmall(int[] originalArray) {
		for (int i = 0; i < originalArray.length; i++) {
			if (i == originalArray.length - 1) {
				break;
			}
			int y = originalArray[i + 1];
			int x = originalArray[i];
			if (y > x) {
				originalArray[i] = y;
				originalArray[i + 1] = x;
			}
		}
		
		this.tempArray = originalArray;
		return this.tempArray;
	}
	
	private boolean isArraySortedSmallestToLargest(int[] someArray) {
		boolean isSorted = true;
		for(int i = 0; i < someArray.length; i++) {
			if (i == someArray.length - 1) {
				break;
			}
			int y = someArray[i + 1];
			int x = someArray[i];
			if (x > y) {
				isSorted = false;
				break;
			}
		}
		return isSorted;
	}
	
	private boolean isArraySortedLargestToSmallest(int[] someArray) {
		boolean isSorted = true;
		for(int i = 0; i < someArray.length; i++) {
			if (i == someArray.length - 1) {
				break;
			}
			int y = someArray[i + 1];
			int x = someArray[i];
			if (x < y) {
				isSorted = false;
				break;
			}
			
		}
		return isSorted;
	}

}
