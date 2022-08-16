package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//To open a browser
		ChromeDriver driver=new ChromeDriver();
		//To load an url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//To maximize the browser
		driver.manage().window().maximize();
		
		//Enter the username by using id locator
	   WebElement elementUsername=driver.findElement(By.id("username"));
	   elementUsername.sendKeys("Demosalesmanager");
	   //Enter the password by using id locator
	   WebElement elementPASSWORD=driver.findElement(By.name("PASSWORD"));
	   elementPASSWORD.sendKeys("crmsfa");
	   //Click on login button using class locator
	   WebElement elementLogin=driver.findElement(By.className("decorativeSubmit"));
	   elementLogin.click();
	   //Click on CRMSFA
	   WebElement elementCRMSFA=driver.findElement(By.id("label"));
       elementCRMSFA.click();
       //Click on Leads button
       WebElement elementLeads=driver.findElement(By.linkText("Leads"));
       elementLeads.click();
       //Click on Create Lead button
	   WebElement elementCreateLead=driver.findElement(By.linkText("Create Lead"));
	   elementCreateLead.click();
	 //Enter the CompanyName by using id Locator
	   WebElement elementCompanyName=driver.findElement(By.id("createLeadForm_companyName"));
	   elementCompanyName.sendKeys("Amazon");
	   //Enter the FirstName by using id Locator
	   WebElement elementFirstName=driver.findElement(By.id("createLeadForm_firstName"));
	   elementFirstName.sendKeys("Vihashini");
	   //Enter the LastName by using id Locator
	   WebElement elementLastName=driver.findElement(By.id("createLeadForm_lastName"));
	   elementLastName.sendKeys("Mahadevan");
	   //Enter the FirstName Local by using id Locator
	   WebElement elementFirstNameLocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
	   elementFirstNameLocal.sendKeys("Adithi");
	 //Enter the Description by using id Locator
	   WebElement elementDescription=driver.findElement(By.id("createLeadForm_description"));
	   elementDescription.sendKeys("Welcome to Testleaf");
	   //Enter the E-mail by using id Locator
	   WebElement elementEmail=driver.findElement(By.id("createLeadForm_primaryEmail"));
	   elementEmail.sendKeys("viha11@gmail.com");
	   //Enter the State by using id Locator
	   WebElement elementState=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	   Select selectState=new Select(elementState);
	   //Select the State by using selectByVisibleText
	   selectState.selectByVisibleText("Florida");
	   //Click on Create button by using name
	   WebElement elementCreateButton=driver.findElement(By.className("smallSubmitButton"));
	   elementCreateButton.click();
	   //Get the title of resulting page
	   String title=driver.getTitle();
	   System.out.println(title);
	   //Click on Duplicate button
	   WebElement elementDuplicate=driver.findElement(By.className("SubMenuButton"));
	   elementDuplicate.click();
	   //Clear the CompanyName field and enter new CompanyName
	   WebElement elementNewCompanyName=driver.findElement(By.id("createLeadForm_CompanyName"));
	   elementNewCompanyName.clear();
	   elementNewCompanyName.sendKeys("wipro");
	   //Click on Create Lead button
	   WebElement createLead=driver.findElement(By.name("submitButton"));
	   createLead.click();
	   //Get the title of resulting page
	   String newtitle=driver.getTitle();
	   System.out.println(newtitle);
	}

}
