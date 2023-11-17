package app.pages;

import app.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public CheckoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='showcoupon']")public WebElement enterYourCodeButton;
    @FindBy(name = "coupon_code")public WebElement couponCodeBox;
    @FindBy(name = "apply_coupon")public WebElement applyCouponButton;
    @FindBy(id = "billing_first_name")public  WebElement firstName;
    @FindBy(id = "billing_last_name")public  WebElement lastName;
    @FindBy(id = "billing_country")public  WebElement countryRegionDropdown;
    @FindBy(id = "billing_address_1")public  WebElement streetAddressFirstLine;
    @FindBy(id = "billing_address_2")public  WebElement streetAddressSecondLine;
    @FindBy(id = "billing_city")public  WebElement townCity;
    @FindBy(id = "billing_postcode")public  WebElement postCodeZIP;
    @FindBy(id = "billing_state")public  WebElement provinceStateDropdown;
    @FindBy(id = "billing_phone")public  WebElement phone;
    @FindBy(id = "billing_email")public  WebElement email;
    @FindBy(id = "payment_method_bacs")public  WebElement wireTransferEFTButton;
    @FindBy(id = "payment_method_cod")public  WebElement payAtTheDoorButton;
    @FindBy(id = "place_order")public  WebElement placeOrderButton;
    @FindBy(xpath = "//strong[contains(text(),'Billing First name')]")public WebElement alertFirstNameRequired;
    @FindBy(xpath = "//strong[contains(text(),'Billing Town / City')]")public WebElement alertTownCityRequired;
    @FindBy(xpath = "//p[contains(text(), 'Thank you. Your order has been received.')]")public  WebElement orderReceivedSuccessfullyMessage;





    @FindBy(id = "billing_first_name")
    public static WebElement firstName;

    @FindBy(id = "billing_last_name")
    public static WebElement lastName;

    @FindBy(id = "billing_country")
    public static WebElement countryRegionDropdown;

    @FindBy(id = "billing_address_1")
    public static WebElement streetAddressFirstLine;

    @FindBy(id = "billing_city")
    public static WebElement townCity;

    @FindBy(id = "billing_state")
    public static WebElement provinceStateDropdown;

    @FindBy(id = "billing_postcode")
    public static WebElement postCodeZIP;

    @FindBy(id = "billing_phone")
    public static WebElement phone;

    @FindBy(id = "billing_email")
    public static WebElement email;

    @FindBy(id = "payment_method_bacs")
    public static WebElement wireTransferEFTButton;

    @FindBy(id = "place_order")
    public static WebElement placeOrderButton;

    @FindBy(xpath = "//p[contains(text(), 'Thank you. Your order has been received.')]")
    public static WebElement orderReceivedSuccessfullyMessage;


}
