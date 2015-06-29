### day04 Array
	
初始化数组

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

定义数组的三种格式

	class ArrayDemo1
	{
		public static void main(String[] args)
		{
			//定义数组的三种格式
			int[] arr0 = new int[2];
			int arr1[] = new int[3];
			int[] arr2 = new int[]{1,2,3};

			// System.out.println(arr2[4]);
			//ArrayIndexOutOfBoundsException: 4	数组越界异常

			arr2 = null;

			System.out.println(arr2[0]);	
			//NullPointerException 空指针异常
		}
	}

---------------------