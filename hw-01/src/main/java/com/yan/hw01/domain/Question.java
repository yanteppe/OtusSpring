package com.yan.hw01.domain;

public class Question {
   private int id;
   private String description;

   public Question(int id, String description) {
      this.id = id;
      this.description = description;
   }

   @Override
   public String toString() {
      return id + ", " + description;
   }
}
