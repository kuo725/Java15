package myJava15;

class CTest extends Thread {
	private String id;

	public CTest(String str) {
		id = str;
	}

//(a)
	public void run() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 1000000000; j++)
				;
			System.out.println(id + " " + i);
		}
	}
}

//(b)
public class Class02 {

	public static void main(String[] args) {
		CTest hi = new CTest("Hello");
		CTest bye = new CTest("Good bye");
		hi.run();
		bye.run();
	}
}
