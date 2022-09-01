package com.abnamro.apps.referenceandroid.POM;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;


public class EspressoBaseTest {

    public static void clickButton(Integer resourceId){
        onView(withId(resourceId))
                .perform(click())
                .check(matches(isDisplayed()));
    }
}
