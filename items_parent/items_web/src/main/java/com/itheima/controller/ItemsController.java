package com.itheima.controller;

import com.itheima.model.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping(value = "/one")
    public String getById(Integer id, Model model){
        Items items=itemsService.getById(id);
        model.addAttribute("items",items);
        return "items";
    }
}
