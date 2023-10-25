#Instructions

#### Codes and Tests Prepared by:
**Zeliha Aktan**

*QA Test Automation Engineer / Test Engineer*


------------
•  I built my framework using Java Programming Language

•  Dependencies were installed into the POM

•  I build the project in Maven

•  As an IDE I use IntelliJ

•  My Test Framework: Cucumber BDD (with JUnit  Assertions)

•  Inside the Cucumber runner, I used glues to connect feature files to step definitions.

•  I added the report plugin to Cucumber Runner to generate a Json and HTML report.

•  I have an utilities package, which contains utility classes such as Browser Utilites, Driver, and Configuration Reader.

•  I am using Page Object Modelling to enhance test maintenance and reduce code duplication.

•  I am using Cucumber and Gherkin language for non-technical people to understand what is going on in testing.

•  I have created my test cases in the feature files as-is.

•  In the Feature folder, I store my feature files separately, and it helps in the usability of the codes.

•  I use hook class as pre-and post-test implementations.

•  In the Browser Utilites class I put some methods which I use in my test scripts.

•  I added a screenshot interface; when the scenario fails, it takes a screenshot.

•  For assertions/verifications, to compare expected and actual results I utilize JUnit assertions.

•  I also use tags for tests that I want to run in bulk.

•  My framework is easy to maintain. I know where to go and how to fix it to run test scripts correctly.


--------------

####Step;
-Test RUN

----------------


## Test RUN

### Run;
Go **src -> test -> java  -> runners -> CukesRunner and RUN**

To run all Scenarios, use @wip tag in the CukesRunner class/Cucumber Options

To run only failed test cases:
Go **srs -> test -> java -> runners -> FailedTestRunner and Run**

To generate "HTML Maven Cucumber Report" ;
## Test Reports Locations
1- Cucumber HTML Plugin Reports
**target -> cucumber-html-reports**
(Right Click and Open in any Browser )



Note:

To see which browser, see the (TestAuto -> configuration.properties ) file

Users can switch the browser from Chrome to another browser in this file -> configuration.properties

To run separately this scenario, use the @wip and @smoke tags in the CukesRunner class/Cucumber Options



------------



###End

------------

Zeliha Aktan