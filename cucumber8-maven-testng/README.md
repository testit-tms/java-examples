# Cucumber8-Maven-TestNG example
Example of tests with Cucumber framework and adapter for Test IT of a Maven project

## Setup

1. Install [Java 17](https://www.oracle.com/java/technologies/downloads/#java17)
2. Install [Maven](https://maven.apache.org/download.cgi)
3. Clone this repository `git clone https://github.com/testit-tms/java-examples.git && cd cucumber8-maven-testng`
4. Configure the tests to run in **testit.properties** file. [How to configure?](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-cucumber8#configuration)
5. Run tests via `mvn test` to upload the results to TMS

## Project structure

* **src/test/java/examples/** – step files
    * **Steps.java** – simple [Cucumber steps](https://docs.cucumber.io/docs/cucumber/api/?lang=java#steps)
* **src/test/resources/** – test files and resource files for tests
    * **attachments/** - attachment files for tests
    * **features/** - test files
        * **annotations-tests.feature** – simple test examples with [annotations testit-adapter-cucumber8](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-cucumber8#tags)
        * **methods-tests.feature** – simple test examples with [methods testit-adapter-cucumber8](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-cucumber8#tags)
        * **steps-tests.feature** – simple test examples with [steps testit-adapter-cucumber8](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-cucumber8#tags)
    * **testit.properties** - configuration file where specified base options for tests
* **pom.xml** - [XML representation](https://maven.apache.org/pom.html) of a Maven project
