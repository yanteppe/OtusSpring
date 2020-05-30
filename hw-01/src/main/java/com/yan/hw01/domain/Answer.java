package com.yan.hw01.domain;

public class Answer {
   private int id;
   private String description;

   public Answer(String row) {
      String[] split = row.split(", ");
      this.id = Integer.parseInt(split[0]);
      this.description = split[1];
   }

   @Override
   public String toString() {
      return id + ", " + description;
   }
}
