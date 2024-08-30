public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator(10.5, 5.5);

        System.out.println("Subtraction: " + calc.subtract());
    
        System.out.println("Multiplication: " + calc.multiply());

        try {
            System.out.println("Division: " + calc.divide());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        calc.setNumber2(0);
        try {
            System.out.println("Division by zero: " + calc.divide());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
