@googleSearch
Feature: As a potential client i need to search in google to find a web site

   #-- @Smoke @Automated @SearchLippia
  #@SearchNotInGoogle
  #Scenario: The client search by "Lippia"
   #-- Given The client isn't on google page
  #  Given The client is not on google page
  #  When The client search for word Lippia
  #  Then The client verify that results are shown properly

  @SearchInGoogle
  Scenario Outline: The client search by <SearchVar>
    Given The client is on google page
    When The client search for word <SearchVar>
    Then The client verify that results are shown properly

    Examples:
      | SearchVar       |
      | Crowdar Academy |
      | Calidad         |
      | Software        |
      | Testing         |

