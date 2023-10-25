//Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z)

import java.util.Scanner;

public class paragram{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine().toLowerCase();
        scanner.close();

        boolean isPangram = isPangram(inputSentence);
        
        if (isPangram) {
            System.out.println("It's a pangram!");
        } else {
            System.out.println("It's not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}
