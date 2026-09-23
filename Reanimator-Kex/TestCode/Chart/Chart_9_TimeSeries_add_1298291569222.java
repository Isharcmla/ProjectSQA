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

public class TimeSeries_add_1298291569222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55173;
     Object term55291;

    public TimeSeries_add_1298291569222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55209 = Class.forName((String) "org.jfree.data.statistics.HistogramDataset");
        term55173 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term55173, term55173.getClass(), "timePeriodClass", term55209);
        term55291 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term55317 = newInstance(Class.forName("org.jfree.data.time.Day"));
        setField(term55291, term55291.getClass(), "period", term55317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term55291;
        args[1] = false;
        try {
            callMethod(klass, "add", argTypes, term55173, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


