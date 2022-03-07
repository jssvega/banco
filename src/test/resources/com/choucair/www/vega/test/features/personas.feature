# create by sanchezvegaing@gmail.com
Feature: check to data state into page


  @fullMeetingHappiness
  Scenario Outline: download info facta
    Given "vega" goin to de web into banistmo
    When goin to page to download FATCA & CRS
      | document | <document> |
    Then check the status

    Examples:
      | document                                    |
      | PJ-Autocertificación unificado- Fatca y CRS |