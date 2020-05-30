package com.yan.hw01.dao;

import com.yan.hw01.domain.Answer;

import java.util.List;

public interface AnswerDao {

   Answer getAnswerById(int id);

   List<Answer> getAnswers();
}
