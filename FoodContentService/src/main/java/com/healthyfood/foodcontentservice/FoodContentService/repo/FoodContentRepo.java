package com.healthyfood.foodcontentservice.FoodContentService.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthyfood.foodcontentservice.FoodContentService.model.FoodContent;

public interface FoodContentRepo extends JpaRepository<FoodContent,String> {
	
	
	List<FoodContent> findByUseridAndPresentday(String userid,String pid);
	
	FoodContent findOneByUseridAndPresentday(String userid,String pid);

}
