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