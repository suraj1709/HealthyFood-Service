package com.healthyfood.foodcontentservice.FoodContentService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="userfooddetails")
@Entity
public class FoodContent {
	@Id
	@Column(name="userid")
	private String userid;

	@Column(name="presentday")
	private String presentday;
	
	@Column(name="Breakfast")
	private String Breakfast;
	
	@Column(name="Lunch")
	private String Lunch;
	
	@Column(name="Evening")
	private String Evening;
	
	@Column(name="Dinner")
	private String Dinner;
	
	@Column(name="itemcontent")
	private String  itemcontent;
	
	@Column(name="haschanged")
	private String haschanged;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPresentday() {
		return presentday;
	}
	public void setPresentday(String presentday) {
		this.presentday = presentday;
	}
	public String getBreakfast() {
		return Breakfast;
	}
	public void setBreakfast(String breakfast) {
		Breakfast = breakfast;
	}
	public String getLunch() {
		return Lunch;
	}
	public void setLunch(String lunch) {
		Lunch = lunch;
	}
	public String getEvening() {
		return Evening;
	}
	public void setEvening(String evening) {
		Evening = evening;
	}
	public String getDinner() {
		return Dinner;
	}
	public void setDinner(String dinner) {
		Dinner = dinner;
	}
	public String getItemcontent() {
		return itemcontent;
	}
	public void setItemcontent(String itemcontent) {
		this.itemcontent = itemcontent;
	}
	public String getHaschanged() {
		return haschanged;
	}
	public void setHaschanged(String haschanged) {
		this.haschanged = haschanged;
	}
	public FoodContent(String userid, String presentday, String breakfast, String lunch, String evening, String dinner,
			String itemcontent, String haschanged) {
		super();
		this.userid = userid;
		this.presentday = presentday;
		Breakfast = breakfast;
		Lunch = lunch;
		Evening = evening;
		Dinner = dinner;
		this.itemcontent = itemcontent;
		this.haschanged = haschanged;
	}
	@Override
	public String toString() {
		return "FoodContent [userid=" + userid + ", presentday=" + presentday + ", Breakfast=" + Breakfast + ", Lunch="
				+ Lunch + ", Evening=" + Evening + ", Dinner=" + Dinner + ", itemcontent=" + itemcontent
				+ ", haschanged=" + haschanged + "]";
	}
	public FoodContent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
