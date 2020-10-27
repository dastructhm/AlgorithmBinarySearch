import java.util.Scanner;

public class SetLength {
    int SetMyArrayLength(){
        System.out.print("Enter array's length: ");
        Scanner UserArrayLength = new Scanner(System.in);

        return UserArrayLength.nextInt();
    }
}
