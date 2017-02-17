package com.novauc;

/**
 * Created by psubedi2020 on 2/16/17.
 */
public class Post {

   int replyId;
   String author;
   String text;

   public Post(int replyId, String author, String text)  {
       this.replyId = replyId;
       this.author = author;
       this.text = text;
   }


}
