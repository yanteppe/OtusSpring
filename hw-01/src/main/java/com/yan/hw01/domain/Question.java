package com.yan.hw01.domain;

public class Question {
   private int id;
   private String description;

   public Question(String row) {
      String[] split = row.split(", ");
      this.id = Integer.parseInt(split[0]);
      this.description = split[1];
   }

   @Override
   public String toString() {
      return id + ", " + description;
   }
}
