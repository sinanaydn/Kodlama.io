package kodlamaio.dataAccess;

import kodlamaio.entities.Categories;
import kodlamaio.entities.Courses;
import kodlamaio.entities.Instructors;

public class HibernateDao implements InstructorsDao, CoursesDao, CategoriesDao{

	@Override
	public void instructorsAdd(Instructors instructors) {
			System.out.println("Hibernate ile eklendi : " + instructors.getFirstName() +" "+ instructors.getLastName());
		
	}

	@Override
	public void coursesAdd(Courses courses) {
		
			System.out.println("Hibernate ile eklendi : "+ courses.getCourseName());
		
	}

	@Override
	public void CategoriesAdd(Categories categories) {
		System.out.println("Hibernate ile eklendi : "+categories.getCategoryName());
		
	}

}
