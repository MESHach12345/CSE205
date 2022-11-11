package Lists;
import java.util.LinkedList;
import java.util.Arrays;

public class ListsTester
{
   public static void main(String[] args)
   {
      LinkedList<String> lst1 = new LinkedList<>(Arrays.asList("Peter", "Paul", "Mary"));
      String res1 = Lists.removeFirst(lst1);
      System.out.println(res1);
      System.out.println("Expected: Peter");
      System.out.println(lst1);
      System.out.println("Expected: [Paul, Mary]");
      LinkedList<String> lst2 = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
      String res2 = Lists.removeFirst(lst2);
      System.out.println(res2);
      System.out.println("Expected: A");
      System.out.println(lst2);
      System.out.println("Expected: [B, C, D, E]");      
   }
}