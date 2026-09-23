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

public class TimeSeries_add_1030290905351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128677;
     Object term128741;

    public TimeSeries_add_1030290905351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term128713 = Class.forName((String) "java.util.concurrent.CompletableFuture$DelayedExecutor");
        term128677 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term128677, term128677.getClass(), "timePeriodClass", term128713);
        term128741 = newInstance(Class.forName("org.jfree.data.time.Month"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term128741;
        args[1] = 0.0;
        try {
            callMethod(klass, "add", argTypes, term128677, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


