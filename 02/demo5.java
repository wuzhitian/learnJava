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