$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Paul Marchenko"
    }
  ],
  "line": 3,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters UserName and Password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.givenStatement()"
});
formatter.result({
  "duration": 162439813,
  "status": "passed"
});
formatter.match({
  "location": "Login.whenStatement()"
});
formatter.result({
  "duration": 56273,
  "status": "passed"
});
formatter.match({
  "location": "Login.andStatement()"
});
formatter.result({
  "duration": 56185,
  "status": "passed"
});
formatter.match({
  "location": "Login.thenStatement()"
});
formatter.result({
  "duration": 53459,
  "status": "passed"
});
});