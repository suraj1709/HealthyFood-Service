package com.healthyfood.foodcontentservice.FoodContentService.model;

public class Items {
	private String itemname;
	private String itemcalorie;
	private String itemdescription;
	private String itemcontent;
	private String itemtime;
	public Items(String itemname, String itemcalorie, String itemdescription, String itemcontent, String itemtime) {
		super();
		this.itemname = itemname;
		this.itemcalorie = itemcalorie;
		this.itemdescription = itemdescription;
		this.itemcontent = itemcontent;
		this.itemtime = itemtime;
	}
	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getItemcalorie() {
		return itemcalorie;
	}
	public void setItemcalorie(String itemcalorie) {
		this.itemcalorie = itemcalorie;
	}
	public String getItemdescription() {
		return itemdescription;
	}
	public void setItemdescription(String itemdescription) {
		this.itemdescription = itemdescription;
	}
	public String getItemcontent() {
		return itemcontent;
	}
	public void setItemcontent(String itemcontent) {
		this.itemcontent = itemcontent;
	}
	public String getItemtime() {
		return itemtime;
	}
	public void setItemtime(String itemtime) {
		this.itemtime = itemtime;
	}
	

}
