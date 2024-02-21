package learn.hibernate.com.learn.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Bike {
	@Id
	int modal_no;
	String brand;
	int price;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int modal_no, String brand, int price) {
		super();
		this.modal_no = modal_no;
		this.brand = brand;
		this.price = price;
	}
	public int getModal_no() {
		return modal_no;
	}
	public void setModal_no(int modal_no) {
		this.modal_no = modal_no;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike [modal_no=" + modal_no + ", brand=" + brand + ", price=" + price + "]";
	}
	
	

}
