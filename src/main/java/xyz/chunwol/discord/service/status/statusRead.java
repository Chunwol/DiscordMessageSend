package xyz.chunwol.discord.service.status;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class statusRead {
    private static String filePath = "status.txt";
    public static String read() {
        try {
            Path path = Paths.get(filePath);
            List<String> content = Files.readAllLines(path);
            return content.get(0);
        } catch (IndexOutOfBoundsException | IOException e) {
           return "Not Find";
        }
    }
    public static String getFilePath() {
        return filePath;
    }

    public static void setFilePath(String filePath) {
        statusRead.filePath = filePath;
    }
}
