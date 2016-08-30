package sort;

/**
 * 希尔排序
 * @author linbingfeng
 *
 */
public class ShellSort extends Sort {

	@Override
	public int[] sort(int[] number) {
		int j = 0;  
        int temp = 0;  
        for (int increment = number.length / 2; increment > 0; increment /= 2) {  
            for (int i = increment; i < number.length; i++) {  
                temp = number[i];  
                for (j = i; j >= increment; j -= increment) {  
                    if(temp < number[j - increment]){  
                        number[j] = number[j - increment];  
                    }else{  
                        break;  
                    }  
                }   
                number[j] = temp;  
            }  
        }  
        return number;
	}
}
