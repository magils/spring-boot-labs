package com.spring.boot.lab.data.rest.repository;

import com.spring.boot.lab.data.rest.domain.Pet;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by mgil on 4/1/17.
 */
public interface PetRepository extends PagingAndSortingRepository<Pet,Integer> {
}
