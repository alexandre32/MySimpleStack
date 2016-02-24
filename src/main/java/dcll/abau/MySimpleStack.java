package dcll.abau;



import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Created by 21102934 on 24/02/2016.
 */
public class MySimpleStack implements SimpleStack {

    ArrayList<Item> elements;


    public MySimpleStack() {
        elements = new ArrayList<Item>();
    }

    public boolean isEmpty()
    {
        return (elements.isEmpty());
    }

    public int getSize()
    {
        return elements.size();
    }

    public void push(Item item)
    {
        elements.add(item);
    }

    public Item peek() throws EmptyStackException
    {
        return elements.get(elements.size());
    }

    public Item pop() throws EmptyStackException
    {
        Item temp = elements.get(elements.size());
        elements.remove(elements.size());
        return temp;
    }


}
