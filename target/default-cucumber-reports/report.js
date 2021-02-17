$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/KidsAndYouth.feature");
formatter.feature({
  "name": "Kids \u0026 Youth Page Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying Kids \u0026 Youth Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Kids"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "move on to Categories",
  "keyword": "When "
});
formatter.match({
  "location": "org.cb.contextCustom.stepdef.KidsAndYouthStepDef.move_on_to_Categories()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "move to Kids\u0026Youth Clothing",
  "keyword": "Then "
});
formatter.match({
  "location": "org.cb.contextCustom.stepdef.KidsAndYouthStepDef.move_to_Kids_Youth_Clothing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on All Kids\u0026Youth Clothing",
  "keyword": "And "
});
formatter.match({
  "location": "org.cb.contextCustom.stepdef.KidsAndYouthStepDef.click_on_All_Kids_Youth_Clothing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Kids\u0026Youth Clothing page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "org.cb.contextCustom.stepdef.KidsAndYouthStepDef.verify_Kids_Youth_Clothing_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});