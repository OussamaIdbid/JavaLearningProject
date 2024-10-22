package org.testPackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TextReader {
    private String textPath;

    public TextReader(String textPath) {
        this.textPath = textPath;
    }

    private final Path getFile() {
        return Path.of(textPath);
    }

    public String getTextPath() {
        return textPath;
    }

    public List<String> getLines() throws IOException {
        Path textFile = getFile();
        return Files.readAllLines(textFile);
    }

}
