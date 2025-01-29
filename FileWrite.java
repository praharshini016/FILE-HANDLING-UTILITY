import java.io.*;

public class FileWrite {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\praha\\OneDrive\\Desktop\\TASK-1\\Description.txt";
        String content = "This is a sample text written to the file.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("File written successfully: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
