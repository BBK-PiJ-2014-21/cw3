
public class FunctionalArrayListTest {
	
	public static void main(String[] args) {
		TestList launcher = new TestList();
		FunctionalList funkList = new FunctionalArrayList();
		System.out.println("=============================================");
		System.out.println("new FunctionalArrayList() created, with no elements");
		System.out.println("=============================================");
		launcher.test1(funkList);
		launcher.test2(funkList);
		launcher.test3(funkList);
		launcher.test4(funkList);
		launcher.functionalTest(funkList);
	}

}