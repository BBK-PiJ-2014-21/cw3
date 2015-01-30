import src.main.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Abstract class to test with JUnit the implementations of the interface {@see FunctionalList}.
 * All the extended methods of that interface are tested here. These implementations can also run 
 * the tests in the superclass {@see TestList} regarding the inherited methods of {@see List}.
 *
 * @author federico bartolomei (bbk-pij-2014-21) 
 */
public abstract class TestFunctionalList extends TestList {
    private FunctionalList list;
    /**
     * This abstract method has to be implemented by each subclass which needs to run this tests.
     *
     * @return the specific implementation of {@see FunctionalList}.
     */
    protected abstract FunctionalList createFunkList();
    /**
     * 
     */
    @Before
    public void setUpAndTestList() {
        list = createFunkList();
    }
    @After
    public void tearDown() {
        list = null;
    }

    @Test
    public void testHeadOnEmptyList() {
        assertNull(list.head().getReturnValue());
    }
    
}
