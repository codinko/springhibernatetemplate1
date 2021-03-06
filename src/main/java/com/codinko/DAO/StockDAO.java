package com.codinko.DAO;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.codinko.model.Stock;

public class StockDAO extends HibernateDaoSupport {
	
	public void save(Stock stock){
		getHibernateTemplate().save(stock);
	}

	public void update(Stock stock){
		getHibernateTemplate().update(stock);
	}

	public void delete(Stock stock){
		getHibernateTemplate().delete(stock);
	}

	public Stock findByStockCode(String stockCode){
		List list = getHibernateTemplate().find(
                      "from Stock where stockCode=?",stockCode
                );
		return (Stock)list.get(0);
	}
	
	

}
