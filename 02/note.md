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

##### 赋值和比较运算符

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

