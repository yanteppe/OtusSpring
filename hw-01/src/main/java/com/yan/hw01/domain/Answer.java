package com.yan.hw01.domain;

public class Answer {
   private int id;
   private String description;

   public Answer(int id, String description) {
      this.id = id;
      this.description = description;
   }

   @Override
   public String toString() {
      return id + ", " + description;
   }
}
