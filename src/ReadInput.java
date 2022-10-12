import java.util.Scanner;

public class ReadInput {

    public static String read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression in the form [4*3/2+1]");

        String input = sc.nextLine();
        sc.close();
        return input;
    }
}
