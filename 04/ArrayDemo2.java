import java.util.*;
class ArrayDemo2
{
	public static void main(String[] args)
	{
		int[] arr = {1, 321, 12, 343, 222, 45};
		System.out.println(getMax(arr));
		selectSort(arr);
		printArr(arr);

		int[] arr1 = {1, 321, 12, 343, 222, 45};
		bubbleSort(arr1);
		printArr(arr1);

		int[] arr2 = {1, 321, 12, 343, 222, 45};
		Arrays.sort(arr2);
		printArr(arr2);
	}

	/*获取最大值*/
	public static int getMax(int[] arr)
	{
		int result = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > result)
			{
				result = arr[i];
			}
		}
		return result;
	}

	/*选择排序: 一个元素跟其他所有元素相比*/
	public static void selectSort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
		//i < arr.length-1: 因为最后一个元素再跟前面比较，没含义
		//因为最后一次内循环已经可以确定最后两个元素的位置
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					swap(arr, i, j);
				}
			}
		}
	}
	/*冒泡排序: 相邻的两个元素相比*/
	public static void bubbleSort(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		//i < arr.length-1: 因为最后一个元素再跟前面比较，没含义
		//因为第一轮冒泡后，已经可以确定最大的元素在最后的位置;
		{
			for(int j = 0; j < arr.length - i -1; j++)	
			//-i: 让每一次比较的元素减少，-1: 避免脚标越界
			{
				if(arr[j] < arr[j+1])
				{
					swap(arr, j, j+1);
				}
			}
		}
	}
	public static void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	/*打印数组*/
	public static void printArr(int[] arr)
	{
		System.out.print("[");
		for(int i = 0; i < arr.length; i++)
		{
			if(i != arr.length-1)
			{
				System.out.print(arr[i] + ", ");
			}
			else
			{
				System.out.print(arr[i] + "]");
			}
		}
		System.out.println();
	}
}