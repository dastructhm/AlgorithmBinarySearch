import java.util.Scanner;

public class SetTarget {
    int ReadInTargetNumber(){
        System.out.print("Please enter your target number: ");
        Scanner UserTarget = new Scanner(System.in);
        return UserTarget.nextInt();
    }
}
