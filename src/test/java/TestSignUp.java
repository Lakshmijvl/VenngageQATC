public class TestSignUp {
	
	private Account account;
	private SignUpPage signUpPage;
	
	@Before
	public void setUp(){
		// Instantiate page objects here
	    System.setProperty("webdriver.chrome.driver","");
	    driver=new ChromeDriver();
	    driver.goToUrl("https://venngage.com/templates");  
	    driver.manage().window().maximize();
	   
		
	}                                                                           
	
	@Test
	public void testSignUp(){
	SignUpPage signUpPage = new SignUpPage(getDriver());
	signUpPage.firstname(account.FirstName);
	signUpPage.lastname(account.Lastname);
	signUpPage.email(account.Email_Address);
	signUpPage.password(account.Password)
	signUpPage.submit();
		
		
	}
}
