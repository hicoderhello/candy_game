
    import java.util.Scanner;

public class candy_game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the candy group integer: ");
        int number = scanner.nextInt();

        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit == 4) {
                count++;
            }
            number /= 10;
        }

        System.out.println("Number of occurrences of 4: " + count);
    }
}

    

