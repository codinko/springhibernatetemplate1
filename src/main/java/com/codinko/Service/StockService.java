package com.codinko.Service;

import com.codinko.DAO.StockDAO;
import com.codinko.model.Stock;

public class StockService {
	
	StockDAO stockDao;
	
	public void setStockDao(StockDAO stockDao) {
		this.stockDao = stockDao;
	}

	public void save(Stock stock){
		stockDao.save(stock);
	}

	public void update(Stock stock){
		stockDao.update(stock);
	}

	public void delete(Stock stock){
		stockDao.delete(stock);
	}

	public Stock findByStockCode(String stockCode){
		return stockDao.findByStockCode(stockCode);
	}

}
