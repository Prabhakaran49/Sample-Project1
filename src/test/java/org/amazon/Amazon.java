package org.amazon;

import java.util.List;

import org.base.ne.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.Home_Page;

public class Amazon extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	chromeLaunch();
	urlLaunch("https://www.amazon.in/ref=as_li_ss_tl?ie=UTF8&linkCode=ll2&tag=enin-edge-topsites-curate-ana-21&linkId=fbedcb44d04a4bae8eae32722a2f41c2&language=en_IN");
	impWait(10);
	
	Home_Page hp = new Home_Page();
	sendKeys(hp.getSearchtext(), "iphone 8");
	click(hp.getSearchbutton());
	
	List<WebElement> allproduts = driver.findElements(By.xpath("//span[text()='New Apple iPhone 12 (128GB) - Green']"));

	for (int i = 0; i < args.length; i++) {
		
	
		
	
	WebElement p1 = allproduts.get(i);
	String text = p1.getText();
	System.out.println(text);
	
	
	}
	
	
	System.out.println("DONE");
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
