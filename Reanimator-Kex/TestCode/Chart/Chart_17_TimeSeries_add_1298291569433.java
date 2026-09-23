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

public class TimeSeries_add_1298291569433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201810;
     Object term201928;

    public TimeSeries_add_1298291569433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term201846 = Class.forName((String) "java.io.ObjectStreamClass$3");
        term201810 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term201810, term201810.getClass(), "timePeriodClass", term201846);
        term201928 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term201954 = newInstance(Class.forName("org.jfree.data.time.Day"));
        setField(term201928, term201928.getClass(), "period", term201954);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term201928;
        args[1] = false;
        try {
            callMethod(klass, "add", argTypes, term201810, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


