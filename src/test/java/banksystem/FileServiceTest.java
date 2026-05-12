package banksystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FileServiceTest {
    @Test
    public void testJoinPath() {
        FileService fileService = new FileService();
        String directory = "logs";
        String filename = "app.log";
        
        // Use File.separator in expectation to make it platform-dependent
        String expected = "logs" + java.io.File.separator + "app.log"; 
        String actual = fileService.joinPath(directory, filename);
        
        assertEquals(expected, actual, "Path should be joined correctly");
    }
}
