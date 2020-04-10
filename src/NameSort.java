import java.util.Comparator;
 
//comparator class for sorting employees according to their last name
public class NameSort implements Comparator<EmployeeInfo> {
 
    @Override
    public int compare(EmployeeInfo o1, EmployeeInfo o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
 
}