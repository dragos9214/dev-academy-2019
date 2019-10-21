# Branch timeline
## Development 01

This branch contains the code of a maven basic "Hello World" application. This is the starting point of our movie store application.

### How did we get here: 
  * We cloned the github repository [here](https://github.com/dragos9214/dev-academy-2019.git)
  * We checked out **development-01** branch.
  * The project was initially generated using the Spring initializr [website](https://start.spring.io/)
 
### Check if it works for you:
  * Go to Application.java class and hit **CTRL + SHIFT + F10**
    * You should get the ***Hello World*** message in the console output.
    
### Files created in this branch:
  * .gitignore ~ specifies intentionally untracked files that Git should ignore. Files already tracked by Git are not affected. Find out more [here](https://git-scm.com/docs/gitignore).
  * pom.xml ~ A Project Object Model or POM is the fundamental unit of work in Maven. It is an XML file that contains information about the project and configuration details used by Maven to build the project. It contains default values for most projects. Examples for this is the build directory, which is target; the source directory, which is src/main/java; the test source directory, which is src/test/java; and so on. Find out more [here](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html).
  
### More useful links:
  * [About Maven](https://maven.apache.org/what-is-maven.html)
  * [About Spring Boot](https://spring.io/projects/spring-boot)
  
## Development 02

This branch contains a basic MVC + Service movie application. The Controller exposes a get all movies method that is then used by the view element in order for the movies to be displayed.
The service represents the component of the application responsible with the business logic related to Movie model.
 
### How did we get here:
  * We created the controller class that requires a service to retrieve the movies from.
  * We created the service and some dummy movies.
  * We added a view that consumes the controller info.
  * We bind all the components in the Application class.
 
### Check if it works for you:
   * Go to Application.java class and hit **CTRL + SHIFT + F10**
     * You should get the ***User Movies*** list in the console output.

### Files created in this branch:
  * MovieController.java ~ Movie Controller class
  * MovieService.java ~ Movie Service class - Business Logic that retrieves or manages the movie entities
  * View.java ~ Simple view that outputs to console the movies
  
### More useful links:
  * [Model View Controller](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller)
  
## Development 03

This branch describes how Spring is added to a maven project and how Spring Dependency injection is used. The principle behind Spring Events is also described.

### How did we get here:
  * We added the Spring web dependency in our [pom.xml](./pom.xml) file
  * We removed all code in the [Application main function](./src/main/java/com/orange/moviestore/Application.java) app and added the Spring boot app annotation and run.
  * We annotated all service classes with *@Service*
  * We added the *ApplicationStartedEvent* listener to the [View Class](./src/main/java/com/orange/moviestore/View.java)
    
### Check if it works for you:
  * Go to Application.java class and hit **CTRL + SHIFT + F10**
       * You should get the Spring Boot logo and specific Spring logs in the console output.
       * You should get the ***User Movies*** list in the end of the console output.
### Files created in this branch:
***NONE***
### More useful links:
  * [Spring boot example from Spring.io](https://spring.io/guides/gs/spring-boot/)
  
## Development 04

This branch describes how a REST controller is created using Spring.

### How did we get here:
  * We removed the View.java file as we no longer need to print the movies in the console, we're moving to WEB
  * We changed the movie controller from *@Service* to *@RestController*
  * We annotate the get method of the movie controller with the *@GetMapping*
  * We configured the port we want the server to work on: 8090
  
### Check if it works for you:
  * Go to Application.java class and hit **CTRL + SHIFT + F10**
    * You should get the Spring Boot logo and specific Spring logs in the console output.
    * You should see the ***"Started Application in ... seconds"*** log.
  * Open your favorite browser and access http://localhost:8090/movie
    * You should see the movies in JSON format.
    
### Files created in this branch:
  * [application.properties](./src/main/resources/application.properties) ~ The Spring application configuration file
  
## Development 05

This branch describe how we can connect to a MongoDB from a Spring application.

### How did we get here:
  * We added Spring Data dependency for MongoDB in our  [pom.xml](./pom.xml) file
  * We added a new field to Movie model and mark it as id with @Id annotation.
  * We created a repository interface who will provide basic operations for our database.
  * We removed the dummy data from the movie service and called the movie repository to provide data from our DB.
  * We added spring.data.mongodb properties in [application.properties](./src/main/resources/application.properties) file.
  * We implemented CommandLineRunner interface in Application class and overrode run method to insert some dummy data to our DB after the startup.
  
 ### Check if it works for you:
  * Go to Application.java class and hit **CTRL + SHIFT + F10**
  * Open your favorite browser and access http://localhost:8090/movie
    * You should see the movies in JSON format.
    
 ### Files created in this branch:
  * MoviesRepository.java ~ Movies Repository class - Provide CRUD operations to the database. 