## day02
##### 进制
	
	072			//八进制
	0x4d7a		//十六进制

##### 类型转换
	
	//java里面，数字默认是int类型

	byte b = 2;
	b = b + 4;	//会引起丢失精度报错

	b = (byte)(b + 4);	//类型强制转换

-----------------------

	class demo4
	{
		public static void main(String[] args)
		{
			char ch = 'a';
			// ch = ch + 1;	//编译报错，可能损失精度
			ch = (char)(ch+1);
			System.out.println(ch);
		}
	}
	
-----------------------

```java
	class demo5
	{
		public static void main(String[] args)
		{
			int x = 4270;
			x = x / 1000 * 1000;
			//由于x / 1000是4.270，int是整数类型，会自动舍弃小数点后面的值；
			////实际上相当于 x / 1000 * 1000 = 4 * 1000 = 4000;

			System.out.println(x);		//4000
			float y = 4270;
			y = y / 1000 * 1000;
			System.out.println(y);		//4270.0
		}
	}
```

##### 赋值和比较运算符

```java
	class operateDemo0
	{
		public static void main(String[] args)
		{
			short s = 5;
			// s = s + 5;	
			// 编译失败 因为s会被提升为int类型，
			// 运算后的结果还是int类型。无法赋值给short类型
			
			s += 5; 		
			//编译成功	因为+=运算符在给s赋值是,自动完成了强转操作
			System.out.println("Hello\b World");
			System.out.println(s);
		}
	}
```

##### 逻辑运算符
	/*
	^: 异或：两边相同，结果为false;
			 两边不同，结果为true;
		true ^ true = false;
		true ^ false = true;
		false ^ true = true;
		false ^ false = false;
	 */
	/*
		int a = 2; a > 3 && a < 6;
		&和&&的特点:
		&: 无论左边是true还是false，右边都运算；
		&&: 当左边为false时，右边不运算；
		|: 两边都参与运算；
		||: 当左边为true时，右边不运算；
	 */

##### 位运算

	<<(左移)相当于乘以2的移动位数次幂;
	>>(右移)相当于除以2的移动位数次幂取整;
```java
	class operateDemo2
	{
		public static void main(String[] args)
		{
			int a0 = 1;
			int b0 = a0 << 2;		//1 * (2*2) = 4;

			int a1 = 1;
			int b1 = a1 << 3;		//1 * (2*2*2) = 8;
			System.out.println("b0=" + b0 + ", b1=" + b1);

			int c0 = 13;
			int d0 = c0>>2;			// (int)(13 / (2*2)) = 3;
			
			int c1 = 17;			
			int d1 = c1>>4;			// (int)(17 / (2*2*2*2)) = 1;
			System.out.println("d0=" + d0 + ", d1=" + d1);
		}
	}
```

“与运算”，“或运算”和“异或运算”
	
	&:
		6 & 3 = 2;
		110
	  & 011
	--------
		010	= 2;

	|:
		6 | 3 = 7;
		110
	  |	011
	---------
		111 = 7;

	^:
		6 ^ 3 = 5;
		110
	  ^	011
	----------
		101 = 5;

位运算乘法

	2 * 8 = 16;
	2<<3 = 16;

变量互换

	int n = 3, m = 8;
	n = n + m;
	m = n - m;
	n = n - m;

"异或运算符^"；一个数连续'异或'另个一数两次, 等于原数; eg: 5 ^ 3 ^ 3 = 5; 

	int a = 3, b = 8;
	a = a ^ b;	//(a ^ b);
	b = a ^ b;	//(a ^ b) ^ b;
	a = a ^ b;	//(a ^ b) ^ ((a ^ b) ^ b);

通过"&"运算进行进制转换
	
	//十进制转十六进制实现
	/*计算原理
		0000-0000 0000-0000 0000-0000 0011-1100 = 60;
		60 & 15(为了取到最小四位上有效的值"1", 4位二进制表示1位十六进制);
		0000-0000 0000-0000 0000-0000 0011-1100
		0000-0000 0000-0000 0000-0000 0000-1111
		------------------------------------------
	n1=	0000-0000 0000-0000 0000-0000 0000-1100 = 12;

		取到第一位十六进制的值后，取第二位十六进制的值，将原数右移四位;
		60 >> 4;
		0000-0000 0000-0000 0000-0000 0000-0011		(-1100)
		0000-0000 0000-0000 0000-0000 0000-1111
		------------------------------------------
	n2=	0000-0000 0000-0000 0000-0000 0000-0011 = 3;
	*/

	class operateDemo6
	{
		public static void main(String[] arg)
		{
			int num = 60;

			//获取60的最低4位，通过 & 15; 
			int n1 = num & 15;

			System.out.println((char)(n1 - 10 + 'A'));

			//要获取下一组四位，将60右移4位;
			int temp = 60 >> 4;

			//对temp的值进行最低四位的获取.
			int n2 = temp & 15;
			
			System.out.println(n2);
		}
	}

关于季节月份判断处理

```java	
	class getDay
	{
		public static void main(String[] args)
		{
			int x = 5;
			if(x > 12 || x < 1){		//先确定有效数据范围
				System.out.println("0");
			}else if(x >= 3 && x <=5){
				System.out.println("1");
			}else if(x >= 6 && x <= 8){
				System.out.println("2");
			}else if(x >= 9 && x <=11){
				System.out.println("3");
			}else{
				System.out.println("4");
			};
		}
	}
```

关于switch: 

```java
	switch(x) 	//x只能为byte short int char四中类型
	{
		case 1:
			System.out.println("a");
			break;
		case 2:
			System.out.println("b");
			break;
		case 3:
			System.out.println("c");
			break;
		case 4:
			System.out.println("d");
			break;
	}
```