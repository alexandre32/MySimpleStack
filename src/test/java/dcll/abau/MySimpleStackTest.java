package dcll.abau;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class MySimpleStackTest extends TestCase {

    MySimpleStack s;

    @Before
    public void setUp() throws Exception {
        s = new MySimpleStack();
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(s.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        s.push(new Item(1));
        s.push(new Item(2));
        s.push(new Item(3));
        assertEquals(s.getSize(), 3);
    }

    @Test
    public void testPush() throws Exception {
        s.push(new Item(1));
        assertEquals(s.pop(), new Item(1));
    }

    @Test
    public void testPeek() throws Exception {
        s.push(new Item(1));
        assertEquals(s.pop(), new Item(1));
        assertTrue(!s.isEmpty());
    }

    @Test
    public void testPop() throws Exception {
        s.push(new Item(1));
        assertEquals(s.pop(), new Item(1));
        assertTrue(s.isEmpty());
    }
}