package com.yan.hw01;

import com.yan.hw01.service.QuestionnaireServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrintQuestions {
   public static void main(String[] args) {
      var context = new ClassPathXmlApplicationContext("/spring-context.xml");
      var questionnaire = context.getBean(QuestionnaireServiceImpl.class);
      questionnaire.getQuestions().forEach(System.out::println);
   }
}
