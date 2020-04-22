$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/search/Login.feature");
formatter.feature({
  "name": "Search by keywords",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Searching for a term-new",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "name": "title of the login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "name": "user enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "And "
});
formatter.step({
  "name": "user moves to contacts menu",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters contact details \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cdepartment\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "department"
      ]
    },
    {
      "cells": [
        "kannan21109444@gmail.com",
        "Aswath555.",
        "dhoni",
        "CSK",
        "5"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Searching for a term-new",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "starter.stepdefinitions.SearchOnDuckDuckGoStepDefinitions.user_is_already_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of the login page is Free CRM",
  "keyword": "When "
});
formatter.match({
  "location": "starter.stepdefinitions.SearchOnDuckDuckGoStepDefinitions.title_of_the_login_page_is_Free_CRM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"kannan21109444@gmail.com\" and \"Aswath555.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "starter.stepdefinitions.SearchOnDuckDuckGoStepDefinitions.user_enter_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"ui\"]/div/div/form/div/div[1]/div/input\"}\n  (Session info: chrome\u003d81.0.4044.113)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ADMIN\u0027, ip: \u0027192.168.43.214\u0027, os.name: \u0027Windows 8\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.2\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.113, chrome: {chromedriverVersion: 81.0.4044.69 (6813546031a4b..., userDataDir: C:\\Users\\DELL\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:51829}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 3c2d34ce69b901e5e13cc5bb19ae0c74\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"ui\"]/div/div/form/div/div[1]/div/input}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat starter.stepdefinitions.SearchOnDuckDuckGoStepDefinitions.user_enter_username_and_password(SearchOnDuckDuckGoStepDefinitions.java:45)\r\n\tat ✽.user enter \"kannan21109444@gmail.com\" and \"Aswath555.\"(file:///F:/sel/Cucumber/serenity-cucumber/src/test/resources/features/search/Login.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "starter.stepdefinitions.SearchOnDuckDuckGoStepDefinitions.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "And "
});
formatter.match({
  "location": "starter.stepdefinitions.SearchOnDuckDuckGoStepDefinitions.user_is_on_Homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user moves to contacts menu",
  "keyword": "Then "
});
formatter.match({
  "location": "starter.stepdefinitions.SearchOnDuckDuckGoStepDefinitions.user_moves_to_contacts_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters contact details \"dhoni\" and \"CSK\" and \"5\"",
  "keyword": "Then "
});
formatter.match({
  "location": "starter.stepdefinitions.SearchOnDuckDuckGoStepDefinitions.user_enters_contact_details_and_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
});