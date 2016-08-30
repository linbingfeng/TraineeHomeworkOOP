package sort;

/**
 * 插入法
 * @author linbingfeng
 *
 */

public class InsertSort extends Sort {

	@Override
	public int[] sort(int[] number) {
		
		for(int i = 1;i < number.length;i++){
			int j = i;
			while(j > 0&&number[j] < number[j - 1]){
				number[j] += number[j - 1];
				number[j-1] = number[j] - number[j - 1];
				number[j] = number[j] - number[j - 1];
				j--;
			}
		}
		return number;
	}

}
