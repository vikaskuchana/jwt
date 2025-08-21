# JWT Authentication & Authorization for Web Applications and APIs

## Overview
This project provides a robust implementation of authentication and authorization using JSON Web Tokens (JWT) in a Java Spring Boot application. It is designed for securing web applications and RESTful APIs.

## Features
- User authentication with JWT
- Role-based authorization
- Secure endpoints with JWT filter
- Custom user details service
- 
- Example API endpoints for testing
- Easy integration with frontend or other services

## Technologies Used
- Java 17+
- Spring Boot
- Spring Security
- Maven
- JWT (io.jsonwebtoken)

## Getting Started
### Prerequisites
- Java 17 or higher
- Maven

### Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/vikaskuchana/jwt.git
   cd jwt
   ```
2. Build the project:
   ```bash
   mvn clean install
   ```
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```
   or
   ```bash
   java -jar target/jwt-1.0.0.jar
   ```

### Configuration
Edit `src/main/resources/application.properties` to set database and JWT secret properties.

## API Endpoints
- `POST /authenticate` - Login and receive JWT token
- `GET /test` - Protected endpoint (requires JWT)

Refer to `JWT.postman_collection.json` for example requests.

## Usage
1. Authenticate using `/authenticate` with valid credentials to receive a JWT token.
2. Use the token in the `Authorization: Bearer <token>` header for protected endpoints.

## Project Structure
```
src/main/java/com/example/jwtapp/
├── JwtAppApplication.java
├── controller/
│   ├── AuthController.java
│   └── TestController.java
├── model/
│   └── User.java
├── repository/
│   └── UserRepository.java
├── security/
│   ├── JwtFilter.java
│   ├── JwtUtil.java
│   └── SecurityConfig.java
├── service/
│   └── CustomUserDetailsService.java
```

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request.

## License
This project is licensed under the MIT License.

## Contact
Maintainer: Kuchana Vikas
Email: kuchanavikas@gmail.com
