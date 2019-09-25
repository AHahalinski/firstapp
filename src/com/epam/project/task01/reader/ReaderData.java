package com.epam.project.task01.reader;

import com.epam.project.task01.exception.FileNotExistHandlerException;
import com.epam.project.task01.exception.PathFileIsNullHandlerException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReaderData {

    public static List<String> read(String path) throws PathFileIsNullHandlerException,
                                                        FileNotExistHandlerException {
        if (path == null) {
            throw new PathFileIsNullHandlerException("Path is null");
        }

        File file = new File(path);

        if (file.exists() & file.isFile()) {
            String absolutePathPath = file.getAbsolutePath();

            Stream<String> lineStream = null;
            try {
                lineStream = Files.lines(Paths.get(absolutePathPath));
            } catch (IOException e) {
                throw new FileNotExistHandlerException(e);
            }
            List<String> lines = lineStream.collect(Collectors.toList());

            return lines;
        } else {
            throw new FileNotExistHandlerException("File not exist");
        }
    }
}
