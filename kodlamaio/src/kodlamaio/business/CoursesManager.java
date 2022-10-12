package kodlamaio.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CoursesDao;
import kodlamaio.entities.Courses;

public class CoursesManager {
	private CoursesDao coursesDao;
	private Logger[] loggers;

	public CoursesManager(CoursesDao coursesDao,Logger[] loggers) {
		super();
		this.coursesDao = coursesDao;
		this.loggers=loggers;
	}

	List<Courses> coursesName = new ArrayList<>();

	public void add(Courses courses) throws Exception {
		for (Courses coursess: coursesName) {
			if (coursess.getCourseName().equalsIgnoreCase(courses.getCourseName())) {
				throw new Exception("Bu kurs zaten mevcut ! "+ courses.getCourseName());
			}
		}
		if (courses.getPrice() < 10) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz ");
		}
		coursesName.add(courses);
		coursesDao.coursesAdd(courses);
		for (Logger logger : loggers) {
			logger.log(courses.getCourseName());
		}
		
		
		

	}

}
