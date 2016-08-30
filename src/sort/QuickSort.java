package sort;

/**
 * ¿ìËÙÅÅĞò
 * @author linbinrgfeng
 *
 */
public class QuickSort extends Sort {

	@Override
	public int[] sort(int[] number) {
		return quicksort(number, 0, number.length-1);
	}
	
	static int[] quicksort(int[] number,int left,int right) {
        int dp;
        if (left < right) {
            dp = partitionumber(number, left, right); 
            quicksort(number, left, dp - 1);
            quicksort(number, dp + 1, right);
        }
        return number;
    }
 
    static int partitionumber(int number[], int left, int right) {
        int pivot = number[left];
        while (left < right) {
            while (left < right && number[right] >= pivot)
                right--;
            if (left < right)
                number[left++] = number[right];
            while (left < right && number[left] <= pivot)
                left++;
            if (left < right)
                number[right--] = number[left];
        }
        number[left] = pivot;
        return left;
    }

}
