package com.embarkmobile.androidexample.tests;

import android.test.AndroidTestCase;
import com.embarkmobile.androidexample.Counter;

/**
 *
 */
public class CounterTest extends AndroidTestCase {
    public void testIncrement() {
        Counter counter = new Counter();
        assertEquals(1, counter.increment());
        assertEquals(1, counter.getValue());
        assertEquals(2, counter.increment());
        assertEquals(2, counter.getValue());
    }
}
