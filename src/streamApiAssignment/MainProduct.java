package streamApiAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainProduct {

	public static void main(String[] args) {
		
		List<Product> products =new ArrayList<Product>();
		products.add(new Product(1,"Pen",9.99));
		products.add(new Product(2,"Pencil",5.99));
		products.add(new Product(3,"Eraser",2.90));
		products.add(new Product(4,"Book",15.99));
		products.add(new Product(5,"sharpener",10.00));
		
		System.out.println("Product with minimum price: "+
		products.stream().filter((product)->product.getPrice()==products.stream().map((p)->p.getPrice()).min((x,y)->x.compareTo(y)).get())
		.collect(Collectors.toList()));
		
		System.out.println("Product with maximum price: "+
				products.stream().filter((product)->product.getPrice()==products.stream().map((p)->p.getPrice()).max((x,y)->x.compareTo(y)).get())
				.collect(Collectors.toList()));
	}

}
