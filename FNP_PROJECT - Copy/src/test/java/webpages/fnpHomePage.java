package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fnpHomePage {
	public fnpHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='all_products']/div")
	private WebElement ClickOnProduct;
	@FindBy(id = "fnpsearch")
	private WebElement HomePageSearchBar;

	@FindBy(id = "searchbtn")
	private WebElement ClickOnSearchBtn;
	
	@FindBy(xpath = "//input[@id='fnpsearch']")
    private WebElement ClickOnSearhBox;
	
	@FindBy (xpath = "//div[@id='searchhintlistdiv']/ul//li[2]/a")
	private WebElement SelectOptionFromDropdown;
	//h1[@class='plp-heading']
	
	

	public WebElement getClickOnProduct() {
		return ClickOnProduct;
	}

	public WebElement getHomePageSearchBar() {
		return HomePageSearchBar;
	}

	public WebElement getClickOnSearchBtn() {
		return ClickOnSearchBtn;
	}

	public WebElement getClickOnSearhBox() {
		return ClickOnSearhBox;
	}

	public WebElement getSelectOptionFromDropdown() {
		return SelectOptionFromDropdown;
	}

}
