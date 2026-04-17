package com.ems.comparators;

import java.util.Comparator;
import com.ems.entity.*;

public class EmployeeSalaryOrder implements Comparator<Employee>{
	@Override
    public int compare(Employee obj1, Employee obj2){
        return Double.compare(obj1.getSalary(), obj2.getSalary());
    }
}
