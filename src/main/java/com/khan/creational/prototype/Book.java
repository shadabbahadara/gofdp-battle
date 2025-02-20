package com.khan.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Book implements Cloneable{
    private String title;
    private Author author;

    private List<String> chapters;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<String> getChapters() {
        return chapters;
    }

    public void setChapters(List<String> chapters) {
        this.chapters = chapters;
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        Book clone = (Book) super.clone();
        clone.author = this.author.clone();
        clone.chapters = new ArrayList<>(this.chapters);
        return clone;
    }
}
