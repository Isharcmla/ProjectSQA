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

public class TimeSeries_add_1505136783223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51966;
     Object term52084;

    public TimeSeries_add_1505136783223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52002 = Class.forName((String) "java.util.stream.SpinedBuffer$OfDouble");
        term51966 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term51966, term51966.getClass(), "timePeriodClass", term52002);
        term52084 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term52111 = newInstance(Class.forName("org.jfree.data.time.Week"));
        setField(term52084, term52084.getClass(), "period", term52111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term52084;
        try {
            callMethod(klass, "add", argTypes, term51966, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


