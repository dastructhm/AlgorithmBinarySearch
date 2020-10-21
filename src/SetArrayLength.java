import java.util.Scanner;

public class SetArrayLength {
    int SetMyArrayLength(){
        System.out.print("Please enter your array's length: ");
        Scanner UserArrayLength = new Scanner(System.in);

        return UserArrayLength.nextInt();
    }
}
