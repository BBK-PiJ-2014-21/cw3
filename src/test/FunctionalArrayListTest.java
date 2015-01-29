import src.main.FunctionalArrayList;
/**
 * 
 */
public class FunctionalArrayListTest extends TestFunctionalList {
    /**
     *
     *  
     * @return
     */
    @Override
    protected FunctionalArrayList createList() {
        return new FunctionalArrayList();
    }

}

/*

// TODO add specific methods for FunctionalTESTS (create new abstract class?)
		funkList.add("String at index 0");
		funkList.add(0, 2);
		System.out.println("List 1, index 0: " + funkList.get(0).getReturnValue());
		System.out.println("List 1, index 1: " + funkList.get(1).getReturnValue());
// TODO check that is actually a copy and the original list is not affected!
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


		launcher.test1(funkList);
		launcher.test2(funkList);
		launcher.test3(funkList);
		launcher.test4(funkList);
		launcher.functionalTest(funkList);

	}

}
            
*/