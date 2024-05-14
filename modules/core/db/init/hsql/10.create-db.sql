-- begin TEST_EMPLOYEE
create table TEST_EMPLOYEE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FULLNAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end TEST_EMPLOYEE
-- begin TEST_PROJECT
create table TEST_PROJECT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end TEST_PROJECT
-- begin TEST_PROJECT_EMPLOYEE_LINK
create table TEST_PROJECT_EMPLOYEE_LINK (
    PROJECT_ID varchar(36) not null,
    EMPLOYEE_ID varchar(36) not null,
    primary key (PROJECT_ID, EMPLOYEE_ID)
)^
-- end TEST_PROJECT_EMPLOYEE_LINK
