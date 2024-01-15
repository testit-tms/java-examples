Scenario: Without annotation success
Then return true

Scenario: Without annotation failed
Then return false

Scenario: With external id annotation success
Meta:
@ExternalId With_external_id_annotation_success
Then return true

Scenario: With external id annotation failed
Meta:
@ExternalId With_external_id_annotation_failed
Then return false

Scenario: With display name annotation success
Meta:
@DisplayName With_display_name_annotation_success_display_name
Then return true

Scenario: With display name annotation failed
Meta:
@DisplayName With_display_name_annotation_failed_display_name
Then return false

Scenario: With title annotation success
Meta:
@Title=With_title_annotation_success_title
Then return true

Scenario: With title annotation failed
Meta:
@Title=With_title_annotation_failed_title
Then return false

Scenario: With description annotation success
Meta:
@Description=With_description_annotation_success
Then return true

Scenario: With description annotation failed
Meta:
@Description=With_description_annotation_failed
Then return false

Scenario: With labels annotation success
Meta:
@Labels=Label1,Label2
Then return true

Scenario: With labels annotation failed
Meta:
@Labels=Label1,Label2
Then return false

Scenario: With links annotation success
Meta:
@Links={"url":"https://test01.example","title":"Example01","description":"Example01_description","type":"Issue"}
@Links={"url":"https://test02.example","title":"Example02","description":"Example02_description","type":"Issue"}
Then return true

Scenario: With links annotation failed
Meta:
@Links={"url":"https://test01.example","title":"Example01","description":"Example01_description","type":"Issue"}
@Links={"url":"https://test02.example","title":"Example02","description":"Example02_description","type":"Issue"}
Then return false

Scenario: With workitemids annotation success
Meta:
@WorkItemIds=26735,26736
Then return true

Scenario: With workitemids annotation failed
Meta:
@WorkItemIds=123,321
Then return false

Scenario: With all annotations success
Meta:
@ExternalId=With_all_annotations_success
@DisplayName=With_all_annotations_success_display_name
@Title=With_all_annotations_success_title
@Description=With_all_annotations_success
@Labels=Label1,Label2
@Links={"url":"https://test01.example","title":"Example01","description":"Example01_description","type":"Issue"}
@Links={"url":"https://test02.example","title":"Example02","description":"Example02_description","type":"Issue"}
@WorkItemIds=26735,26736
Then return true

Scenario: With all annotations failed
Meta:
@ExternalId=With_all_annotations_failed
@DisplayName=With_all_annotations_failed_display_name
@Title=With_all_annotations_failed_title
@Description=With_all_annotations_failed
@Labels=Label1,Label2
@Links={"url":"https://test01.example","title":"Example01","description":"Example01_description","type":"Issue"}
@Links={"url":"https://test02.example","title":"Example02","description":"Example02_description","type":"Issue"}
@WorkItemIds=26735,321
Then return false


Scenario: Parametrized test success
Meta:
@ExternalId=parametrized_test_{number}_{value}_success
@DisplayName=parametrized_test_{number}_{value}_success_display_name
@Title=parametrized_test_{number}_{value}_success_title
@Description=parametrized_test_{number}_{value}_success
When get parameters <number> <value>
Then return true

Examples:
      | number | value    |
      | 1      | string01 |
      | 2      | string02 |
      | 3      | string03 |

Scenario: Parametrized test failed
Meta:
@ExternalId=parametrized_test_{number}_{value}_failed
@DisplayName=parametrized_test_{number}_{value}_failed_display_name
@Title=parametrized_test_{number}_{value}_failed_title
@Description=parametrized_test_{number}_{value}_failed
When get parameters <number> <value>
Then return false

Examples:
      | number | value    |
      | 1      | string01 |
      | 2      | string02 |
      | 3      | string03 |