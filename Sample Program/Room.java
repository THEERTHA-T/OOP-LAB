class Room
{
	int roomno,roomarea;
	String roomtype;
	Room()
	{
		roomno=304;
		roomtype="large";
		roomarea=500;
	}
	Room(int rn,String rt,int ra)
	{
                roomno=rn;
                roomtype=rt;
                roomarea=ra;
	}
	void disp()
	{
		System.out.println("ROOM NUMBER ="+roomno);
                System.out.println("ROOM TYPE ="+roomtype);
                System.out.println("ROOM AREA ="+roomarea);
	}
	public static void main(String args[])
	{
		System.out.println("\nROOM 1 DETAILS\n");
		Room r1=new Room();
		r1.disp();
                System.out.println("\nROOM 2 DETAILS\n");
		Room r2=new Room(475,"small",230);
		r2.disp();
	}
}

