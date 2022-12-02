package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NopCommerceHeaderPage {
	
	public class NopCommerseLandingPage {
		
		@FindBy (xpath = "//select[@id='customerCurrency']")private WebElement SelectCurrency;
		@FindBy (xpath = "//a[@class='ico-register']")private WebElement Regester;
		@FindBy (xpath = "//a[@class='ico-login']")private WebElement LogIn;
		@FindBy (xpath = "//a[@class='ico-wishlist']")private WebElement WishList;
		@FindBy (xpath = "//a[@class='ico-cart']")private WebElement ShoppingCart;
		@FindBy (xpath = "//input[@id='small-searchterms']")private WebElement SearchStoreTab;
		@FindBy (xpath = "//button[@class='button-1 search-box-button']")private WebElement SearchButton;
		@FindBy (xpath = "//img[@alt='nopCommerce demo store']")private WebElement MainLogo;
		@FindBy (xpath = "(//a[text()='Computers '])[1]")private WebElement ComputersMenu;
		@FindBy (xpath="(//a[@href='/desktops'])[1]")private WebElement Desktop;
		@FindBy (xpath="(//a[@href='/notebooks'])[1]")private WebElement Notebook; 
		@FindBy (xpath="(//a[@href='/Software'])[1]")private WebElement Software;
		@FindBy (xpath="(//a[text()='Electronics '])[1] ")private WebElement ElectronicsMenu;
		@FindBy (xpath="(//a[@href='/camera-photo'])[1]")private WebElement CameraAndPhoto;
		@FindBy (xpath="(//a[@href='/cell-phones'])[1]")private WebElement CellPhones;
		@FindBy (xpath="(//a[@href='/others'])[1]")private WebElement OthersInElectronics;
		@FindBy (xpath="(//a[@href='/apparel'])[1]")private WebElement Apparel;
		@FindBy (xpath="(//a[@href='/shoes'])[1]")private WebElement  Shoes;
		@FindBy (xpath="(//a[@href='/clothing'])[1]")private WebElement Clothing;
		@FindBy (xpath="(//a[@href='/accessories'])[1]")private WebElement Accessories;
		@FindBy (xpath="(//a[@href='/digital-downloads'])[1]")private WebElement DigitalDownloads;
		@FindBy (xpath="(//a[@href='/books'])[1]")private WebElement Books;
		@FindBy (xpath="(//a[@href='/jewelry'])[1]")private WebElement Jewelry;
		@FindBy (xpath="(//a[@href='/gift-cards'])[1]")private WebElement GiftCards;
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		@FindBy (xpath="(//a[@href='/electronics'])[3]")private WebElement MiddleElectronics;
		@FindBy (xpath="(//a[@href='/apparel'])[3]")private WebElement   MiddleApparel;
		@FindBy (xpath="(//a[@href='/digital-downloads'])[3]")private WebElement MiddleDigitalDownloads;
		@FindBy (xpath="//a[text()='New online store is open!']")private WebElement NewOnlineStoreOpen;
		@FindBy (xpath="//a[text()='nopCommerce new release!']")private WebElement  NopCommerceNewRelease;
		@FindBy (xpath="//a[text()='About nopCommerce']")private WebElement  AboutNopCommerce;
		@FindBy (xpath="(//a[@href='/new-online-store-is-open'])[2]")private WebElement DetailsButtonNewOnlineStoreOpen;
		@FindBy (xpath="(//a[@href='/nopcommerce-new-release'])[2]")private WebElement  DetailsButtonNopCommerceNewRelease;
		@FindBy (xpath="(//a[@href='/about-nopcommerce'])[2]")private WebElement  DetailsButtonAboutNopCommerce;
		@FindBy (xpath="(//a[@href='/news'])[1]")private WebElement ViewNewsArchive;
		@FindBy (xpath="(//input[@name='pollanswers-1'])[1]")private WebElement FeedbackExcellent;
		@FindBy (xpath="(//input[@name='pollanswers-1'])[2]")private WebElement FeedbackGood;
		@FindBy (xpath="(//input[@name='pollanswers-1'])[3]")private WebElement FeedbackPoor;
		@FindBy (xpath="(//input[@name='pollanswers-1'])[4]")private WebElement FeedbackVeryBad;
		@FindBy (xpath="//button[@id='vote-poll-1']")private WebElement VoteButton;
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		@FindBy (xpath="//a[text()='Sitemap']")private WebElement FooterSitemap;
		@FindBy (xpath="//a[text()='Shipping & returns']")private WebElement FooterShippingAndreturns;
		@FindBy (xpath="//a[text()='Privacy notice']")private WebElement FooterPrivacyNotice;
		@FindBy (xpath="//a[text()='Conditions of Use']")private WebElement FooterConditionsOfUse; 
		@FindBy (xpath="//a[text()='About us']")private WebElement FooterAboutUs;
		@FindBy (xpath="//a[text()='Contact us']")private WebElement FooterContactUs;
		@FindBy (xpath="//a[text()='Search']")private WebElement FooterSearch;
		@FindBy (xpath="//a[text()='News']")private WebElement FooterNews;
		@FindBy (xpath="//a[text()='Blog']")private WebElement FooterBlog;
		@FindBy (xpath="//a[text()='Recently viewed products']")private WebElement FooterRecentlyViewedProducts;
		@FindBy (xpath="//a[text()='Compare products list']")private WebElement FooterCompareProductsList;
		@FindBy (xpath="//a[text()='New products']")private WebElement FooterNewProducts;
		@FindBy (xpath="//a[text()='My account']")private WebElement FooterMyAccount;
		@FindBy (xpath="//a[text()='Orders']")private WebElement FooterOrders;
		@FindBy (xpath="//a[text()='Addresses']")private WebElement FooterAddresses;
		@FindBy (xpath="//a[text()='Shopping cart']")private WebElement FooterShoppingCart;
		@FindBy (xpath="//a[text()='Wishlist']")private WebElement FooterWishlist;
		@FindBy (xpath="//a[text()='Apply for vendor account']")private WebElement FooterApplyForVendorAccount;
		@FindBy (xpath="//a[text()='Facebook']")private WebElement FooterFacebook;
		@FindBy (xpath="//a[text()='Twitter']")private WebElement FooterTwitter;
		@FindBy (xpath="//a[text()='RSS']")private WebElement FooterRSS;
		@FindBy (xpath="//a[text()='YouTube']")private WebElement FooterYouTube;
		@FindBy (xpath="//input[@id='newsletter-email']")private WebElement FooterNewsLetterEmail;
		@FindBy (xpath="//button[@id='newsletter-subscribe-button']")private WebElement FooterNewsLetterEmailButton;
		@FindBy (xpath="(//a[@target='_blank'])[4]")private WebElement FooterNopCommerce;
		
		WebDriver driver;
		public NopCommerseLandingPage () {
			PageFactory.initElements(driver, this);
			
		}
		
		public void selectCurrency (int index) {
			SelectCurrency.click();
			Select A = new Select(SelectCurrency);
			A.selectByIndex(index);
		}
		
		public void regesterUser () {
			Regester.click();
		}
		
		public void logInUser () {
			LogIn.click();
		}
		
		public void wishList() {
			WishList.click();
		}
		
		public void shoppingCart () {
			ShoppingCart.click();
		}
		
		public void searchStoreTab (String A) {
			SearchStoreTab.sendKeys(A);
		}
		
		public void searchButton () {
			SearchButton.click();
		}
		
		public void mainLogo () {
			MainLogo.click();
		}
		 
		public void computersMenu () {
		Actions act =new Actions(driver);
		act.moveToElement(ComputersMenu);
		act.perform();
		}
		
		public void desktopMenu () {
			Desktop.click();
		}
		
		public void notebookSubMenu () {
			Notebook.click();
		}
		
		public void softwareSubMenu () {
			Software.click();
		}
		
		public void electronicsMenu () {
		Actions act =new Actions(driver);
		act.moveToElement(ElectronicsMenu);
		act.perform();
		}
		
		public void selectCameraAndPhoto () {
			CameraAndPhoto.click();
		}
		
		public void selectCellPhones () {
			CellPhones.click();
		}
		
		public void selectOthersInElectronics () {
			OthersInElectronics.click();
		}
		
		public void apparelMenu () {
			Actions act =new Actions(driver);
			act.moveToElement(Apparel);
			act.perform();
			
		}
		
		public void selectShoes () {
			Shoes.click();
		}
		
		public void selectClothing () {
			Clothing.click();
		}
		
		public void selectAccessories () {
			Accessories.click();
		}
		
		public void digitalDownloads () {
			DigitalDownloads.click();
		}
		
		public void booksSubMenu () {
			Books.click();
		}
		
		public void jewelrySubMenu () {
			Jewelry.click();
		}
		
		public void giftCardsSubMenu () {
			GiftCards.click();
		}
		
	////////////////////////////////////////////////////////////////////////////////////////////////
		
		public void middleElectronics () {
			MiddleElectronics.click();
		}
		
		public void middleApparel () {
			MiddleApparel.click();
		}
		
		public void middleDigitalDownloads () {
			MiddleDigitalDownloads.click();
		}
		
		public void newsSectionOnlineStore () {
			NewOnlineStoreOpen.click();
		}
		
		public void newsSectionNopComNewRelease () {
			NopCommerceNewRelease.click();
		}
		
		public void newsSectionAboutNopCommerce () {
			AboutNopCommerce.click();
		}
		
		public void detailsButtonNewOnlineStoreOpen () {
			DetailsButtonNewOnlineStoreOpen.click();
		}
		
		public void detailsButtonNopCommerceNewRelease () {
			DetailsButtonNopCommerceNewRelease.click();
		}
		
		public void detailsButtonAboutNopCommerce () {
			DetailsButtonAboutNopCommerce.click();
		}
		
		public void viewNewsArchive () {
			ViewNewsArchive.click();
		}
		
		public void feedbackExcellent () {
			FeedbackExcellent.click();
		}
		
		public void feedbackGood () {
			FeedbackGood.click();
		}
		
		public void feedbackPoor () {
			FeedbackPoor.click();
		}
		
		public void feedbackVeryPoor () {
			FeedbackVeryBad.click();
		}
		
		public void feedbackVoteButton () {
			VoteButton.click();
		}
		
	///////////////////////////////////////////////////////////////////////////////////////////
		
		public void footerSitemap () {
			FooterSitemap.click();
		}
		
		public void privacyNotice () {
			FooterPrivacyNotice.click();
		}
		
		public void footerShippingAndreturns () {
			FooterShippingAndreturns.click();
		}
		
		public void footerConditionsOfUse () {
			FooterConditionsOfUse.click();
		}
		
		public void footerAboutUs () {
			FooterAboutUs.click();
		}
		
		public void footerContactUs () {
			FooterContactUs.click();
		}
		
		public void footerSearch () {
			FooterSearch.click();
		}
		
		public void footerNews () {
			FooterNews.click();
		}
		
		public void footerBlog () {
			FooterBlog.click();
		}
		
		public void footerRecentlyViewedProducts () {
			FooterRecentlyViewedProducts.click();
		}
		
		public void footerCompareProductsList () {
			FooterCompareProductsList.click();
		}
		
		public void footerNewProducts () {
			FooterNewProducts.click();
		}
		
		public void footerMyAccount () {
			FooterMyAccount.click();
		}
		
		public void footerOrders () {
			FooterOrders.click();
		}
		
		public void footerAddresses () {
			FooterAddresses.click();
		}
		
		public void footerShoppingCart () {
			FooterShoppingCart.click();
		}
		
		public void footerWishlist () {
			FooterWishlist.click();
		}
		
		public void footerApplyForVendorAccount () {
			FooterApplyForVendorAccount.click();
		}
		
		public void footerFacebook () {
			FooterFacebook.click();
		}
		
		public void footerTwitter () {
			FooterTwitter.click();
		}
		
		public void footerRSS () {
			FooterRSS.click();
		}
		
		public void footerYouTube () {
			FooterYouTube.click();
		}
		
		public void footerNewsLetterEmail (String email) {
			FooterNewsLetterEmail.sendKeys(email);
		}
		
		public void footerNewsLetterEmailButton () {
			FooterNewsLetterEmailButton.click();
		}
		
		public void footerNopCommerce () {
			FooterNopCommerce.click();
		}
		
	}
	}
