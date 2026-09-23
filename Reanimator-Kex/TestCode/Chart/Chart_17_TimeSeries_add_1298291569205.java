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

public class TimeSeries_add_1298291569205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42410;
     Object term42528;

    public TimeSeries_add_1298291569205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42446 = Class.forName((String) "java.util.regex.Pattern$LastMatch");
        term42410 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term42410, term42410.getClass(), "timePeriodClass", term42446);
        term42528 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term42555 = newInstance(Class.forName("org.jfree.data.time.Year"));
        setField(term42528, term42528.getClass(), "period", term42555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term42528;
        args[1] = false;
        try {
            callMethod(klass, "add", argTypes, term42410, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


