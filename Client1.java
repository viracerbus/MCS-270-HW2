
public class Client1 implements Callback {

	public void performCallback(int n) {
		System.out.println ("Value = " + n);
	}
	
	public static void main(String[] args) {
		Client1 check = new Client1();
	check.performCallback(10);

	}

}
