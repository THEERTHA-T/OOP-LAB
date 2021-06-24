import java.io.*;
class Product
{
	String pcode;
	int price;
	String pname;
	void read(String p,String n,int pc)
	{
		pcode=p;
		pname=n;
		price=pc;
	}
}
class Program_1
{
	public static void main(String args[])
	{
		Product p1=new Product();
		p1.read("CRT72","abc",1000);
		Product p2=new Product();
		p2.read("TYH4205","xyz",7500);
		Product p3=new Product();
		p3.read("VMK2022","mno",3200);
		if(p1.price<p2.price&&p1.price<p3.price)
		{
			System.out.println("LOWEST PRICE IS "+p1.price+" FOR PRODUCT  "+p1.pcode);
		}
		else  if(p2.price<p1.price&&p2.price<p3.price)
		{
			System.out.println("LOWEST PRICE IS "+p2.price+" FOR PRODUCT  "+p2.pcode);
		}
		else
		{
			System.out.println("LOWEST PRICE IS "+p3.price+" FOR PRODUCT  "+p3.pcode);
		}
	}
}