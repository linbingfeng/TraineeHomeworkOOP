package sort;
/**
 * 直接插入法
 * @author linbingfeng
 *
 */
public class DirectInsertSort extends Sort {

	@Override
	public int[] sort(int[] number) {
        //直接插入排序
        for (int i = 1; i < number.length; i++) {
            //待插入元素
            int temp = number[i];
            int j;
            for (j = i-1; j>=0; j--) {
                //将大于temp的往后移动一位
                if(number[j]>temp){
                    number[j+1] = number[j];
                }else{
                    break;
                }
            }
            number[j+1] = temp;
        }
        return number;
	}
}
