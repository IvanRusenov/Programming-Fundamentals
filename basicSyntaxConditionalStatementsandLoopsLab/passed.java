package basicSyntaxConditionalStatementsandLoopsLab;

import java.util.Scanner;

public class passed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());
        String message = "Passed!";
        if (grade >=3){
            System.out.println(message);
        }
    }
}
