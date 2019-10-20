package com.healthyfood.foodcontentservice.FoodContentService.service;

import java.util.List;

import com.healthyfood.foodcontentservice.FoodContentService.model.ItemDetails;
import com.healthyfood.foodcontentservice.FoodContentService.model.Items;
import com.healthyfood.foodcontentservice.FoodContentService.model.UserFoodDetail;

public interface FoodContentService {
	
	public ItemDetails getitemdetail(String itemno);
	
	public String saveitem(Items item);
	
	public List<ItemDetails>  getAllItenByContent(String itemcat);
	
	public UserFoodDetail getuserfooddetail(String Userid,String presentday);
	
	

}
