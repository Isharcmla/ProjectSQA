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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TimeSeries_add_1298291569246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70144;
     Object term70262;

    public TimeSeries_add_1298291569246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70180 = Class.forName((String) "java.util.Spliterators$DoubleIteratorSpliterator");
        term70144 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term70144, term70144.getClass(), "timePeriodClass", term70180);
        term70262 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term70290 = newInstance(Class.forName("org.jfree.data.time.Month"));
        setField(term70262, term70262.getClass(), "period", term70290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term70262;
        args[1] = false;
        callMethod(klass, "add", argTypes, term70144, args);
    }

};


