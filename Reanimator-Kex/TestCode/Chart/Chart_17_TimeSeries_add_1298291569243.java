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

public class TimeSeries_add_1298291569243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60820;
     Object term60938;

    public TimeSeries_add_1298291569243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60856 = Class.forName((String) "org.jfree.data.xy.AbstractIntervalXYDataset");
        term60820 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term60820, term60820.getClass(), "timePeriodClass", term60856);
        term60938 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term60965 = newInstance(Class.forName("org.jfree.data.time.Week"));
        setField(term60938, term60938.getClass(), "period", term60965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term60938;
        args[1] = false;
        try {
            callMethod(klass, "add", argTypes, term60820, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


