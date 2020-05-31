package com.yan.hw01;

import com.yan.hw01.service.QuestionnaireService;
import com.yan.hw01.service.QuestionnaireServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testing Questionnaire")
public class QuestionnaireTest {
   QuestionnaireService questionnaireService;

   @BeforeEach()
   void preconditions() {
      questionnaireService = new ClassPathXmlApplicationContext("/spring-context.xml")
            .getBean(QuestionnaireServiceImpl.class);
   }

   @Test()
   @DisplayName("Test method: getQuestions()")
   void getQuestionsTest() {
      List<String> expectedQuestions = Arrays.asList(
            "1, What is your name?",
            "2, What is your last name?",
            "3, What is your birthday?",
            "4, What is your month of birth?",
            "5, What is your year of birth?");
      List<String> actualQuestions = new ArrayList<>();
      questionnaireService.getQuestions().forEach(question -> actualQuestions.add(question.toString()));
      assertEquals(expectedQuestions, actualQuestions);
      actualQuestions.forEach(System.out::println);
   }

   @Test()
   @DisplayName("Test method: getQuestionsById()")
   void getQuestionsByIdTest() {
      String expectedQuestion = "3, What is your birthday?";
      String actualQuestion = questionnaireService.getQuestionById(2).toString();
      assertEquals(expectedQuestion, actualQuestion);
   }
}
