import java.util.Scanner;
class Calculator {
    double a, b;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double add() { return a + b; }
    double sub() { return a - b; }
    double mul() { return a * b; }
    double div() { return b == 0 ? Double.NaN : a / b; }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String op = sc.next();

        Calculator c = new Calculator(a, b);

        switch (op.toLowerCase()) {
            case "add":
                System.out.println(c.add());
                break;
            case "sub":
                System.out.println(c.sub());
                break;
            case "mul":
                System.out.println(c.mul());
                break;
            case "div":
                System.out.println(c.div());
                break;
            default:
                System.out.println("Unknown operation");
        }

        sc.close();
    }
}
