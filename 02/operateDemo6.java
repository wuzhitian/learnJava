//十进制转十六进制实现
class operateDemo6
{
	public static void main(String[] arg)
	{
		int num = 60;

		//获取60的最低4位，通过 & 15; 
		int n1 = num & 15;

		System.out.println(n1 < 9 ? n1 :(char)(n1 - 10 + 'A'));		//显示67，因为做三元运算后，char类型被强转成int了

		//要获取下一组四位，将60右移4位;
		int temp = 60 >> 4;

		//对temp的值进行最低四位的获取.
		int n2 = temp & 15;

		System.out.println(n2 < 9 ? n2 :(char)(n2 - 10 + 'A'));
	}
}