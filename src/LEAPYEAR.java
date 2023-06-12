import java.util.Scanner;
//Input a year and find whether it is a leap year or not.
public class LEAPYEAR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int userInput = in.nextInt();
        userInput = userInput % 4;
        if (userInput == 0){
            System.out.println("It's a leap Year");
        }else {
            System.out.println("It's not a leap Year");
        }
    }
}
