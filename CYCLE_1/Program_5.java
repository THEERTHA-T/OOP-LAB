class CPU
{
	int price;
	public void disp(int p)
	{
		System.out.println("\n----CPU DETAILS----\n");
		System.out.println("PRICE  = "+p);

	}

	class Processor
	{
		int no_of_cores;
		String manufacturer;
		public void disp(int c,String m)
		{
			System.out.println("\n--PROCESSOR DETAILS--\n");
			System.out.println("NUMBER OF CORES  = "+c);
			System.out.println("MANUFACTURER     = "+m);
		}

	}
	static class RAM
	{
		static int memory;
		static String manufacturer;
		public void disp(int my,String m)
		{
			System.out.println("\n--RAM DETAILS--\n");
			System.out.println("MEMORY         = "+my);
			System.out.println("MANUFACTURER   = "+m);
		}
	}
}
class Program_5
{
	public static void main(String args[])
	{
		CPU c=new CPU();
		c.disp(14000);
		CPU.Processor p=c.new Processor();
		p.disp(6,"AMD");
		CPU.RAM r=new CPU.RAM();
		r.disp(4,"Micron");
	}
}