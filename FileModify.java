import java.io.*;

public class FileModify {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\praha\\OneDrive\\Desktop\\TASK-1\\Description.txt";  // File must exist before modifying
        String newContent = "This is the newly appended text.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.newLine();
            writer.write(newContent);
            System.out.println("Content appended successfully.");
        } catch (IOException e) {
            System.err.println("Error modifying file: " + e.getMessage());
        }
    }
}
