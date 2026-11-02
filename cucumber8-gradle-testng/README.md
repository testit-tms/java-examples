# Cucumber8-Gradle-TestNG example
Example of tests with Cucumber framework and adapter for Test IT of a Gradle project

## Setup

1. Install [Java 17](https://www.oracle.com/java/technologies/downloads/#java17)
2. Install [Gradle](https://gradle.org/install/)
3. Clone this repository `git clone https://github.com/testit-tms/java-examples.git && cd cucumber8-gradle-testng`
4. Configure the tests to run in **testit.properties** file. [How to configure?](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-cucumber8#configuration)
5. Run tests via `gradle test` to upload the results to TMS

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
* **build.gradle** - [build file](https://docs.gradle.org/current/userguide/tutorial_using_tasks.html) of a Gradle project
