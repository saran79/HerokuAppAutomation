$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/feature/infiniteScroll.feature");
formatter.feature({
  "line": 1,
  "name": "Infinite Scroll-Validation",
  "description": "",
  "id": "infinite-scroll-validation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6950652100,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate by Scrolling to the Bottom of the page and back",
  "description": "",
  "id": "infinite-scroll-validation;validate-by-scrolling-to-the-bottom-of-the-page-and-back",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@infinite"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I navigate to the provided Url",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click the infinite scroll link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I scroll down to the Bottom of the page twice",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Scroll Up to the Top of the page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should be able to validate the text \"Infinite Scroll\"",
  "keyword": "Then "
});
formatter.match({
  "location": "formAuthenticationSteps.i_navigate_to_the_provided_Url()"
});
formatter.result({
  "duration": 1849362300,
  "status": "passed"
});
formatter.match({
  "location": "InfiniteScrollSteps.i_click_the_infinite_scroll_link()"
});
formatter.result({
  "duration": 520809200,
  "status": "passed"
});
formatter.match({
  "location": "InfiniteScrollSteps.i_scroll_down_to_the_Bottom_of_the_page_twice()"
});
formatter.result({
  "duration": 34560000,
  "status": "passed"
});
formatter.match({
  "location": "InfiniteScrollSteps.i_Scroll_Up_to_the_Top_of_the_page()"
});
formatter.result({
  "duration": 74100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Infinite Scroll",
      "offset": 39
    }
  ],
  "location": "InfiniteScrollSteps.i_should_be_able_to_validate_the_text(String)"
});
formatter.result({
  "duration": 64130100,
  "status": "passed"
});
});