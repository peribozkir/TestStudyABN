package com.abnamro.apps.referenceandroid.POM;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import android.view.View;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.ViewInteraction;

import com.abnamro.apps.referenceandroid.R;

import org.hamcrest.Matcher;
import org.hamcrest.core.AllOf;


public class SettingsMenu {




    public static void settingOpen() throws InterruptedException {
        //click the option menu on toolbar
         openActionBarOverflowOrOptionsMenu(
                ApplicationProvider.getApplicationContext());


        //check the setting menu is open
        Thread.sleep(2000);
        onView(withId(androidx.appcompat.R.id.title))
               .check(matches(withText("Settings")));


    }

    public static void clickSettings() {

        //click the settings button.
        ViewInteraction SetMenu = onView(withText("Settings"));
                SetMenu.perform(click());

        //Check the setting menu is closed and not clickable
        onView(withContentDescription("More options")).
                check(matches(isEnabled()));

    }


}
