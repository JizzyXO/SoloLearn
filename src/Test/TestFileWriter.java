package Test;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    private String fileName;
    private boolean appendMode;

    public TestFileWriter(String fileName, boolean appendMode) {
        this.fileName = fileName;
        this.appendMode = appendMode;
    }

    public void write(String data) throws IOException {
        FileWriter writer = new FileWriter(fileName, appendMode);
        writer.write(data);
        writer.close();
    }
}
