package com.epam.project.task01.reader;

import com.epam.project.task01.exception_handler.FileNotExistHandlerException;
import com.epam.project.task01.exception_handler.PathFileIsNullException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReaderData {

    public static List<String> read(String path) throws PathFileIsNullException,
                                                        FileNotExistHandlerException,
                                                        IOException {
        if (path == null) {
            throw new PathFileIsNullException();
        }

        File file = new File(path);

        if (file.exists() & file.isFile()) {
            String absolutePathPath = file.getAbsolutePath();

            Stream<String> lineStream = Files.lines(Paths.get(absolutePathPath));
            List<String> lines = lineStream.collect(Collectors.toList());

            return lines;
        } else {
            throw new FileNotExistHandlerException();
        }
    }
}
