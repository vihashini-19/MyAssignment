package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To add driver to the code
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
	   //Click the login button using class locator
	   WebElement elementLogin=driver.findElement(By.className("decorativeSubmit"));
	   elementLogin.click();
	   //Click on CRMSFA link
	   WebElement elementCRMSFA=driver.findElement(By.id("label"));
	   elementCRMSFA.click();
	   //Click on Lead button
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
	   //Enter the DepartmentName by using id Locator
	   WebElement elementDepartment=driver.findElement(By.id("createLeadForm_departmentName"));
	   elementDepartment.sendKeys("ECE");
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
	   
	}

}
