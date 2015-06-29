class foo1
{
	public static void main(String[] args)
	{
		System.out.println(compare(4, 4));

		// System.out.println(getSum(5, 5));	//此处不允许使用 "void" 类型
	}
	public static boolean compare(int a ,int b)
	{
		return a == b;
	}
	public static void getSum(int x, int y)
	{
		System.out.println(x + y);
	}
}N