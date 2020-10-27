import java.util.Scanner;

public class SetTarget {
    int ReadInTargetNumber(){
        System.out.print("Enter target element: ");
        Scanner UserTarget = new Scanner(System.in);
        return UserTarget.nextInt();
    }
}
