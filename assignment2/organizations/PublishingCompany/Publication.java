package assignment2.organizations.PublishingCompany;

import assignment2.commons.Person;
import assignment2.organizations.party.Election;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Publication {



    private String title;
    private String author;
    private int publishDate;

    //Constructor

    public Publication(String title, String author, int publishDate){
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
    }

    //Getter methods

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }
    public Object getTitle() {
        return true;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Publication{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", publishDate='").append(publishDate).append('\'');
        sb.append('}');
        return sb.toString();
    }


    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;
        Publication publication = (Publication) p;
        return Objects.equals(title, publication.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}


