package com.springbootfirst.shiawase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee
{
    @Autowired
    Salary salary;
    public void Get()
    {
        salary.GetSalary();
    }
}
