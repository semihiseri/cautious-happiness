package com.example.semih.helloworld;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainScreenTest {

    @Rule
    public ActivityTestRule<MainScreen> mActivityTestRule = new ActivityTestRule<>(MainScreen.class);

    @Test
    public void mainScreenTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText), withText("Enter a cat name"), isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.editText), /*withText("Enter a cat name"),*/ isDisplayed()));
        appCompatEditText5.perform(replaceText("Hede"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.button2), withText("Send"), isDisplayed()));
        appCompatButton.perform(click());


        onView(withId(R.id.textView)).check(matches(withText("Hede")));
    }

    @Test
    public void otherMainScreenTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText), withText("Enter a cat name"), isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.editText), withText("Enter a cat name"), isDisplayed()));
        appCompatEditText5.perform(replaceText("Hede"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.button2), withText("Send"), isDisplayed()));
        appCompatButton.perform(click());


        onView(withId(R.id.textView)).check(matches(withText("Hede")));
    }

}
