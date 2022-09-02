package com.abnamro.apps.referenceandroid.tests;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.rule.ActivityTestRule;

import com.abnamro.apps.referenceandroid.MainActivity;
import com.abnamro.apps.referenceandroid.POM.Fab;
import com.abnamro.apps.referenceandroid.POM.HomePage;
import com.abnamro.apps.referenceandroid.POM.LoginTest;
import com.abnamro.apps.referenceandroid.POM.SettingsMenu;
import com.abnamro.apps.referenceandroid.POM.ToastMatcher;
import com.abnamro.apps.referenceandroid.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.junit.Test;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class TestExecution {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);



    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception{

    }

    @Test  //TestCase1: Check the "Hello World!" text on th home page
    public void TestCase1() throws InterruptedException {
        Thread.sleep(3000);
        HomePage.ControlText();

    }

    @Test //TestCase2:
    // Step: Click the options button on Toolbar
    //expected result: Settings menu must be opened
    public void TestCase2() throws InterruptedException {
        SettingsMenu.settingOpen();

    }

   @Test //TestCase3:
   // Step: Click the setting menu
    //Expected result: setting menu must be closed
    public void TestCase3()  throws InterruptedException {

        SettingsMenu.settingOpen();
        Thread.sleep(2000);
        SettingsMenu.clickSettings();

    }
    @Test //TestCase4:
    // step: Click the fab
    //Expected Result: check the "Replace with your own action" text on snackbar
    public void TestCase4() throws InterruptedException {
        Fab.FabButton();
    }
    @Test //TestCase5:
    // Step: click the fab
    // Step: click the option button on toolbar
    // Expected Result: Settings menu must be open
    public void TestCase5() throws InterruptedException {
        Fab.FabButton();
        SettingsMenu.settingOpen();
    }
    @Test //TestCase6:
    // (this is failure scenario, the snackbar not open at the first click after click the optıon button)
    //Step: click the optıon buton on toolbar
    //Step: click the fab
    //Expected Result: Snackbar must be opened
    public void TestCase6() throws InterruptedException{
        SettingsMenu.settingOpen();
        Fab.FabButton();
    }
    @Test //TestCase7:
    //Step: enter right username
    //Step: enter right passwd
    //Step : click login button
    //Expected Result : toast message must be succes
    public void TestCase7() throws InterruptedException{
        LoginTest.LoginSuccess();


    }
    @Test //TestCase8:
    //Step: enter wrong username
    //Step: enter wrong passwd
    //Step: click login button
    //Expected Result : toast message must be failed
    public void TestCase8() throws InterruptedException{
        LoginTest.LoginFailed1();
    }
    @Test //TestCase9:
    //Step: enter right username
    //Step: enter wrong passwd
    //Step: click login button
    //Expected Result: toast message must be failed
    public void TestCase9() throws InterruptedException{
        LoginTest.LoginFailed2();
    }
    @Test //TestCase10:
    //Step: enter wrong username
    //Step: enter right passwd
    //Step: click login button
    //Expected Result : toast message must be failed
    public void TestCase10() throws InterruptedException{
        LoginTest.LoginFailed3();
    }


}
