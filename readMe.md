**Customer Service API**

This README file provides an overview of the Customer Service API, including the Actuator endpoints for monitoring and managing the application.



### Spring Boot Actuators Integration:

The Customer Service API is integrated with Spring Boot Actuators, which provides endpoints for monitoring and managing the application. Here are some key points about Actuators:

- **Port Configuration:** The management server port is set to 9001 in the application properties (`management.server.port=9001`).

- **Endpoint Exposure:** All Actuator endpoints are exposed over HTTP by including all endpoints (`management.endpoints.web.exposure.include=*`).

- **Health Endpoint Details:** Health endpoint details are set to always show (`management.endpoint.health.show-details=always`), providing comprehensive health information about the application.
- 
### Actuator Endpoints:

Actuator endpoints provide various information about the application's health, metrics, environment, and more. The Actuator endpoints are accessible via HTTP and provide valuable insights into the application's internal state and performance.

To access Actuator endpoints, use the following base URL:

```
http://localhost:9001/actuator
```

Here are some commonly used Actuator endpoints:

- **Health Endpoint:** `/health`
    - Provides information about the application's health status. The `show-details` property is set to "always", ensuring that detailed health information is always displayed.

- **Info Endpoint:** `/info`
    - Displays arbitrary application information. This endpoint can be customized to provide additional details about the application.

- **Metrics Endpoint:** `/metrics`
    - Provides various metrics about the application, such as memory usage, CPU usage, garbage collection statistics, and more.

- **Environment Endpoint:** `/env`
    - Displays information about the application's environment, including system properties, environment variables, and configuration properties.

### Usage:

1. **Creating a Customer:**
    - Send a POST request to `http://localhost:8080/createCustomer`.
    - Provide the required fields: `firstname`, `lastname`, and `email`.
    - Optionally, provide additional fields such as `customerType` and `phone`.
    - Upon successful creation, the response will include a generated UUID along with the provided data.

2. **Getting a List of Customers:**
    - Send a GET request to `http://localhost:8080/getCustomers`.
    - No request body parameters are required.
    - The response will contain an array of objects, each representing a customer and their details.

### Example:

**Creating a Customer:**
```
POST http://localhost:8080/createCustomer
{
  "firstname": "John",
  "lastname": "Doe",
  "customerType": "Regular",
  "email": "john.doe@example.com",
  "phone": "123-456-7890"
}
```
**Response:**
```
{
  "uuid": "123e4567-e89b-12d3-a456-556642440000",
  "firstname": "John",
  "lastname": "Doe",
  "customerType": "Regular",
  "email": "john.doe@example.com",
  "phone": "123-456-7890"
}
```

**Getting a List of Customers:**
```
GET http://localhost:8080/getCustomers
```
**Response:**
```
[
  {
    "uuid": "123e4567-e89b-12d3-a456-556642440000",
    "firstname": "John",
    "lastname": "Doe",
    "customerType": "Regular",
    "email": "john.doe@example.com",
    "phone": "123-456-7890"
  },
  {
    "uuid": "789e0123-f456-45ab-cdef-1234567890ab",
    "firstname": "Jane",
    "lastname": "Smith",
    "customerType": "Premium",
    "email": "jane.smith@example.com",
    "phone": "987-654-3210"
  }
]
```

This README provides a basic understanding of the Customer Service API and its usage, along with the Actuator endpoints configuration for monitoring and managing the application. For more detailed information contact the API provider.