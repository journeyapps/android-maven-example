package com.embarkmobile.androidexample.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import com.embarkmobile.androidexample.ExampleActivity;
import com.jayway.android.robotium.solo.Solo;


/**
 *
 */
public class ExampleTest extends
        ActivityInstrumentationTestCase2<ExampleActivity> {

    private Solo solo;

    public ExampleTest() {
        super(ExampleActivity.class);
    }

    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testIncrement() throws Exception {
        TextView counter = solo.getText("Counter: 0");
        solo.clickOnButton("Increment");
        assertEquals("Counter: 1", counter.getText());
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }
}