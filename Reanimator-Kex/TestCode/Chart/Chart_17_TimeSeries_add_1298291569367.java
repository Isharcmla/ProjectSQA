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

public class TimeSeries_add_1298291569367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143427;
     Object term143545;

    public TimeSeries_add_1298291569367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term143463 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsInts$ArrayHandle");
        term143427 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term143427, term143427.getClass(), "timePeriodClass", term143463);
        term143545 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term143571 = newInstance(Class.forName("org.jfree.data.time.Day"));
        setField(term143545, term143545.getClass(), "period", term143571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term143545;
        args[1] = false;
        try {
            callMethod(klass, "add", argTypes, term143427, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


