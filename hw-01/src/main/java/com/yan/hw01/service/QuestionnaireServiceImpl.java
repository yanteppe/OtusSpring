package com.yan.hw01.service;

import com.yan.hw01.dao.AnswerDao;
import com.yan.hw01.dao.DataAccessObject;
import com.yan.hw01.dao.QuestionDao;
import com.yan.hw01.domain.Answer;
import com.yan.hw01.domain.Question;

import java.util.List;

public class QuestionnaireServiceImpl implements QuestionnaireService {
   private final QuestionDao questionDao;
   private final AnswerDao answerDao;

   public QuestionnaireServiceImpl(DataAccessObject<Question> questionDao, DataAccessObject<Answer> answerDao) {
      this.questionDao = (QuestionDao) questionDao;
      this.answerDao = (AnswerDao) answerDao;
   }

   @Override
   public Question getQuestionById(int id) {
      return questionDao.getById(id);
   }

   @Override
   public List<Question> getQuestions() {
      return questionDao.getAll();
   }

   @Override
   public Answer getAnswerById(int id) {
      return answerDao.getById(id);
   }

   @Override
   public List<Answer> getAnswers() {
      return answerDao.getAll();
   }

   @Override
   public void print(Class clazz) {
      if (clazz == Question.class) {
         questionDao.getAll().forEach(System.out::println);
      } else {
         answerDao.getAll().forEach(System.out::println);
      }
   }
}
