package com.abnamro.apps.referenceandroid.POM;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.is;


import com.abnamro.apps.referenceandroid.R;

public class LoginTest {

    public static void LoginSuccess() {

        //enter right username
        onView(withId(R.id.username))
                .perform(typeText("peribozkir"));

        //enter right passwd
        onView(withId(R.id.password))
                .perform(typeText(String.valueOf("12345")));

        //click login button
        onView(withId(R.id.button))
                .perform(click());

        //check toast message
        onView(withText("Login Succesfull!"))
                .check(matches(isDisplayed()));
    }

    public static void LoginFailed1() {

        //enter wrong username
        onView(withId(R.id.username))
                .perform(typeText("testname"));

        //enter wrong passwd
        onView(withId(R.id.password))
                .perform(typeText(String.valueOf("87569")));

        //click login button
        onView(withId(R.id.button))
                .perform(click());

        //check toast message
        onView(withText("Login Failed!"))
                .check(matches(isDisplayed()));

    }

    public static void LoginFailed2() {

        //enter right username
        onView(withId(R.id.username))
                .perform(typeText("peribozkir"));

        //enter wrong passwd
        onView(withId(R.id.password))
                .perform(typeText(String.valueOf("87569")));

        //click login button
        onView(withId(R.id.button))
                .perform(click());

        //check toast message
        onView(withText("Login Failed!"))
                .check(matches(isDisplayed()));

    }

    public static void LoginFailed3() {

        //enter wrong username
        onView(withId(R.id.username))
                .perform(typeText("testname"));

        //enter right passwd
        onView(withId(R.id.password))
                .perform(typeText(String.valueOf("12345")));

        //click login button
        onView(withId(R.id.button))
                .perform(click());

        //check toast message
        onView(withText("Login Failed!"))
                .check(matches(isDisplayed()));

    }

}
