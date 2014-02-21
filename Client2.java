
public class Client2 implements Callback{

	public void performCallback (int n) {
		System.out.println("Half = " + n/2);
	}
	
	public static void main(String[] args) {
		Client2 check = new Client2();
		check.performCallback(10);
		
	}

}
