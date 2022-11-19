package Excel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webtable {
	
	//
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Akki\\Desktop\\chromedriver");
		
		
	WebDriver driver =new ChromeDriver();	driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjEs-PM9oL7AhWQCSsKHfFQB4wYABAAGgJzZg&ohost=www.google.com&cid=CAESbOD2EWXyxFBRxu3XGoDutJIbcdyUx0zpXEBIpGcV_WNnIFIuFTBevJmGVZcjkEZsGXnZmKOxkMq3FYRB8nUS-4lb7aOaCqKCw0YtpmHwG-twtbH2aoa92ETg5UMKoYHfPjNyMnxEaU2rjNxRTQ&sig=AOD64_0858y95M_4-m7IPq2lcuzSpAS5vw&q&adurl&ved=2ahUKEwjJz9rM9oL7AhV0RnwKHZxMAzYQ0Qx6BAgJEAE");
	driver.manage().window().maximize();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi 10 prime"+Keys.ENTER);
Thread.sleep(2000);
String q=	driver.getTitle();
System.out.println(q);
driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();





Thread.sleep(2000);
Set<String> a = driver.getWindowHandles();
Iterator<String> it = a.iterator();
String w3 = it.next();
String w4 = it.next();
driver.switchTo().window(w4);
////
//System.out.println(q);
Thread.sleep(2000);
String omya=driver.findElement(By.xpath("(//*[@class='a-price-whole'])[1]")).getText();
String q1=	driver.getTitle();


System.out.println(omya);
System.out.println(q1);
Thread.sleep(2000);




//	Thread.sleep(2000);
//	String	s5=omya.replaceAll(",","");
//System.out.println(s5);
////
////String q=	driver.getTitle();
////System.out.println(q);
////Thread.sleep(3000);
////	int b=Integer.parseInt(s5);
//	System.out.println("prize of redmi 10 prime in Amazon "+s5);

		
////
//driver.close();
		Thread.sleep(3000);

//WebDriver driver1 =new ChromeDriver();
////
//driver1.get("https://www.flipkart.com/");
//Thread.sleep(2000);
//////
//driver1.manage().window().maximize();
//
//
//Thread.sleep(2000);
//driver1.findElement(By.xpath("//*[@class=\"_2KpZ6l _2doB4z\"]")).click();
//Thread.sleep(4000);
//System.out.println("ok");
//
//driver1.findElement(By.className("_3704LK")).sendKeys("redmi 10 prime");
//driver1.findElement(By.className("L0Z3Pu")).click();
//
//Thread.sleep(4000);
//driver1.findElement(By.xpath("//*[@class=\"_4rR01T\"][1]")).click();
//
//Thread.sleep(4000);
//
//String str=driver1.findElement(By.xpath("//*[@class=\"_25b18c\"][1]")).getText();
//Thread.sleep(4000);
////
////
//String str1=str.substring(1, 7);
////
//String str2=str1.replace(",", "");
//System.out.println(str2);
//Thread.sleep(2000);
//int A=Integer.parseInt(str2);
//
//System.out.println("prize of  redmi 10 prime on flipcard is "  +A);
//
//driver1.close();
//		Thread.sleep(4000);
//
//WebDriver driver2=new ChromeDriver();
//driver2.get("https://www.91mobiles.com/");
//Thread.sleep(3000);
//
//driver2.manage().window().maximize();
//Thread.sleep(3000);
//
//driver2.findElement(By.id("autoSuggestTxtBox")).sendKeys("redmi 10 prime"+Keys.ENTER);
//Thread.sleep(3000);
//driver2.findElement(By.xpath("//*[@class=\"hover_blue_link name gaclick ng-binding\"][1]")).click();
//Thread.sleep(3000);
//Set<String> a1 = driver2.getWindowHandles();
//Iterator<String> it1 = a1.iterator();
//String w1 = it1.next();
//String w2 = it1.next();
//driver2.switchTo().window(w2);
//Thread.sleep(2000);
//
//
//String st=driver2.getTitle();
//
//System.out.println(st);
//
//String str4=driver2.findElement(By.xpath("//div[@class='spec_rvw_pnl das_bdr']/div/span[2]")).getText();
//Thread.sleep(3000);
//
//String str5=str4.replace(",", "");
//int c=Integer.parseInt(str5);
//System.out.println("prize of redmi 10 prime"+c);
//
//
//System.out.println("The Comparision Between two Site Like amazon and flipkart and  mobile91:");
//if(A>b &&c>b ) {
//	System.out.println("Please give the Amazon product...............");
//}if(b>A&& c>A)
//{
//	System.out.println("Please give the Flipkart product...................");
//}
//else {
//	System.out.println(" pz buy mobile 91 product "+ c);
//}



}}