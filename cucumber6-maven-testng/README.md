# Cucumber6-Maven-TestNG example
Example of tests with Cucumber framework and adapter for Test IT of a Maven project

## Setup

1. Install [Java 8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
2. Install [Maven](https://maven.apache.org/download.cgi)
3. Clone this repository `git clone https://github.com/testit-tms/java-examples.git && cd cucumber6-maven-testng`
4. Configure the tests to run in **testit.properties** file. [How to configure?](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-cucumber6#configuration)
5. Run tests via `mvn test` to upload the results to TMS

## Project structure

* **src/test/java/examples/** – step files
    * **Steps.java** – simple [Cucumber steps](https://docs.cucumber.io/docs/cucumber/api/?lang=java#steps)
* **src/test/resources/** – test files and resource files for tests
    * **attachments/** - attachment files for tests
    * **features/** - test files
        * **annotations-tests.feature** – simple test examples with [annotations testit-adapter-cucumber6](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-cucumber6#tags)
        * **methods-tests.feature** – simple test examples with [methods testit-adapter-cucumber6](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-cucumber6#tags)
        * **steps-tests.feature** – simple test examples with [steps testit-adapter-cucumber6](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-cucumber6#tags)
    * **testit.properties** - configuration file where specified base options for tests
* **pom.xml** - [XML representation](https://maven.apache.org/pom.html) of a Maven project
