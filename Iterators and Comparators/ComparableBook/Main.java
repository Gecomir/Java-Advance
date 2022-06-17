package IteratorsAndComparators.ComparableBook;

import IteratorsAndComparators.Book.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        IteratorsAndComparators.Book.Book bookOne = new IteratorsAndComparators.Book.Book("Animal Farm", 2003, "George Orwell");
        IteratorsAndComparators.Book.Book bookThree = new IteratorsAndComparators.Book.Book("The Documents in the Case", 2002);
        IteratorsAndComparators.Book.Book bookTwo = new IteratorsAndComparators.Book.Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<Book> books = new ArrayList<>();

        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
    }
}
