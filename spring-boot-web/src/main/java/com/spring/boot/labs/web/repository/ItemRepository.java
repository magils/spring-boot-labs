package com.spring.boot.labs.web.repository;

import com.spring.boot.labs.web.domain.Item;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by mgil on 4/1/17.
 */
public interface ItemRepository extends PagingAndSortingRepository<Item,Integer> {
}
