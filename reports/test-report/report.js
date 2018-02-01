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
  "duration": 255378538,
  "status": "passed"
});
formatter.match({
  "location": "Login.whenStatement()"
});
formatter.result({
  "duration": 61264,
  "status": "passed"
});
formatter.match({
  "location": "Login.andStatement()"
});
formatter.result({
  "duration": 104612,
  "status": "passed"
});
formatter.match({
  "location": "Login.thenStatement()"
});
formatter.result({
  "duration": 75547,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Successful LogOut",
  "description": "",
  "id": "login-action;successful-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User LogOut from the Application",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Message displayed LogOut Successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});