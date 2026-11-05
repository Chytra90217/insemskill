TOURIST TOKEN API - READY TO RUN

This version uses an embedded H2 in-memory database.
You do NOT need to install MySQL, create a database, or edit a database password.

IMPORT INTO SPRING TOOL SUITE (STS)
1. Extract this ZIP file.
2. Open STS.
3. Select File > Import.
4. Select Maven > Existing Maven Projects.
5. Browse to the extracted TouristTokenAPI-Ready folder.
6. Select the pom.xml file and click Finish.
7. Wait for Maven dependencies to download.
8. Open TouristTokenApiApplication.java.
9. Right-click > Run As > Spring Boot App.

SWAGGER UI
http://localhost:8081/swagger-ui/index.html

TEST
1. Expand GET /api/tourists.
2. Click Try it out.
3. Enter the custom request header:
   Token: ABC123
4. Click Execute.

EXPECTED
- Valid token: 200 OK and three sample tourist records.
- Missing/invalid token: 500 Internal Server Error
  Unauthorized: Invalid Token Provided

DATABASE
The project automatically creates an in-memory H2 database and inserts
three sample tourist records at startup. Data resets when the application
is stopped.

H2 CONSOLE (optional)
http://localhost:8081/h2-console
JDBC URL: jdbc:h2:mem:touristdb
Username: sa
Password: (leave blank)

TOKEN
ABC123 is a sample token for this ready-to-run lab project.
Replace app.security.valid-token in application.properties with your
existing pre-generated token if your instructor supplied one.

JAVA
Use JDK 17 or a compatible newer JDK.
Internet is required the first time Maven downloads dependencies.
