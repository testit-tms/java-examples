# Serenity3-Gradle-JUnit example
Example of tests with Serenity framework and adapter for Test IT of a Gradle project

## Setup

1. Install [Java 8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
2. Install [Gradle](https://gradle.org/install/)
3. Clone this repository `git clone https://github.com/testit-tms/java-examples.git && cd serenity3-gradle-junit4`
4. Configure the tests to run in **testit.properties** file. [How to configure?](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-cucumber7#configuration)
5. Run tests via `gradle test` to upload the results to TMS

## Project structure

* **src/test/java/ru/testit/samples** – step files
    * **ParameterizedTest.java** – simple [steps](https://serenity-bdd.info/docs/serenity/#_step_definitions) for parametrized tests
    * **SampleTests.java** – simple [steps](https://serenity-bdd.info/docs/serenity/#_step_definitions) for sample tests
    * **SerenityRunnerTest.java** – simple file of [Serenity run-configuration](https://serenity-bdd.info/docs/serenity/#_writing_executable_specifications_with_cucumber_and_serenity)
* **src/test/resources/** – test files and resource files for tests
    * **features/** - test files
        * **parameterized.feature** – parametrized test examples with [annotations testit-adapter-cucumber7](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-cucumber7#tags)
        * **sample-failed.feature** – simple-failed test examples with [methods testit-adapter-cucumber7](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-cucumber7#tags)
        * **sample.feature** – simple test examples with [steps testit-adapter-cucumber7](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-cucumber7#tags)
    * **testit.properties** - configuration file where specified base options for tests
* **build.gradle** - [build file](https://docs.gradle.org/current/userguide/tutorial_using_tasks.html) of a Gradle project
