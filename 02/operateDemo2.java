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