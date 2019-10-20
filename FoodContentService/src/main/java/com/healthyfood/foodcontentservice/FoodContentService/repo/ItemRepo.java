package com.healthyfood.foodcontentservice.FoodContentService.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.healthyfood.foodcontentservice.FoodContentService.model.ItemDetails;

public interface ItemRepo extends JpaRepository<ItemDetails,String>{
	
	List<ItemDetails> findByItemcontent(String itemcontent);
	ItemDetails findOneByItemid(String itemid);
	

    
}
