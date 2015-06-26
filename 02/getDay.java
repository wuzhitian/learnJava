class getDay
{
	public static void main(String[] args)
	{
		int x = 5;
		if(x > 12 || x < 1){		//先确定有效数据范围
			System.out.println("0");
		}else if(x >= 3 && x <=5){
			System.out.println("1");
		}else if(x >= 6 && x <= 8){
			System.out.println("2");
		}else if(x >= 9 && x <=11){
			System.out.println("3");
		}else{
			System.out.println("4");
		};
	}
}