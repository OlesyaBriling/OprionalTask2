import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int n = in.nextInt();
        int[] numbers = new int[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }


        {

            for (int i = n-1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int a = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = a;
                    }
                }
            }
            for (int i = 0; i < n; i++)
                System.out.println(numbers[i]);
            }

    }
}

