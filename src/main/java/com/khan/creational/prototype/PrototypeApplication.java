package com.khan.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeApplication {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book java = new Book();
        Author author = new Author();
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");
        author.setName("Joshua Bloch");

        java.setTitle("effective java");
        java.setAuthor(author);
        java.setChapters(chapters);

        Book cloned = java.clone();

        System.out.println("original: " + java);
        System.out.println("cloned: "+ cloned);

        System.out.println("original: " + java.getAuthor());
        System.out.println("cloned: "+ cloned.getAuthor());

        System.out.println("original: " + java.getChapters());
        System.out.println("cloned: "+ cloned.getChapters());

        System.out.println("is chapter object cloned? " + (java.getChapters() != cloned.getChapters()));



    }
}
