public class FunctionalArrayListTest {
	
	public static void main(String[] args) {
		TestList launcher = new TestList();
		FunctionalList funkList = new FunctionalArrayList();
		System.out.println("=============================================");
		System.out.println("new FunctionalArrayList() created, with no elements");
		System.out.println("=============================================");
	
		funkList.add("String at index 0");
		funkList.add(0, 2);
		System.out.println("List 1, index 0: " + funkList.get(0).getReturnValue());
		System.out.println("List 1, index 1: " + funkList.get(1).getReturnValue());

		FunctionalList secondList = funkList.rest();
		System.out.println("List 2, index 0: " + secondList.get(0).getReturnValue());
		System.out.println("List 2, index 1: " + secondList.get(1).getReturnValue());
		secondList.remove(0);
		System.out.println("Removed index 0 in secondList");
		System.out.println("List 2, index 0: " + secondList.get(0).getReturnValue());
		System.out.println("List 2, index 1: " + secondList.get(1).getReturnValue());
		System.out.println("List 1, index 0: " + funkList.get(0).getReturnValue());
		System.out.println("List 1, index 1: " + funkList.get(1).getReturnValue());
		System.out.println("List 2, index 0: " + secondList.get(0).getReturnValue());

	/*	
		launcher.test1(funkList);
		launcher.test2(funkList);
		launcher.test3(funkList);
		launcher.test4(funkList);
		launcher.functionalTest(funkList);
	*/
	}

}