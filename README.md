# Q2Assignment
Question 2 One of our projects requires you to automated the sing up flow, refer to the automation requirement given below for the steps to be followed. 
Automation Requirements: 
  • Launch a new Browser. 
  • Open URL https://jt-dev.azurewebsites.net/#/SignUp 
  • Validate that the dropdown has "English" and "Dutch" 
  • Fill in your name. 
  • For organization, use your name as well. 
  • Input your email address. 
  • Click on "I agree to the Terms And Conditions" 
  • Click on "SignUp" 
  • Validate that you received an email. Deliverable: The deliverable shall be shared via GitHub, BitBucket, SourceTree, or any versioning System containing all relevant Test Cases in the correct sequence. 
  
 Evaluation and Scoring: You are free to ask any questions for clarification or help. 
 You will be evaluated on the below attributes - 
  1. A working codebase delivered via Github, Gitlab, or Bitbucket. 
  2. 'Readme.md’ on the codebase, explaining how to run the deliverable. 
  3. Test Case Completeness of Requirements. 
  4. Automation Code Readability. 
  5. Use of Advance Technical concepts. 
  6. Tracking or journaling your work to tell how you have spent your time on this problem. 

Next Steps: 
  1. Read the requirement thoroughly. Please keep a copy of it for a reference if needed.
  2. Send the deliverable to ankita.d@thinkbridge.in, in the next 3 days viaGitHub, BitBucket,or SourceTree. If not received within the specified time, we will consider it as an un-attempted question.
  3. Click on the Submit button of this test.

## Quick start

This is a sample project to demonstrate what is page object model framework and how it can used in selenium to automate any application. TestNG is used as test framework.

**Dependency Java Maven**
###libraries used Selenium TestNG log4j Extent Reports

POM
1. Created config.propertie file to store the environment variables like browser, credentails and url
2. Creed Util class to store all the general utilities like time, screenshot etc
3. Created base class to store all browser inititalization like, init webdrive, maximise window, delete all cookies, launch url, and implcit wait.
4. Created seperate java class for all the pages like login, email verification
5. Created Login class to store test cases using TestNG annotation. This class will execute all the test cases.
6. Run LoginPageTest.java as TestNG

Steps to clone execute the tests
git clone https://github.com/Sheetal-salunke21/Q2Assignment.git
cd Q2Assignment
Open LoginPageTest.java and Run as TestNG

