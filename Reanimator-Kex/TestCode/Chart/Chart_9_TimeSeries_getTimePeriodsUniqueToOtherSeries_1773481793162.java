package org.jfree.data.time;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TimeSeries_getTimePeriodsUniqueToOtherSeries_1773481793162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31594;
     Object term31660;

    public TimeSeries_getTimePeriodsUniqueToOtherSeries_1773481793162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31594 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        term31660 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term31660, term31660.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeries");
        Object[] args = new Object[1];
        args[0] = term31660;
        try {
            callMethod(klass, "getTimePeriodsUniqueToOtherSeries", argTypes, term31594, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


