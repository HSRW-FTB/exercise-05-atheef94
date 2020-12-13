import java.sql.Date;
import java.util.Arrays;

public class Classroom {
	String id ;
	Course course;
	Student participants;
	String room,term;
	Date birthdate;
	 public Classroom() {
		 
	 }
	 public Classroom(Course newcourse,String newroom) {
		 this.course=newcourse;
		 this.room=newroom;
	 }
	 public Classroom( Course newcourse,String newroom,Date birthdate) {
		 this.course=newcourse;
		 this.room=newroom;
		 this.birthdate= birthdate ;
	 }
public Course  getCourse() {
	return course ;
}
public String getRoom()	{
	return room ;
	
}
public void setroom(String newroom) {
	this.room=newroom;
	
}
public String getTerm() {
	return term;
}
public String getID() {
	return id;
}
public  void addStudent(Student newparticipants) {
	this.participants=newparticipants;
	
}
public String getParticipantsEmail() {
        
        return id + "@student.hsrw";
        
}
public  int  getTotalParticipants() {
	  return participants.length; 
}
}