package pcd.ass02;

import java.util.List;

public interface ProjectReport {

	ClassReport getMainClass();
	
	List<ClassReport> getAllClasses();
	
	ClassReport getClassReport(String fullClassName);
}
