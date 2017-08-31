package com.library;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.steadystate.css.util.Output;



public abstract class Screenshot {
	public static void takeScreenShot(String filename,WebDriver driver){
		try{
		TakesScreenshot ts= (TakesScreenshot) driver;
		java.io.File src =   ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new java.io.File( "./screenshots/"+filename+".jpg"));
		}
		catch(Exception e){
			System.out.println("Screenshot not Captured properly");
		}
		
	}

}
