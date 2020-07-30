public class IndividualTemplatesPage {
	
	private Selenium selenium;
	
	// Add XPaths here
	private static final String signUp = "//button[@data-hover='Sign Up']";
	
	
	public IndividualTemplatesPage(){
		this.selenium = Selenium();
	}
	
	// Create a function that clicks on the Sign Up button
		
		public void submitsignup()
	{
		selenium.click(signup);
	
	
	
}
