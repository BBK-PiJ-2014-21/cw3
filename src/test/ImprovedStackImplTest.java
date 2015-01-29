import org.junit.Test;
import src.main.*;
import sun.awt.image.ImageWatched;

import static org.junit.Assert.*;

//TODO double check internalList of original stack is not affected by reverse() method of copied stack

public class ImprovedStackImplTest {
    
    @Test
    public void testReversedStackDoesNotAffectOriginal() {
        LinkedList link = new LinkedList();
        link.add(1);
        link.add("Stringy");
        link.add("INDEX2");
        ImprovedStack stack = new ImprovedStackImpl(link);
        ImprovedStack stacky = stack.reverse();
        stacky.pop();
        assertEquals(stack.top().getReturnValue(), "INDEX2");
        assertEquals(stacky.top().getReturnValue(), "Stringy");
    }
    @Test
    public void testRemoveTwoElementssNextToEachOther() {
        LinkedList link = new LinkedList();
        link.add(33);
        link.add(33);
        link.add(1);
        ImprovedStack stacky = new ImprovedStackImpl(link);
        stacky.remove(33);
        assertEquals(stacky.size(), 1);
    }
    @Test
    public void testRemoveAllElements() {
        LinkedList link = new LinkedList();
        link.add(33);
        link.add(33);
        link.add(33);
        ImprovedStack stacky = new ImprovedStackImpl(link);
        stacky.remove(33);
        assertEquals(stacky.size(), 0);
    }
}