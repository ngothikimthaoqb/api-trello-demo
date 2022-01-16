## Regression Test

### Init

 - Access [Kobition](https://portal.kobiton.com) to get *USERNAME* and *API_KEY*
 - Replace *USERNAME* and *API_KEY* on `config.properties`

### Prerequisites

 - Install [Maven](https://maven.apache.org/install.html)
 - Build project with [Maven](https://maven.apache.org/run-maven/) `mvn clean install`
 - Open Java project in Eclipse
 - Install [TestNG Plugin](http://beust.com/eclipse) if it doesn't exist.

### Run tests

#### Run test with TestNG - package kobiton.com.testng

#### 1. Run test suite by right-clicking on testng.xml and select **Run-as → TestNG Suite**

#### 2. Run separate files by right-click on each file and select **Run-as → TestNG Test**

 - Select `Test.java`  
 
#### Run parallel tests with TestNG
### Modify `udid` on parallel_testng.xml to wait the device online
#### Run test suite by right-clicking on parallel_testng.xml and select **Run-as → TestNG Suite**

### References

 - http://rest-assured.io (Support to test REST API)
 - https://groovy-playground.appspot.com (Support to identify JSON path)
 - https://hamcrest.org (Support to assert API)
 - https://jsonschema2pojo.org (Support to generate API body)
 - https://projectlombok.org (Support to optimize API body)