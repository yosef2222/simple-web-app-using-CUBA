package com.company.test.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Table(name = "TEST_EMPLOYEE")
@Entity(name = "test_Employee")
public class Employee extends StandardEntity {
    private static final long serialVersionUID = -2511117901469470454L;

    @Column(name = "FULLNAME", nullable = false)
    private String fullName;

    @ManyToMany(mappedBy = "employees")
    private List<Project> projects;


    public String getName() {
        return fullName;
    }

    public void setName(String fullName) {
        this.fullName = fullName;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}