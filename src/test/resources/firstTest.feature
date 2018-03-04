@firstFeature
Feature: Login in facebook

  @firstScenario
  Scenario: We want to login in facebook
    Given we want to log in facebook
    When we tΩry login with email "xxxx@xxxx.com" and  password "password"
    Then successful if title web page is "Facebook"

