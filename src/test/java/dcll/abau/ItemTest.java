package dcll.abau;

import junit.framework.TestCase;

public class ItemTest extends TestCase {

    public void testSetVal() throws Exception {
        Item i = new Item(2);
        i.setVal(4);
        assertEquals(i.getVal(), 4);
    }

    public void testGetVal() throws Exception {
        Item i = new Item(2);
        assertEquals(i.getVal(), 2);
    }
}