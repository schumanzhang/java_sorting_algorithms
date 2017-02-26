
public class InsertionSort extends SortingAlgorithm {
	
	private int[] subArray;
	private int loopCounter = 0;
	
	public InsertionSort() {
	}
	
	public int[] initSortingAlgorithm(int[] originalArray, String sortingRule) {
		this.subArray = new int[originalArray.length];
		while (this.loopCounter < originalArray.length) {
			this.subArray[this.loopCounter] = originalArray[this.loopCounter];
			if (this.loopCounter > 0) {
				if (sortingRule == "Smallest to largest") {
					insertionSortSmallToLarge();
				} else {
					insertionSortLargeToSmall();
				}
			}
			this.loopCounter++;
		}
		
		return this.subArray;
	}
	
	private void insertionSortSmallToLarge() {
		for (int compareIndex = this.loopCounter; compareIndex > 0; compareIndex--) {
			if (compareIndex - 1 < 0) {
				break;
			}
			if (this.subArray[compareIndex] < this.subArray[compareIndex - 1]) {
				int x = this.subArray[compareIndex];
				int y = this.subArray[compareIndex - 1];
				this.subArray[compareIndex] = y;
				this.subArray[compareIndex - 1] = x;
			}
		}		
	}
	
	private void insertionSortLargeToSmall() {
		for (int compareIndex = this.loopCounter; compareIndex > 0; compareIndex--) {
			if (compareIndex - 1 < 0) {
				break;
			}
			if (this.subArray[compareIndex] > this.subArray[compareIndex - 1]) {
				int x = this.subArray[compareIndex];
				int y = this.subArray[compareIndex - 1];
				this.subArray[compareIndex] = y;
				this.subArray[compareIndex - 1] = x;
			}
		}		
	}
	
}
