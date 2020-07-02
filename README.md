This is a spring boot application which uses Spring REST to expose REST APIs.
First run the sql script "employee.sql" in mysql workbench or any other RDBMS before running the application.

This application creates the Rest APIs for post,get,put, and delete operation for an employee database. It uses Data Access Object(DAO) Pattern.
Use postman API testing tool for testing the API.
The api spec is as follows:

| Method | endpoint            | Params | Request Body    | Action                                 |
|--------|---------------------|--------|-----------------|----------------------------------------|
| GET    | /api/employees      | -      | -               | Retrieves a list of employees          |
| GET    | /api/employees/{id} | id     | -               | Retrieves a specific employee using id |
| POST   | /api/employees      | -      | Employee Object | To insert new Employee to the table    |
| PUT    | /api/employees{id}  | id     | Employee Object | To update an existing Employee         |
| DELETE | /api/employees      | id     | -               | To delete employee by id               |
