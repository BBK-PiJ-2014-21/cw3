import src.main.FunctionalArrayList;

/**
 * Class for launching the Junit test for implementation {@see FunctionalArrayList}
 * through the testing abstract classes {@see TestList} and {@see TestFunctionalList}.
 * 
 * @author federico bartolomei (bbk-pij-2014-21)
 */
public class FunctionalArrayListTest extends TestFunctionalList {
    /**
     * Create a FunctionalArrayList. 
     * 
     * @return the FunctionalArrayList to be passed on to TestList for tests against the interface {@see List}.
     */
    @Override
    protected FunctionalArrayList createList() {
        return new FunctionalArrayList();
    }
    /**
     * Create a FunctionalArrayList.
     *  
     * @return the FunctionalArrayList to be passed on to TestFunctionalList 
     * for tests against the interface {@see FunctionalList}.
     */
    @Override
    protected FunctionalArrayList createFunkList() {
        return new FunctionalArrayList();
    }

}