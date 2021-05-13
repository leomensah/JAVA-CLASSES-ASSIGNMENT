package assignments;

public class Area {
	int length;
	int breadth;
	
	public Area(int len, int bredt) {
		length = len;
		breadth = bredt;
	}
	
	public int returnArea() {
		return length * breadth;
	}
}
