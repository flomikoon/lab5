package com.example.lab33

import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.lab33.task5.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun startTest() {
        isFirst()
        onView(withId(R.id.Go12)).perform(click())
        isSecond()
        onView(withId(R.id.Go21)).perform(click())
        isFirst()
        onView(withId(R.id.Go12)).perform(click())
        isSecond()
        onView(withId(R.id.about_button)).perform(click())
        openAbout()
        pressBack()
        isSecond()
        onView(withId(R.id.Go23)).perform(click())
        isThird()
        onView(withId(R.id.Go32)).perform(click())
        isSecond()
    }

    @Test
    fun backstackTest() {
        isFirst()
        onView(withId(R.id.Go12)).perform(click())
        onView(withId(R.id.Go23)).perform(click())
        isThird()
        pressBack()
        pressBack()
        isFirst()

        onView(withId(R.id.Go12)).perform(click())
        onView(withId(R.id.Go21)).perform(click())
        onView(withId(R.id.Go12)).perform(click())
        onView(withId(R.id.Go21)).perform(click())
        pressBackUnconditionally()
    }

    private fun openAbout() {
        onView(withId(R.id.Go12)).check((doesNotExist()))
        onView(withId(R.id.Go23)).check(doesNotExist())
        onView(withId(R.id.Go32)).check(doesNotExist())
    }

    private fun isFirst() {
        onView(withId(R.id.Go21)).check((doesNotExist()))
        onView(withId(R.id.Go12)).check(matches(isDisplayed()))
        onView(withId(R.id.Go32)).check(doesNotExist())
        onView(withId(R.id.about_button)).check(matches(isDisplayed()))
    }

    private fun isSecond() {
        onView(withId(R.id.Go21)).check((matches(isDisplayed())))
        onView(withId(R.id.Go12)).check(doesNotExist())
        onView(withId(R.id.Go23)).check(matches(isDisplayed()))
        onView(withId(R.id.about_button)).check(matches(isDisplayed()))
    }

    private fun isThird() {
        onView(withId(R.id.Go31)).check((matches(isDisplayed())))
        onView(withId(R.id.Go32)).check(matches(isDisplayed()))
        onView(withId(R.id.Go23)).check(doesNotExist())
        onView(withId(R.id.about_button)).check(matches(isDisplayed()))
    }
}