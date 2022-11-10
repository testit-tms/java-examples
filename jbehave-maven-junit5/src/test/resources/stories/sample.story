Scenario: Create new project, section and test case
Meta:
@ExternalId with_all_annotations
@DisplayName Test_with_all_annotations
@WorkItemIds 123
@Title Title_in_the_autotest_card
@Description Test_with_all_annotations
@Labels Tag1,Tag2
@Links {"url":"https://dumps.example.com/module/repository","title":"Repository","description":"Example_of_repository","type":"Repository"}
Given I authorize on the portal
When I create a project
And I open the project
And I create a section
Then I create a test case

Scenario: Check something
Given I authorize on the portal
Then I check something
