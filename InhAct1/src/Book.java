public class Book extends Product  // this class is now final
{
    private String author;
    private int pages;
    
    public Book()
	{
		author = "heen";
		pages = 0;
		System.out.println("This is the book class");
	}
	public String getAuthor() 
	{
		return author;
	}
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	public int getPages() 
	{
		return pages;
	}
	public void setPages(int pages) 
	{
		this.pages = pages;
	}
	
	 public boolean equals(Book book)
	    {
	    	if (this.author == book.getAuthor() && this.pages == book.getPages())
	    		return true;
	    	else
	    		return false; 
	    }
}