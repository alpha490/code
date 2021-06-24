Feature: verify the compose function in Gmail

  Scenario: Verification of sing In button
    Given Open the chrome and launch the gmail login Page
    And User enter the valid email on email filed and click on next
    And user enter the valid Password and click ok next
    Then User should click on the Compose button
    And enter the "Incubyte" in the subject box
    And enter the "Automation QA test for Incubyte" in the body section
    And enter a email address in the Reseption section
    Then click on the Send button
