package com.itheima.service.impl;

import com.itheima.mapper.ItemsMapper;
import com.itheima.model.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;

    public Items getById(Integer id) {

        return itemsMapper.getById(id);
    }
}
