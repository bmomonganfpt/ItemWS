package vn.com.fpt.entities;

public class Bid {

	private Long id;
	private Item item;
	private Account account;
	private double bidAccount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double getBidAccount() {
		return bidAccount;
	}

	public void setBidAccount(double bidAccount) {
		this.bidAccount = bidAccount;
	}

}
