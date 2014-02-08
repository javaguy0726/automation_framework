Verify the ui for the ticket search screen

Narrative:
In order to make sure the Ticketing --> Search page has correct UI
As a test user
I want to test the look and feel of this screen

GivenStories: ../login/login_validation_logic.story#{Pre:logsuccess}
					 
Scenario: All the labels on this screen should be correct
Given User go to the Search screen under Ticketing menu
Then The texts should be as follows:
| texts |
| Incident#: |
| Description: |
| Priority: |
| Customer Ticket #: |
| Status: |
| # of Days |
| Customer: |
| Incident Date Between |
| Close Date Between |
| Ship To Address: |
| Contact: |
| Requester: |
| Created By: |
| Unit ID (S/N) |
| FE/Owner: |
| Contract: |
| SRO: |
| SRO Status: |

