package sort;
/**
 * 直接插入法
 * @author linbingfeng
 *
 */
public class DirectInsertSort extends Sort {

	@Override
	public int[] sort(int[] number) {
        //ֱ�Ӳ�������
        for (int i = 1; i < number.length; i++) {
            //������Ԫ��
            int temp = number[i];
            int j;
            for (j = i-1; j>=0; j--) {
                //������temp�������ƶ�һλ
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
