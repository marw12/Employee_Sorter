import java.util.Comparator;

//comparator class for sorting employees according to their number
public class NumSort implements Comparator<EmployeeInfo> {
    @Override
    public int compare(EmployeeInfo o1, EmployeeInfo o2) {
        return o1.getNumber() - o2.getNumber();
    }
}