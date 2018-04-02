package com.kodilla;

import java.time.LocalDate;

public class Book {
    private String author;
    private String title;
    LocalDate date;

    public Book (String author, String title, int year,int month,int dayOfMonth){
        this.author = author;
        this.title = title;
        this.date = LocalDate.of(year, month,dayOfMonth);
    }

//    @Override
    public int hashCode() {
        return date.getYear();
    }

//    @Override
   public boolean equals(Object o) {
        final Book b = (Book) o;
        return (author.equals(b.author))&&(title.equals(b.title))&&(date.getYear()==b.date.getYear())&&(date.getMonthValue()==b.date.getMonthValue())&&(date.getDayOfMonth()==b.date.getDayOfMonth());


    }

    @Override
    public String toString() {
        return this.title;
    }
}
