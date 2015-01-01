
public class TestList {

	public void test1(List test) {
		System.out.println("=============================================");
	// testing size(), isEmpty(), hasError(), getError()
		System.out.print("size() >> ");
		System.out.println(test.size());
		System.out.print("isEmpty() >> ");
		System.out.println(test.isEmpty());
		System.out.print("get(0).hasError() >> ");
		System.out.println(test.get(0).hasError());
		System.out.print("get(0).getError() >> ");
		System.out.println(test.get(0).getError());
		printList(test);
	}
	
	public void test2(List test) {
	// testing get(), getReturnValue(), add(Object)
		System.out.print("get(0).getReturnValue() >> ");
		System.out.println(test.get(0).getReturnValue());
		System.out.print("add(\"String1\").getReturnValue() >> ");
		System.out.println(test.add("String1").getReturnValue());
		printList(test);
		System.out.print("add(0.131).getReturnValue() >> ");
		System.out.println(test.add(0.131).getReturnValue());
		printList(test);
		System.out.print("get(0).getReturnValue() >> ");
		System.out.println(test.get(0).getReturnValue());
		System.out.print("add(null).getError() >> ");
		System.out.println(test.add(null).getError());
		printList(test);
		System.out.println("LinkedList newLinkedList = new LinkedList()");
		LinkedList newLinkedList = new LinkedList();
		System.out.print("add(newLinkedList).getError() >> ");
		System.out.println(test.add(newLinkedList).getError());
		printList(test);
	}
	
	public void test3(List test) {
	// testing add(index, Object)
		System.out.print("add(0, 13).getError() >> ");
		System.out.println(test.add(0, 13).getError());
		printList(test);
		System.out.print("add(0, \"String at index 0\").getReturnValue() >> ");
		System.out.println(test.add(0, "String at index 0").getReturnValue());
		printList(test);
		System.out.print("add(3, 33333.333).getReturnValue() >> ");
		System.out.println(test.add(3, 33333.333).getReturnValue());
		printList(test);
		System.out.print("add(4, null).getError() >> ");
		System.out.println(test.add(4, null).getError());
		System.out.print("add(1, 15).getReturnValue() >> ");
		System.out.println(test.add(1, 15).getReturnValue());
		printList(test);
		System.out.print("add(3, false).getReturnValue() >> ");
		System.out.println(test.add(3, false).getReturnValue());
		printList(test);
		System.out.println("ArrayList array2 = new ArrayList()");
		ArrayList array2 = new ArrayList();
		System.out.println("array2.add(\"Tim\")");
		array2.add("Tim");
		System.out.println("printList(array2)");
		printList(array2);
		System.out.println("============");
		System.out.println("add(array2))");
		test.add(array2);
		printList(test);
	}

	public void test4(List test) {
	// testing remove(index, Object)
		System.out.print("remove(9).getError() >> ");
		System.out.println(test.remove(9).getError());
		printList(test);
		System.out.print("remove(8).getReturnValue() >> ");
		System.out.println(test.remove(8).getReturnValue());
		printList(test);
		System.out.print("remove(1).getReturnValue() >> ");
		System.out.println(test.remove(1).getReturnValue());
		printList(test);
		System.out.print("remove(0).getReturnValue() >> ");
		System.out.println(test.remove(0).getReturnValue());
		printList(test);
		System.out.print("remove(0).getReturnValue() >> ");
		System.out.println(test.remove(0).getReturnValue());
		printList(test);
	}
	
	public void functionalTest(FunctionalList f) {
		System.out.println("=============================================");
		System.out.println("FUNCTIONAL_LIST TEST");
		System.out.println("=============================================");
		System.out.print("testing head().getReturnValue() > ");
		System.out.println(f.head().getReturnValue());
		System.out.println("=============================================");
		System.out.println("testing rest().printList()");
		printList(f.rest());
	}
	
	public void printList(List list) {
		System.out.println("=============================================");
		if(list.isEmpty()) {
			System.out.println("The list is empty");
		} else {
			for(int i=0; i<list.size(); i++) {
				System.out.println("index " + i + ": " + list.get(i).getReturnValue());
			}
		}
		System.out.println("SIZE: " + list.size());
		System.out.println("=============================================");
	}
	

	
}
