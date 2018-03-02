class Test1
{
	public static void main(String[] args)
	{
		byte b;
		int a=257;
		b=(byte)a;
		System.out.println("final b " + b);
		
		int m=128;
		byte n=(byte)m;
		System.out.println("final b when a is 128 " + m);

		int p=20;
		byte q=(byte)p;
		System.out.println("final b when a is 128 " + q);

		a=260;
		b=(byte)a;
		System.out.println("final b when a is 260 " + b);
		
	}
}