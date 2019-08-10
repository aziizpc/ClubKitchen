$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/com/bie/qa/features/one.feature");
formatter.feature({
  "line": 2,
  "name": "Add to cart Feature",
  "description": "",
  "id": "add-to-cart-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@one"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Add item to cart",
  "description": "",
  "id": "add-to-cart-feature;add-item-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User opens clubkitchen",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "selects Mamacita",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User can add item",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});