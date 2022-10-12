package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.InstructorsDao;
import kodlamaio.entities.Instructors;

public class InstructorsManager {
	private InstructorsDao instructorsDao;
	private Logger[] loggers;
	
	
	
	public InstructorsManager(InstructorsDao instructorsDao, Logger[] loggers) {
		super();
		this.instructorsDao = instructorsDao;
		this.loggers=loggers;
	}


	public void add(Instructors instructors) {
			instructorsDao.instructorsAdd(instructors);
			for (Logger logger : loggers) {
				logger.log(instructors.getFirstName()+ " " + instructors.getLastName());
			}
			
	}
}
