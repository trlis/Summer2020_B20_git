import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = input.nextLine();

        String result ="";

        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            result += "" + ch;

        }
        System.out.println(result);

    }
}
