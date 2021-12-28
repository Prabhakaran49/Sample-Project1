package org.amazon;

import java.util.List;

import org.apache.poi.ss.formula.functions.Replace;
import org.base.ne.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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

				List<WebElement> productlist = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
				for (WebElement e : productlist) {
					System.out.println(e.getAttribute("innerText"));
					System.out.println("------------------------------------");

		}
		List<WebElement> pricelist = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		
			
		
		WebElement oneprice = pricelist.get(8);
		String attribute = oneprice.getAttribute("innerText");
		System.out.println(attribute);

		if( attribute.contains(",")) {

			String replace = attribute.replace(",", "");
			
			System.out.println(replace);


		} 

		
	}








	//		for (WebElement e : pricelist) {
	//			System.out.println(e.getText());
	//
	//		}





















}	

