
public class FunctionalLinkedListTest {
	
	public static void main(String[] args) {
		TestList launcher = new TestList();
		FunctionalList funky = new FunctionalLinkedList();
		System.out.println("=============================================");
		System.out.println("new FunctionalLinkedList() created, with no elements");
		System.out.println("=============================================");
		launcher.test1(funky);
		launcher.test2(funky);
		launcher.test3(funky);
		launcher.test4(funky);
		launcher.functionalTest(funky);
	}
	
}
		