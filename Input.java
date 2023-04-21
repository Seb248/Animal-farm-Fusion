import java.util.Scanner;
public class Input {
    static Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    
    public static String nextLine(){
        String UI = scanner.nextLine();  // Read user input
        return UI;
    }
    
    public static int nextInt(){
        int UI = scanner.nextInt();  // Read user input
        return UI;
    }
    
    public static double nextDouble(){
        double UI = scanner.nextDouble();  // Read user input
        return UI;
    }
    
    public static boolean nextBoolean(){
        boolean UI = scanner.nextBoolean();  // Read user input
        return UI;
    }
    
}