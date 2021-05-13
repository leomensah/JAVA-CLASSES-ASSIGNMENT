package assignments;
/* Write a program to create a room class, 
 * the attributes of this class is roomno, 
 * roomtype,roomarea and ACmachine. In this 
 * class the member functions are setdata and 
 * displaydata.
 */

public class Room {
	private int roomno;
	private String roomtype;
	private String roomarea;
	private boolean ACmachine;
	
	public void setdata() {
		roomno = 123;
		roomtype = "Two Bed room";
		roomarea = "Kofikrom";
		ACmachine = true;
	}
	
	public void displaydata() {
		System.out.println("Room no is "+ roomno + "room type is "+ roomtype + "room area is "+ roomarea);
	}

}
