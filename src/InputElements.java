import java.util.Scanner;

public class InputElements {
    void SetElements(int arrayLength, int[] myArray){
        for(int i = 0; i < arrayLength; i++) {
            System.out.print("Please enter element " + i + ": ");
            Scanner UserInput = new Scanner(System.in);
            myArray[i] = UserInput.nextInt();
        }
    }
}
