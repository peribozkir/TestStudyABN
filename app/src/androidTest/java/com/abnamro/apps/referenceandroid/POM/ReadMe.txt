About Project:

I added simple login screen to main activity
In this context;
Fist edittext as a username -- Users should enter the username in this area.
Second edittext as a password -- User should enter the password in this area.
The username must be 'peribozkir and the password must be '12345'.
If the user enter the right username and password, The succesfull toast message show up on screen.
If the user enter the wrong username or password, the failed toast message show up on screen.

Test cases:
1.check the 'helloworld!' message on the screen. ( if there is a 'Helloworld! message it means the application opened succesfully.)
2.Click the option button(:) on the toolbar and the settings menu must be open.
3.Click the setting menu on toolbar (firstly second testcase must execute for this case) and the settings menu must be close.
4.Click the floating action button and the snackbar must be open and check the text message on the snackbar.
It must be right message("Replace with your own action")
 'this  two test cases kind of exploratory tests . the purpose of the test cases is to see the application work correctly and does not crash or something in different uses.'
5.click the fab and after that click the option button(:) on toolbar . the setting menu must open.
6.click the option button and after that click the fab. The snacbar must open ( this is failed case : the snackbar doesn't open at the first click)
' this cases about login feature'
7.enter right username and password . the succes toast message must show up (happy path)
8.enter wrong username and passwd. the failed toast message must show up.
9.enter right username and wrong passwd. the failed toast message must show up.
10.enter wronf username and right passwd. the failed toast message must show up.

for this test I used page object model.
--In the POM package there are 5 class.
HomePage class ; It contains the first scenarios code. (check helloworld text)
Fab class ; It contains the fab test cases codes. I defined the fab and added the assertion for this casses in this class.
SettingsMenu class ; It contains settingmenu definement and assertions.
LoginTest class: It contains login features definement and asertions.
ToastMatcher  class: I used this for check the toast message. I checked the toast message correctly because of this class. It provides to read the text of the toast pop up window.
--In the Test Package there is a Test Execution class.
This class contains the all test casses. The all test casses must execute on this class and also It contains android test runner.


