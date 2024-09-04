package Vehical;

public class TwoWeeler extends Vehicals {
	
	private String vehical_Company;
	private String vehical_price;
	
	public TwoWeeler() {
		this.vehical_Company = "Honda";
		this.vehical_price = "120000";
	}
	
	public TwoWeeler(String company,String price) {
		this.vehical_Company = company;
		this.vehical_price = price;
	}
	
	public String getVehical_Company() {
		return vehical_Company;
	}
	
	public String getVehical_price() {
		return vehical_price;
	}
	
	public void setVehical_Company(String vehical_Company) {
		this.vehical_Company = vehical_Company;
	}
	
	public void setVehical_price(String vehical_price) {
		this.vehical_price = vehical_price;
	}
	
	
	public String toString() {
		return "Vehical Company: "+this.vehical_Company+" | Vehical Price "+this.vehical_price;
	}
	
}
