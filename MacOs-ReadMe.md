# Tackle-Test Configuration for MacOS Users

## Required Prerequisites

Before you start, make sure that the appropriate versions of the following programs are installed in your system.
- **Python:** Versions 3.9 or newer are supported. 
- **Java Development Kit:** Versions 8-11 or newer are supported, JDK-11 is more preferable.
  JDK-11 can be downloaded [here](https://www.oracle.com/java/technologies/downloads/#license-lightbox) ARM64, and [here](https://www.oracle.com/java/technologies/downloads/#license-lightbox) for X64.
- **Build Automation Tool:** One of the Gradle, Ant or Maven software must be installed on the system. The following parts of the project were progressed using Gradle. Click [here](https://gradle.org/install/) for more information about installing Gradle.

## Gradle Part

### Creating `build.gradle`

To compile the Java project, the `build.gradle` file is created in the root directory. The compilation process can be personalized by making changes to the `build.gradle` provided as a template.

```groovy

plugins {
    id 'java' // Applies the Java plugin to the project
    id 'application' // Applies the Application plugin to the project
}

group 'com.example' // Defines the group ID for the project
version '1.0-SNAPSHOT' // Defines the version of the project

sourceCompatibility = '11' // Sets the Java source compatibility to Java 11

repositories {
    mavenCentral() // Specifies Maven Central as the repository to fetch dependencies from
}

dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.0' // Adds JUnit Jupiter API as a test implementation dependency
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.7.0' // Adds JUnit Jupiter Engine as a test runtime-only dependency
}

test {
    useJUnitPlatform() // Configures the test task to use the JUnit Platform
}

application {
    mainClassName = 'Game._Lancher' // Specifies the main class for the application
}

sourceSets {
    main {
        java {
            srcDirs = ['src'] // Sets the source directory for Java files
        }
        resources {
            srcDirs = ['src'] // Sets the source directory for resource files
        }
    }
}

jar {
    manifest {
        attributes(
            'Main-Class': 'Game._Lancher' // Sets the main class attribute in the JAR manifest
        )
    }
}
```




### Building Project

To build the project, go to the directory where the build.gradle file is located via the terminal and use the code given below.
```sh
gradle build
```
 

### Running Project

After the build process, code in below is used to run the application.
```sh
gradle run
```










