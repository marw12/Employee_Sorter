import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;



public class EReport {
	
	public static void main(String[] args) {
		
		List<EmployeeInfo> employeeList = new ArrayList<EmployeeInfo>(); //list stores employee information objects	
		
		try {
			Scanner scanner = new Scanner(new File("src/employees.dat"));
			
			while (scanner.hasNextLine()) {
				
				String line = scanner.nextLine(); //reads the file line by line
				
				
				if(line.charAt(0)!='#') { //check to see if the line is a comment
					
					
					int num = Integer.parseInt(line.substring(0, 3)); //gets the employee number and converts the string to int
					
					//extract name code:
					
					if(line.contains(", ")) {
						line = line.replaceFirst(", ", ",");
					}
					
					String[] name = line.split(",");
					String fullname = name[1].toString();
					String[] full = fullname.split(" ");
					String firstName = full[0].toString();
					String lastName = full[1].toString();
					
					EmployeeInfo employee = new EmployeeInfo(num, firstName, lastName);
					employeeList.add(employee);
					
				}
			
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Collections.sort(employeeList, new NumSort());
		
		System.out.println("Processing by employee number...");
		for(EmployeeInfo st: employeeList){
	         System.out.println(st.toString());
	      }
		
		Collections.sort(employeeList, new NameSort());
		
		System.out.println("\nProcessing by last (family) Name...");
		for(EmployeeInfo st: employeeList){
	         System.out.println(st.toString());
	      }
	}

}
