
public class TestList {

	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		System.out.println("=============================================");
		System.out.println("new ArrayList() created, with no elements");
		System.out.println("=============================================");
		test1(aList);
		printList(aList);
		System.out.println("=============================================");
		test2(aList);
		printList(aList);
		System.out.println("=============================================");
		test3(aList);
		printList(aList);
		System.out.println("=============================================");
		test4(aList);
		printList(aList);
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
		System.out.println("add(\"String1\").getError()");
		test.add("String1").getError();
		System.out.print("add(0.131).getReturnValue() >> ");
		System.out.println(test.add(0.131).getReturnValue());
		System.out.print("get(0).getReturnValue() >> ");
		System.out.println(test.get(0).getReturnValue());
		System.out.print("add(null).getError() >> ");
		System.out.println(test.add(null).getError());
	}
	
	public static void test3(List test) {
	// testing remove(index, Object)
		System.out.print("remove(-1).getError() >> ");
		System.out.println(test.remove(-1).getError());
		System.out.print("remove(1).getError() >> ");
		System.out.println(test.remove(1).getError());
		System.out.print("remove(1).getError() >> ");
		System.out.println(test.remove(1).getError());
		System.out.print("remove(0).getError() >> ");
		System.out.println(test.remove(0).getError());
		System.out.print("remove(0).getError() >> ");
		System.out.println(test.remove(0).getError());
	}
	
	public static void test4(List test) {
	// testing add(index, Object)
		System.out.print("add(0, 13).getError() >> ");
		System.out.println(test.add(0, 13).getError());
		System.out.print("add(\"String at index 0\").getReturnValue() >> ");
		System.out.println(test.add("String at index 0").getReturnValue());
		System.out.print("add(0.131).getReturnValue() >> ");
		System.out.println(test.add(0.131).getReturnValue());
		System.out.print("add(null).getError() >> ");
		System.out.println(test.add(null).getError());
		System.out.print("add(1, 15).getReturnValue() >> ");
		System.out.println(test.add(1, 15).getReturnValue());
		System.out.print("add(3, false).getReturnValue() >> ");
		System.out.println(test.add(3, false).getReturnValue());
		System.out.println("ArrayList array2 = new ArrayList()");
		ArrayList array2 = new ArrayList();
		System.out.println("array2.add(\"Tim\")");
		array2.add("Tim");
		System.out.println("printList(array2)");
		printList(array2);
		System.out.println("============");
		System.out.println("add(array2))");
		test.add(array2);
	}
	
	public static void printList(ArrayList test) {
		if(test.isEmpty()) {
			System.out.println("The list is empty");
		} else {
			for(int i=0; i<test.size(); i++) {
				System.out.println("index " + i + ": " + test.get(i).getReturnValue());
			}
		}
	}
	
}