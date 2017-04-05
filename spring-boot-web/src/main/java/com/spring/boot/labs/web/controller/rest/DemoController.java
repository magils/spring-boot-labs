package com.spring.boot.labs.web.controller.rest;

import com.spring.boot.labs.web.domain.Item;
import com.spring.boot.labs.web.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/hello")
    public ResponseEntity helloWorld(){
        return ResponseEntity.ok("Hello World from Spring Boot!");
    }

    //Returning a collection of objects
    @RequestMapping("/items")
    public ResponseEntity getItems(){
        return ResponseEntity.ok(itemService.getItems());
    }


    @RequestMapping(value="/items",method = RequestMethod.POST)
    public ResponseEntity addItem(@RequestBody Item item){
       itemService.saveItem(item);
       return ResponseEntity.ok().build();
    }

}
