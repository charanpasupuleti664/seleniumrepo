package genericutilities;

import java.io.File;
import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ITestListenerImplementation<ITestResult> extends BaseClass implements IAutoConstants,ITestListener{
	
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File photo=ts.getScreenshotAs(OutputType.FILE);
		File file=new File(SS_PATH+ result.getName()+".png");
		try {
			FileUtils.copyFile(photo, file);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
