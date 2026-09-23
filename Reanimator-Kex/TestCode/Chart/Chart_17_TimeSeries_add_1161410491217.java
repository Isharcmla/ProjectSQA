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
import java.lang.Byte;

public class TimeSeries_add_1161410491217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47083;
     Object term47153;
     Object term47195;

    public TimeSeries_add_1161410491217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47119 = Class.forName((String) "java.util.Collections$UnmodifiableNavigableSet");
        term47083 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term47083, term47083.getClass(), "timePeriodClass", term47119);
        term47153 = newInstance(Class.forName("org.jfree.data.time.Millisecond"));
        term47195 = new Byte((byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = Class.forName("java.lang.Number");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term47153;
        args[1] = term47195;
        args[2] = false;
        try {
            callMethod(klass, "add", argTypes, term47083, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


