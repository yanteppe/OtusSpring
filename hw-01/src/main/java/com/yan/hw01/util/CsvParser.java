package com.yan.hw01.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvParser implements FileParser {
   List<String> rows = new ArrayList<>();

   public List<String> getRows() {
      return rows;
   }

   public List<String> parseFile(String pathToFile) {
      try (var bufferedReader = Files.newBufferedReader(Paths.get(pathToFile))) {
         String row;
         while ((row = bufferedReader.readLine()) != null) {
            rows.add(row);
         }
      } catch (IOException ioException) {
         ioException.printStackTrace();
      }
      return rows;
   }
}