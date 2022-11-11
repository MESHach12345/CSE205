package Lists;
import java.util.Iterator;
import java.util.LinkedList;

public class Lists
{
    public static String removeFirst(LinkedList<String> strings)
    {
        Iterator<String> iter = strings.iterator();
        String result = null;

        if (iter.hasNext()) {
            result = iter.next();
            iter.remove();
        }
        
        return result;
    }
}