package comphrehensive.sdetbasiclevel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomateAnywhere_4 {

          public static void main(String[] args) throws Exception {
            // TODO Auto-generated method stub
            WebDriver driver;
            System.setProperty("webdriver.edge.driver","C:\\Users\\THUMMALAJ\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.automationanywhere.com/");
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div/div[2]/div/button[2]")).click();
       
        //Products
        driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[1]/a")).click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        if(url.equals("https://www.automationanywhere.com/products")) {
            System.out.println("Products Page Navigated");
            
        }
        else {
            System.out.println("Not navigated");
        }
       
       
        //Solutions
        driver.navigate().to("https://www.automationanywhere.com/");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/div/div/div[2]/ul/li[2]/a")).click();
        String url1 = driver.getCurrentUrl();
        System.out.println(url1);
        if(url1.equals("https://www.automationanywhere.com/solutions")) {
            System.out.println("Solutions Page Navigated");
            
        }
        else {
            System.out.println("Not navigated");
        }
       
        //Resources
        driver.navigate().to("https://www.automationanywhere.com/");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/div/div/div[2]/ul/li[3]/a")).click();
        String url2 = driver.getCurrentUrl();
        System.out.println(url2);
        if(url2.equals("https://www.automationanywhere.com/resources")) {
            System.out.println("Resources Page Navigated");
            
        }
        else {
            System.out.println("Not navigated");
        }
       
       
        //Beyond RPA
        driver.navigate().to("https://www.automationanywhere.com/");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/div/div/div[2]/ul/li[4]/a")).click();
        String url3 = driver.getCurrentUrl();
        System.out.println(url3);
        if(url3.equals("https://www.automationanywhere.com/rpa/robotic-process-automation")) {
            System.out.println("Robotic-Process-Automation Page Navigated");
            
        }
        else {
            System.out.println("Not navigated");
        }
     
       
        //Company
        driver.navigate().to("https://www.automationanywhere.com/");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/div/div/div[2]/ul/li[5]/a")).click();
        String url4 = driver.getCurrentUrl();
        System.out.println(url4);
        if(url4.equals("https://www.automationanywhere.com/company/about-us")) {
            System.out.println("Company_AboutUs Page Navigated");
            
        }
        else {
            System.out.println("Not navigated");
        }
     
        driver.close();
       
      }

}