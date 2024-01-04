import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        int [] array = new int[10];
        for (int i = 0 ; i<array.length; i++){
            array[i] = secureRandom.nextInt(90);
        }
        System.out.printf("%s%n%n", Arrays.toString(array));

        System.out.printf("please enter a number  :");
        int number  = input.nextInt();
        while (number != -1){
            int returnIndex = LinnerSearch.linnerSearchTest(array,number);
            if (returnIndex == -1){
                System.out.printf("%d was not found %n%n",number);
            }else {
                System.out.printf("%d was fount in position %d%n%n",number,returnIndex);
            }
            System.out.printf("enter -1 quit");
            number = input.nextInt();
        }
    }

}
