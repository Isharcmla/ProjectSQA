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

public class TimeSeries_add_1298291569287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83604;
     Object term83722;

    public TimeSeries_add_1298291569287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83640 = Class.forName((String) "java.util.LinkedHashMap");
        term83604 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term83604, term83604.getClass(), "timePeriodClass", term83640);
        term83722 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term83751 = newInstance(Class.forName("org.jfree.data.time.Minute"));
        setField(term83722, term83722.getClass(), "period", term83751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term83722;
        args[1] = false;
        try {
            callMethod(klass, "add", argTypes, term83604, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


