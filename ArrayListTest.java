// tests for both ArrayList and ReturnObjectImpl objects

public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayList test = new ArrayList();
		System.out.println("new ArrayList() created, with no elements.");
		System.out.print("testing size() >> ");
		System.out.println(test.size());
		System.out.print("testing isEmpty() >> ");
		System.out.println(test.isEmpty());
		System.out.print("testing get(0).hasError() >> ");
		System.out.println(test.get(0).hasError());
		System.out.print("testing get(0).getError() >> ");
		System.out.println(test.get(0).getError());
		System.out.print("testing get(0).getReturnValue() >> ");
		System.out.println(test.get(0).getReturnValue());
	}
	
}