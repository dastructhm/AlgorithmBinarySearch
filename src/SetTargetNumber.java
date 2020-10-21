import java.util.Scanner;

public class SetTargetNumber {
    int ReadInTargetNumber(){
        System.out.println("Please enter your target number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
