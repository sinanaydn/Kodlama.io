package kodlamaio.dataAccess;

import kodlamaio.entities.Categories;
import kodlamaio.entities.Courses;
import kodlamaio.entities.Instructors;

public class JdbcDao implements InstructorsDao, CoursesDao, CategoriesDao{

	@Override
	public void instructorsAdd(Instructors instructors ) {
		System.out.println("Jdbc ile eklendi : "+ instructors.getFirstName()+instructors.getLastName());
		
	}

	@Override
	public void coursesAdd(Courses courses) {
		System.out.println("Jdbc ile eklendi : " + courses.getCourseName());
		
	}

	@Override
	public void CategoriesAdd(Categories categories) {
		System.out.println("Jdbc ile eklendi : " + categories.getCategoryName());
		
	}

}
