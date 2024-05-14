package com.company.test.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@Table(name = "TEST_PROJECT")
@Entity(name = "test_Project")
public class Project extends StandardEntity {
    private static final long serialVersionUID = -2183143284935914020L;
    @Column(name = "NAME", nullable = false)
    private String name;

    @JoinTable(name = "TEST_PROJECT_EMPLOYEE_LINK",
            joinColumns = @JoinColumn(name = "PROJECT_ID"),
            inverseJoinColumns = @JoinColumn(name = "EMPLOYEE_ID"))

    @ManyToMany
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}