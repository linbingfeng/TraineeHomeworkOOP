package sort;

/**
 * 归并排序
 * @author linbingfeng
 *
 */
public class MergeSort extends Sort {

	@Override
	public int[] sort(int[] number) {
		if(number.length > 1){
			int i = 0, j = 0, k = 0;
			int[] number1 = new int[number.length/2];
			int[] number2 = new int[number.length - number.length/2];
			for(; i < number.length;i++){
				if(i < number.length/2){
					number1[j] = number[i];
					j++;
				}else{
					number2[k] = number[i];
					k++;
				}
			}
			int[] number3 = this.sort(number1);
			int[] number4 = this.sort(number2);
			number = Merge(number3, number4);
		}   
		return number;
	}
	
	private static int[] Merge(int[] number1,int[] number2){
		int i = 0,j = 0,k = 0;
		int[] number = new int[number1.length+number2.length];
		while(i < number1.length && j < number2.length){
			if(number1[i] <= number2[j]){
				number[k] = number1[i];
				i++;
				k++;
			}else {
				number[k] = number2[j];
				j++;
				k++;
			}
		}
		if(i == number1.length ){
			for(;j<number2.length;j++){
				number[k] = number2[j];
				k++;
			}
		}else {
			for(;i<number1.length;i++){
				number[k] = number1[i];
				k++;
			}
		}
		return number;
	}
}
