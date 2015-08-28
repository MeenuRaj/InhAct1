public class Software extends Product 
{
    private String programmer;
    private String platform; //linux, mac, or pc
    private String os; 
    
    public Software()
	{
		programmer = "";
		platform = "";
		os = "";
		System.out.println("This is the software class");
	}

	public String getProgrammer() {
		return programmer;
	}

	public void setProgrammer(String programmer) {
		this.programmer = programmer;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	
	 public boolean equals(Software software)
	    {
	    	if (this.programmer == software.getProgrammer() && this.platform == software.getPlatform() && this.os == software.getOs())
	    		return true;
	    	else
	    		return false; 
	    }
    
}