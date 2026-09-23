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

public class TimeSeries_add_1505136783253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67222;
     Object term67340;

    public TimeSeries_add_1505136783253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term67258 = Class.forName((String) "java.lang.StackStreamFactory$WalkerState");
        term67222 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term67222, term67222.getClass(), "timePeriodClass", term67258);
        term67340 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term67370 = newInstance(Class.forName("org.jfree.data.time.Quarter"));
        setField(term67340, term67340.getClass(), "period", term67370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term67340;
        try {
            callMethod(klass, "add", argTypes, term67222, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


