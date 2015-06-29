## day03

for循环的最简单的无限循环表达，当条件判断语句为空的时候，默认为真

```java	
	class forDemo
	{
		public static void main(String[] args)
		{
			/*for循环的最简单的无限循环表达*/
			for(;;)
			{
				System.out.println("A");
			}
		}
	}
```

forforDemo
	
```java
	/*
		*****
		****
		***
		**
		*
	 */
	for(int x = 0; x < 5; x++)
	{
		for(int y = x; y < 5; y++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	/*
	*
	**
	***
	****
	*****
	 */
	for(int j = 0; j < 5; j++)
	{
		for(int k = 0; k <= j; k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	/*九九乘法*/
	for(int x = 1; x <= 9; x++)
	{
		for(int y = 1; y <= x; y++)
		{
			System.out.print(x+"*"+y+"="+(x*y)+"\t");
		}
		System.out.println();
	}
```

循环可以编号

```java
	w: for(int x = 0; x < 4; x++)
	{
		q: for(int y = 0; y < 4; y++)
		{
			System.out.println("x="+x);
			// break w;
			break;
		}
	}
```

```java
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
```

重载

当定义的功能相同，单参与运算的未知内容不同。那么，这时定义一个韩数码城以表示其功能，方便阅读，而通过参数列表的不同来区分多个同名函数。重载的判定与返回值的类型无关，至于参数列表有关