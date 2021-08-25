import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the first number? ");
        String num1str = scanner.nextLine();
        System.out.println("What is the second number? ");
        String num2str = scanner.nextLine();

        int num1 = Integer.parseInt(num1str);
        int num2 = Integer.parseInt(num2str);

        int add = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println(num1str + " + " + num2str + " = " + add + "\n" + num1str + " - " + num2str + " = " + sub + "\n" + num1str + " * " + num2str + " = " + mult + "\n" + num1str + " / " + num2str + " = " + div);
    }
}