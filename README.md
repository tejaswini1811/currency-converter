# Currency Converter

### 1. What You Need
* **Java:** You need Java 8 or later. Java 11 is recommended.
* **Maven**: A tool to manage the project dependencies and build the application.
* **Tomcat:** A web server where you’ll deploy your application.

### 2. Steps to Set Up the Project

**Step 1: Install Java**

* Install **Java 11** (or Java 8 or later) on your machine or EC2 instance.

* For example, on **Ubuntu**:

```bash
sudo apt install openjdk-11-jdk
```
**Step 2: Install Maven**
* Install **Maven** for managing the build and dependencies.

* For example, on **Ubuntu**:
  
```bash
sudo apt install maven
```

### Step 3: Project Files

Create a folder structure as described below and place the following files in it:

   * `**pom.xml:**` A configuration file that defines project dependencies like Spring Boot, Tomcat, etc.
   * `**CurrencyConverterApplication.java:**` The main Java class that starts the Spring Boot application.
   * `**CurrencyController.java:**` A controller that handles requests like showing the currency conversion form and processing the conversion.
   * `**index.html**` and `**result.html:**` HTML templates for the user interface (input form and result page).

### Step 4: Build the Application

Run the following command to build the application and create a `.war` file (which is deployable on Tomcat):

```bash
mvn clean package
```
This will create a `currency-converter-1.0-SNAPSHOT.war` file inside the `target/` folder.

### Step 5: Deploy on Tomcat