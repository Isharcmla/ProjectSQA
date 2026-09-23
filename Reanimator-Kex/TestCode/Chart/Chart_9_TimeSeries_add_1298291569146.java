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
import java.lang.Object;

public class TimeSeries_add_1298291569146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25829;
     Object term25911;

    public TimeSeries_add_1298291569146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25829 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        term25911 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term25963 = newInstance(Class.forName("org.jfree.data.time.Day"));
        setField(term25911, term25911.getClass(), "period", term25963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term25911;
        args[1] = false;
        try {
            callMethod(klass, "add", argTypes, term25829, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


