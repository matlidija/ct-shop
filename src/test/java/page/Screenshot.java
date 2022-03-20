package page;

import base.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

public class Screenshot extends BaseTest {
    java.util.Date date = new java.util.Date();
    Timestamp t = new Timestamp(date.getTime());
    String dateNow = t.toString().replace(":","_");
    File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    String srcShotFilePath = "C:\\Users\\Lidija Matic\\Documents\\Selenium\\"+dateNow+".png";

    public void screenShotFile()throws IOException{

        FileUtils.copyFile(srcFile, new File(srcShotFilePath));
    }

}