package week1day2;

public class Library {
	
	public String addBook(String booktitle) {
		System.out.println("Book is added Successfully");
	return booktitle;
}
    public void issueBook() {
    	System.out.println("Book is issued Successfully");
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
  Library obj=new Library();
  obj.addBook("The Alchemist");
  obj.issueBook();

	}

}

   
    	



