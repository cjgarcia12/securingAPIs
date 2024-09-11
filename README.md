# Securing APIs with Spring Boot and JWT

This project demonstrates how to secure RESTful APIs using Spring Boot and JSON Web Tokens (JWT).

## Prerequisites

- Java 22
- Maven 3.6+
- An IDE of your choice (e.g., IntelliJ IDEA, Eclipse)

## Getting Started

1. Clone the repository:
   ```
   git clone <repository-url>
   cd securingAPIs2
   ```

2. Build the project:
   ```
   mvn clean install
   ```

3. Run the application:
   ```
   mvn spring-boot:run
   ```

The application will start on `http://localhost:8080`.

## Testing the APIs

You can use tools like Postman or cURL to test the APIs. Here are the main endpoints:

### 1. Register a new user

- Method: POST
- URL: `http://localhost:8080/api/register`
- Body (raw JSON):
  ```json
  {
    "username": "testuser",
    "password": "password123",
    "roleNames": ["USER"]
  }
  ```

### 2. Login

- Method: POST
- URL: `http://localhost:8080/api/auth/login`
- Body (raw JSON):
  ```json
  {
    "username": "testuser",
    "password": "password123"
  }
  ```
- This will return a JWT token in the response.

### 3. Access protected endpoints

Use the token received from the login endpoint to access protected endpoints:

- Method: GET
- URL: `http://localhost:8080/api/user-only`
- Headers:
  - Key: Authorization
  - Value: Bearer <your_jwt_token>

Replace `<your_jwt_token>` with the actual token you received from the login request.

## Additional Information

- The JWT token is set to expire after one year. You can modify this in the `application.properties` file.
- Make sure to keep your JWT secret key secure and never commit it to version control.

## Troubleshooting

If you encounter any issues, please check the application logs for error messages. Ensure that you're using the correct endpoints and that your JWT token is valid and not expired.
