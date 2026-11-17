Feature: AnnotationMassTests
  # Experiment: isolate shared vs unique labels/links under parallel bulk updateAutoTest.

  # A — shared fat (same labels+links as With_all_annotations_*)
  @ExternalId=Mass_shared_fat_success
  @DisplayName=Mass_shared_fat_success_display_name
  @Title=Mass_shared_fat_success_title
  @Description=Mass_shared_fat_success
  @Labels=Label1,Label2
  @Links={"url":"https://test01.example","title":"Example01","description":"Example01_description","type":"Issue"}
  @Links={"url":"https://test02.example","title":"Example02","description":"Example02_description","type":"Issue"}
  @WorkItemIds=27834,27835
  Scenario: Mass shared fat success
    Then return true

  @ExternalId=Mass_shared_fat_failed
  @DisplayName=Mass_shared_fat_failed_display_name
  @Title=Mass_shared_fat_failed_title
  @Description=Mass_shared_fat_failed
  @Labels=Label1,Label2
  @Links={"url":"https://test01.example","title":"Example01","description":"Example01_description","type":"Issue"}
  @Links={"url":"https://test02.example","title":"Example02","description":"Example02_description","type":"Issue"}
  @WorkItemIds=27834,321
  Scenario: Mass shared fat failed
    Then return false

  # B — unique fat (different labels+links per scenario)
  @ExternalId=Mass_unique_fat_success
  @DisplayName=Mass_unique_fat_success_display_name
  @Title=Mass_unique_fat_success_title
  @Description=Mass_unique_fat_success
  @Labels=MassB1,MassB2
  @Links={"url":"https://mass-b-success-01.example","title":"MassBSuccess01","description":"Mass_B_success_01","type":"Issue"}
  @Links={"url":"https://mass-b-success-02.example","title":"MassBSuccess02","description":"Mass_B_success_02","type":"Issue"}
  @WorkItemIds=27834,27835
  Scenario: Mass unique fat success
    Then return true

  @ExternalId=Mass_unique_fat_failed
  @DisplayName=Mass_unique_fat_failed_display_name
  @Title=Mass_unique_fat_failed_title
  @Description=Mass_unique_fat_failed
  @Labels=MassB3,MassB4
  @Links={"url":"https://mass-b-failed-01.example","title":"MassBFailed01","description":"Mass_B_failed_01","type":"Issue"}
  @Links={"url":"https://mass-b-failed-02.example","title":"MassBFailed02","description":"Mass_B_failed_02","type":"Issue"}
  @WorkItemIds=27834,321
  Scenario: Mass unique fat failed
    Then return false

  # C — fat without links (shared labels)
  @ExternalId=Mass_fat_no_links_success
  @DisplayName=Mass_fat_no_links_success_display_name
  @Title=Mass_fat_no_links_success_title
  @Description=Mass_fat_no_links_success
  @Labels=Label1,Label2
  @WorkItemIds=27834,27835
  Scenario: Mass fat no links success
    Then return true

  @ExternalId=Mass_fat_no_links_failed
  @DisplayName=Mass_fat_no_links_failed_display_name
  @Title=Mass_fat_no_links_failed_title
  @Description=Mass_fat_no_links_failed
  @Labels=Label1,Label2
  @WorkItemIds=27834,321
  Scenario: Mass fat no links failed
    Then return false

  # D — fat without labels (shared links)
  @ExternalId=Mass_fat_no_labels_success
  @DisplayName=Mass_fat_no_labels_success_display_name
  @Title=Mass_fat_no_labels_success_title
  @Description=Mass_fat_no_labels_success
  @Links={"url":"https://test01.example","title":"Example01","description":"Example01_description","type":"Issue"}
  @Links={"url":"https://test02.example","title":"Example02","description":"Example02_description","type":"Issue"}
  @WorkItemIds=27834,27835
  Scenario: Mass fat no labels success
    Then return true

  @ExternalId=Mass_fat_no_labels_failed
  @DisplayName=Mass_fat_no_labels_failed_display_name
  @Title=Mass_fat_no_labels_failed_title
  @Description=Mass_fat_no_labels_failed
  @Links={"url":"https://test01.example","title":"Example01","description":"Example01_description","type":"Issue"}
  @Links={"url":"https://test02.example","title":"Example02","description":"Example02_description","type":"Issue"}
  @WorkItemIds=27834,321
  Scenario: Mass fat no labels failed
    Then return false

  # E — many unique fat success scenarios
  @ExternalId=Mass_many_unique_01_success
  @DisplayName=Mass_many_unique_01_success_display_name
  @Title=Mass_many_unique_01_success_title
  @Description=Mass_many_unique_01_success
  @Labels=MassE01a,MassE01b
  @Links={"url":"https://mass-e-01a.example","title":"MassE01a","description":"Mass_E_01a","type":"Issue"}
  @Links={"url":"https://mass-e-01b.example","title":"MassE01b","description":"Mass_E_01b","type":"Issue"}
  Scenario: Mass many unique 01 success
    Then return true

  @ExternalId=Mass_many_unique_02_success
  @DisplayName=Mass_many_unique_02_success_display_name
  @Title=Mass_many_unique_02_success_title
  @Description=Mass_many_unique_02_success
  @Labels=MassE02a,MassE02b
  @Links={"url":"https://mass-e-02a.example","title":"MassE02a","description":"Mass_E_02a","type":"Issue"}
  @Links={"url":"https://mass-e-02b.example","title":"MassE02b","description":"Mass_E_02b","type":"Issue"}
  Scenario: Mass many unique 02 success
    Then return true

  @ExternalId=Mass_many_unique_03_success
  @DisplayName=Mass_many_unique_03_success_display_name
  @Title=Mass_many_unique_03_success_title
  @Description=Mass_many_unique_03_success
  @Labels=MassE03a,MassE03b
  @Links={"url":"https://mass-e-03a.example","title":"MassE03a","description":"Mass_E_03a","type":"Issue"}
  @Links={"url":"https://mass-e-03b.example","title":"MassE03b","description":"Mass_E_03b","type":"Issue"}
  Scenario: Mass many unique 03 success
    Then return true

  @ExternalId=Mass_many_unique_04_success
  @DisplayName=Mass_many_unique_04_success_display_name
  @Title=Mass_many_unique_04_success_title
  @Description=Mass_many_unique_04_success
  @Labels=MassE04a,MassE04b
  @Links={"url":"https://mass-e-04a.example","title":"MassE04a","description":"Mass_E_04a","type":"Issue"}
  @Links={"url":"https://mass-e-04b.example","title":"MassE04b","description":"Mass_E_04b","type":"Issue"}
  Scenario: Mass many unique 04 success
    Then return true
