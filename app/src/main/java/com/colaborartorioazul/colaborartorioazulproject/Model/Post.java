package com.colaborartorioazul.colaborartorioazulproject.Model;

public class Post {

    private String postid;
    private String postimage;
    private String description;
    private String title;
    private String publisher;

    public Post(String postid, String postimage, String title, String description, String publisher) {
        this.postid = postid;
        this.postimage = postimage;
        this.title = title;
        this.description = description;
        this.publisher = publisher;
    }

    public Post() {
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getPostimage() {
        return postimage;
    }

    public void setPostimage(String postimage) {
        this.postimage = postimage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitleDescription() {
        return title;
    }

    public void setTitleDescription(String titledescription) {
        this.title = titledescription;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
