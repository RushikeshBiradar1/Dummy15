//package practice;
//
//import org.openqa.selenium.WebDriver;
//
//public class ItestListenerImplementation implements ITestListener
//{
//WebDriver driver;
// ExtentReports report;
//  ExtentTest test;
//
// public void onTestStart(ITestResult result) 
// {
//    /* Step:3 Create a test method during the test execution start*/
//      test=report.createTest(result.getMethod().getMethodName());
//     
//  
//  
// }
//
// public void onTestSuccess(ITestResult result) {
//   
//   /*Step:4 Log the pass method*/
//  test.log(Status.PASS, result.getMethod().getMethodName()+" is passed");
//   
//}
//
// public void onTestFailure(ITestResult result) {
//  //Step 5
///*Log fail method, take screenshot, attach screenshot to extent report, add exception log*/
//  
//  test.log(Status.FAIL, result.getMethod().getMethodName());
//  test.log(Status.FAIL, result.getThrowable());
//  String filePath = null;
//  
//  try {
//    filePath = new WebDriverUtility().takeScreenshotOfPage(driver, result.getMethod().getMethodName());
//   
//  } catch (IOException e) {
//   // TODO Auto-generated catch block
//   e.printStackTrace();
//  }
//  
//  test.addScreenCaptureFromPath(filePath);
//  
//  
//   
// }
//
// public void onTestSkipped(ITestResult result) {
///*step:6 Log the skip method()*/
//  
//  test.log(Status.SKIP, result.getMethod().getMethodName());
//  test.log(Status.SKIP, result.getThrowable());
//  
//  
// }
//
// public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//  // TODO Auto-generated method stub
//  
// }
//
// public void onStart(ITestContext context)
// {
//System.out.println("Execution of Test Script started");
//  
//  /*Step:1 Extent report configuration*/
//  
//  Date d = new Date();
//  System.out.println(d);
//  String date = d.toString().replace(" ", "-").replace(":", "-");
//  
//  ExtentSparkReporter htmlReport=new ExtentSparkReporter(new File("extentreport.html"));    
//        htmlReport.config().setDocumentTitle("Extent Report");
//        htmlReport.config().setTheme(Theme.DARK);
//        htmlReport.config().setReportName("Functional Test");
//
//  
//  
//  
//  /*Step:2 Attach the physical report and do the system configuration*/
//  
//  report = new ExtentReports();
//  report.attachReporter(htmlReport);
//  report.setSystemInfo("OS", "Windows 11");
//  report.setSystemInfo("Environment", "Testing Environment");
//  report.setSystemInfo("URL", "http://localhost:8888");
//  report.setSystemInfo("Reporter Name", "Shobha");
//  
//  
//  
//    
//  
// }
//
// public void onFinish(ITestContext context) {
//  report.flush();
//  
// }
// 
//
//}
//
//
//
//
//
//
//public String takeScreenshotOfPage(WebDriver driver, String screenshotName) throws IOException {
// Date d = new Date();
// String date = d.toString().replace(" ", "-").replace(":", "-");
// TakesScreenshot ts = (TakesScreenshot) driver;
// File source = ts.getScreenshotAs(OutputType.FILE);
// screenshotName = screenshotName + date;
// File destination = new File("./Screenshots/" + screenshotName + " " + ".png");
// FileUtils.copyFile(source, destination);
// System.out.println("Screenshot Taken Successfully");
// return destination.getAbsolutePath();
//
// 
//}
//
//
//
//
//03:35 PM
//
//Tech Admin2
//
//<suite name="Suite">
//<listeners>
//<listener class-name="comcast.vtiger.genericUtility.ItestListenerImplementation"/>
//</listeners>
//  <test thread-count="5" name="Test">
//    <classes>
//      <class name="com.crm.practice.TestCase2"/>
//      <class name="com.crm.practice.TestCase3"/>
//    </classes>
//  </test> <!-- Test -->
//</suite> <!-- Suite -->
