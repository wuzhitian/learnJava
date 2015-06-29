class ArrayDemo1
{
	public static void main(String[] args)
	{
		//定义数组的三种格式
		int[] arr0 = new int[2];
		int arr1[] = new int[3];
		int[] arr2 = new int[]{1,2,3};
		int[] arr3 = {12, 3, 4, 5};

		// System.out.println(arr2[4]);
		//ArrayIndexOutOfBoundsException: 4	数组越界异常

		arr2 = null;

		System.out.println(arr2[0]);	
		//NullPointerException 空指针异常
	}
}