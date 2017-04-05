package com.spring.boot.lab.data.rest.repository;

import com.spring.boot.lab.data.rest.domain.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mgil on 4/5/17.
 */
public interface JournalEntryRepository extends JpaRepository<JournalEntry,Long>{
}
