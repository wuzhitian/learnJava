### day04 Array
[TOC]
	
##### 初始化数组

```java
	class ArrayDemo
	{
		public static void main(String[] args)
		{
			char[] arrChar = new char[3];
			System.out.println(arrChar[0]);		//

			byte[] arrByte = new byte[3];
			System.out.println(arrByte[0]);		//0

			int[] arrInt = new int[3];
			System.out.println(arrInt[0]);		//0

			short[] arrShort = new short[3];
			System.out.println(arrShort[0]);	//0

			long[] arrLong = new long[3];
			System.out.println(arrLong[0]);		//0

			double[] arrDouble = new double[3]; 
			System.out.println(arrDouble[0]);	//0.0

			float[] arrFloat = new float[3];
			System.out.println(arrFloat[0]);	//0.0

			boolean[] arrBoolean = new boolean[3];
			System.out.println(arrBoolean[0]);	//flase
		}
	}
```

---------------------

##### 定义数组的三种格式

```java
	class ArrayDemo1
	{
		public static void main(String[] args)
		{
			//定义数组的三种格式
			int[] arr0 = new int[2];
			int arr1[] = new int[3];
			int[] arr2 = new int[]{1,2,3};
			int[] arr3 = {1, 3, 4, 5};

			// System.out.println(arr2[4]);
			//ArrayIndexOutOfBoundsException: 4	数组越界异常

			arr2 = null;

			System.out.println(arr2[0]);	
			//NullPointerException 空指针异常
		}
	}
```

---------------------

##### 数组排序，获取最大值，打印数组

```java
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
```

-------------------------

##### 折半查找
```java
	class ArrayDemo3
	{
		public static void main(String[] args)
		{
			int[] arr = {2, 3, 1, 4, 5};
			int index = getIndex(arr, 2);
			System.out.println(index);

			int[] arr0 = {12, 23, 38, 41, 56, 63, 79};
			int index0 = halfSearch(arr0, 63);
			System.out.println(index0);

			int index1 = halfSearch_2(arr0, 56);
			System.out.println(index1);

			int index2 = getIndex_2(arr0, 39);
			System.out.println(index2);
		}
		public static int getIndex(int[] arr, int key)
		{
			for(int i = 0; i < arr.length; i++)
			{
				if(arr[i] == key)
				{
					return i;
				}
			}
			return -1;
		}
		public static int getIndex_2(int[] arr, int key)
		{
			int min = 0, max = arr.length - 1, mid;
			while(min <= max)
			{
				mid = (min + max)>>1;
				if(key > arr[mid])
				{
					min = mid + 1;
				}
				else if(key < arr[mid])
				{
					max = mid - 1;
				}
				else
				{
					return mid;
				}
			}
			return min;
		}
		public static int halfSearch_2(int[] arr, int key)
		{
			int min = 0, max = arr.length -1, mid;
			while(min <= max)
			{
				mid = (max + min)>>1;
				if(key > arr[mid])
				{
					min = mid + 1;
				}
				else if(key < arr[mid])
				{
					max = mid - 1;
				}
				else
				{
					return mid;
				}
			}
			return -1;
		}

		public static int halfSearch(int[] arr, int key)
		{
			int min, max, mid;
			min = 0;
			max = arr.length - 1;
			mid = (max + min)/2;

			while(arr[mid] != key)
			{
				if(key > arr[mid])
				{
					min = mid + 1;
				}
				else if(key < arr[mid])
				{
					max = mid - 1;
				}
				if(min > max)
				{
					return -1;
				}
				mid = (max + min)/2;
			}
			return mid;
		}
	}
```