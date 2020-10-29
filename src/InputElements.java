import java.util.Scanner;

public class InputElements {
    void SetElements(int arrayLength, int[] myArray){
        // int[] myArray = {1, 3, 4, 6, 7, 8, 10, 13, 14, 18, 19, 21, 24, 37, 40, 45, 71};
        for(int i = 0; i < arrayLength; i++) {
            System.out.print("Enter element " + i + ": ");
            Scanner UserInput = new Scanner(System.in);
            myArray[i] = UserInput.nextInt();
        }
    }
}
