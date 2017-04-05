package com.spring.boot.labs.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Journal {

    private Long id;
    private String title;
    private Date created;
    private String summary;

    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    public Journal() {
    }

    public Journal(Long id, String title, Date created, String summary) {
        this.id = id;
        this.title = title;
        this.created = created;
        this.summary = summary;
    }

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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", created=" + created +
                ", summary='" + summary + '\'' +
                '}';
    }
}
