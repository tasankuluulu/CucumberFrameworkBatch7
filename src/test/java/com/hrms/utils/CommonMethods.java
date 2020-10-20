package com.hrms.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.testbase.BaseClass;
import com.hrms.testbase.PagesInitializer;

public class CommonMethods extends PagesInitializer {
	/**
	 * Method that sends text to any given web element
	 * 
	 * @param element
	 * @param text
	 */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * Method returns object of JavascriptExecutor type
	 * 
	 * @return JavascriptExecutor object
	 */
	public static JavascriptExecutor getJSExecutor() {
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;
		return js;
	}

	/**
	 * Method performs click using JavascriptExecutor
	 * 
	 * @param element
	 */
	public static void jsClick(WebElement element) {
		getJSExecutor().executeScript("arguments[0].click();", element);
	}

	/**
	 * Method scrolls up using JavaScript Executor
	 * 
	 * @param pixel
	 */
	public static void scrollUp(int pixel) {
		getJSExecutor().executeScript("window.scrollBy(0, -" + pixel + ")");
	}

	/**
	 * Method scrolls down using JavaScript Executor
	 * 
	 * @param pixel
	 */
	public static void srollDown(int pixel) {
		getJSExecutor().executeScript("window.scrollBy(0," + pixel + ")");
	}

	public static WebDriverWait getWaitObject() {
		return new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
	}

	public static void waitForClickability(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}

	/**
	 * Method that will take a screenshot and store with name in specified location
	 * with .png extension
	 * 
	 * @param fileName
	 */
	public static byte[] takeScreenshot(String fileName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] bytes = ts.getScreenshotAs(OutputType.BYTES);

		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(Constants.SCREENSHOT_FILEPATH + fileName + getTimeStamp() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return bytes;

	}

	/**
	 * This method will generate timeStamp
	 * 
	 * @return
	 */
	public static String getTimeStamp() {
		Date date = new Date();
		System.out.println(date.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		return sdf.format(date);
	}

	/**
	 * Method will click on checkbox or radio button by the given list of
	 * webelements and the value
	 * 
	 * @param radioOrCheckBoxes
	 * @param value
	 */
	public static void clickRadioOrCheckBox(List<WebElement> radioOrCheckBoxes, String value) {
		String actualValue;
		for (WebElement radioOrCheckBox : radioOrCheckBoxes) {
			actualValue = radioOrCheckBox.getAttribute("value").trim();
			if (radioOrCheckBox.isEnabled() && actualValue.equals(value)) {
				jsClick(radioOrCheckBox);
				break;
			}
		}
	}

	/**
	 * Method will select an option from the dropdown by given webelement and
	 * visible text value
	 * 
	 * @param dd
	 * @param visibleTextOrValue
	 */
	public static void selectDDValue(WebElement dd, String visibleTextOrValue) {
		try {
			Select select = new Select(dd);
			List<WebElement> options = select.getOptions();
			for (WebElement option : options) {
				if (option.getText().equals(visibleTextOrValue)) {
					select.selectByVisibleText(visibleTextOrValue);
					break;
				}
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Method will select an option from the dropdown by given webelement and
	 * visible text value
	 * 
	 * @param dd
	 * @param visibleTextOrValue
	 */
	public static void selectDDValue(WebElement dd, int index) {
		try {
			Select select = new Select(dd);
			List<WebElement> options = select.getOptions();
			int size = options.size();
			if (size > index) {
				select.selectByIndex(index);
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Method will swith to a frame by the given frame web element
	 * 
	 * @param iFrame
	 */
	public static void switchToFrame(WebElement iFrame) {
		try {
			driver.switchTo().frame(iFrame);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Method will swith to a frame by the given frame index
	 * 
	 * @param frameIndex
	 */

	public static void switchToFrame(int frameIndex) {
		try {
			driver.switchTo().frame(frameIndex);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Method will swith to a frame by the given frame nameOrId
	 * 
	 * @param nameOrId
	 */

	public static void switchToFrame(String nameOrId) {
		try {
			driver.switchTo().frame(nameOrId);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Method will switch to a child Window
	 */
	public static void swithToChildWindow() {
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			if (!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
	}
}
