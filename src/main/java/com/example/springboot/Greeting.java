package com.example.springboot;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Greeting {
    @Id
    private Long id;
    private String content;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}