package seleniumNov;

public class TestComputer {

	public static void main(String[] args) {
		Computer myComputer = new Computer (420,"Black", "Mac", 1400);
		Computer myMac = new Computer (420, "Pink", "Mac", 1200);
		myComputer.showMe();
	}	
	
}
