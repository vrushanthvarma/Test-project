Feature:  HomePage

@tag
Scenario Outline: Positive test validating start application
Given initialize the browser with chrome and navigate to "https://foxdemo-standalone.eastus.cloudapp.azure.com/CE/cerb" Site
Given  click the start application button and navigate to next page
When User selects one of the impacts and selects date and click on continue button
And user enter <firstname> and <lastname> and <dob> and <sin> and click on continue
And user enter <unit> and <street> and <city> and <province> and <postal> and <primaryphone> and <seconPhone> and <email> and click on continue for next page
And user selects one of the reason and click on continue to navigate
And user enters <branchno> and <institutionno> and <accountno> and click on contbtn and click on nextbtn and finally submit button

Then Verify that user is succesfully submitted the application

Examples:
|firstname      |lastname    |dob        |sin        |unit |street   |city      |province   |postal  |primaryphone     |seconPhone     |email                |branchno  |institutionno       |accountno        | 
|Brain          |Tokeyo      |1985-02-03 |675 216 634|5    |church   |Moncton   |NB         |E1C3H2  |5068508323       |5068508553     |abc@gmail.com        |02982     |003                 |547687           |
