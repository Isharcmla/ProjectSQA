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

public class TimeSeries_add_1505136783109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19917;
     Object term19999;

    public TimeSeries_add_1505136783109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19917 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        term19999 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term20055 = newInstance(Class.forName("org.jfree.data.time.Month"));
        setField(term19999, term19999.getClass(), "period", term20055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term19999;
        try {
            callMethod(klass, "add", argTypes, term19917, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


