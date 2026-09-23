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

public class TimeSeries_add_9444569437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205158;
     Object term205228;

    public TimeSeries_add_9444569437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term205194 = Class.forName((String) "org.jfree.chart.util.VerticalAlignment");
        term205158 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term205158, term205158.getClass(), "timePeriodClass", term205194);
        term205228 = newInstance(Class.forName("org.jfree.data.time.Millisecond"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = double.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term205228;
        args[1] = 0.0;
        args[2] = false;
        try {
            callMethod(klass, "add", argTypes, term205158, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


