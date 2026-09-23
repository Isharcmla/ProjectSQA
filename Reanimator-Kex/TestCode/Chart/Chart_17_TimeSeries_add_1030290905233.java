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
import org.jfree.data.general.SeriesException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TimeSeries_add_1030290905233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55769;
     Object term55844;

    public TimeSeries_add_1030290905233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55805 = Class.forName((String) "java.util.Locale$IsoCountryCode");
        term55769 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term55769, term55769.getClass(), "timePeriodClass", term55805);
        term55844 = newInstance(Class.forName("org.jfree.data.time.FixedMillisecond"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term55844;
        args[1] = 0.0;
        try {
            callMethod(klass, "add", argTypes, term55769, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


