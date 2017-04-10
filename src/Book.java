
public  class Book extends Product {
	private String isbn;
	public Book(String id,String name,String barcode,String isbn){
		this.id= id;
		this.name=name;
		this.barcode=barcode;
		this.isbn=isbn;
	}
	
	
	

	@Override
	public void setId(String id) {
	    this.id=id;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setBarcode(String barcode) {
		// TODO Auto-generated method stub
		this.barcode=barcode;
	}

	@Override
	public String getBarcode() {
		// TODO Auto-generated method stub
		return this.barcode;
	}
	public void setIsbn(String isbn) {
		// TODO Auto-generated method stub
		this.isbn=isbn;
	}
	public String getIsbn() {
		// TODO Auto-generated method stub
		return this.isbn;
	}
	public void show(){
		System.out.println(getId()+"\n"+getName()+"\n"+getBarcode()+"\n"+getIsbn());
		
		
	}
	
	
 
}
