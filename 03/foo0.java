class foo0
{
	public static void main(String[] args)
	{
		int x = getResult(6);
		System.out.println(x);

		getResult1(7);
	}
	/*函数定义的格式*/
	/*修饰符 返回值类型 函数名(参数类型 形式参数1, 参数类型 形式参数2)
	{
		执行语句;
		return 返回值;
	}*/
	public static int getResult(int num)
	{
		return num * 3 + 5;
	}

	/*void:代表的是函数没有具体返回值的情况*/
	/*当函数的返回值类型是void时，函数中的return可以省略不写*/
	public static void getResult1(int num)
	{
		System.out.println(num * 7 +4);
		return;	//可以省略
	}

	//函数中只可以调用函数，不能定义函数
}