import src.main.FunctionalLinkedList;

/**
 * Class for launching the Junit test for implementation {@see FunctionalLinkedList}
 * through the testing abstract classes {@see TestList} and {@see TestFunctionalList}.
 * 
 * @author federico bartolomei (bbk-pij-2014-21)
 */
public class FunctionalLinkedListTest extends TestFunctionalList {
    /**
     * Create a FunctionalLinkedList.
     * 
     * @return the FunctionalLinkedList to be passed on to TestList for tests against the interface {@see List}.
     */
    @Override
    protected FunctionalLinkedList createList() {
        return new FunctionalLinkedList();
    }
    /**
     * Create a FunctionalLinkedList.
     * 
     * @return the FunctionalLinkedList to be passed on to TestFunctionalList
     * for tests against the interface {@see FunctionalList}.
     */
    @Override
    protected FunctionalLinkedList createFunkList() {
        return new FunctionalLinkedList();
    }

}