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

public class TimeSeries_add_1148696891257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69425;
     Object term69488;
     Object term69536;

    public TimeSeries_add_1148696891257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69461 = Class.forName((String) "java.lang.invoke.LambdaForm$1");
        term69425 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term69425, term69425.getClass(), "timePeriodClass", term69461);
        term69488 = newInstance(Class.forName("org.jfree.data.time.Year"));
        term69536 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = term69488;
        args[1] = term69536;
        try {
            callMethod(klass, "add", argTypes, term69425, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


