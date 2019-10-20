package com.healthyfood.foodcontentservice.FoodContentService.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="Item")
@Entity
public class ItemDetails {
	
	@Id
	@Column(name ="Item_Id")
	private String itemid;

	@Column(name ="Item_Name")
	private String itemname;

	@Column(name ="Item_Calorie")
	private String itemcalorie;

	@Column(name ="Item_Description")
	private String itemdescription;
	

	@Column(name ="Item_Content")
	private String itemcontent;
	

	@Column(name ="Item_Time")
	private String itemtime;


	public String getItemid() {
		return itemid;
	}


	public void setItemid(String itemid) {
		this.itemid = itemid;
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


	public ItemDetails(String itemid, String itemname, String itemcalorie, String itemdescription, String itemcontent,
			String itemtime) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.itemcalorie = itemcalorie;
		this.itemdescription = itemdescription;
		this.itemcontent = itemcontent;
		this.itemtime = itemtime;
	}


	@Override
	public String toString() {
		return "ItemDetails [itemid=" + itemid + ", itemname=" + itemname + ", itemcalorie=" + itemcalorie
				+ ", itemdescription=" + itemdescription + ", itemcontent=" + itemcontent + ", itemtime=" + itemtime
				+ "]";
	}


	public ItemDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	

}
