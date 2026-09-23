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

public class TimeSeries_add_1030290905397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169998;
     Object term170063;

    public TimeSeries_add_1030290905397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term170034 = Class.forName((String) "java.lang.Class$1");
        term169998 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term169998, term169998.getClass(), "timePeriodClass", term170034);
        term170063 = newInstance(Class.forName("org.jfree.data.time.Second"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term170063;
        args[1] = 0.0;
        try {
            callMethod(klass, "add", argTypes, term169998, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


