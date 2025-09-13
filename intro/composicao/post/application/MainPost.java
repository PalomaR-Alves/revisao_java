package application;

import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class MainPost {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44",fmt),
                "Traveling to New Zealand",
                "I'm gonna visit this wonderful country!",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        sc.close();

    }
}
