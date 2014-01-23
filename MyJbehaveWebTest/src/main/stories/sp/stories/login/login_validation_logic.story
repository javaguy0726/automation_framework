Verify the validation logic of the SP login page

Narrative:
In order to know how the SP(http://test.mysplogon.com/SinglePoint/) validate user login
As a test user
I want to login with different conditions 
Meta:
login_val_logic
					 
Scenario:  User click "Forgot Password" link directly to see what message shows
Given user get to the Login page
When user click "Forgot Password" link
Then message "Enter your username." should be displayed

Scenario:  User click "Forgot Password" link after inputting correct user info
Given user get to the Login page
And user input the correct username "quwei@beyondsoft.com" and password "T3stingSMS321"
When user click "Forgot Password" link
Then message "An e-mail was sent with password reset instructions." should be displayed

Scenario:  User click "Forgot Password" link after inputting incorrect user name
Given user get to the Login page
And user input the incorrect username "quwei@beyondsoft.com~" and password "T3stingSMS321"
When user click "Forgot Password" link
Then message "User account not found." should be displayed

Scenario:  User login with incorrect account
Given user get to the Login page
And user input the incorrect username "quwei@beyondsoft.com:" and password "T3stingSMS321:"
When user click submit button
Then message "Invalid username or password." should be displayed

Scenario:  User login with nothing account info
Given user get to the Login page
And user input the incorrect username "quwei@beyondsoft.com:" and password "T3stingSMS321:"
When user click submit button
Then message "Invalid username or password." should be displayed

Scenario:  User login successfully
Given user get to the Login page
And user input the incorrect username "quwei@beyondsoft.com" and password "T3stingSMS321"
When user click submit button
Then user should get to the Home page