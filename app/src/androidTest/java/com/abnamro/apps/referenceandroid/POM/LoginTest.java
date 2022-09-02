package com.abnamro.apps.referenceandroid.POM;



import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.*;


import static com.google.android.material.internal.ContextUtils.getActivity;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import android.view.View;
import android.widget.Toast;

import androidx.test.espresso.Espresso;

import com.abnamro.apps.referenceandroid.MainActivity;
import com.abnamro.apps.referenceandroid.R;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class LoginTest {

    private static final String ToastSucces = "Login Succesfull!";
    private static final String ToastFailed = "Login Failed!";



    public static void LoginSuccess() throws InterruptedException{

        //enter right username
        onView(withId(R.id.username))
                .perform(typeText("peribozkir"));

        //enter right passwd
        onView(withId(R.id.password))
                .perform(typeText(String.valueOf("12345")));
        Espresso.closeSoftKeyboard();

        Thread.sleep(2000);
        //click login button
        onView(withId(R.id.button))
                .perform(click());

        //check the toast message
        onView(withText(ToastSucces)).inRoot(new ToastMatcher())
                .check(matches(isDisplayed()));

    }

    public static void LoginFailed1() throws InterruptedException {

        //enter wrong username
        onView(withId(R.id.username))
                .perform(typeText("testname"));

        //enter wrong passwd
        onView(withId(R.id.password))
                .perform(typeText(String.valueOf("87569")));
        Espresso.closeSoftKeyboard();

        //click login button
        onView(withId(R.id.button))
                .perform(click());

        //check toast message
        onView(withText(ToastFailed)).inRoot(new ToastMatcher())
                .check(matches(isDisplayed()));



    }

    public static void LoginFailed2() throws InterruptedException {

        //enter right username
        onView(withId(R.id.username))
                .perform(typeText("peribozkir"));

        //enter wrong passwd
        onView(withId(R.id.password))
                .perform(typeText(String.valueOf("87569")));
        Espresso.closeSoftKeyboard();

        //click login button
        onView(withId(R.id.button))
                .perform(click());
        //check toast message
        onView(withText(ToastFailed)).inRoot(new ToastMatcher())
                .check(matches(isDisplayed()));



    }

    public static void LoginFailed3() throws InterruptedException {

        //enter wrong username
        onView(withId(R.id.username))
                .perform(typeText("testname"));

        //enter right passwd
        onView(withId(R.id.password))
                .perform(typeText(String.valueOf("12345")));
        Espresso.closeSoftKeyboard();

        //click login button
        onView(withId(R.id.button))
                .perform(click());
        //check toast message
        onView(withText(ToastFailed)).inRoot(new ToastMatcher())
                .check(matches(isDisplayed()));


    }


}
