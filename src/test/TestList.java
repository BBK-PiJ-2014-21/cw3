import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.main.*;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * Abstract class to test the various implementations of interface {@see List}.
 */
public abstract class TestList {
    private List list;
    private FunctionalList funkList;
    /**
     *
     */
    protected abstract List createList();
    /**
     * 
     */
    @Before
    public void setUp() {
        list = createList();
    }
    @After
    public void tearDown() {    
        list = null;
    }
    /**
     * 
     */
	@Test
    public void testEmptyListIsEmpty() {
        assertTrue(list.isEmpty());
    }
    /**
     * 
     */
    @Test
    public void testHamcrestWorks() {
        assertThat("Stringy", is(equalTo("Stringy")));
    }
    /**
     * 
     */
    @Test
    public void testRemoveOnEmptyList() {
        assertEquals(list.remove(0).getError(), ErrorMessage.EMPTY_STRUCTURE);
    }
    @Test
    public void testCompareListWithStackPopOneElement() {
        list.add("String1");
        StackImpl stack = new StackImpl(list);
        assertThat(list.get(0).getReturnValue(), sameInstance(stack.pop().getReturnValue()));
    }
    /**
     * 
     */
    @Test
    public void fiveAddsGetFirst() {
        fiveAdds();
        assertEquals(list.get(0).getReturnValue(), "StringAtIndex0");
    }
    /**
     *
     */
    public void fiveAdds() {
        list.add("StringAtIndex0");
        list.add(2);
        list.add(3.33);
        list.add("Four");
        list.add(true);
    }
    @Test
    public void testSizeAfterRemovingAllElements() {
        list.add(33);
        list.add(1);
        list.remove(0);
        assertEquals(list.get(0).getReturnValue(), 1);
    }
    /**
     * 
     */

    
    
    
    /*
    
	public void test2() {
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
	
	public void test3() {
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

	public void test4() {
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
    
    */
	
}
