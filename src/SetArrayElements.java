// int[] myArray = {1, 3, 4, 6, 7, 8, 10, 13, 14, 18, 19, 21, 24, 37, 40, 45, 71};

import java.util.Scanner;

public class SetArrayElements {
    void SetElements(int arrayLength, int[] myArray){
        for(int i = 0; i < arrayLength; i++) {
            System.out.print("Please enter element " + i + ": ");
            Scanner UserInput = new Scanner(System.in);
            myArray[i] = UserInput.nextInt();
        }
    }
}
