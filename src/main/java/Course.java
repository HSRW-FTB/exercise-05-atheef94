
public class Course {
	private String id;
	private String name;
	private Professor lecturer;
	private int credit;
	
	public Course (String id, String name,Professor lecturer, int credit ) {
	this.id= id;
    this.name=name;
    this.lecturer=lecturer;
    this.credit=credit;
    
}
public String  getid() {
	return this.id;
}
public String  getname() {
	return this.name;
}
public void setname(String givenname) {
    this.name=givenname;
}
public void setlecturer(Professor lecturer) {
    this.lecturer=lecturer;
    
}
public Professor getlecturer() {
    return this.lecturer;
}
public int getcredit() {
       return this.credit;
        
    }
  public void setcredit(int credit) {
        this.credit=credit;
        
    
}

}
