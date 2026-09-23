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

public class TimeSeries_add_1148696891309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98526;
     Object term98588;
     Object term98632;

    public TimeSeries_add_1148696891309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term98562 = Class.forName((String) "java.util.concurrent.LinkedTransferQueue$Node");
        term98526 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term98526, term98526.getClass(), "timePeriodClass", term98562);
        term98588 = newInstance(Class.forName("org.jfree.data.time.Day"));
        term98632 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = term98588;
        args[1] = term98632;
        try {
            callMethod(klass, "add", argTypes, term98526, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


