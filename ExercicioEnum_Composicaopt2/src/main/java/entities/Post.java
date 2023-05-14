package entities;

import entities.Comment;

import java.util.ArrayList;
import java.util.Date;

public class Post {
    private Date moment;
    Comment comment;
    private String title;
    private String content;
    private int likes;

    private ArrayList<Comment>allComments = new ArrayList<>();

    public Post(){}

    public  Post (Date moment, String title, String content, int likes){

        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void addComment(Comment comment){
        allComments.add(comment);
    }


    public ArrayList<Comment> getAllComments() {
        return allComments;
    }

    public void setAllComments(ArrayList<Comment> allComments) {
        this.allComments = allComments;
    }
    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {

        StringBuilder st = new StringBuilder();
        st.append(title+"\n");
        st.append(likes+" Likes - " + moment +"\n");
        st.append(content+"\n");
        st.append("Comments: \n");

        for (Comment e:allComments) {
            st.append(e.getComment());
        }

        return st.toString();
    }
    }

