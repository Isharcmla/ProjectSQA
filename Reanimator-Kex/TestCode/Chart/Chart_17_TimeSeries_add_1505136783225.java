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

public class TimeSeries_add_1505136783225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53609;
     Object term53691;

    public TimeSeries_add_1505136783225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53609 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        term53691 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term53747 = newInstance(Class.forName("org.jfree.data.time.Month"));
        setField(term53691, term53691.getClass(), "period", term53747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term53691;
        try {
            callMethod(klass, "add", argTypes, term53609, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


