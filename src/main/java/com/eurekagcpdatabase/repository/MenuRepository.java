package com.eurekagcpdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eurekagcpdatabase.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

}
