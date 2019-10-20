package com.healthyfood.foodcontentservice.FoodContentService.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthyfood.foodcontentservice.FoodContentService.model.FoodContent;
import com.healthyfood.foodcontentservice.FoodContentService.model.ItemDetails;
import com.healthyfood.foodcontentservice.FoodContentService.model.Items;
import com.healthyfood.foodcontentservice.FoodContentService.model.UserFood;
import com.healthyfood.foodcontentservice.FoodContentService.model.UserFoodDetail;
import com.healthyfood.foodcontentservice.FoodContentService.repo.FoodContentRepo;
import com.healthyfood.foodcontentservice.FoodContentService.repo.ItemRepo;


@Service
public class FoodServiceImpl implements FoodContentService{
	
	@Autowired
	ItemRepo itemdetails;
    @Autowired
    FoodContentRepo foodcontent;
	public ItemDetails getitemdetail(String itemno) 
	{
		
		return itemdetails.findOneByItemid(itemno);
	}

	
	public String saveitem(Items item)
	{
		if (!item.equals(null))
		{
		Long value=itemdetails.count();
		ItemDetails itemdetail= new ItemDetails("item_"+(value+1),item.getItemname(),item.getItemcalorie(),item.getItemdescription(),item.getItemcontent(),item.getItemcontent());
		itemdetails.save(itemdetail);
		return "{ Result: Saved sucessfully User Id :" +"item_"+(value+1)+"}";
		}
		else
		{
			return "{Result:Invalid Value}";
		}
		
	}

	public List<ItemDetails> getAllItenByContent(String itemcat) 
	{
		List<ItemDetails> listval=itemdetails.findByItemcontent(itemcat);
		if (!listval.isEmpty())
		{
			return listval;
		}
		else
		{
			List<ItemDetails> listitem= new ArrayList<>();
			return listitem;
		}
	}


	public UserFoodDetail getuserfooddetail(String Userid, String presentday) {
		
		UserFood userfood= new UserFood();
		UserFoodDetail userfooddetails = new UserFoodDetail();
		FoodContent fd=foodcontent.findOneByUseridAndPresentday(Userid, presentday);
		List<ItemDetails> item=getitemdetail(fd);
		userfood.setUserID(fd.getUserid());
		userfood.setDay(fd.getPresentday());
		userfood.setItemDetails(item);
		userfood.setUserContent(fd.getItemcontent());
		userfooddetails.setUserfood(userfood);
		return userfooddetails;
	}
	
	public List<ItemDetails> getitemdetail(FoodContent userfood)
	{

		List<ItemDetails> itemdetails = new ArrayList<>();
		List<String> item = new ArrayList<String>(Arrays.asList(userfood.getBreakfast().split(",")));
		item.addAll(Arrays.asList(userfood.getDinner().split(",")));
		item.addAll(Arrays.asList(userfood.getEvening().split(",")));
		item.addAll(Arrays.asList(userfood.getLunch().split(",")));
		for(String items:item)
		{
			itemdetails.add(getitemdetail(items));
		}
		return itemdetails;
	}
	
	

}
