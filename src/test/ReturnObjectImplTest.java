package src.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import src.main.*;

import static org.junit.Assert.*;
/**
 * JUnit test for {@see ReturnObjectImpl}.
 *
 * @author federico bartolomei (bbk-pij-2014-21)
 */
public class ReturnObjectImplTest {
    private String validString;
    private Integer emptyInt;
    private ReturnObject valid;
    private ReturnObject empty;
    private ReturnObject bounds;
    private ReturnObject validNull;
    /**
     * Set up instances for the tests: validString for a ReturnObjectImpl carrying a valid String Object;
     * empty for a ReturnObjectImpl carrying an EMPTY_STRUCTURE {@see ErrorMessage};
     * bounds for a ReturnObjectImpl carrying an INDEX_OUT_OF_BOUNDS {@see ErrorMessage};
     * validNull for a ReturnObjectImpl with NO_ERROR carrying a null Integer.
     */
    @Before
    public void setUp() {
        validString = "valid String";
        emptyInt = null;
        valid = new ReturnObjectImpl(validString);
        empty = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        bounds = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        validNull = new ReturnObjectImpl(emptyInt);
    }
    /**
     * Test hasError() on a ReturnObjectImpl carrying a valid String object.
     */
    @Test
    public void testValidHasError() {
        assertFalse("hasError() should be false", valid.hasError());
    }
    /**
     * Test getError() on a ReturnObjectImpl carrying a valid String object.
     */
    @Test
    public void testValidGetError() {
        assertEquals(valid + " should output NO_ERROR", valid.getError(), ErrorMessage.NO_ERROR);
    }
    /**
     * Test getReturnValue() on a ReturnObjectImpl carrying a valid String object. 
     */
    @Test
    public void testValidGetReturnValue() {
        assertEquals(valid + " should output " + validString, valid.getReturnValue(), validString);
    }
    /**
     * Test hasError() on a EMPTY_STRUCTURE ReturnObjectImpl.
     */
    @Test
    public void testEmptyHasError() {
        assertTrue("hasError() should be true", empty.hasError());
    }
    /**
     * Test hasError() on an INDEX_OUT_OF_BOUNDS ReturnObjectImpl.
     */
    @Test
    public void testBoundsHasError() {
        assertTrue(bounds + " should carry an error", bounds.hasError());
    }
    /**
     * Test getError() on an EMPTY_STRUCTURE ReturnObjectImpl.
     */
    @Test
    public void testEmptyGetError() {
        assertEquals(empty + " should outputs INDEX_OUT_OF_BOUNDS", empty.getError(), ErrorMessage.EMPTY_STRUCTURE);
    }
    /**
     * Test getReturnValue() on an INDEX_OUT_OF_BOUNDS ReturnObjectImpl.
     */
    @Test
    public void testBoundsGetReturnValue() {
        assertNull(bounds + " should carry a Null Object", bounds.getReturnValue());
    }
    /**
     * Test getReturnValue() on a valid ReturnObjectImpl carrying a null Object.
     */
    @Test
    public void testValidNullGetReturnValue() {
        assertNull(validNull + " should return null", validNull.getReturnValue());
    }
    /**
     * Test getErrorMessage() on a valid ReturnObjectImpl carrying a null Object. 
     */
    @Test
    public void testValidNullGetError() {
        System.out.println(validNull.getError());
        assertEquals(validNull + " shouldn't carry an error", validNull.getError(), ErrorMessage.NO_ERROR);
    }
}