package com.eurekagcpdatabase.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eurekagcpdatabase.entity.Menu;
import com.eurekagcpdatabase.service.MenuService;


@RestController
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	@GetMapping("/menu")
	public List<Menu> list() {
	    return menuService.listAll();
	}
	
	@GetMapping("/newmenu")
	public List<Menu> listNew() {
	    return menuService.listAll();
	}
}

