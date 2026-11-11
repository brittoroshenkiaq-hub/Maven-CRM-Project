package com.Base_Class;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static WebDriver driver;
	public static WebDriverWait wait;

	public static WebDriver BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.password_manager_leak_detection", false);
		prefs.put("profile.credentials_enable_service", false);
		Options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(Options);
		driver.get("https://dnbtvdxcepl8u.cloudfront.net/");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return driver;

	}

	public static void Quit() {
		driver.quit();

	}

	public static void Sendkeys(WebElement element, String value) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(value);
	}

	public static String Url() {
		return driver.getCurrentUrl();

	}

	public static void Enter(WebElement e) {
		e.sendKeys(Keys.ENTER);
	}

	public static void Tab(WebElement e) {
		e.sendKeys(Keys.TAB);
	}

	public static void SelectAll(WebElement e) {
		e.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	}

	public static void BackSpace(WebElement e) {
		e.sendKeys(Keys.BACK_SPACE);
	}

	public static void Down(WebElement e) {
		e.sendKeys(Keys.DOWN);
	}

	public static void Up(WebElement e) {
		e.sendKeys(Keys.UP);
	}

	public static void Escape(WebElement e) {
		e.sendKeys(Keys.ESCAPE);
	}

	public static void MoveToElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}

	public static void DoubleClick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();
	}

	public static void RightClick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).perform();
	}

	public static void ClickandHold(WebElement e) {
		Actions a = new Actions(driver);
		a.clickAndHold(e).perform();
	}

	public static void DragandDrop(WebElement drag, WebElement drop) {
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
	}

	public static void back() {
		driver.navigate().back();
	}

	public static void NavigateTo(String Url) {
		driver.navigate().to(Url);
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public void SelectbyText(WebElement e, String text) {
		new Select(e).selectByVisibleText(text);
	}

	public void SelectbyValue(WebElement e, String value) {
		new Select(e).selectByValue(value);
	}

	public void SelectbyIndex(WebElement e, int index) {
		new Select(e).selectByIndex(index);
	}

	public void DeselectAll(WebElement e) {
		new Select(e).deselectAll();
	}

	public static void Screenshot(String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshot/" + fileName + ".Png");
		FileHandler.copy(source, destination);

	}

	public static void window() {
		String WindowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String x : windowHandles) {
			if (!WindowHandle.equals(windowHandles)) {
				driver.switchTo().window(x);

			}
		}
	}

	public static void SelectDate(String Month, String Year, String Date) {
		while (true) {
			String CurrentMonth = driver.findElement(By.xpath("")).getText();
			String CurrentYear = driver.findElement(By.xpath("")).getText();
			if (CurrentMonth.equals(Month) && CurrentYear.equals(Year)) {
				break;
			}
			driver.findElement(By.xpath("")).click();
		}
		List<WebElement> allDates = driver.findElements(By.xpath(""));
		for (WebElement dt : allDates) {
			if (dt.getText().equals(Date)) {
				dt.click();
				break;
			}
			driver.findElement(By.xpath("")).click();
		}

	}

	public static void SelectMonthandYear(String Month, String Year) {
		while (true) {
			String CurrentMonth = driver.findElement(By.xpath("")).getText();
			String CurrentYear = driver.findElement(By.xpath("")).getText();

			if (CurrentMonth.equals(Month) && CurrentYear.equals(Year)) {
				break;
			}
		}
	}

	public static void SelectDate(String Date) {
		List<WebElement> allDates = driver.findElements(By.xpath(""));
		for (WebElement dt : allDates) {
			if (dt.getText().equals(Date)) {
				dt.click();
				break;
			}
			driver.findElement(By.xpath("")).click();
		}
	}

	public static void click(WebElement e) {
		wait.until(ExpectedConditions.elementToBeClickable(e));
		wait.until(ExpectedConditions.visibilityOf(e));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e);

	}

	public void clickelement(WebElement e) {
		wait.until(ExpectedConditions.elementToBeClickable(e));
		wait.until(ExpectedConditions.visibilityOf(e));
		e.click();
	}

	public void clearelemenent(WebElement e) {
		e.clear();
	}

	public static void jsclick(WebElement e) {
		wait.until(ExpectedConditions.elementToBeClickable(e));
		wait.until(ExpectedConditions.visibilityOf(e));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e);
	}

	public static void WindowsScroll(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000);", e);
	}

	public static void scrollIntoView(WebElement e) {
		wait.until(ExpectedConditions.elementToBeClickable(e));
		wait.until(ExpectedConditions.visibilityOf(e));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", e);
	}

	public static void ScrolltoElemeent(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoView({block;'center'})", e);
	}

	public static void date(WebElement e, String date) {
		wait.until(ExpectedConditions.elementToBeClickable(e));
		wait.until(ExpectedConditions.visibilityOf(e));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + date + "';", e);
	}

	public static void SliderValue(WebElement slider, double targetValue) {
		wait.until(ExpectedConditions.visibilityOf(slider));
		double currentValue = Double.parseDouble(slider.getAttribute("aria-valuenow"));
		while (Math.abs(currentValue - targetValue) > 0.05) {
			if (currentValue < targetValue) {
				slider.sendKeys(Keys.ARROW_RIGHT.toString());
			} else {
				slider.sendKeys(Keys.ARROW_LEFT.toString());
			}
			currentValue = Double.parseDouble(slider.getAttribute("aria-valuenow"));
		}
	}

	public static void setPriceRange(WebElement minslider, WebElement maxslider, String minPrice, String maxPrice) {
		double minimum = Double.parseDouble(minPrice);
		double maximum = Double.parseDouble(maxPrice);
		SliderValue(minslider, minimum);
		SliderValue(maxslider, maximum);
	}

	public void OnDemand(WebElement element, String SelectX) {
		wait.until(ExpectedConditions.visibilityOf(element));
		Select sc = new Select(element);
		sc.selectByVisibleText(SelectX);
	}

	public void CustomName(WebElement element, String SelectX) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		Select sc = new Select(element);
		sc.selectByVisibleText(SelectX);
	}

	public void Assignee(WebElement element, String SelectX) {
		wait.until(ExpectedConditions.visibilityOf(element));
		Select sc = new Select(element);
		sc.selectByVisibleText(SelectX);
	}

	public void Priority(WebElement element, String SelectX) {
		wait.until(ExpectedConditions.visibilityOf(element));
		Select sc = new Select(element);
		sc.selectByVisibleText(SelectX);
	}

	public void Category(WebElement element, String SelectX) {
		wait.until(ExpectedConditions.visibilityOf(element));
		Select sc = new Select(element);
		sc.selectByVisibleText(SelectX);
	}

	public static String GetAttribute(WebElement element, String attribute) {
		return element.getAttribute(attribute);

	}

	public static String gettxt(WebElement e) {
		wait.until(ExpectedConditions.visibilityOf(e));
		return e.getText();
	}

	public boolean isDisplayed(WebElement e) {
		wait.until(ExpectedConditions.visibilityOf(e));
		return e.isDisplayed();
	}

	public static void Validation(WebElement e) {
		System.out.println(e.getAttribute("ValidationMessage"));
	}

}
