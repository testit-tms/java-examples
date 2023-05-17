# JBehave-Gradle-JUnit example
Example of tests with JBehave framework and adapter for Test IT of a Gradle project

## Setup

1. Install [Java 8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
2. Install [Gradle](https://gradle.org/install/)
3. Clone this repository `git clone https://github.com/testit-tms/java-examples.git && cd jbehave-gradle-junit4`
4. Configure the tests to run in **testit.properties** file. [How to configure?](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-jbehave#configuration)
5. Run tests via `gradle test` to upload the results to TMS

## Project structure

* **src/test/java/examples/** – step and run-configuration files
    * **Steps.java** – simple [JBehave steps](https://jbehave.org/reference/latest/candidate-steps.html)
    * **TestStoriesRunner.java** – simple file of [JBehave run-configuration](https://jbehave.org/reference/latest/configuration.html)
* **src/test/resources/** – test files and resource files for tests
    * **attachments/** - attachment files for tests
    * **stories/** - test files
        * **annotations-tests.story** – simple test examples with [annotations testit-adapter-jbehave](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-jbehave#meta)
        * **methods-tests.story** – simple test examples with [methods testit-adapter-jbehave](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-jbehave#meta)
        * **steps-tests.story** – simple test examples with [steps testit-adapter-jbehave](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-jbehave#meta)
    * **testit.properties** - configuration file where specified base options for tests
* **build.gradle** - [build file](https://docs.gradle.org/current/userguide/tutorial_using_tasks.html) of a Gradle project
