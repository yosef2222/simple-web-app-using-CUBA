package com.company.test.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Employee;

@UiController("test_Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
@LoadDataBeforeShow
public class EmployeeBrowse extends StandardLookup<Employee> {
}