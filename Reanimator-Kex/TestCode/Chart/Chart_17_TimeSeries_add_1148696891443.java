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
import java.lang.Float;

public class TimeSeries_add_1148696891443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209225;
     Object term209290;
     Object term209334;

    public TimeSeries_add_1148696891443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term209261 = Class.forName((String) "org.jfree.chart.demo.TimeSeriesChartDemo1");
        term209225 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term209225, term209225.getClass(), "timePeriodClass", term209261);
        term209290 = newInstance(Class.forName("org.jfree.data.time.Second"));
        term209334 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = term209290;
        args[1] = term209334;
        try {
            callMethod(klass, "add", argTypes, term209225, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


