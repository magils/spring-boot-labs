package com.spring.boot.labs.service;

import com.spring.boot.labs.domain.Journal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class JournalService {

    private static final Logger log = LoggerFactory.getLogger(JournalService.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void insertData(){

        log.info("Creating table...");

        jdbcTemplate.execute("DROP TABLE JOURNAL IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE JOURNAL(id SERIAL,title VARCHAR(255),summary VARCHAR(255),created TIMESTAMP)");

        log.info("Inserting in the table...");

        jdbcTemplate.execute("INSERT INTO JOURNAL(TITLE,SUMMARY,CREATED) VALUES('Dummy value #1','Dummy summary #1','2016-01-11 00:00:00.000')");
        jdbcTemplate.execute("INSERT INTO JOURNAL(TITLE,SUMMARY,CREATED) VALUES('Dummy value #2','Dummy summary #2','2016-01-12 00:00:00.000')");
        jdbcTemplate.execute("INSERT INTO JOURNAL(TITLE,SUMMARY,CREATED) VALUES('Dummy value #3','Dummy summary #3','2016-01-13 00:00:00.000')");
        jdbcTemplate.execute("INSERT INTO JOURNAL(TITLE,SUMMARY,CREATED) VALUES('Dummy value #4','Dummy summary #4','2016-01-14 00:00:00.000')");


        log.info("Done!");

    }

    public List<Journal> findAll(){

        List<Journal> entries = new ArrayList<>();

        jdbcTemplate.query("SELECT * FROM JOURNAL",new Object[]{},(rs,row) ->
                new Journal(rs.getLong("id"),rs.getString("title"),new Date(rs.getTimestamp("created").getTime()),rs.getString("summary"))
        ).forEach(entry -> entries.add(entry));

        return entries;
    }



}
