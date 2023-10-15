# API_RestAssured

Java with Rest Assured
REST Assured is a Java library that provides a domain-specific language (DSL) for writing powerful, maintainable tests for RESTful APIs.
You can use RestAssured to send HTTP(S) requests, set up expectations/assertions for responses, and perform various API testing tasks.
To run the Java code with RestAssured, you'll need to set up a Java development environment and include RestAssured as a dependency in your project.

Some prerequisites and steps to get started:

1. Java Development Environment: Make sure you have Java installed on your computer. You can download and install the Java Development Kit (JDK) from the official Oracle website;
2. Integrated Development Environment (IDE): You can use an IDE for Java development like Eclipse or IntelliJ IDEA. An IDE can significantly simplify the development process;
3. Maven or Gradle (Optional): You can use Maven or Gradle as a build tool to manage project dependencies and build your project. While it's not strictly required, it is a good practice for managing dependencie;
4. TestNG Library: TestNG is a popular testing framework for Java, primarily used for test automation. You need to have the TestNG library added to your project's classpath. You can download the TestNG JAR file from the TestNG website (http://testng.org) or use a build automation tool like Maven or Gradle to manage your project's dependencies;
5. RestAssured Library: You need to include the RestAssured library in your project. This can be done through your build automation tool (Maven or Gradle) by adding RestAssured as a dependency in your project's configuration file (pom.xml for Maven or build.gradle for Gradle);
6. HTTP Client: RestAssured uses an HTTP client under the hood to send HTTP requests and receive responses. By default, it uses the Apache HttpClient library. However, you can also use other HTTP clients such as OkHttp or the built-in HTTP client in Java 11 and later. Ensure that the HTTP client you intend to use is available in your project;
7. JSON or XML Parsing Library (Optional): If you are working with JSON or XML data in your API responses, you may want to include a library for parsing and handling these data formats, such as Jackson for JSON or JAXB for XML;
