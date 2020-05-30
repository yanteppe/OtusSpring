package com.yan.hw01.dao;

import com.yan.hw01.domain.Answer;
import com.yan.hw01.util.CsvParser;

import java.util.ArrayList;
import java.util.List;

public class AnswerDaoImpl implements AnswerDao {
   private String pathToFile;
   private List<Answer> answers;
   private CsvParser csvParser;

   public AnswerDaoImpl(String pathToFile) {
      this.pathToFile = pathToFile;
      this.csvParser = new CsvParser();
      convertRowToAnswer();
   }

   public Answer getAnswerById(int id) {
      return answers.get(id);
   }

   public List<Answer> getAnswers() {
      return answers;
   }

   private void convertRowToAnswer() {
      answers = new ArrayList<>();
      for (String row : csvParser.parseFile(pathToFile)) {
         answers.add(new Answer(row));
      }
   }
}
