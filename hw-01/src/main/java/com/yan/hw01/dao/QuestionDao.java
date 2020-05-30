package com.yan.hw01.dao;

import com.yan.hw01.domain.Question;

import java.util.List;

public interface QuestionDao {

   Question getQuestionById(int id);

   List<Question> getQuestions();
}
