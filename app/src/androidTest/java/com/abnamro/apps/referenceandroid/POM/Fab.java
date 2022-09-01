package com.abnamro.apps.referenceandroid.POM;

import androidx.test.espresso.ViewInteraction;
import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.is;


public class Fab  extends EspressoBaseTest{

public static void FabButton() {
    ViewInteraction FabBtn = onView(withClassName(is("androidx.appcompat.widget.ContentFrameLayout")))
            .perform(click());

}
}

