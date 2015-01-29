import src.main.ArrayList;
/**
 * Class for launching the implementation {@see ArrayList} to JUnit testing class {@see TestList}.
 */
public class ArrayListTest extends TestList {
    /**
     * Create an ArrayList.
     *
     * @return the ArrayList to be passed on to TestList for tests against the interface {@see List}.
     */
	@Override
    protected ArrayList createList() {
        return new ArrayList();
	}
}