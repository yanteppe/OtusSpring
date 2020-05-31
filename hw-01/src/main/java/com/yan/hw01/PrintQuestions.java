package com.yan.hw01;

import com.yan.hw01.service.QuestionnaireServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrintQuestions {
   public static void main(String[] args) {
      new ClassPathXmlApplicationContext("/spring-context.xml")
            .getBean(QuestionnaireServiceImpl.class)
            .getQuestions().forEach(System.out::println);
   }
}
