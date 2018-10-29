
public class TestException {

	public static void main(String[] args) {
		TestException te = new TestException();
		
		try {
			int j =te.divide(4, 8);
			for (int i=0; i<j; i++) {
				System.out.println("Hey there");
			}
		} catch (ArithmeticException e0) {
			System.out.println("Can't divide by zero");
		} catch (MyException e1) {
			System.out.println("Wow, my exception works! " + e1.getY());
			e1.printStackTrace();
		} catch (Exception e2) {
			//"catch all" kind of exception
			System.out.println("Didn't see that one coming ... ");
		} finally {
			System.out.println("All done");
		}
	}

	public int divide(int x, int y) throws MyException {
		if (y == 0) {
			MyException me = new MyException();
			me.setX(x);
			me.setY(y);
			throw me;
		}
		return x/y;
		
	}
}
