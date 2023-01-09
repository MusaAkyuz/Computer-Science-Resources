package javaıteratorpatern;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Onder Eyecioglu
 */
// Liste üzerinde gezilecek olan elamnı temsil eden sınıf.
class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
// Koleksiyon üzerinde dolaşmak için operasyonların tanımlandığı arayüzdür.
// Bir sonraki elemana geçme, bir sonraki elemanın olup olmadığı gibi.
// UML diyagramındaki Iterator arayüzüne denk gelmektedir.
// Generic bir yapı sağlanarak birçok yerde kullanılması sağlanır.
interface IIterator<T> {
    Boolean hasNext();
    //T getCurrentItem();
    void getCurrentItem();
}
// Iterator arayüzünü uygulayan sınıf örneklerini elde etmek için metot içerir.
// Bu sayede çeşitli Iterator arayüzünü uygulayan sınıfların örneklerini elde edebiliriz.
// UML diyagramındaki Aggregate arayüzüne denk gelmektedir.
interface IEmployeeAggregate {
    IIterator<Employee> createIterator();
}
// Iterator arayüzünü ve koleksiyon üzerinde dolaşmak için gerekli metotları uygular.
// Veriler üzerinde dolanma işlemleri burada gerçekleştirilecektir.
// ConcreteAggregate (EmployeeListAggregate) sınıfı ile birlikte çalışır
class EmployeeIterator implements IIterator<Employee> {
    private EmployeeListAggregate _employeeListAggregate;
    private int _currentIndex;
    public EmployeeIterator(EmployeeListAggregate employeeListAggregate) {
        _employeeListAggregate = employeeListAggregate;
        _currentIndex = 0;
    }
    /* public Employee getCurrentItem() {
        return _employeeListAggregate.get(_currentIndex++);
    }*/
    public Boolean hasNext() {
        if (_employeeListAggregate.count() > _currentIndex) {
            return true;
        }
        return false;
    }
    public void getCurrentItem(){
        while (this.hasNext()) {
            String message = String.format("%s %s", _employeeListAggregate.get(_currentIndex).firstName, _employeeListAggregate.get(_currentIndex).lastName);
            System.out.println(message);
            _currentIndex++;
        }
    
    }
    
    
}
// Aggregate (IEmployeeAggregate) arayüzünü uygular ve Iterator arayüzünü uygulayan sınıf örneği üretir.
// Değerlerin referansları burada bulunur.
// UML diyagramındaki ConcreteAggregate  sınıfına denk gelmektedir.
class EmployeeListAggregate implements IEmployeeAggregate {
    private List<Employee> _employees;
    public EmployeeListAggregate() {
        _employees = new ArrayList<>();
    }
    public void add(Employee employee) {
        _employees.add(employee);
    }
    public int count() {
        return _employees.size();
    }
    public Employee get(int index) {
        return _employees.get(index);
    }
    public IIterator<Employee> createIterator() {
        return new EmployeeIterator(this);
    }
}
public class JavaIteratorPatern {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmployeeListAggregate employeeListAggregate = new EmployeeListAggregate();
        Employee yusuf = new Employee(1, "Yusuf", "Yılmaz");
        Employee arafat = new Employee(2, "Arafat", "Önlük");
        Employee derya = new Employee(3, "Derya", "Obi");
        employeeListAggregate.add(yusuf);
        employeeListAggregate.add(arafat);
        employeeListAggregate.add(derya);
        var iterator = employeeListAggregate.createIterator();
        iterator.getCurrentItem();
        /* while (iterator.hasNext()) {
            Employee currentEmployee = iterator.getCurrentItem();
            String message = String.format("%s %s", currentEmployee.firstName, currentEmployee.lastName);
            System.out.println(message);
        } */
    }
    
}
