package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggy {
public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\krushna_gaikwad\\Desktop\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.swiggy.com/");
        Thread.sleep(2000);
        driver.findElement(By.className("x4bK8")).click();
        driver.findElement(By.id("mobile")).sendKeys("9370077569");
        Thread.sleep(2000);
        driver.findElement(By.className("a-ayg")).click();
        Thread.sleep(20000);
        driver.findElement(By.className("a-ayg")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("LukWG")).click();
        Thread.sleep(10000);
        driver.findElement(By.className("_1qbcC")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("DCrYO")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("_2ZH3s")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("_3QCnP")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[2]/div[2]/form/div[1]/input")).clear();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[2]/div[2]/form/div[1]/input")).sendKeys("9370077569");;
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div[2]/div[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div[2]/form/div[1]/input")).clear();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div[2]/form/div[1]/input")).sendKeys("krushnagaikwad0002@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div[2]/form/div[2]/div/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[4]/div[2]/div[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"newPassword\"]")).sendKeys("Royalenfield@0002");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys("Royalenfield@0002");
        Thread.sleep(5000);
        driver.close();
        }
}







