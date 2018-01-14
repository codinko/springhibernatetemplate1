package com.codinko.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codinko.Service.StockService;
import com.codinko.model.Stock;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void main(String[] args) {ApplicationContext appContext =
	    	  new ClassPathXmlApplicationContext("spring-config.xml");

	    	StockService stockService = (StockService)appContext.getBean("stockService");

	    	/** insert **/
	    	Stock stock = new Stock();
	    	stock.setStockCode("1001");
	    	stock.setStockName("IPAD-MINI");
	    	stockService.save(stock);

	    	/** select **/
	    	Stock stock2 = stockService.findByStockCode("1001");
	    	System.out.println(stock2);

	    	/** update **/
	    	stock2.setStockName("IPAD-PRO");
	    	stockService.update(stock2);

	    	/** delete **/
	    	//stockService.delete(stock2);

	    	System.out.println("Done");}
	
	    	
}
