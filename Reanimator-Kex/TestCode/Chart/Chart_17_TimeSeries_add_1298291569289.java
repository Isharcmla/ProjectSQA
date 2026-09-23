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

public class TimeSeries_add_1298291569289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85946;
     Object term86064;

    public TimeSeries_add_1298291569289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85982 = Class.forName((String) "org.jfree.chart.event.ChartProgressListener");
        term85946 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term85946, term85946.getClass(), "timePeriodClass", term85982);
        term86064 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term86094 = newInstance(Class.forName("org.jfree.data.time.Quarter"));
        setField(term86064, term86064.getClass(), "period", term86094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term86064;
        args[1] = false;
        try {
            callMethod(klass, "add", argTypes, term85946, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


