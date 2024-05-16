import java.lang.reflect.Method;

public class q26_q27 {

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("NonExistentClass");


            Method method = clazz.getMethod("nonExistentMethod");
            method.invoke(null);

        } catch (ClassNotFoundException | NoSuchMethodException e) {
            System.out.println("Class or Method not found: " + e.getMessage());
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
