package kodlamaio;

import kodlamaio.business.CategoriesManager;
import kodlamaio.business.CoursesManager;
import kodlamaio.business.InstructorsManager;

import kodlamaio.core.logging.DataBaseLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.core.logging.MailLogger;
import kodlamaio.dataAccess.HibernateDao;
import kodlamaio.entities.Categories;
import kodlamaio.entities.Courses;
import kodlamaio.entities.Instructors;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Instructors instructors = new Instructors(1,"engin","demirog");
		
		Logger[] loggers= new Logger[]{new DataBaseLogger(), new MailLogger()};
		
		InstructorsManager instructorsManager=new InstructorsManager(new HibernateDao(),loggers);
		instructorsManager.add(instructors);
		
		System.out.println("--------------------------------------");
		
		Courses courses =new Courses("donanım", 25, "en iyi yazılım eğitimi");
		Courses courses2=new Courses("Programlama", 25, "en iyi yazılım eğitimi");
	
		
		
		CoursesManager coursesManager=new CoursesManager(new HibernateDao(),loggers);
		coursesManager.add(courses);
		coursesManager.add(courses2);
		
		
		System.out.println("-----------------------------------------");
		
		Categories categories1=new Categories("kategori");
		Categories categories2=new Categories("kategori");
		CategoriesManager categoriesManager=new CategoriesManager(new HibernateDao(), loggers);
		categoriesManager.add(categories2);
		categoriesManager.add(categories1);

		
		
	}

}
