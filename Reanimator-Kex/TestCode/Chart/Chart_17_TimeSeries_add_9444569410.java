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

public class TimeSeries_add_9444569410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180397;
     Object term180467;

    public TimeSeries_add_9444569410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term180433 = Class.forName((String) "java.util.stream.DoublePipeline$4");
        term180397 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term180397, term180397.getClass(), "timePeriodClass", term180433);
        term180467 = newInstance(Class.forName("org.jfree.data.time.Millisecond"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = double.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term180467;
        args[1] = 0.0;
        args[2] = false;
        try {
            callMethod(klass, "add", argTypes, term180397, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


