/*
Получить колекцию пользователя на основе файла и вывести на экран столбиком

**/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        File myFile = new File("Text.txt");
        List<String> result = Files.lines(Paths.get(String.valueOf(myFile)), StandardCharsets.UTF_8).collect(Collectors.toList());

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
}
