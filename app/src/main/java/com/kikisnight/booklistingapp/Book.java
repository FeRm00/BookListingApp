package com.kikisnight.booklistingapp;


/**
 * {@link Book} represents the tittle, author and url for each book
 * It contains the tittle of the book, the author, and the url to buy it.
 */

public class Book {

    private String mTittle;
    private String mAuthor;
    private String mUrl;


    /**
     * Constructs a new {@link Book} object.
     *
     * @param tittle is the tittle of the book
     * @param author is the author of the book
     * @param url is the website URL to find more details about the earthquake
     */
    public Book (String tittle, String author, String url) {
        mTittle = tittle;
        mAuthor = author;
        mUrl = url;
    }

    public String getTittle(){
        return mTittle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getUrl() {
        return mUrl;
    }
}
