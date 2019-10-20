package com.healthyfood.foodcontentservice.FoodContentService.model;

import java.util.List;

public class UserFood {
	public UserFood() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String UserID;
	private String Day;
	private List<ItemDetails> ItemDetails ; 
	private String UserContent;
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getDay() {
		return Day;
	}
	public void setDay(String day) {
		Day = day;
	}
	public List<ItemDetails> getItemDetails() {
		return ItemDetails;
	}
	public void setItemDetails(List<ItemDetails> itemDetails) {
		ItemDetails = itemDetails;
	}
	public String getUserContent() {
		return UserContent;
	}
	public void setUserContent(String userContent) {
		UserContent = userContent;
	}
	
	@Override
	public String toString() {
		return "UserFood [UserID=" + UserID + ", Day=" + Day + ", ItemDetails=" + ItemDetails + ", UserContent="
				+ UserContent + "]";
	}
	public UserFood(String userID, String day,
			List<com.healthyfood.foodcontentservice.FoodContentService.model.ItemDetails> itemDetails,
			String userContent) {
		super();
		UserID = userID;
		Day = day;
		ItemDetails = itemDetails;
		UserContent = userContent;
	}
	
	

}
