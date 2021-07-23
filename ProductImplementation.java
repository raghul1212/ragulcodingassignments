package com.revature.practice;
import java.util.ArrayList;
import java.util.List;
//set 9

class Product {
	int id;
	String name;
	int price;
	
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
};
public class ProductImplementation {
	double sumOfPrice(ArrayList<Product> productList) {
		double sum=0;
	for(Product p:productList) {
		sum+=p.price;
		
	}
		return sum;
	}
	int  maxPrice(ArrayList<Product> productList) {
	    int maxi=Integer.MIN_VALUE;
			for(Product obj:productList){
		    maxi=Math.max(maxi,obj.getPrice());
				
		}
		return maxi;
		
	}
	int  minPrice(ArrayList<Product> productList) {
		 int min1=Integer.MAX_VALUE;
			for(Product obj:productList){
		    min1=Math.min(min1,obj.getPrice());
		}
		return min1;
		
	}
	List<String> getProductNameList(ArrayList<Product> productList) {
		List<String> namesList=new ArrayList<String>();
		for(Product obj:productList){
		    namesList.add(obj.getName());
		}
		return namesList;
	}
	public static void main(String[] args) throws Exception {
		ArrayList<Product> plist=new ArrayList<Product>();
		plist.add(new Product(20,"Bag",897));
		plist.add(new Product(21,"Book",87));
		plist.add(new Product(22,"Table",89));
		plist.add(new Product(23,"pen",597));
		ProductImplementation pa=new ProductImplementation();
		System.out.println(pa.getProductNameList(plist));
		System.out.println(pa.sumOfPrice(plist));
		System.out.println(pa.maxPrice(plist));
		System.out.println(pa.minPrice(plist));
		
	}
}
