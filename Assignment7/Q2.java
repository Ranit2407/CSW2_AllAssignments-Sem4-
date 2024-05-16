public class q2 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String: " + str);
// Trying to modify using concat
        str.concat(" World");
        System.out.println("After concat: " + str); // Remains "Hello" due to immutability
// Correct way to concatenate
        str = str.concat(" World");
        System.out.println("After correct concat: " + str);
// Using as CharSequence
        CharSequence cs = "Immutable";
        System.out.println("Char at 3 in CharSequence: " + cs.charAt(3)); // 'm'
    }
}