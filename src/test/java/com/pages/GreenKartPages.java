package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GreenKartPages {
	public GreenKartPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//*[@alt='Cart']")
	private static WebElement cartIcon;

	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'PROCEED TO CHECKOUT')]")
	private static WebElement checkoutButton;

	@FindBy(how = How.XPATH, using = "//*[@class='totAmt']")
	private static WebElement totalPrice;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Place Order')]")
	private static WebElement placeOrderButton;

	@FindBy(how = How.XPATH, using = "//*[@style=\"width: 200px;\"]")
	private static WebElement countryDropDown;

	@FindBy(how = How.XPATH, using = "//*[@value=\"United States\"]")
	private static WebElement country;

	@FindBy(how = How.XPATH, using = "//*[@type='checkbox']")
	private static WebElement checkBox;

	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Proceed')]")
	private static WebElement proceedButton;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Thank you, your order has been placed successfully')]")
	private static WebElement shipmentText;
	
	@FindBy(how = How.XPATH, using = "//p[@class = 'product-price']")
	private static List<WebElement> allPrices;

	public static List<WebElement> getAllPrices() {
		return allPrices;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public static WebElement getCartIcon() {
		return cartIcon;
	}

	public static void setCartIcon(WebElement cartIcon) {
		GreenKartPages.cartIcon = cartIcon;
	}

	public static WebElement getCheckoutButton() {
		return checkoutButton;
	}

	public static void setCheckoutButton(WebElement checkoutButton) {
		GreenKartPages.checkoutButton = checkoutButton;
	}

	public static WebElement getTotalPrice() {
		return totalPrice;
	}

	public static void setTotalPrice(WebElement totalPrice) {
		GreenKartPages.totalPrice = totalPrice;
	}

	public static WebElement getPlaceOrderButton() {
		return placeOrderButton;
	}

	public static void setPlaceOrderButton(WebElement placeOrderButton) {
		GreenKartPages.placeOrderButton = placeOrderButton;
	}

	public static WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public static void setCountryDropDown(WebElement countryDropDown) {
		GreenKartPages.countryDropDown = countryDropDown;
	}

	public static WebElement getCountry() {
		return country;
	}

	public static void setCountry(WebElement country) {
		GreenKartPages.country = country;
	}

	public static WebElement getCheckBox() {
		return checkBox;
	}

	public static void setCheckBox(WebElement checkBox) {
		GreenKartPages.checkBox = checkBox;
	}

	public static WebElement getProceedButton() {
		return proceedButton;
	}

	public static void setProceedButton(WebElement proceedButton) {
		GreenKartPages.proceedButton = proceedButton;
	}

	public static WebElement getShipmentText() {
		return shipmentText;
	}

	public static void setShipmentText(WebElement shipmentText) {
		GreenKartPages.shipmentText = shipmentText;
	}

	public static void setAllPrices(List<WebElement> allPrices) {
		GreenKartPages.allPrices = allPrices;
	}

	

}
