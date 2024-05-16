import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class q23_q24 {

    public static void main(String[] args) {

        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        try {
            throwCheckedException();
        } catch (FileNotFoundException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
    }
    public static void readFile(String filename) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
    public static void throwCheckedException() throws FileNotFoundException {
        throw new FileNotFoundException("File not found!");
    }
}
