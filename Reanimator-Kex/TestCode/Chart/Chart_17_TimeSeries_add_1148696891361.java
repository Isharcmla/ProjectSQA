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
import java.lang.Short;

public class TimeSeries_add_1148696891361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138347;
     Object term138412;
     Object term138456;

    public TimeSeries_add_1148696891361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term138383 = Class.forName((String) "java.util.AbstractMap");
        term138347 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term138347, term138347.getClass(), "timePeriodClass", term138383);
        term138412 = newInstance(Class.forName("org.jfree.data.time.Second"));
        term138456 = new Short((short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = term138412;
        args[1] = term138456;
        try {
            callMethod(klass, "add", argTypes, term138347, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


