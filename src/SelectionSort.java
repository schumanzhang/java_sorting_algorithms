
public class SelectionSort extends SortingAlgorithm {
	
	private int[] tempArray;
	private int loopCounter = 0;
	
	public SelectionSort() {
	}
	
	public int[] initSortingAlgorithm(int[] originalArray, String sortingRule) {
		this.tempArray = originalArray;
		if (sortingRule == "Smallest to largest") {
			while (this.loopCounter < originalArray.length) {
				this.tempArray = selectionSortSmallToLarge(this.tempArray);
				this.loopCounter++;
			}
		} else {
			while (this.loopCounter < originalArray.length) {
				this.tempArray = selectionSortLargeToSmall(this.tempArray);
				this.loopCounter++;
			}	
		}
		return this.tempArray;
	}
	
	private int[] selectionSortSmallToLarge(int[] originalArray) {		
		for (int i = this.loopCounter; i < originalArray.length; i++) {
			if (originalArray[i] < originalArray[this.loopCounter]) {
				int x = originalArray[this.loopCounter];
				int y = originalArray[i];
				originalArray[this.loopCounter] = y;
				originalArray[i] = x;
			}
		}
		this.tempArray = originalArray;
		return this.tempArray;
	}
	
	private int[] selectionSortLargeToSmall(int[] originalArray) {
		for (int i = this.loopCounter; i < originalArray.length; i++) {
			if (originalArray[i] > originalArray[this.loopCounter]) {
				int x = originalArray[this.loopCounter];
				int y = originalArray[i];
				originalArray[this.loopCounter] = y;
				originalArray[i] = x;
			}
		}
		this.tempArray = originalArray;
		return this.tempArray;
	}
	
}
