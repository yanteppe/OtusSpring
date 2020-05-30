package com.yan.hw01.service;

import com.yan.hw01.dao.AnswerDao;
import com.yan.hw01.dao.QuestionDao;
import com.yan.hw01.domain.Answer;
import com.yan.hw01.domain.Question;

import java.util.List;

public class QuestionnaireServiceImpl implements QuestionnaireService {
   private QuestionDao questionDao;
   private AnswerDao answerDao;

   public QuestionnaireServiceImpl(QuestionDao questionDao, AnswerDao answerDao) {
      this.questionDao = questionDao;
      this.answerDao = answerDao;
   }

   public Question getQuestionById(int id) {
      return questionDao.getQuestionById(id);
   }

   public List<Question> getQuestions() {
      return questionDao.getQuestions();
   }

   public Answer getAnswerById(int id) {
      return answerDao.getAnswerById(id);
   }

   public List<Answer> getAnswers() {
      return answerDao.getAnswers();
   }
}
