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

public class TimeSeries_add_1505136783311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100179;
     Object term100261;

    public TimeSeries_add_1505136783311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100179 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        term100261 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term100319 = newInstance(Class.forName("org.jfree.data.time.Second"));
        setField(term100261, term100261.getClass(), "period", term100319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term100261;
        try {
            callMethod(klass, "add", argTypes, term100179, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


