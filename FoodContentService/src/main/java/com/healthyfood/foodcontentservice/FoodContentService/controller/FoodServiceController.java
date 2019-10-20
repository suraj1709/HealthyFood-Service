package com.healthyfood.foodcontentservice.FoodContentService.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.healthyfood.foodcontentservice.FoodContentService.model.FoodContent;
import com.healthyfood.foodcontentservice.FoodContentService.model.ItemDetails;
import com.healthyfood.foodcontentservice.FoodContentService.model.Items;
import com.healthyfood.foodcontentservice.FoodContentService.model.UserFood;
import com.healthyfood.foodcontentservice.FoodContentService.model.UserFoodDetail;
import com.healthyfood.foodcontentservice.FoodContentService.repo.FoodContentRepo;
import com.healthyfood.foodcontentservice.FoodContentService.repo.ItemRepo;
import com.healthyfood.foodcontentservice.FoodContentService.service.FoodContentService;

@RestController
public class FoodServiceController {

	@Autowired
	FoodContentService foodcontentservice;
	
	
	@GetMapping("/Item/{itemid}")
	@ResponseBody
	public ItemDetails getitembyid(@PathVariable("itemid") String itemid)
	{
		return foodcontentservice.getitemdetail(itemid);
		
	}
	@PostMapping(path="/Item/Save")
	@ResponseBody
	public String saveitem(@RequestBody Items item)
	{
		return foodcontentservice.saveitem(item);
		 
	}
	
	@GetMapping("/Item")
	@ResponseBody
	public List<ItemDetails> fetchallbycategory(@RequestParam("category") String itemcat)
	{
		return foodcontentservice.getAllItenByContent(itemcat);
	 }
	@GetMapping("/Item/FoodContent")
	@ResponseBody
	public UserFoodDetail fetchallbyuserid(@RequestParam("UserId") String Userid,@RequestParam("PresentDay") String pday)
	{
		
		return foodcontentservice.getuserfooddetail(Userid, pday);
		
		
	}
	
	

}
