import src.main.ArrayList;
import src.main.FunctionalList;
/**
 * 
 */
public class ArrayListTest extends TestList {
    /**
     * 
     * @return
     */
	@Override
    protected ArrayList createList() {
        return new ArrayList();
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