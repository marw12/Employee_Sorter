

public class EmployeeInfo {

	
	  private int number;     
	  private String firstName;     
	  private String lastName;    
	  
	  public EmployeeInfo(int number, String firstName, String lastName) {         
	    this.number = number;         
	    this.firstName = firstName;         
	    this.lastName = lastName;     
	  }       

	  public int getNumber() {         
		    return number;     
	  }       
	  public String getFirstName() {         
		    return firstName;     
	  }       
	  public String getLastName() {         
		    return lastName;     
	  }      
	  
	  //outputs in the format we want
	  @Override
	    public String toString() {
	        return this.number + "," + this.firstName + " " + this.lastName;
	    }
}
