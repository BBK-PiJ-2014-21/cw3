import src.main.LinkedList;

/**
 * Class for launching the Junit test for implementation {@see LinkedList}
 * through the testing abstract class {@see TestList}.
 * 
 * @author federico bartolomei (bbk-pij-2014-21)
 */
public class LinkedListTest extends TestList {
    /**
     * Create a LinkedList.
     *  
     * @return the LinkedList to be passed on to TestList for tests against the interface {@see List}.
     */
    @Override
    protected LinkedList createList() {
        return new LinkedList();
    }
}