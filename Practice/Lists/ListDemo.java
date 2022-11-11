package Lists;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<>();
        staff.add("Diana");
        staff.add("Harry");
        staff.add("Romeo");
        staff.add("Tom");

        ListIterator<String> iterator = staff.listIterator(); //|DHRT
        iterator.next(); //D|HRT
        iterator.next(); //DH|RT

        iterator.add("Juliet"); //DHJ|RT
        iterator.add("Nina"); //DHJN|RT

        iterator.next(); //DHJNR|T
        iterator.remove(); //DHJN|T

        System.out.println(staff);
        System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
    }
}