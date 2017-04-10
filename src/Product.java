
public abstract class Product {
protected String id,name,barcode,category,description;
protected  int price;
public Product(){}
public Product(String id,String name,String barcode,String category,String description,int price){
	this.id= id;this.name=name;this.barcode=barcode;this.category=category;this.description=description;this.price=price;
}
public abstract void setId(String id);
public abstract String getId();
public abstract void setName(String name);
public abstract String getName();
public abstract void setBarcode(String barcode);
public abstract String getBarcode();
/*public abstract void setCategory(String category);
public abstract String getCategory() ;
public abstract void setDescription(String description);
public abstract String getDescription();
public abstract void setPrice(int price);
public  abstract int getPrice();
*/

}

