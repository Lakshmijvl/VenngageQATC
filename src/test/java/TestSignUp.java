public class TestSignUp {
	
	private Account account;
	private SignUpPage signUpPage;
	
	@Before
	public void setUp(){
		// Instantiate page objects here
	    System.setProperty("webdriver.chrome.driver","");
	    driver=new ChromeDriver(); 
	    driver.get("");   
	    driver.manage().window().maximize();
	   
		
	}
	
	@Test
	public void testSignUp(){
		// Write test steps here
		
	}
}
