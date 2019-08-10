# ClubKitchen

Design Approach:
User Acceptance testing using Cucumber (BDD) with Page Object Model Design pattern.

Packages available:
- com.bie.qa.base                   : This package has TestBase.java class. All the Page classes are inherited from this.
- com.bie.qa.config                 : config.properties file is saved here. URL, Environment and Browser to be mentioned here.
- com.bie.qa.extentReportListener   : Class for reporting. This is not completed. 
- com.bie.qa.features               : Feature files are saved here.
- com.bie.qa.pages                  : java class for each page is saved here.
- com.bie.qa.runner                 : Cucumber TestRunner class saved here.
- com.bie.qa.stepDefinitions        : Definition for the Feature files saved here.

How to run?
Open one.feature file -> Right click and select 'Run As' -> Select 'Cucumber feature'.
(Follow the steps from the following page if Cucumber feature option is not available:
https://stackoverflow.com/questions/42399721/run-as-cucumber-feature-not-showing-in-eclipse)
