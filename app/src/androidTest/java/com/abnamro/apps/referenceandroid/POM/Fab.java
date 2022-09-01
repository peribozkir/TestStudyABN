package com.abnamro.apps.referenceandroid.POM;

import androidx.test.espresso.ViewInteraction;
import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.is;

import com.abnamro.apps.referenceandroid.R;


public class Fab {



    public static void FabButton() throws InterruptedException {

    //click fab
    onView(withId(R.id.fab)).perform(click());


    //check the snackbar text is opened or not
    onView(withId(com.google.android.material.R.id.snackbar_text))
            .check(matches(withText("Replace with your own action")));

}
}

