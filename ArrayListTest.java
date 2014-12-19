// tests for both ArrayList and ReturnObjectImpl objects

public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayList test = new ArrayList();
		System.out.println("===============================================");
		System.out.println("new ArrayList() created, with no elements.");
		System.out.println("===============================================");
	// testing size(), isEmpty(), hasError(), getError()
		System.out.print("testing size() >> ");
		System.out.println(test.size());
		System.out.print("testing isEmpty() >> ");
		System.out.println(test.isEmpty());
		System.out.print("testing get(0).hasError() >> ");
		System.out.println(test.get(0).hasError());
		System.out.print("testing get(0).getError() >> ");
		System.out.println(test.get(0).getError());
		System.out.println("================================================");
	// testing get(), getReturnValue(), add(Object)
		System.out.print("testing get(0).getReturnValue() >> ");
		System.out.println(test.get(0).getReturnValue());
		System.out.println("testing add(\"String1\")");
		test.add("String1");
		test.printList();
		System.out.print("testing add(0.131).getReturnValue() >> ");
		System.out.println(test.add(0.131).getReturnValue());
		test.printList();
		System.out.print("testing add(null).getError() >> ");
		System.out.println(test.add(null).getError());
		test.printList();
		System.out.println("================================================");
	// testing remove(index, Object)
		System.out.print("testing remove(-1).getError() >> ");
		System.out.println(test.remove(-1).getError());
		test.printList();
		System.out.print("testing remove(1).getError() >> ");
		System.out.println(test.remove(1).getError());
		test.printList();
		System.out.print("testing remove(1).getError() >> ");
		System.out.println(test.remove(1).getError());
		test.printList();
		System.out.print("testing remove(0).getError() >> ");
		System.out.println(test.remove(0).getError());
		test.printList();
		System.out.print("testing remove(0).getError() >> ");
		System.out.println(test.remove(0).getError());
		test.printList();
		System.out.println("================================================");
	// testing add(index, Object)
		System.out.print("testing add(2, 13).getError() >> ");
		System.out.println(test.add(2, 13).getError());
		System.out.print("testing add(0, \"String1\").getReturnValue() >> ");
		System.out.println(test.add(0, "String1").getReturnValue());
		test.printList();
		System.out.print("testing add(0, 0.131).getReturnValue() >> ");
		System.out.println(test.add(0, 0.131).getReturnValue());
		test.printList();
		System.out.print("testing add(null).getError() >> ");
		System.out.println(test.add(null).getError());
		test.printList();
		System.out.print("testing add(1, 15).getReturnValue() >> ");
		System.out.println(test.add(1, 15).getReturnValue());
		test.printList();
		System.out.println("ArrayList john = new ArrayList()");
		ArrayList john = new ArrayList();
		System.out.print("testing add(0, john).getReturnValue() >> ");
		System.out.println(test.add(0, john).getReturnValue());
		test.printList();
		System.out.print("testing add(3, false).getReturnValue() >> ");
		System.out.println(test.add(3, false).getReturnValue());
		test.printList();
	}
	
}