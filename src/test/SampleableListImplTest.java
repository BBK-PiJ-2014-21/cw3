import org.junit.Test;
import src.main.*;

import static org.junit.Assert.*;

/**
 * Class for launching the Junit test for implementation {@see SampleableListImpl}
 * through the testing abstract class {@see TestList}.
 * This class has also internal tests for its specific method from interface {@see SampleableList}.
 * 
 * @author federico bartolomei (bbk-pij-2014-21) 
 */
public class SampleableListImplTest extends TestList {
    /**
     * Create an empty SampleableListImpl to run {@see TestList}.
     *
     * @return the List to be passed on to TestList for tests against the interface {@see List}.
     */
    @Override
    protected SampleableListImpl createList() {
        return new SampleableListImpl();
    }
    /**
     * Method to avoid code repetition, to be used for various tests. It creates a new {@see LinkedList}
     * and add() four elements to it. Creation and addition of element for this implementation should have
     * passed {@see LinkedListTest} successfully.
     *
     * @return a LinkedList with four elements.
     */
    public LinkedList createLinkedList() {
        LinkedList four = new LinkedList();
        four.add("Sting");
        four.add(1);
        four.add(3.33);
        four.add(false);
        return four;
    }
    /**
     * Method to avoid code repetition, to be used for various tests. It creates a new SampleableListImpl
     * with the LinkedList created with the previous method as internal data structure.
     * 
     * @return a SampleableListImpl with four elements (see previous method). 
     */
    public SampleableListImpl createSampleable() {
        return new SampleableListImpl(createLinkedList());
    }
    
    @Test
    public void testSampleOnEmptyListShouldReturnAnEmptyList() {
        List empty = new ArrayList();
        SampleableList emptyList = new SampleableListImpl(empty);
        assertEquals("Size should be 0", emptyList.sample().size(), 0);
    }

    @Test
    public void testSampleFourElementsList() {
        SampleableList copy = createSampleable();
        SampleableList sampled = copy.sample();
        assertEquals("Size should be 2", sampled.size(), 2);
    }
    
    @Test
    public void testSampleATwoElementsListAndCompareWithOriginal() {
        List two = new FunctionalArrayList();
        two.add("Stingy");
        two.add(2);
        SampleableList sampled = new SampleableListImpl(two);
        assertEquals("Size should be 1", sampled.sample().size(), 1);
        assertEquals("Original list size should still be 2", two.size(), 2);
        assertEquals(sampled.size(), 2);
    }
    
    @Test
    public void testNotSampledFirstElementReturnValue() {
        SampleableList original = new SampleableListImpl(createLinkedList());
        SampleableList copy = new SampleableListImpl(original);
        assertEquals("Should return the same object", copy.get(0).getReturnValue(), original.get(0).getReturnValue());
    }

    @Test
    public void testSampledSecondElementReturnValue() {
        SampleableList original = createSampleable();
        SampleableList copy = original.sample();
        assertEquals("Should be 3.33 (the item at index 2 in the original list)", copy.get(1).getReturnValue(), 3.33);
    }
    
}
		