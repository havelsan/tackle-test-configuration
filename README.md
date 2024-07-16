
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

\`\`\`groovy
// Add your build.gradle template here
\`\`\`

4. Build your project with the following command:

```ruby
gradle build
```

5. To run the application directly using Gradle, use the following command:

\`\`\`sh
gradle run
\`\`\`

If your project builds and runs successfully, proceed to the next step.

## Step 2: Setting Up Tackle-Test

1. Clone the TackleTest Generator CLI repository:

\`\`\`sh
git clone https://github.com/konveyor/tackle-test-generator-cli
\`\`\`

2. Download the necessary Java library dependencies:

\`\`\`sh
cd /path/to/tackle-test-generator-cli
cd tkltest-lib
./download_lib_jars.sh
\`\`\`

### Prerequisites for Tackle-Test

- Ensure Python 3.9+ is installed.
- Ensure a JDK (versions 8-11) is installed.
- Install required build systems (Ant, Maven, Gradle).

### Installing Tackle-Test Generator CLI

#### Option 1: Using a Virtual Environment (Recommended)

1. Create and activate a virtual environment:

\`\`\`sh
python3 -m venv venv
source venv/bin/activate
pip install --editable .
\`\`\`

#### Option 2: Global Installation

1. Install `pipx`:

\`\`\`sh
sudo apt update
sudo apt install pipx
pipx ensurepath
\`\`\`

2. Install the CLI globally:

\`\`\`sh
cd /path/to/tackle-test-generator-cli
pipx install .
\`\`\`

### Verifying Installation

Run the following commands to verify that TackleTest Generator CLI has been successfully installed:

\`\`\`sh
tkltest-unit --help
tkltest-ui --help
\`\`\`

## Step 3: Creating the Configuration File

Create a `tkltest_config.toml` file in the root directory of the project you want to create unit tests for. The structure and description of the file can be found in the following link:

[Link to the `tkltest_config.toml` script]

## Step 4: Generating and Executing Test Code

After setting up the configuration file, you can generate test code using the following commands:

1. Generate the test code:

\`\`\`sh
tkltest-unit --verbose generate ctd-amplified
\`\`\`

2. Execute the generated test code and get coverage reports:

\`\`\`sh
tkltest-unit --verbose --test-directory tkltest-output-unit-<app-name>/<app-name>-ctd-amplified-tests execute
\`\`\`

## Configuration Options

TackleTest uses different build systems to run the generated tests. Ensure you have the appropriate version of Gradle (7.0 to 7.4, as version 7.5 is not supported). The build system can be configured using the `--build-type` option with the `execute` command.

## Additional Resources

For more information and detailed documentation, visit the [TackleTest Generator CLI repository](https://github.com/konveyor/tackle-test-generator-cli).
