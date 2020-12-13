import java.util.Date;

public class User{

    private String id;
    private String lastname;
    private String firstname;
    private Date birthdate = new Date();
    private Domain domain;
    
    protected User(){
    
    
        
    }
    
     protected User(String id, Domain domain, String firstname, String lastname){
    
        this.id = id;
        this.domain = domain;
        this.firstname = firstname;
        this.lastname = lastname;
         
        
    }
    
     protected User(String id, Domain domain, String firstname, String lastname, Date birthdate){
    
        this.id = id;
        this.domain = domain;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        
    }
    
    public String getFirstName(){
    
        return this.firstname;
        
    }
    
    public void setFirstName(String givenName){
        
        this.firstname = givenName;
    
    }
    
    public String getLastName(){
    
        return this.lastname;
        
    }
    
    public void setLastName(String givenName){
        
        this.lastname = givenName;
    
    }
    
    public String getID(){
        
        return id;
    
    }
    
    public Date getBirthDate(){
        
        return this.birthdate;
    
    }
    
    public void setBirthDate(Date dateofbirth){
        
        this.birthdate = dateofbirth;
    
    }
    
    public Domain getDomain(){
    
        return this.domain;
    
    }
    
    public String getFQUN(){
    
        if (this.domain.name()=="STAFF"){
        
            return id + "@staff.hsrw";
            
        }
        
        else {
        
            return id + "@student.hsrw";
            
        }
    
    }
    
    
    
    

}
