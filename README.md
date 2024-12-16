
# profile Manager
java- application

# User Management System  

A simple Java application for managing user data. This application provides a complete solution for performing **CRUD operations** (Create, Read, Update, Delete) on user details, including **Name**, **Username**, and **Email**.  

## Features  

- Create a new user entry with **Name**, **Username**, and **Email**.  
- View a list of all registered users.  
- Edit existing user details.  
- Delete user records.  
- Backend and frontend integration for seamless user management.  

## Technologies Used  

### Frontend  
- **React.js**: For creating the user interface and managing state.  
- **CSS**: For styling the application.  

### Backend  
- **Java**: Core application logic and CRUD operations.  
- **JDBC**: For database connectivity.  
- **MySQL**: Database to store user information.  

## Setup Instructions  

### Prerequisites  
- **Java Development Kit (JDK)** installed (version 8 or higher).  
- **MySQL Server** installed and running.  
- A Java IDE (e.g., IntelliJ IDEA, Eclipse, or NetBeans).  

### Installation  
1. **Clone the Repository**:  
   ```bash  
   git clone https://github.com/Bharathi7890/Profile-Manager.git  
   cd user-management-system  
2.**Set Up Database**:
  ```bash
  CREATE DATABASE user_management;  
USE user_management;  
CREATE TABLE users (  
    id INT AUTO_INCREMENT PRIMARY KEY,  
    name VARCHAR(255) NOT NULL,  
    username VARCHAR(255) UNIQUE NOT NULL,  
    email VARCHAR(255) UNIQUE NOT NULL  
);
```
3. **Configure the Database Connection**:
 - Update the database credentials in the db.properties file:
```bash
    db.url=jdbc:mysql://localhost:3306/user_management  
    db.username=your_mysql_username  
    db.password=your_mysql_password
```
5. **Run the Application:**
 - Compile and run the Java backend using your IDE or from the terminal
```bash
  javac Main.java  
  java Main
```
7. **Access the Frontend:**
 - Open the file in your browser to interact with the user interface.

## Usage  

1. **Create User**: Enter user details in the form and click "Add User".  
2. **Read User**: View the list of users on the main page.  
3. **Update User**: Click "Edit" next to a user and modify their details.  
4. **Delete User**: Click "Delete" to remove a user from the database.  

---

## Screenshots  

### Home Page  
![Home Page](https://github.com/Bharathi7890/Profile-Manager/Frontend/public/homepage.png)  

### Add User  
![Add User](https://github.com/Bharathi7890/Profile-Manager/Frontend/public/adduser.png)  

---

## Contributing  

Contributions are welcome! Please follow these steps:  

1. Fork the repository.  
2. Create a new branch:  
   ```bash
   git checkout -b feature-name  

## License
This project is licensed under the [MIT License.]

## Contact  

- **Developer**: [Bharathiraja](https://github.com/Bharathi7890)  
- **Email**: bharathiraja@example.com  


  
