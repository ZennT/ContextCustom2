$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Accessories.feature");
formatter.feature({
  "name": "Accessories Page Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Navigating and Verifying Accessories Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Accessories"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "move on to Categories dropdown menu",
  "keyword": "When "
});
formatter.match({
  "location": "org.cb.contextCustom.stepdef.WomensClothingSteps.moveOnToCategoriesDropdownMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "move on to Accessories",
  "keyword": "When "
});
formatter.match({
  "location": "org.cb.contextCustom.stepdef.AccessoriesStepDef.move_on_to_Accessories()"
});
formatter.result({
  "error_message": "java.lang.IllegalArgumentException: Must provide a location for a move action.\r\n\tat org.openqa.selenium.interactions.MoveMouseAction.\u003cinit\u003e(MoveMouseAction.java:37)\r\n\tat org.openqa.selenium.interactions.Actions.moveToElement(Actions.java:386)\r\n\tat org.cb.contextCustom.stepdef.Base.moveAndClickToElement(Base.java:56)\r\n\tat org.cb.contextCustom.stepdef.AccessoriesStepDef.move_on_to_Accessories(AccessoriesStepDef.java:13)\r\n\tat ✽.move on to Accessories(file:///C:/Users/Work/eclipse-workspace/contextCustom/src/test/resources/features/Accessories.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "move on to All Accessories and click",
  "keyword": "Then "
});
formatter.match({
  "location": "org.cb.contextCustom.stepdef.AccessoriesStepDef.move_on_to_All_Accessories_and_click()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify  Accessories text is present",
  "keyword": "And "
});
formatter.match({
  "location": "org.cb.contextCustom.stepdef.AccessoriesStepDef.verify_Accessories_text_is_present()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "Screenshot");
formatter.after({
  "status": "passed"
});
});