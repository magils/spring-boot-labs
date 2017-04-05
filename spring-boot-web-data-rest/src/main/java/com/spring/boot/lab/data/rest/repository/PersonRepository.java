package com.spring.boot.lab.data.rest.repository;

import com.spring.boot.lab.data.rest.domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by mgil on 4/1/17.
 */
public interface  PersonRepository  extends PagingAndSortingRepository<Person,Long>{

    public List<Person> findByActive(@Param("active") Boolean active);

}
