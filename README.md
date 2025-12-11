🎯 Java-Spring Projects Collection — Learning + Microservices Playground

A complete collection of multiple Spring Boot, JPA, REST API, Security, and Microservice projects, built for learning, experimenting, and practicing backend development with Java.

This repository is a sandbox of real working projects — useful for:

🚀 Learning Spring Boot from basics to advanced

🧩 Exploring microservices with REST, DB, Post/Notification services

📚 Reusing CRUD templates, JPA mappings, and controller logic

🧪 Testing ideas while building real Java backend skills

📂 Projects Included

Each folder is a standalone Spring Boot project.
Below is a categorized overview:

🧑‍💼 Employee & User Management
Project	Description
EmployeeJpaLvl2	JPA CRUD operations, Level-2 cache pattern examples
EmployeeManagement	Full CRUD employee management app
EmployeeSpringJpa	Clean implementation of Spring JPA with controllers
UserManage	User database + microservice integration example
UserDbapr	Another user DB practice project



🎓 Student Management Projects
Project	Description
StudentManagment	Simple student CRUD service
studentapp	Spring Boot + Student controller/entity
studentconnect	Student service connectivity example
studentconnectlvl1	Level-1 advanced version of student connectivity




📚 Library Management
Project	Description
LibraryManagment	Basic library DB + CRUD operations



📬 Microservices – Posts & Notifications
Project	Description
PostUser	User + Post microservice logic
PostDb	Dedicated Post DB service
Notification	Notification microservice (in-memory or REST)
NotificationDb	Notification database service



🛒 Order Management
Project	Description
OrderManagment	Order CRUD + business logic demo




🔐 Spring Security Projects
Project	Description
SpringSecure	Basic Spring Security setup
SpringSecuring	Enhanced security example
SpringSecurityDemo	Demo with login/authentication




🌐 REST API Samples
Project	Description
RestAPIwithSpringDataJPAEMS	REST API with Entity–Repository–Service pattern
SpringMicroSer	Microservice communication examples




🚀 How to Run Any Project

Each project is independent. To run one:

1. Clone the repository
git clone https://github.com/GoulikarRamcharan/Java-Spring-.git
cd Java-Spring-

2. Open any project folder

For example:

cd EmployeeManagement

3. Build & Run

Using Maven:

mvn clean install
mvn spring-boot:run


Or using Maven wrapper:

./mvnw spring-boot:run

⚙️ Tech Stack Used Across Projects

Java 8 / 11 / 17

Spring Boot

Spring Data JPA / Hibernate

Spring Security

REST Controllers (Spring MVC)

MySQL / H2 / in-memory databases

Maven Build Tool

🔥 Highlight: Microservices Example (Posts + Notifications)

In your UserService, microservices are consumed using RestTemplate:

Posts post = restTemplate.getForObject(
    "http://localhost:8010/po/posts/" + userId,
    Posts.class
);

Notifications notify = restTemplate.getForObject(
    "http://localhost:8011/noti/notifications/" + userId,
    Notifications.class
);


You’ve built a clean pattern of:

User DB Service

Post Service

Notification Service

RestTemplate communication

This structure is a great stepping stone toward:

Eureka Service Discovery


Load Balancing (Spring Cloud LoadBalancer)

🔧 Folder Structure (High-Level)
Java-Spring-/
│
├── EmployeeManagement/
├── LibraryManagment/
├── Notification/
├── PostUser/
├── RestAPIwithSpringDataJPAEMS/
├── SpringSecure/
├── UserManage/
└── ...


Each folder contains:

src/main/java/...  → Java source files  
src/main/resources → properties, templates  
pom.xml            → Maven configuration  

🧭 Roadmap / Future Enhancements

Here are some improvements you may add later:

 Add Eureka Server + register microservices

 Add API Gateway (Spring Cloud Gateway)

 Add Swagger UI for all REST APIs

 Add Dockerfile for each microservice
 
 Use WebClient instead of RestTemplate

 Add unit tests (JUnit + Mockito)

 Add Postgres or MongoDB examples

🤝 Contributing

Add new sample projects

Improve existing code

Add documentation

Refactor microservices

Pull requests are welcome if you open this repo to others.

👤 Author

Ram Charan Goulikar
Java Backend | Spring Boot | Microservices | REST APIs
Passionate about building scalable backend systems.

⭐ Support This Repository

If this repo helped you in learning or project development:

⭐ Star this repository — it helps others discover it!
🔁 Share it with fellow Java/Spring learners.


