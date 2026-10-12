# Maven-JUnit6 example
Example of tests with JUnit6 framework and adapter for Test IT of a Maven project

## Setup

1. Install [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
2. Install [Maven](https://maven.apache.org/download.cgi)
3. Clone this repository `git clone https://github.com/testit-tms/java-examples.git && cd maven-junit6`
4. Configure the tests to run in **testit.properties** file. [How to configure?](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-junit6#configuration)
5. Run tests via `mvn test` to upload the results to TMS

## Project structure

* **src/test/java/examples/** – test files
    * **AnnotationTests.java** – simple test examples with [annotations testit-adapter-junit6](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-junit6#annotations)
    * **MethodTests.java** – simple test examples with [methods testit-adapter-junit6](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-junit6#annotations)
    * **StepsTests.java** – simple test examples with [steps testit-adapter-junit6](https://github.com/testit-tms/adapters-java/tree/main/testit-adapter-junit6#annotations)
* **src/test/resources/** – resource files for tests
    * **attachments/** - attachment files for tests
    * **testit.properties** - configuration file where specified base options for tests
* **pom.xml** - [XML representation](https://maven.apache.org/pom.html) of a Maven project
