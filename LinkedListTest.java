
public class LinkedListTest {
	
	public static void main(String[] args) {
	// testing size() and isEmpty()
		LinkedList test = new LinkedList();
		System.out.println("===================================");
		System.out.println("Created new LinkedList()");
		System.out.print("testing size() >> ");
		System.out.println(test.size());
		System.out.print("testing isEmpty() >> ");
		System.out.println(test.isEmpty());
		System.out.println("====================================");
	// testing get()
		System.out.print("get(0).hasError() >> ");
		System.out.println(test.get(0).hasError());
		System.out.print("get(0).getError() >> ");
		System.out.println(test.get(0).getError());
		System.out.println("===================================");
	// testing add(item), add(index, item) and get(index)
		System.out.print("add(0, 111).getError() >> ");
		System.out.println(test.add(3, 111).getError());
		System.out.print("size() >> ");
		System.out.println(test.size());
		System.out.print("add(111).getError() >> ");
		System.out.println(test.add(111).getError());
		System.out.print("size() >> ");
		System.out.println(test.size());
		test.printList();
		System.out.print("get(0).getReturnValue() >> ");
		System.out.println(test.get(0).getReturnValue());
		System.out.print("add(222.2).getError() >> ");
		System.out.println(test.add(222.2).getError());
		System.out.print("size() >> ");
		System.out.println(test.size());
		test.printList();
		System.out.print("get(1).getReturnValue() >> ");
		System.out.println(test.get(1).getReturnValue());
		System.out.print("add(0, \"Brand-new-Head\").getError() >> ");
		System.out.println(test.add(0, "Brand-new-Head").getError());
		System.out.print("size() >> ");
		System.out.println(test.size());
		test.printList();
		System.out.print("add(3, 333).getError() >> ");
		System.out.println(test.add(3, 333).getError());
		System.out.print("size() >> ");
		System.out.println(test.size());
		test.printList();
		System.out.print("add(2, \"Stringy at index 2\").getReturnValue() >> ");
		System.out.println(test.add(2, "Stringy at index 2").getReturnValue());
		System.out.print("size() >> ");
		System.out.println(test.size());
		test.printList();
		System.out.println("ArrayList newArray = new ArrayList()");
		ArrayList newArray = new ArrayList();
		System.out.print("add(newArray).getError() >> ");
		System.out.println(test.add(newArray).getError());
		System.out.print("size() >> ");
		System.out.println(test.size());
		test.printList();
		System.out.println("LinkedList newLinkedList = new LinkedList()");
		LinkedList newLinkedList = new LinkedList();
		System.out.print("add(newLinkedList).getError() >> ");
		System.out.println(test.add(newLinkedList).getError());
		System.out.print("size() >> ");
		System.out.println(test.size());
		test.printList();
		System.out.print("add(null).getError() >> ");
		System.out.println(test.add(null).getError());
		System.out.print("size() >> ");
		System.out.println(test.size());
		test.printList();
		System.out.println("===================================");
		
	}
	
}
		