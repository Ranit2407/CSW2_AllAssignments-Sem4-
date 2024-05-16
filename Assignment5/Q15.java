public class q15 {
    public static void main(String[] args) {
        try {

            String str = "abc";
            int num;
            try {
                num = Integer.parseInt(str);
                int result = 10 / num;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.err.println("Inner Catch Block: ArithmeticException - " + e.getMessage());
            }
        } catch (NumberFormatException e) {
            System.err.println("Outer Catch Block: NumberFormatException - " + e.getMessage());
        }
    }
}
