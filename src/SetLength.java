import java.util.Scanner;
// 导入java.util中的Scanner类

public class SetLength {
    int SetMyArrayLength(){
        System.out.print("Enter array's length: ");
        Scanner UserArrayLength = new Scanner(System.in);

        return UserArrayLength.nextInt();
    }
}
