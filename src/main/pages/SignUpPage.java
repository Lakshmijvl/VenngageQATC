public class SignUpPage  {
	
	private Selenium selenium;
	
	// Add XPaths here
	By setfirstname = By.xpath("//input[@id='user_first_name']");
	By setlastname = By.xpath("//input[@id='user_last_name']");
	By setEmail = By.xpath("//input[@id='user_email']");
	By setpassword = By.xpath("//input[@id='user_password']");
	By clicksubmit =By.xpath("//button[@id='btn_register']");
	
	public SignUpPage(){
		this.selenium = Selenium();
	}

	
	// Create a function that takes an Account and simulates signing up using Selenium actions. (Refer to Selenium.java)
	
	//Enter First Name
	
	public void firstname(String text) 
	{
		selenium.sendKeys(setfirstname, text);
	

	}

	// Enter LastName
	public void lastname(String text)

	{
		selenium.sendKeys(setlastname, text);
	}

	// Enter Email
	public void email(String text)

	{
		selenium.sendKeys(setEmail, text);

	}
	
	//Enter Password
	public void password(String text)
	{
	 
		selenium.sendKeys(setpassword, text);
		
	}
	
	//click submit
	
	
	public void submit()
	{
		selenium.click(clicksubmit);
	
	
	
}
