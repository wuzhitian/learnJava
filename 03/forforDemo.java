class forforDemo
{
	public static void main(String[] args)
	{
		/*九九乘法*/
		// for(int x = 1; x <= 9; x++)
		// {
		// 	for(int y = 1; y <= x; y++)
		// 	{
		// 		System.out.print(x+"*"+y+"="+(x*y)+"\t");
		// 	}
		// 	System.out.println();
		// }
		
		/*对于打印长方形，外循环控制的行数，内循环控制的是每一行的列数*/
		// for(int x = 0; x < 3; x++)
		// {
		// 	for(int y = 0; y < 4; y++)
		// 	{
		// 		System.out.print("x");
		// 	}
		// 	System.out.println();
		// }
		
		/*
			*****
			****
			***
			**
			*
		 */
		// for(int x = 0; x < 5; x++)
		// {
		// 	for(int y = x; y < 5; y++)
		// 	{
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }
		
		/*
		*
		**
		***
		****
		*****
		 */
		// for(int j = 0; j < 5; j++)
		// {
		// 	for(int k = 0; k <= j; k++)
		// 	{
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }
		
		/*循环可以编号*/
		// w: for(int x = 0; x < 4; x++)
		// {
		// 	q: for(int y = 0; y < 4; y++)
		// 	{
		// 		System.out.println("x="+x);
		// 		// break w;
		// 		break;
		// 	}
		// }

		// for(int x = 1; x <= 10; x++)
		// {
		// 	if(x%2 == 1)
		// 	{
		// 		continue;
		// 	}
		// 	System.out.println("x="+x);
		// }
		
		/*
		    * 
		   * * 
		  * * * 
		 * * * * 
		* * * * * 
		 */
		for(int x = 0; x < 5; x++)
		{
			for(int y = x + 1; y < 5; y++)
			{
				System.out.print(" ");
			}
			for(int z = 0; z <= x; z++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}