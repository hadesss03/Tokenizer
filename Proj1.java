import java.util.ArrayList;
import java.util.Scanner;

public class Proj1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> keywords = new ArrayList<>();
        String[] keywordArray = {"int", "float", "if", "else", "return", "while", "for", "char", "void", "main"};
        for (String kw : keywordArray) {
            keywords.add(kw);
        }

        ArrayList<Character> operators = new ArrayList<>();
        char[] operatorArray = {'+', '-', '*', '/', '=', '<', '>', '!'};
        for (char op : operatorArray) {
            operators.add(op);
        }

        while (true) {

            System.out.println("====================================");
            System.out.println("Hello World! Welcome to my Program!");
            System.out.println("PANTALUNAN, JOSH J.");
            System.out.println("BSCS 2B");
            System.out.println("=============== Menu ===============");
            System.out.println("1. Start the Program");
            System.out.println("2. Exit the Program");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println("====================================");
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter your code: ");
                String code = scanner.nextLine(); 
                System.out.println("\n====================================");

                ArrayList<String> tokens = new ArrayList<>();
                String token = "";

                for (int i = 0; i < code.length(); i++) {
                    char ch = code.charAt(i);

                    if (Character.isLetterOrDigit(ch) || ch == '_') { 
                        token += ch; 
                    } else {
                        if (!token.isEmpty()) { 
                            tokens.add(token);
                            token = "";
                        }
                        if (operators.contains(ch)) { 
                            tokens.add(String.valueOf(ch));
                        }
                    }
                }
                if (!token.isEmpty()) {
                    tokens.add(token);
                }

                System.out.println("\n=============================");
                System.out.printf("| %-15s | %-10s |\n", "TOKEN", "TYPE");
                System.out.println("=============================");

                for (String t : tokens) {
                    String type;
                    if (keywords.contains(t)) {
                        type = "KEYWORD";
                    } else if (t.length() == 1 && operators.contains(t.charAt(0))) {
                        type = "OPERATOR";
                    } else {
                        type = "IDENTIFIER";
                    }
                    System.out.printf("| %-15s | %-10s |\n", t, type);
                }

                System.out.println("=============================");

                System.out.println("\nReturning to the menu...");
            } else if (choice == 2) {
                System.out.println("Exiting the program...");
                scanner.close();
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    }
}