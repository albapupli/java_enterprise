# Building a Maven Project Using Command Line Interface (CLI)

This guide will demonstrate how to create and build a Maven project using the Command Line Interface (CLI), based on the documentation provided in [Maven's "Maven in Five Minutes" guide](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html).

## Prerequisites

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed on your system. 
- [Apache Maven](https://maven.apache.org/download.cgi) installed on your system.
- Basic understanding of using the command line.

## Steps

### 1. Verify Maven Installation

Open a command prompt or terminal and run the following command to verify that Maven is installed:

```bash
mvn -v
```
### 2. Create a New Maven Project

Run the following command to create a new Maven project:

```bash
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

### 3. Navigate to the Project Directory

Navigate to the directory of the newly created Maven project using the following command:

```bash
cd my-app
```

### 4. Build the Project

Run the following command to build the Maven project:

```bash
mvn package
```

### 5. Run the Project

To run the project, navigate to the `target` directory and execute the JAR file using the following command:

```bash
java -jar my-app-1.0-SNAPSHOT.jar
```

## Additional Resources

- [Maven Documentation](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) - Official documentation for Maven.
- [Apache Maven Download Page](https://maven.apache.org/download.cgi) - Download Maven if you haven't installed it yet.
- [Java SE Development Kit (JDK) Downloads](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) - Download and install JDK if you haven't already.
