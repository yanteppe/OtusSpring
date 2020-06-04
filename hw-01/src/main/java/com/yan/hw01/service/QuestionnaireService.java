package com.yan.hw01.service;

import com.yan.hw01.domain.Answer;
import com.yan.hw01.domain.Question;

import java.util.List;

public interface QuestionnaireService {

   Question getQuestionById(int id);

   List<Question> getQuestions();

   Answer getAnswerById(int id);

   List<Answer> getAnswers();

   void print(Class clazz);
}
