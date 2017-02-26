
public class MergeSort extends SortingAlgorithm {
	
	private int[] sortedArray;
	
	public MergeSort() {
	}
	
	public int[] initSortingAlgorithm(int[] originalArray, String sortingRule) {
		this.sortedArray = originalArray;
		mergeSort(this.sortedArray, 0, originalArray.length - 1, sortingRule);
		
		return this.sortedArray;
	}
	
	private void mergeSort(int[] array, int start, int end, String sortingRule) {
		if(start < end) {
			int mid = (start+end)/2;
		    mergeSort(array, start, mid, sortingRule);
			mergeSort(array, mid+1, end, sortingRule);
			merge(array, start, mid, end, sortingRule);
		}
	}
	
	private void merge(int[] array, int start, int mid, int end, String sortingRule) {
		int n1 = mid - start + 1;
		int n2 = end - mid;
        
		int[] temp1 = new int[n1];
		int[] temp2 = new int[n2];
			        
		for(int i = 0; i < n1; i++) {
			temp1[i] = array[start+i];
		}
		        
	    for(int j = 0; j < n2; j++) {
		    temp2[j] = array[mid+j+1];
		}
		        
		int i = 0, j = 0, k = start;
		
		if (sortingRule == "Smallest to largest") {
			while(i < n1 && j < n2) {
				if(temp1[i] <= temp2[j]) {
		            array[k] = temp1[i];
			        i++;
			    } else {
			        array[k] = temp2[j];
			        j++;
			    }
			        k++;
		    }	
		} else {
			while(i < n1 && j < n2) {
				if(temp1[i] >= temp2[j]) {
		            array[k] = temp1[i];
			        i++;
			    } else {
			        array[k] = temp2[j];
			        j++;
			    }
			        k++;
		    }	
		}
		 
		while(i < n1) {
			array[k] = temp1[i];
			i++;
		    k++;
		}
		   
	    while(j < n2) {
	    	array[k] = temp2[j];
			j++;
			k++;
	    }
	    
	    this.sortedArray = array;
	}
}
