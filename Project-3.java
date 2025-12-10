import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = (a % 2 == 1) ? a : a - 1;
        if (count < 0) count = 0;
        for (int i = 0; i < count; i++) {
            System.out.print((2 * i + 1));
            if (i < count - 1) System.out.print(", ");
        }
        sc.close();
    }
}
