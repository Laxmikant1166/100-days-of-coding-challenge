import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        System.out.println("\nString Length: " + inputString.length());

        System.out.print("Enter another string to concatenate: ");
        String stringToConcat = scanner.nextLine();
        System.out.println("Concatenated String: " + inputString.concat(" " + stringToConcat));

        System.out.print("Enter another string to compare: ");
        String stringToCompare = scanner.nextLine();
        if (inputString.equals(stringToCompare)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        System.out.println("Uppercase: " + inputString.toUpperCase());
        System.out.println("Lowercase: " + inputString.toLowerCase());

        System.out.print("Enter a string with leading/trailing spaces: ");
        String stringToTrim = scanner.nextLine();
        System.out.println("Trimmed String: '" + stringToTrim.trim() + "'");

        System.out.print("Enter the starting index for substring: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the ending index for substring: ");
        int endIndex = scanner.nextInt();
        System.out.println("Extracted Substring: " + inputString.substring(startIndex, endIndex));

        scanner.nextLine();

        System.out.print("Enter a string to split (with commas): ");
        String stringToSplit = scanner.nextLine();
        String[] substrings = stringToSplit.split(",");
        System.out.println("Splitted Substrings:");
        for (String substring : substrings) {
            System.out.println(substring.trim());
        }

        StringBuilder reversedString = new StringBuilder(inputString).reverse();
        System.out.println("Reversed String: " + reversedString);

        System.out.print("Enter a substring to search for: ");
        String substringToSearch = scanner.nextLine();
        if (inputString.contains(substringToSearch)) {
            System.out.println("Substring found.");
        } else {
            System.out.println("Substring not found.");
        }

        scanner.close();
    }
}
