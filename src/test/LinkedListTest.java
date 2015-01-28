import src.main.FunctionalList;
import src.main.LinkedList;
/**
 *
 */
public class LinkedListTest extends TestList {
    /**
     *
     * @return
     */
    @Override
    protected LinkedList createList() {
        return new LinkedList();
    }
    /**
     *
     * @return
     */
    @Override
    protected FunctionalList createFunkList() {
        return null;
    }

}