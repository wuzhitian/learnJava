class operateDemo0
{
	public static void main(String[] args)
	{
		short s = 5;
		s = s + 5;	
		// 编译失败 因为s会被提升为int类型，
		// 运算后的结果还是int类型。无法赋值给short类型
		
		// s += 5; 		
		//编译成功	因为+=运算符在给s赋值是,自动完成了强转操作
		System.out.println("Hello\b World");
		System.out.println(s);

	}
}