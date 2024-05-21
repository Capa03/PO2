package pt.ipbeja.app.model;

import java.io.*;

public class FileReadWrite {

    public FileReadWrite() {}

    public String readFile() {
        StringBuilder formattedContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/words.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Trim the line and add it to the formatted content with a newline character
                formattedContent.append(line.trim()).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Remove the trailing newline character if it exists
        if (!formattedContent.isEmpty()) {
            formattedContent.setLength(formattedContent.length() - 1);
        }
        return formattedContent.toString();
    }

    public void writeFile(String content,String fileName,boolean append) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("src/main/resources/"+fileName+".txt",append))) {
            writer.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}