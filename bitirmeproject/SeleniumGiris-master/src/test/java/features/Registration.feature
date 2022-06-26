@Registration
  Feature: Registration

    Scenario Outline:Registration
      Given Access"www.lcwaikiki.com.tr"
      When Click Login Button
      When Click Sign in Button
      When Enter "<E-mail>" in e-mail box
      When Enter "<Password>" in password box
      When Enter "<Phone Number>" in phone number box
      When Click check box of Privacy Approve
      When Click Register button.
      Then Check that  phone verification is opened

      Examples:
        |E-mail|                    |Password|      |Phone Number|
        |ttugceyalcin@gmail.com|    |tugce123456|   |05347803010|