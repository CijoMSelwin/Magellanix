package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class LinkedinLink extends ProjectMethods{

	public LinkedinLink() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='Submit']")
	private WebElement likedinSubmit;
	@And("Click LinkednSubmit")
	public LinkedinLink clickLinkedinSubmit()  {
		//WebElement eleLogin = locateElement("name","firstName");
		click(likedinSubmit);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().window(strCurrentWindow)	;
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='Close']")
	private WebElement likedinCloseButton;
	@And("Click LinkedinClose")
	public LinkedinLink likedinCloseButtonClick()  {
		//WebElement eleLogin = locateElement("name","firstName");
		click(likedinCloseButton);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		return this;		
	}
	
	

	@FindBy(how=How.XPATH,using="//input[@type='url']")
	private WebElement likedinTextBox;
	@And("Enter Text in linkedin Window (.*)")
	public LinkedinLink likedinTextBox(String data)  {
		//WebElement eleLogin = locateElement("name","firstName");
		type(likedinTextBox, data);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		return this;		
	}
	
}
