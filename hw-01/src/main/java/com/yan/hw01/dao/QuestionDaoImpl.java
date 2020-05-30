package com.yan.hw01.dao;

import com.yan.hw01.domain.Answer;
import com.yan.hw01.domain.Question;
import com.yan.hw01.util.CsvParser;

import java.util.ArrayList;
import java.util.List;

public class QuestionDaoImpl implements QuestionDao {
   private String pathToFile;
   private List<Question> questions;
   private CsvParser csvParser;

   public QuestionDaoImpl(String pathToFile) {
      this.pathToFile = pathToFile;
      this.csvParser = new CsvParser();
      convertRowToQuestion();
   }

   public Question getQuestionById(int id) {
      return questions.get(id);
   }

   public List<Question> getQuestions() {

      return questions;
   }

   private void convertRowToQuestion() {
      questions = new ArrayList<>();
      for (String row : csvParser.parseFile(pathToFile)) {
         questions.add(new Question(row));
      }
   }
}
