package seleniumgluecode;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test {
	WebDriver driver;
	@Given("^Open the Chrome browser and launch the application$")
	public void open_the_Chrome_browser_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
    	driver.get("http://ias-guidewire-core2-1969069036.us-east-1.elb.amazonaws.com:8080/cc/ClaimCenter.do");
    	driver.manage().window().maximize();
    	driver.close();
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
		WebElement x=new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'Login-LoginScreen-LoginDV-username\']/div/input")));
        x.click();   
        x.sendKeys("su");
        driver.findElement(By.xpath("//*[@id=\'Login-LoginScreen-LoginDV-password\']/div/input")).sendKeys("gw");
        
	}

	@And("^Click the submit button and Activities page displayed$")
	public void click_the_submit_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"Login-LoginScreen-LoginDV-submit\"]/div")).click();
		
	}

	@And("^User provides type as Worker's Compensation,Type of claim and Loss date$")
	public void user_provides_type_as_Worker_s_Compensation_Type_of_claim_and_Loss_date() throws Throwable {
		WebElement y=new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='TabBar-ClaimTab']/div[@class='gw-action--expand-button']")));
        y.click();
   
        driver.findElement(By.xpath("//*[@id=\'TabBar-ClaimTab-ClaimTab_FNOLWizard\']/div/div[2]")).click();
       
        //*Click the unverified Policy
        WebElement radio=new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("FNOLWizard-FNOLWizard_FindPolicyScreen-ScreenMode_1")));
        radio.click();
        
        //Enter the Policy Number
        WebElement polnum=new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-PolicyNumber\']/div/input")));
        polnum.sendKeys("23234");
        
        //Select the Type
	    Select poltype=new Select (driver.findElement(By.name("FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Type")));
	    poltype.selectByVisibleText("Workers' Compensation");
	    
	    //Select the Type of claim
	    WebElement radio2=new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-ClaimLossType_10")));
        radio2.click();
        
        //Select the Loss Date 
        Thread.sleep(5000);
        WebElement LossDate=new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Claim_LossDate']/div/input")));
        LossDate.sendKeys("02/02/2020");
	}

	@And("^User provides basic information of Policy, Insured details, Location details and Policy Level Coverages$")
	public void user_provides_basic_information_of_Policy_Insured_details_Location_details_and_Policy_Level_Coverages() throws Throwable {

        driver.findElement(By.xpath("//*[@id=\'FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-NewClaimPolicyGeneralPanelSet-NewClaimPolicyGeneralDV-EffectiveDate\']/div/input")).sendKeys("12/01/2019");
	    driver.findElement(By.xpath("//*[@id=\'FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-NewClaimPolicyGeneralPanelSet-NewClaimPolicyGeneralDV-ExpirationDate\']/div/input")).sendKeys("12/01/2020");
	    
	 //   Select the New Person
	    driver.findElement(By.xpath("//*[@id=\'FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-NewClaimPolicyGeneralPanelSet-NewClaimPolicyGeneralDV-Insured_Name-Insured_NameMenuIcon\']/div[2]/div")).click();
	    driver.findElement(By.xpath("//*[@id=\'FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-NewClaimPolicyGeneralPanelSet-NewClaimPolicyGeneralDV-Insured_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson\']/div")).click();
	    
	    //New Person Information
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\'NewContactPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-GlobalPersonNameInputSet-FirstName\']/div/input")).sendKeys("Reguser");
	    driver.findElement(By.xpath("//*[@id=\'NewContactPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-GlobalPersonNameInputSet-LastName\']/div/input")).sendKeys("Test003");
	    
	    //Address 
	    driver.findElement(By.xpath("//*[@id=\'NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1\']/div/input")).sendKeys("93 Ocean St.");
	    driver.findElement(By.xpath("//*[@id=\'NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City\']/div[1]/input")).sendKeys("Redondo Beach");
	    driver.findElement(By.xpath("//*[@id=\'NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State\']/div/div/select")).sendKeys("California");
	    driver.findElement(By.xpath("//*[@id=\'NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode\']/div[1]/input")).sendKeys("90278");
	    driver.findElement(By.xpath("//*[@id=\'NewContactPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-TaxID\']/div[1]/input")).sendKeys("523-23-6789");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"NewContactPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-CustomUpdateButton\"]/div/div[2]")).click();
	    
	    //Add Coverage
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\'FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-NewClaimPolicyGeneralPanelSet-PolicyCoverageListDetail-EditableWorkersCompPolicyCoveragesLV_tb-Add\']/div/div[2]")).click();
	    
	    Thread.sleep(5000);
	    Select Covtype=new Select (driver.findElement(By.xpath("//*[@id=\'FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-NewClaimPolicyGeneralPanelSet-PolicyCoverageListDetail-EditableWorkersCompPolicyCoveragesLV-0-CoverageType\']/div/div/select")));
	    Covtype.selectByVisibleText("Federal Employer's Liability");
	    //Enter the Exposure Limit
	    driver.findElement(By.name("FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-NewClaimPolicyGeneralPanelSet-PolicyCoverageListDetail-EditableWorkersCompPolicyCoveragesLV-0-ExposureLimit")).sendKeys("10000");
	   //Click the Add button
	    driver.findElement(By.xpath("(//div[text()='Add'])[4]")).click();
	 
	    
	    //Policy Location Page
	    Thread.sleep(5000);
	    driver.findElement(By.name("PolicyLocationPopup-PolicyLocationScreen-LocationNumber")).sendKeys("1");;
	    driver.findElement(By.name("PolicyLocationPopup-PolicyLocationScreen-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1")).sendKeys("93 Ocean St.");
	    driver.findElement(By.name("PolicyLocationPopup-PolicyLocationScreen-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City")).sendKeys("Redondo Beach");
	    driver.findElement(By.name("PolicyLocationPopup-PolicyLocationScreen-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State")).sendKeys("California");
	  	
	   //Click OK button
	    driver.findElement(By.xpath("(//div[text()='OK'])[2]")).click();  
	}

	@And("^Click Next button and Basic information page displayed$")
	public void click_Next_button() throws Throwable {
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"FNOLWizard-Next\"]/div")).click();
		 Thread.sleep(5000);
		String Basin1=driver.findElement(By.xpath("//*[@id=\'FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-ttlBar\']/div/div")).getText();
		assertEquals(Basin1,"Step 2 of 4: Basic information");
	}
	@And("^User Provides the Reported By information and Injured Worker Name$")
	public void user_Provides_the_Reported_By_information_and_Injured_Worker_Name() throws Throwable {
		Thread.sleep(5000);
	    Select selname=new Select (driver.findElement(By.xpath("//*[@id=\'FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-ReportedBy_Name\']/div[1]/div/select")));
	    selname.selectByVisibleText("Reguser Test003");
	    
	    Thread.sleep(5000);
	    Select Injname=new Select (driver.findElement(By.xpath("//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-Claimant_Name\"]/div[1]/div/select")));
	    Injname.selectByVisibleText("Reguser Test003");
	  
	     
	}

	@And("^Click Next button and Claim Information page displayed$")
	public void click_Next_button_and_Claim_Information_page_displayed() throws Throwable {
		 Thread.sleep(5000);
		    driver.findElement(By.xpath("//*[@id=\'FNOLWizard-Next\']/div/div[2]")).click();
		      
	}

	@And("^User Provides the Incident details, Injured worker details,Incident location and Injury details$")
	public void user_Provides_the_Incident_details_Injured_worker_details_Incident_location_and_Injury_details() throws Throwable {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\'FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-DateReportedtoEmployer\']/div/input[1]")).sendKeys("02/05/2020");
	    
	    WebElement radio4=new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_TimeLossReport_1")));
        radio4.click();
        
	    
	    Select Inloc=new Select (driver.findElement(By.xpath("//*[@id=\'FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-CCAddressInputSet-globalAddressContainer-Address_Picker\']/div/div/select")));
	    Inloc.selectByVisibleText("93 Ocean St., Redondo Beach, CA");
	    
	    JavascriptExecutor js = ((JavascriptExecutor) driver);
	    js.executeScript("window.scrollTo(0, 500)");
	    Thread.sleep(5000);
	    
	    WebElement radio5=new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_DeathReport_1")));
        radio5.click();
	    
        Select caofIn=new Select(driver.findElement(By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_InjuryIllnessCause")));
        caofIn.selectByVisibleText("Lightning");
        
        WebElement radio3=new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_MedicalReport_1")));
        radio3.click();  
	}

	@And("^Click Next button and Save and Assign Claim page should be displayed$")
	public void click_Next_button_and_Save_and_Assign_Claim_page_should_be_displayed() throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"FNOLWizard-Next\"]/div/div[2]")).click();  
	}

	@And("^Click Finish button$")
	public void click_Finish_button() throws Throwable {
		Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"FNOLWizard-Finish\"]/div")).click();
         
	}

	@Then("^New Claim is saved$")
	public void new_Claim_is_saved() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\'NewClaimSaved-NewClaimSavedScreen-NewClaimSavedDV-GoToClaim\']/div/div/div[2]")).click();
		System.out.println("Claim Summary page is displayed-FNOL SUCCESS");    
	}
}
