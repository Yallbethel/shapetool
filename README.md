# ShapeTool SOAP Web Service


## 👤 Author

Name: Bethlehem Yalelet  
ID: 145614 
Department: Software Engineering  
University: Woldia University  
Year: 5th Year (2026)

## 📌 Project Overview

ShapeTool is a SOAP-based web service developed as part of the Web Service course assignment for 5th Year Software Engineering students at Woldia University (2026).

The system calculates the area of different geometric shapes using a contract-first approach. The XML Schema (XSD) is designed first to define the structure of request and response messages, followed by the implementation of the SOAP web service.



## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Web Services (Spring-WS)
* SOAP (Simple Object Access Protocol)
* JAXB (Jakarta XML Binding)
* XML Schema (XSD)
* WSDL
* SoapUI (for testing) 

---

## 📐 Supported Operations

The web service provides the following operations:

* `circleArea` → calculates area using radius
* `squareArea` → calculates area using side
* `rectangleArea` → calculates area using length and width
* `triangleArea` → calculates area using base and height
* `parallelogramArea` → calculates area using base and height

---

## 🧩 XSD Design (Contract-First Approach)

The XML Schema (`shapes.xsd`) defines all request and response structures.

### Key Features:

* Uses `xs:double` for numeric values
* Defines a reusable type `positiveDouble`
* Prevents invalid input (negative numbers)
* Uses proper namespace:

  ```
  http://example.org/shapetool
  ```

### Example (Circle Request)

```xml
<circleAreaRequest>
   <radius>5</radius>
</circleAreaRequest>
```

### Example (Circle Response)

```xml
<circleAreaResponse>
   <area>78.5</area>
</circleAreaResponse>
```


## 📄 WSDL Description

The WSDL file defines:

* All operations (circleArea, squareArea, rectangleArea, triangleArea, parallelogramArea)
* Input and output messages
* SOAP binding (document/literal style)
* Service endpoint

### Endpoint:
SOAP Service Endpoint:
```
http://localhost:8080/ws
```
WSDL URL:

```
http://localhost:8080/ws/shapes.wsdl
```

## ⚙️ Service Implementation

The service is implemented using Spring Boot and Spring Web Services.

Each operation:

* Receives a request object
* Validates input values
* Computes area using correct formula
* Returns a structured SOAP response


## ✅ Validation Logic

Validation is implemented in the endpoint layer.

### Rules:

* Missing values → specific error message
* Negative or zero values → rejected

### Examples:

| Case              | Error Message                                    |
| ----------------- | ------------------------------------------------ |
| Missing radius    | "Circle error: radius is required"               |
| Negative radius   | "Circle error: radius must be greater than 0"    |
| Missing base      | "Triangle error: base is required"               |
| Invalid rectangle | "Rectangle error: length must be greater than 0" |



## ⚠️ SOAP Fault Handling

Invalid requests return SOAP Fault responses.

### Example:

```xml
<SOAP-ENV:Fault>
   <faultcode>SOAP-ENV:Server</faultcode>
   <faultstring>Circle error: radius must be greater than 0</faultstring>
</SOAP-ENV:Fault>
```



## 🧪 Testing

The service was tested using  SoapUI.

### Test Cases Included:

* Valid requests for all operations
* Invalid inputs (negative values)
* Missing parameters

All test cases are stored in:

```
test-cases/
```



## ▶️ How to Run the Project

1. Open the project in IntelliJ IDEA
2. Ensure JDK is installed
3. Run the main class:

   ```
   ShapetoolrestApplication
   ```
4. Open browser:

   ```
   http://localhost:8080/ws/shapes.wsdl
   ```
5. Test using SoapUI



## 📁 Project Structure

```
shapetool/
 ├── src/main/java/
 ├── src/main/resources/
 │     ├── shapes.xsd
 │     ├── shapes.wsdl
 │     └── test-cases/
 ├── README.md
 ├── pom.xml
```



## 🎯 Conclusion

This project demonstrates:

* Contract-first SOAP web service development
* XML Schema design and validation
* WSDL-based service definition
* Error handling using SOAP Faults

The ShapeTool system successfully meets all assignment requirements and provides a fully functional SOAP-based service for geometric calculations.


