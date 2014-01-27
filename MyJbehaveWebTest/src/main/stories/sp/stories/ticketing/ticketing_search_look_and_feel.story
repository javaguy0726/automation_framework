Verify the ui for the ticket search screen


Narrative:
In order to make sure the Ticketing --> Search page has correct UI
As a test user
I want to test the look and feel of this screen

GivenStories: ../login/login_validation_logic.story#{Pre:logsuccess}
					 
Scenario: All the labels on this screen should be correct
Given User go to the Search screen under Ticketing menu
Then The labels <labels> should be correctly spelled
