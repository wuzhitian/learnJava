class ArrayDemo4
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		toBin(28);
	}
	/*十进制-->二进制*/
	public static void toBin(int num)
	{
		StringBuffer sb = new StringBuffer();
		while(num > 0)
		{
			sb.append(num % 2);
			num = num / 2;
		}
		System.out.println(sb.reverse());
	}
}