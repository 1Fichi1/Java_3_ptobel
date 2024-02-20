import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку:");
            String input = scanner.nextLine();
            boolean isPalindrome = true;
            int left = 0, right = input.length() - 1;

            while (left < right) {
                while (left < right && input.charAt(left) == ' ') {
                    left++;
                }
                while (left < right && input.charAt(right) == ' ') {
                    right--;
                }
                if (Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) {
                System.out.println("Строка является палиндромом.");
                break;
            } else {
                System.out.println("Строка не является палиндромом. Пожалуйста, попробуйте снова.");
            }
        }

        scanner.close();
    }
}
