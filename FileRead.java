import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\praha\\OneDrive\\Desktop\\TASK-1\\Description.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Reading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
