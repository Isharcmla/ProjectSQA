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
import java.lang.Integer;

public class TimeSeries_add_1148696891449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216031;
     Object term216097;
     Object term216145;

    public TimeSeries_add_1148696891449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term216067 = Class.forName((String) "org.jfree.data.xy.DefaultHighLowDataset");
        term216031 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term216031, term216031.getClass(), "timePeriodClass", term216067);
        term216097 = newInstance(Class.forName("org.jfree.data.time.Quarter"));
        term216145 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = term216097;
        args[1] = term216145;
        try {
            callMethod(klass, "add", argTypes, term216031, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


