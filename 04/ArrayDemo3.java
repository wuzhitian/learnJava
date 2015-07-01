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