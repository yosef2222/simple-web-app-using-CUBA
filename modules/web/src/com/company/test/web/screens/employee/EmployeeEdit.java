package com.company.test.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Employee;

@UiController("test_Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
@LoadDataBeforeShow
public class EmployeeEdit extends StandardEditor<Employee> {
}