package com.example.idn.espresso;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityExpressoTest {


    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);


    @Test
    public void ensureTextChangeWork() {

        // cari element yang mau diuji
        onView(withId(R.id.edt_text))
                .perform(typeText("Hello"), closeSoftKeyboard());

        // buat aksi untuk element yang mau diuji
        onView(withId(R.id.btn_change_text)).perform(click());

        // cek kondisi atau state dari komponen yang diuji
        onView(withId(R.id.tv_cetak)).check(matches(withText("Hallo")));

    }


    @Test
    public void ensureMoveActivityWithData() {

        onView(withId(R.id.edt_text))
                .perform(typeText("FiqriHafzainIslami"), closeSoftKeyboard());
        onView(withId(R.id.btn_swicth_activity)).perform(click());
        onView(withId(R.id.tv_result_view)).check(matches(withText("FiqriHafzainIslami")));

    }
}
