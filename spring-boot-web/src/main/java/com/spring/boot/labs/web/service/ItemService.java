package com.spring.boot.labs.web.service;

import com.spring.boot.labs.web.domain.Item;
import com.spring.boot.labs.web.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mgil on 4/1/17.
 */
@Service
public class ItemService {

   @Autowired
   private ItemRepository itemRepository;

   public void insertItems(int quantity){

       for(int x = 1 ; x <= quantity ; x++ ){

           Item item = new Item();

           item.setId(x);
           item.setDescription(String.format("Generic Item #%d", x));
           item.setName(String.format("Item #%d",x));

           itemRepository.save(item);

       }
   }

   public List<Item> generateItems(int quantity){

       List<Item> items = new ArrayList<>();

       for(int x = 1 ; x <= quantity ; x++ ){

           Item item = new Item();

           item.setId(x);
           item.setDescription(String.format("Generic Item #%d", x));
           item.setName(String.format("Item #%d",x));

           items.add(item);

       }

       return items;
   }

    public Iterable<Item> getItems(){
        return itemRepository.findAll();
    }

    public void saveItem(Item item){
        itemRepository.save(item);
    }

}
