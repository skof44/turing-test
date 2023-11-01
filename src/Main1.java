import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        System.out.println(str);
        System.out.print("Введите N: ");
        int N = in.nextInt();
        do {
            System.out.println(str);
            N--;
        }
        while (N > 0);
    }
}