public class Fibonacci {

    public void printFibonacci() {
        int number1 = 0;
        int number2 = 1;
        int number3;
        int length = 10;

        System.out.print(number1 + "  " + number2);

        for (int i = 2; i < length; ++i) {
            number3 = number1 + number2;
            System.out.print(" " + number3);
            number1 = number2;
            number2 = number3;
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacci();
    }
}

