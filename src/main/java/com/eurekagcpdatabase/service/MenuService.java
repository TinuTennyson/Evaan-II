package com.eurekagcpdatabase.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.eurekagcpdatabase.entity.Menu;
import com.eurekagcpdatabase.repository.MenuRepository;


@Component
public class MenuService {
	
	@Autowired
	public MenuRepository menuRepository;
	
    public List<Menu> listAll() {
        return menuRepository.findAll();
    }
     
    public void save(Menu menu) {
    	menuRepository.save(menu);
    }
     
    public Menu get(Integer id) {
        return menuRepository.findById(id).get();
    }
     
    public void delete(Integer id) {
    	menuRepository.deleteById(id);
    }
}
