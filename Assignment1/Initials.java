import java.util.Scanner;

public class Initials {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String nameInput = scan.nextLine();

        String initials = nameToInitials(nameInput);

        System.out.println("Initials for " + nameInput + " : " +initials);

        scan.close();
    }

    public static String nameToInitials(String name) {
        String initials = "";
        char nameInitial;
        
        nameInitial = name.charAt(0);

        initials = nameInitial + ".";

        for (int i = 1; i < name.length()-1; i++) {
            if (name.charAt(i) == ' ') {
                nameInitial = name.charAt(i+1);
                initials = initials + " " + nameInitial + ".";
            }
        }

        return initials;
    }
}
