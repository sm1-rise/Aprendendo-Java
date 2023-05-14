package Aplication;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateTemplate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment  comment= new Comment("Have a nice trip\n");
        Comment comment1 = new Comment("Wow that's awesome\n");

        Post post0 = new Post(
                dateTemplate.parse("22/06/2018 13:05:44"), "Traveling to New Zealand",
                "I'm going to visit this wonderful country",
                12
        );

        post0.addComment(comment);
        post0.addComment(comment1);

        Comment  comment2= new Comment("Good night\n");
        Comment comment3 = new Comment("May the Force be with you\n");

        Post post1 = new Post(
                dateTemplate.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",5
        );

        post1.addComment(comment2);
        post1.addComment(comment3);

        System.out.println(post0);
        System.out.println(post1);





    }
}
