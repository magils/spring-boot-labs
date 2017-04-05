package com.spring.boot.lab.data.rest.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spring.boot.lab.data.rest.util.JsonDateSerializer;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mgil on 4/5/17.
 */
@Entity
@Table(name="entry", schema = "journal")
public class JournalEntry {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    private Date created;
    private String summary;

    @Transient
    private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");


    public JournalEntry(){

    }

    public JournalEntry(Long id, String title, String created, String summary) throws ParseException {
        this.id = id;
        this.title = title;
        this.created = formatter.parse(created);
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }


    public void setCreated(Date created) {
        this.created = created;
    }

    @JsonSerialize(using= JsonDateSerializer.class)
    public Date getCreated() {
        return created;
    }

    @JsonIgnore
    public String getCreatedAsShort(){
        return this.formatter.format(created);
    }

    @Override
    public String toString() {
        return "JournalEntry{" +
                "summary='" + summary + '\'' +
                ", title='" + title + '\'' +
                ", id=" + id +
                ", created=" + formatter.format(created) +
                '}';
    }
}
