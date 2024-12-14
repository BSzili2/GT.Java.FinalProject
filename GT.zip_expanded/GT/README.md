# SC CONST PETER SRL - Spring Boot Web Application

## Project Description
This is a web application built using Spring Boot, designed for a construction company, SC CONST PETER SRL. It showcases various pages like Acasa, Catalog, and Contact, all styled with a custom dark theme CSS. The application also integrates Spring Security for authentication and MySQL for data storage.

---

## Features
- Home Page (Acasa): Displays a welcome message and interactive navigation buttons.
- Catalog Page: Lists three products with names, prices, average completion times, and associated images.
- Contact Page: Provides a form to submit inquiries with a thank-you confirmation message.
- Custom dark CSS theme applied to all pages.
- Spring Security: Includes one-time login functionality with username and password authentication.
- Thymeleaf: For server-side rendering of HTML pages.
- MySQL Database Integration: Data persistence for product and contact information.
- REST Endpoints Testing: Fully testable with Postman.

---

## Technologies Used
- Java 20 (or compatible version)
- Spring Boot 3.x
  - Spring MVC
  - Spring Data JPA
  - Spring Security
- MySQL for database
- Thymeleaf for front-end templating
- Maven for dependency management
- CSS for styling
- Eclipse IDE for development

---

## Setup Instructions

### Prerequisites
- JDK 17 or higher
- Eclipse IDE with Maven support
- MySQL server
- Postman (optional, for API testing)

---

### Installation
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/your-repository.git
   
2. Open the project in Eclipse:

Go to File > Open Projects from File System.
Select the project's root folder and click Finish.

3. Configure the database:

Open src/main/resources/application.properties.
Update the following lines with your MySQL credentials: 
	spring.datasource.url=jdbc:mysql://localhost:3306/your-database-name
	spring.datasource.username=your-username
	spring.datasource.password=your-password
	
4. Build the project:

Right-click on the project in Eclipse and select Run As > Maven Install.
Run the application:

Right-click on the project and select Run As > Spring Boot App.

	### Testing the Application ###
	
Open your browser and navigate to:

http://localhost:8080/ - Automatically redirects to the login page.
Default credentials:
Username: gt
Password: 2024

Access different pages:

Acasa: http://localhost:8080/acasa
Catalog: http://localhost:8080/catalog
Contact: http://localhost:8080/contact