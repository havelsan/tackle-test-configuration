
# Tackle-Test Configuration

This repository provides a comprehensive guide for setting up and using TackleTest to generate automated unit tests for your Java projects. Follow the steps below to get started.

## Prerequisites

Before starting, ensure the following software is installed on your system:
- **Gradle**: [Install Gradle](https://gradle.org/install/)
- **Python 3.9+**: Supported versions are 3.9, 3.10, and 3.11
- **JDK**: Supported versions are 8-11
- **Build Systems**: Depending on the TackleTest features, install Ant, Maven, or Gradle. Maven is required for installing the CLI.

## Step 1: Setting Up Gradle

If your Java project does not have a `build.gradle` file, follow these steps:

1. Install Gradle on your system.
2. Create a `build.gradle` file in the root directory of your project.
3. Use the provided template below and make necessary adjustments.

### Example `build.gradle` Template

```groovy
// Apply the Java and Application plugins
plugins {
    // This plugin is used to compile and run Java applications
    id 'java'
    // This plugin provides tasks for creating executable Java applications
    id 'application'
}

// Define the group ID and version of the project
group 'com.example' // Replace 'com.example' with your group ID
version '1.0-SNAPSHOT' // Replace '1.0-SNAPSHOT' with your project version

// Set the source compatibility for Java
sourceCompatibility = '11' // Set the Java version to 11, modify as needed

// Define the repositories to fetch dependencies from
repositories {
    mavenCentral() // Use Maven Central repository
}

// Define the dependencies required for the project
dependencies {
    // Add JUnit Jupiter for testing
    testImplementation 'org.junit.jupiter:junit-jupiter:5.7.1'
    // Add JUnit Platform Launcher to run tests
    testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
}

// Configure the test task
tasks.named('test', Test) {
    useJUnitPlatform() // Use JUnit Platform for testing

    maxHeapSize = '1G' // Set the maximum heap size for tests to 1 GB

    testLogging {
        events "passed" // Log events when tests pass
    }
}

// Configure the application plugin
application {
    // Specify the main class of the application
    mainClass = 'Game._Lancher' // Replace 'Game._Lancher' with your main class
}

// Define the source sets for the project
sourceSets {
    main {
        java {
            srcDirs = ['src'] // Specify the source directory for Java files
        }
        resources {
            srcDirs = ['src'] // Specify the source directory for resource files
        }
    }
}

// Configure the jar task
jar {
    manifest {
        attributes(
            'Main-Class': 'Game._Lancher' // Set the Main-Class attribute in the manifest file
        )
    }
}
```

4. Build your project with the following command:

```sh
gradle build
```

5. To run the application directly using Gradle, use the following command:

```sh
gradle run
```

If your project builds and runs successfully, proceed to the next step.

## Step 2: Setting Up Tackle-Test

1. Clone the TackleTest Generator CLI repository:

```sh
git clone https://github.com/konveyor/tackle-test-generator-cli
```

2. Download the necessary Java library dependencies:

```sh
cd /path/to/tackle-test-generator-cli
cd tkltest-lib
./download_lib_jars.sh
```

### Prerequisites for Tackle-Test

- Ensure Python 3.9+ is installed.
- Ensure a JDK (versions 8-11) is installed.
- Install required build systems (Ant, Maven, Gradle).

### Installing Tackle-Test Generator CLI

#### Option 1: Using a Virtual Environment (Recommended)

1. Create and activate a virtual environment:

```sh
python3 -m venv venv
source venv/bin/activate
pip install --editable .
```

#### Option 2: Global Installation

1. Install `pipx`:

```sh
sudo apt update
sudo apt install pipx
pipx ensurepath
```

2. Install the CLI globally:

```sh
cd /path/to/tackle-test-generator-cli
pipx install .
```

### Verifying Installation

Run the following commands to verify that TackleTest Generator CLI has been successfully installed:

```sh
tkltest-unit --help
tkltest-ui --help
```

## Step 3: Creating the Configuration File

Create a `tkltest_config.toml` file in the root directory of the project you want to create unit tests for. You can use the following command to create:

```sh
tkltest-unit config init --file tkltest_config.toml
```

The structure and description of the file can be found below:

```toml
[general]
# The name of your application - Change this to the name of your application
app_name = "Tetris"

# The classpath file for your application (leave empty if not applicable)
app_classpath_file = ""

# The Java JDK home path - Update this to the path where JDK is installed on your system
java_jdk_home = "/usr/lib/jvm/java-11-openjdk-amd64"

# Directory where the test files will be generated - Update to the desired output directory for test files
test_directory = "tkltest-output-unit-Tetris/Tetris-ctd-amplified-tests"

# Directory for storing the generated reports - Update to the desired output directory for reports
reports_path = "tkltest-output-unit-Tetris/Tetris-tkltest-reports"

# Enable verbose logging - Set to true for detailed logs
verbose = true

# Enable or disable offline instrumentation
offline_instrumentation = false

# The build system used (e.g., "gradle", "maven", "ant") - Specify your build system
build_type = "gradle"

# Maximum memory allocated for code coverage in MB - Adjust based on your system capacity
max_memory_for_coverage = 4096

[generate]
# Disable differential assertions
no_diff_assertions = false

# List of target classes for test generation - Specify target classes or leave empty for all classes
target_class_list = []

# List of classes to exclude from test generation - Specify classes to exclude
excluded_class_list = []

# Time limit for test generation in minutes - Adjust as needed
time_limit = 1

# List of build files for your application - Specify the paths to your build files
app_build_files = ["./build.gradle"]

# Additional build settings files - Specify additional settings files if applicable
app_build_settings_files = []

# Path to the application's build target - Specify if applicable
app_build_ant_target = ""

[execute]
# Packages to include in test execution - Update to match your application's package structure
app_packages = ["Game.*"]

# Do not create a build file
no_create_build_file = false

# Enable or disable code coverage
code_coverage = true

# Specific test class to execute - Specify if you want to run a specific test class
test_class = ""

# Combine coverage reports from multiple modules
combine_modules_coverage_reports = false

[dev_tests]
# Build targets for developer tests - Specify your build targets
build_targets = ["test"]

# Coverage execution file - Specify if applicable
coverage_exec_file = ""

# Compare code coverage with a previous run
compare_code_coverage = false

# Use for test augmentation
use_for_augmentation = false

# Coverage threshold percentage - Adjust based on your requirements
coverage_threshold = 100

[config.init]
# Configuration for initialization - Add your settings here

[config.list]
# Configuration for listing - Add your settings here

[generate.ctd_amplified]
# Base test generator to use - Specify the base test generator
base_test_generator = "combined"

# Disable augmenting coverage
no_augment_coverage = false

# Disable CTD coverage
no_ctd_coverage = false

# Interaction level for CTD generation
interaction_level = 1

# Number of sequential executions
num_seq_executions = 10

# Reuse base tests
reuse_base_tests = false

[generate.evosuite]
# Criteria for EvoSuite test generation - Specify criteria
criterion = ["BRANCH"]

[generate.randoop]
# Configuration for Randoop test generation - Add your settings here
```

To determine the home path of your Java JDK, you can use the following command in your terminal:

```sh
readlink -f $(which java)
```

The output will likely resemble the following:

```
/usr/lib/jvm/java-11-openjdk-amd64/bin/java
```

To use this path in your tkltest_config.toml file, you should format it as follows:

```groovy
java_jdk_home = “/usr/lib/jvm/java-11-openjdk-amd64”
```
This ensures that the configuration accurately points to the Java JDK home directory.

## Step 4: Generating and Executing Test Code

After setting up the configuration file, you can generate test code using the following commands:

1. Generate the test code:

```sh
tkltest-unit --verbose generate ctd-amplified
```

The unit test cases will be generated in a folder named tkltest-output-unit-<app-name>/<app-name>-ctd-amplified-tests. A CTD coverage report will be created as well in a folder named tkltest-output-unit-<app-name>/<app-name>-tkltest-reports, showing the CTD test plan row coverage achieved by the generated tests.


2. Execute the generated test code and get coverage reports:

```sh
tkltest-unit --verbose --test-directory tkltest-output-unit-<app-name>/<app-name>-ctd-amplified-tests execute
```
JUnit reports and Jacoco code coverage reports will be created in tkltest-output-unit-<app-name>/<app-name>-tkltest-reports.

## Configuration Options

TackleTest uses different build systems to run the generated tests. Ensure you have the appropriate version of Gradle (7.0 to 7.4, as version 7.5 is not supported). The build system can be configured using the `--build-type` option with the `execute` command.

## Additional Resources

For more information and detailed documentation, visit the [TackleTest Generator CLI repository](https://github.com/konveyor/tackle-test-generator-cli).
