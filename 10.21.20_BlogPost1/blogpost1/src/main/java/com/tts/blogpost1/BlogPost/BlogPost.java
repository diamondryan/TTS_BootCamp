package com.tts.blogpost1.BlogPost;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// 5 "@"
@Entity
public class BlogPost {
    
    // 1 properties aka fields aka attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String author;
    private String blogEntry;

    // 2 constructors
    public BlogPost(String title, String author, String blogEntry) {
        this.title = title; 
        this.author = author;
	    this.blogEntry = blogEntry;
    }

    public BlogPost(){
        
    }

    // 3 getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBlogEntry() {
        return blogEntry;
    }

    public void setBlogEntry(String blogEntry) {
        this.blogEntry = blogEntry;
    }

    // 4 toString
    @Override
    public String toString() {
        return "BlogPost [author=" + author + ", blogEntry=" + blogEntry + ", id=" + id + ", title=" + title + "]";
    }


    
}

