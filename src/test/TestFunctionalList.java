import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import src.main.FunctionalList;

import static org.junit.Assert.*;

/**
 *
 * @author federico bartolomei (bbk-pij-2014-21) 
 */
public abstract class TestFunctionalList {
    private FunctionalList list;
    /**
     * 
     * @return
     */
    protected abstract FunctionalList createList();
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
    public void testHeadOnEmptyList() {
        assertNotNull(list.head().getReturnValue());
    }
    
    
    
}
