Scenario: Steps without annotations success
When step01
Then return true

Scenario: Steps without annotations failed
When step01
Then return false

Scenario: Steps with title annotation success
When step02
Then return true

Scenario: Steps with title annotation failed
When step02
Then return false

Scenario: Steps with description annotation success
When step03
Then return true

Scenario: Steps with description annotation failed
When step03
Then return false

Scenario: Steps with all annotations success
When step04
Then return true

Scenario: Steps with all annotations failed
When step04
Then return false