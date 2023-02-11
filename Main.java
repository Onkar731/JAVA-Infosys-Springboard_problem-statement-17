import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String letter = sc.next();

        // checking whether character is in lowercase or uppercase
        // using findCase() method of LetterCase class
        System.out.println(LetterCase.findCase(letter));

        // closing resource
        sc.close();
    }
}
