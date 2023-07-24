# Mapping-Practice
- This project is a Mapping-Practice that allows you to manage students' information, addresses, books, courses, and laptops. The system is implemented using Spring Boot and uses JPA/Hibernate for data persistence with an H2 in-memory database. The following sections provide an overview of the project structure, functionality, and usage.

## Project Structure

- The project is organized into different classes and packages to manage various entities and their interactions. Here is a brief overview of the main components:

1. **Entities**: Contains classes representing the data models (Address, Book, Course, Laptop, Student).

2. **Controllers**: Each controller handles HTTP requests and manages API endpoints for CRUD operations on entities (AddressController, BookController, CourseController, LaptopController, StudentController).

3. **Repositories**: Contains interfaces that define data access methods (AddressRepository, BookRepository, CourseRepository, LaptopRepository, StudentRepository).

4. **Services**: Contains service classes that provide business logic and act as an intermediary between controllers and repositories (AddressService, BookService, CourseService, LaptopService, StudentService).

## Functionality

- The Student Management System provides the following functionality:

- **Create Address**: You can create a new address by providing the landmark, zipcode, district, state, and country.

- **Update Address**: You can update the details of an existing address by its ID.

- **Get Address**: Retrieve an address by its ID.

- **Delete Address**: Delete an address by its ID.

- **Create Book**: You can add a new book to the system with the title, author, description, and price. Each book is associated with a student.

- **Update Book**: Update the details of an existing book by its ID.

- **Get Book**: Retrieve a book by its ID.

- **Delete Book**: Delete a book by its ID.

- **Create Course**: You can create a new course with a title, description, duration, and associated student list.

- **Update Course**: Update the details of an existing course by its ID.

- **Get Course**: Retrieve a course by its ID.

- **Delete Course**: Delete a course by its ID.

- **Create Laptop**: Add a new laptop to the system with a name, brand, price, and associated student.

- **Update Laptop**: Update the details of an existing laptop by its ID.

- **Get Laptop**: Retrieve a laptop by its ID.

- **Delete Laptop**: Delete a laptop by its ID.

- **Create Student**: You can add a new student with their name, age, phone number, branch, department, and associated address.

- **Update Student**: Update the details of an existing student by their ID.

- **Get Student**: Retrieve a student by their ID.

- **Delete Student**: Delete a student by their ID.

## Usage

- To run the Student Management System, follow these steps:

1. Clone the repository to your local machine.

2. Import the project into your preferred Java IDE (e.g., IntelliJ, Eclipse).

3. Build the project to resolve dependencies.

4. Run the application using Spring Boot.

5. The application will start, and you can access the endpoints using tools like Postman or through a frontend application.

- Note: The project uses an H2 in-memory database, so the data will be reset every time the application restarts.

## Dependencies

- The main dependencies for this project are:

- Spring Boot: For building the backend application.

- H2 Database: For in-memory data storage.

- Spring Data JPA: For data access and manipulation.

- Spring Web: For creating RESTful APIs.

## Conclusion

- This Student Management System provides essential functionality to manage students, their addresses, books, courses, and laptops. You can extend the project by adding more features, such as user authentication, user roles, or data validation. Feel free to explore and enhance the system to meet your specific requirements. Happy coding!
