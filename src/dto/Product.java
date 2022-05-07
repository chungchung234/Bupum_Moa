package dto;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = -4274700572038677000L;

	private String id;	
	private String name;		
	private Integer unitPrice; 
	private String description; 
	private String manufacturer;
	private String category; 	
	private String filename; 	
	private int quantity;		 

	public Product() {
		super();
	}

	public Product(String id, String name, Integer unitPrice) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public String getid() {
		return id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setid(String id) {
		this.id = id;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}



	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}			
	
}
