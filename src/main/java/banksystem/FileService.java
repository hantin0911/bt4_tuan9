package banksystem;

public class FileService {
    /**
     * Joins a directory and a filename using a hardcoded separator.
     * This is intentionally buggy for cross-platform compatibility.
     */
    public String joinPath(String directory, String filename) {
        return java.nio.file.Path.of(directory, filename).toString();
    }
}
