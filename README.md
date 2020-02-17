This is a spring boot application which uses Spring REST to expose REST APIs.
First run the sql script "employee.sql" in mysql workbench or any other RDBMS before running the application.

This application creates the Rest APIs for post,get,put, and delete operation for an employee database. It uses Data Access Object(DAO) Pattern.
Use postman API testing tool for testing the API.
The api spec is as follows:

METHOD              path                     Params               Request Body

Get               /api/employees              -                   
                  /api/employees/{id}        id
                  
Post              /api/employees                                    employee(Object)

Put               /api/employees/{id}        id                     employee(Object)

Delete            /api/employees/{id}        id
