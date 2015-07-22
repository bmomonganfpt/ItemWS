package vn.com.fpt.entities;

public class Item {

	private Long id;
	private String itemName;
	private Account account;
	private double itemAccount;

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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double getItemAccount() {
		return itemAccount;
	}

	public void setItemAccount(double itemAccount) {
		this.itemAccount = itemAccount;
	}

}
