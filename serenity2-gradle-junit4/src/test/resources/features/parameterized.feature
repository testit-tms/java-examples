Feature: Rule
  Tests that use Rule

  # No @ExternalId/@DisplayName: Outline rows share hash externalId "Summing"
  # (api-validator Expected/serenity*-gradle-junit4). To switch to
  # @ExternalId=Summing_{left}_{right}_{result}, refresh expected with
  # TMS_OVERWRITE_EXPECTED=true and archive the old hash-based autotest.
  Scenario Outline: Summing
    When Summing <left>+<right>
    Then Result is <result>

    Examples:
      | left | right | result |
      | 1    | 1     | 3      |
      | 9    | 9     | 18     |
