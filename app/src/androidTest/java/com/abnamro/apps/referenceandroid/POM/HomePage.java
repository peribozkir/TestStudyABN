package com.abnamro.apps.referenceandroid.POM;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isChecked;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import org.hamcrest.Description;

public class HomePage {

    public static void ControlText(){
        //check the "hello world" text on main activity
        onView(withText("Hello World!"))
                .check(matches(isDisplayed()));
    }
}
