#Author: Paul Marchenko
@Test
Feature: LoginAction

  Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully