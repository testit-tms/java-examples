# Gradle-TestNG example
Example of tests with TestNG framework and adapter for Test IT of a Gradle project

## Setup

1. Install [Java 8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
2. Install [Gradle](https://gradle.org/install/)
3. Clone this repository `git clone https://github.com/testit-tms/java-examples.git && cd gradle-testng`
4. Configure the tests to run in **testit.properties** file. [How to configure?](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-testng#configuration)
5. Run tests via `gradle test` to upload the results to TMS

## Project structure

* **src/test/java/examples/** – test files
    * **AnnotationTests.java** – simple test examples with [annotations testit-adapter-junit5](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-testng#annotations)
    * **MethodTests.java** – simple test examples with [methods testit-adapter-junit5](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-testng#annotations)
    * **StepsTests.java** – simple test examples with [steps testit-adapter-junit5](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-testng#annotations)
* **src/test/resources/** – resource files for tests
    * **attachments/** - attachment files for tests
    * **testit.properties** - configuration file where specified base options for tests
* **build.gradle** - [build file](https://docs.gradle.org/current/userguide/tutorial_using_tasks.html) of a Gradle project
