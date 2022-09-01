package com.abnamro.apps.referenceandroid.tests;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.rule.ActivityTestRule;

import com.abnamro.apps.referenceandroid.MainActivity;
import com.abnamro.apps.referenceandroid.POM.Fab;
import com.abnamro.apps.referenceandroid.POM.HomePage;
import com.abnamro.apps.referenceandroid.POM.SettingsMenu;

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
    public void HomePageTest() throws InterruptedException {
        Thread.sleep(3000);
        HomePage.ControlText();

    }

    @Test //TestCase2: Click the options button on Toolbar
    //expected result: Settings menu must be opened
    public void ToolbarTest() throws InterruptedException {
        SettingsMenu.settingOpen();

    }

   @Test //TestCase3: Click the setting menu
    //Expected result: setting menu must be closed
    public void SettingMenuTest()  throws InterruptedException {

        SettingsMenu.settingOpen();
        Thread.sleep(2000);
        SettingsMenu.clickSettings();

    }
    @Test //TestCase4: Click the fab button
    //Expected Result: check the "Replace with your own action" text.
    public void FabTest() throws InterruptedException {
        Fab.FabButton();
    }


}
