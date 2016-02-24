package dcll.abau;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class ItemTest extends TestCase {

    public Item i;

    @Before
    public void setUp() throws Exception {
        i = new Item(2);

    }

    @Test
    public void testSetVal() throws Exception {
        i.setVal(4);
        assertEquals(i.getVal(), 4);
    }

    @Test
    public void testGetVal() throws Exception {
        assertEquals(i.getVal(), 2);
    }
}