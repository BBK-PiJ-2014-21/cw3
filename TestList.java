
public class TestList {

	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		System.out.println("=============================================");
		System.out.println("new ArrayList() created, with no elements");
		System.out.println("=============================================");
		test1(aList);
		aList.printList();
		System.out.println("=============================================");
		test2(aList);
		aList.printList();
		System.out.println("=============================================");
		test3(aList);
		aList.printList();
		System.out.println("=============================================");
		test4(aList);
		aList.printList();
		System.out.println("=============================================");
		LinkedList lList = new LinkedList();
		System.out.println("=============================================");
		System.out.println("new LinkedList() created, with no elements");
		System.out.println("=============================================");
		test1(lList);
		lList.printList();
		System.out.println("=============================================");
		test2(lList);
		lList.printList();
		System.out.println("=============================================");
		test3(lList);
		lList.printList();
		System.out.println("=============================================");
		test4(lList);
		lList.printList();
		System.out.println("=============================================");
		FunctionalArrayList funkList = new FunctionalArrayList();
		System.out.println("=============================================");
		System.out.println("new FunctionalArrayList() created, with no elements");
		System.out.println("=============================================");
		test1(funkList);
		lList.printList();
		System.out.println("=============================================");
		test2(funkList);
		lList.printList();
		System.out.println("=============================================");
		test3(funkList);
		lList.printList();
		System.out.println("=============================================");
		test4(funkList);
		lList.printList();
		System.out.println("=============================================");
		System.out.print("testing head().getReturnValue() > ");
		System.out.println(funkList.head().getReturnValue());
		System.out.println("test4(rest())");
		test4(funkList.rest());
		System.out.println("=============================================");
		
	}	
		
	public static void test1(List test) {
	// testing size(), isEmpty(), hasError(), getError()
		System.out.print("size() >> ");
		System.out.println(test.size());
		System.out.print("isEmpty() >> ");
		System.out.println(test.isEmpty());
		System.out.print("get(0).hasError() >> ");
		System.out.println(test.get(0).hasError());
		System.out.print("get(0).getError() >> ");
		System.out.println(test.get(0).getError());
	}
	
	public static void test2(List test) {
	// testing get(), getReturnValue(), add(Object)
		System.out.print("get(0).getReturnValue() >> ");
		System.out.println(test.get(0).getReturnValue());
		System.out.print("add(\"String1\").getReturnValue() >> ");
		System.out.println(test.add("String1").getReturnValue());
		System.out.print("size() >> ");
		System.out.println(test.size());
		System.out.print("add(0.131).getReturnValue() >> ");
		System.out.println(test.add(0.131).getReturnValue());
		System.out.print("size() >> ");
		System.out.println(test.size());
		System.out.print("get(0).getReturnValue() >> ");
		System.out.println(test.get(0).getReturnValue());
		System.out.print("add(null).getError() >> ");
		System.out.println(test.add(null).getError());
		System.out.print("size() >> ");
		System.out.println(test.size());
		System.out.println("LinkedList newLinkedList = new LinkedList()");
		LinkedList newLinkedList = new LinkedList();
		System.out.print("add(newLinkedList).getError() >> ");
		System.out.println(test.add(newLinkedList).getError());
		System.out.print("size() >> ");
		System.out.println(test.size());
	}
	
	public static void test3(List test) {
	// testing add(index, Object)
		System.out.print("add(0, 13).getError() >> ");
		System.out.println(test.add(0, 13).getError());
		System.out.print("size() >> ");
		System.out.println(test.size());
		System.out.print("add(0, \"String at index 0\").getReturnValue() >> ");
		System.out.println(test.add(0, "String at index 0").getReturnValue());
		System.out.print("size() >> ");
		System.out.println(test.size());
		System.out.print("add(3, 33333.333).getReturnValue() >> ");
		System.out.println(test.add(3, 33333.333).getReturnValue());
		System.out.print("size() >> ");
		System.out.println(test.size());
		System.out.print("add(4, null).getError() >> ");
		System.out.println(test.add(4, null).getError());
		System.out.print("size() >> ");
		System.out.println(test.size());
		System.out.print("add(1, 15).getReturnValue() >> ");
		System.out.println(test.add(1, 15).getReturnValue());
		System.out.print("size() >> ");
		System.out.println(test.size());
		System.out.print("add(3, false).getReturnValue() >> ");
		System.out.println(test.add(3, false).getReturnValue());
		System.out.print("size() >> ");
		System.out.println(test.size());
		System.out.println("ArrayList array2 = new ArrayList()");
		ArrayList array2 = new ArrayList();
		System.out.println("array2.add(\"Tim\")");
		array2.add("Tim");
		System.out.println("printList(array2)");
		array2.printList();
		System.out.println("============");
		System.out.println("add(array2))");
		test.add(array2);
	} 
	
	public static void test4(List test) {
	// testing remove(index, Object)
		System.out.print("remove(9).getError() >> ");
		System.out.println(test.remove(9).getError());
		System.out.print("size() >> ");
		System.out.println(test.size());
		System.out.print("remove(8).getReturnValue() >> ");
		System.out.println(test.remove(8).getReturnValue());
		System.out.print("size() >> ");
		System.out.println(test.size());
		System.out.print("remove(1).getReturnValue() >> ");
		System.out.println(test.remove(1).getReturnValue());
		System.out.print("size() >> ");
		System.out.println(test.size());
		System.out.print("remove(0).getReturnValue() >> ");
		System.out.println(test.remove(0).getReturnValue());
		System.out.print("size() >> ");
		System.out.println(test.size());
		System.out.print("remove(0).getReturnValue() >> ");
		System.out.println(test.remove(0).getReturnValue());
		System.out.print("size() >> ");
		System.out.println(test.size());
	}
	
}
