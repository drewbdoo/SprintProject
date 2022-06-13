package com.springBootCRUD.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "post")
public class Post {
    public Post() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="title")
    private String title;

//    @NotEmpty(message = "Write something for the love of Internet...")

    //Specifies the type of data field is to be TEXT
    @Column(name = "body", columnDefinition = "TEXT", nullable = false)
    private String body;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date", nullable = false,updatable = false)
    private Date currentDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", creationDate=" + currentDate +
//                ", comments=" + comments +
//                ", comments=" + comments.stream().map(Comment::toString).collect(Collectors.joining(",")) +
//                ", username=" + user.getUsername() +
//                ", user=" + user + // this way it is making the inf loop
                '}';
    }
}