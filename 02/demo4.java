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