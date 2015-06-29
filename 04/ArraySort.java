import java.util.*;


class ArraySort
{
	public static void main(String[] args)
	{
		int[] arr0 = {12, 43, 32, 21, 24};
		System.out.println(getMax(arr0));

		int[] arr1 = {12, 43, 32, 21, 24};
		bubbleSort(arr1);
		printArr(arr1);

		int[] arr2 = new int[]{12, 32, 10, 45, 23};
		selectSort(arr2);
		printArr(arr2);

		int[] arr3 = new int[]{43, 21, 12, 45, 62, 35};
		Arrays.sort(arr3);
		printArr(arr3);
	}
	/*获取数组最大值*/
	public static int getMax(int[] arr)
	{
		int result = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(result < arr[i])
			{
				result = arr[i];
			}
		}
		return result;
	}
	/*冒泡排序*/
	public static void bubbleSort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = 0; j < arr.length - i -1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					swap(arr, j, j+1);
				}
			}
		}
	}
	/*选择排序*/
	public static void selectSort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					swap(arr, i, j);
				}
			}
		}
	}
	/*数组元素换位*/
	public static void swap(int[] arr, int x, int y)
	{
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	/*打印数组*/
	public static void printArr(int[] arr)
	{
		System.out.print("[");
		for(int i = 0; i < arr.length; i++)
		{
			if(i < arr.length - 1)
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