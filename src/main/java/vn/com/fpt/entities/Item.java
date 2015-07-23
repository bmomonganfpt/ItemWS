package vn.com.fpt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	@GeneratedValue
	private Long id;
	private String itemName;
	private String itemDesc;
	private Double itemInitPrice;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getItemDesc() {
		return itemDesc;
	}
	
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	
	public Double getItemInitPrice() {
		return itemInitPrice;
	}
	
	public void setItemInitPrice(Double itemInitPrice) {
		this.itemInitPrice = itemInitPrice;
	}
}
