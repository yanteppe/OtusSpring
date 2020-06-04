package com.yan.hw01.dao;

import com.yan.hw01.domain.Question;
import com.yan.hw01.util.CsvParser;

import java.util.ArrayList;
import java.util.List;

public class QuestionDaoImpl implements QuestionDao {
   private String pathToFile;
   private List<Question> questions;
   private final CsvParser csvParser;

   public QuestionDaoImpl(String pathToFile) {
      this.pathToFile = pathToFile;
      this.csvParser = new CsvParser();
   }

   public Question getById(int id) {
      if (questions == null) {
         convertRowToQuestion();
      }
      return questions.get(id);
   }

   public List<Question> getAll() {
      if (questions == null) {
         convertRowToQuestion();
      }
      return questions;
   }

   private void convertRowToQuestion() {
      questions = new ArrayList<>();
      for (String row : csvParser.parseFile(pathToFile)) {
         String[] split = row.split(", ");
         questions.add(new Question(Integer.parseInt(split[0]), split[1]));
      }
   }
}
