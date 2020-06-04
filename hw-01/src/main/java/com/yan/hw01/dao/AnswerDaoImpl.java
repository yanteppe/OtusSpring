package com.yan.hw01.dao;

import com.yan.hw01.domain.Answer;
import com.yan.hw01.util.CsvParser;

import java.util.ArrayList;
import java.util.List;

public class AnswerDaoImpl implements AnswerDao {
   private String pathToFile;
   private List<Answer> answers;
   private final CsvParser csvParser;

   public AnswerDaoImpl(String pathToFile) {
      this.pathToFile = pathToFile;
      this.csvParser = new CsvParser();
   }

   public Answer getById(int id) {
      if (answers == null) {
         convertRowToAnswer();
      }
      return answers.get(id);
   }

   public List<Answer> getAll() {
      if (answers == null) {
         convertRowToAnswer();
      }
      return answers;
   }

   private void convertRowToAnswer() {
      answers = new ArrayList<>();
      for (String row : csvParser.parseFile(pathToFile)) {
         String[] split = row.split(", ");
         answers.add(new Answer(Integer.parseInt(split[0]), split[1]));
      }
   }
}
