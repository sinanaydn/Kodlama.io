package kodlamaio.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CategoriesDao;
import kodlamaio.entities.Categories;

public class CategoriesManager {
	private CategoriesDao categoriesDao;
	private Logger[] loggers;
	
	public CategoriesManager(CategoriesDao categoriesDao, Logger[] loggers) {
		super();
		this.categoriesDao = categoriesDao;
		this.loggers = loggers;
	}
	List<Categories> categories1=new ArrayList<>();

	public void add(Categories categories) throws Exception {
		for (Categories categoriess : categories1) {
			if (categoriess.getCategoryName().equalsIgnoreCase(categories.getCategoryName())) {
				throw new Exception("Bu kurs zaten mevcut ! "+ categories.getCategoryName());
			}
		}
		for (Logger logger : loggers) {
			logger.log(categories.getCategoryName());
		}
		categoriesDao.CategoriesAdd(categories);
		categories1.add(categories);
	}
}
