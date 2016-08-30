package test;

import java.util.Random;
import java.util.Scanner;

import sort.DirectInsertSort;
import sort.InsertSort;
import sort.MergeSort;
import sort.QuickSort;
import sort.ShellSort;
import sort.Sort;
/**
 * 五种排序测试
 * @author Linbingfeng
 *
 */
public class SortTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sign = 0;
		System.out.print("请输入测试的次数：");
		//输入测试的次数
		int testNum = input.nextInt();
		while(sign < testNum){
			System.out.println("\n"+"*********    "+(sign+1)+"   **************************************");
			Random r = new Random();
			//随机生成数组的长度
			int size = r.nextInt(10)+10;
			int[] number = new int[size];
			//随机生成数组的每个元素的值
			for(int i = 0;i < size;i++){
				number[i] = r.nextInt(100);
			}
			System.out.print("排序之前的序列：");
			for(int i = 0;i < size;i++){
				System.out.print(number[i]+" ");
			}
			System.out.println("\n"+"---------------------------------------------------");
			Sort directInsertSort = new DirectInsertSort();
			Sort insertSort = new InsertSort();
			Sort mergeSort = new MergeSort();
			Sort quickSort = new QuickSort();
			Sort shellSort = new ShellSort();
			//直接插入排序
			System.out.println("DirectInsertSort:");
			for(int i : directInsertSort.sort(number)){
				System.out.print(i+" ");
			}
			System.out.println();
			//插入排序
			System.out.println("InsertSort:");
			for(int i : insertSort.sort(number)){
				System.out.print(i+" ");
			}
			System.out.println();
			//归并排序
			System.out.println("MergeSort:");
			for(int i : mergeSort.sort(number)){
				System.out.print(i+" ");
			}
			System.out.println();
			//快速排序
			System.out.println("QuickSort:");
			for(int i : quickSort.sort(number)){
				System.out.print(i+" ");
			}
			System.out.println();
			//希尔排序
			System.out.println("ShellSort:");
			for(int i : shellSort.sort(number)){
				System.out.print(i+" ");
			}
			System.out.println();
			sign++;
		}
		input.close();
	}

}
