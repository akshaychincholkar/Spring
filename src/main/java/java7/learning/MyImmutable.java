package java7.learning;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class MyImmutable {
    public static void main(String[] args){
        int empNumber = 1;
        String empName = "Sachin";
        HashMap<String,String> addresses = new HashMap<String,String>();
        addresses.put("1","Address1");
        addresses.put("2","Address2");
        Date dob = new Date();
        Employee employee = new Employee(empNumber,empName,addresses,dob);

        System.out.println("*******************************");
        System.out.println("Shadow copy implementation");
        System.out.println("Number: "+employee.getEmpNumber());
        System.out.println("Name: "+employee.getEmpName());
        System.out.println("Addresses: "+employee.getAddresses());
        System.out.println("Dob: "+employee.getDob());
        System.out.println("********************************");

        System.out.println("After updating the address");
        addresses.put("3","Address3");
        System.out.println("*******************************");
        System.out.println("Shadow copy implementation");
        System.out.println("Number: "+employee.getEmpNumber());
        System.out.println("Name: "+employee.getEmpName());
        System.out.println("Addresses: "+employee.getAddresses());
        System.out.println("Dob: "+employee.getDob());
        System.out.println("********************************");

    }
}
final class Employee{
    private final int empNumber;
    private final String empName;
    private final HashMap<String,String> addresses;
    private final Date dob;

    Employee(int empNumber, String empName,HashMap<String,String> addresses, Date dob){
        this.empNumber = empNumber;
        this.empName = empName;
        Iterator<String> iterator = addresses.keySet().iterator();
        HashMap<String,String> tempMap=new HashMap<String,String>();
        while(iterator.hasNext()){
            String key = iterator.next();
            tempMap.put(key,addresses.get(key));
        }
        this.addresses = tempMap;
        this.dob = dob;
    }
    public int getEmpNumber() {
        return empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public HashMap<String, String> getAddresses() {
        return (HashMap<String, String>) addresses.clone();
    }
    public Date getDob() {
        return (Date)dob.clone();
    }
}
