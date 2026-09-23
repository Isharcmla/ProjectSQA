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

public class TimeSeries_add_1505136783180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37871;
     Object term37989;

    public TimeSeries_add_1505136783180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37907 = Class.forName((String) "java.util.concurrent.CopyOnWriteArrayList$COWSubListIterator");
        term37871 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term37871, term37871.getClass(), "timePeriodClass", term37907);
        term37989 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term38017 = newInstance(Class.forName("org.jfree.data.time.Month"));
        setField(term37989, term37989.getClass(), "period", term38017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term37989;
        try {
            callMethod(klass, "add", argTypes, term37871, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


