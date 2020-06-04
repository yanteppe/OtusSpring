package com.yan.hw01.service;

public class PrinterServiceImpl implements PrinterService {
   private QuestionnaireService questionnaireService;

   public PrinterServiceImpl(QuestionnaireService questionnaireService) {
      this.questionnaireService = questionnaireService;
   }

   @Override
   public void print() {
      questionnaireService.getQuestions().forEach(System.out::println);
   }
}
