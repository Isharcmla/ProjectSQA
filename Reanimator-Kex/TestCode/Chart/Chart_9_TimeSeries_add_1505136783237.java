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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TimeSeries_add_1505136783237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64407;
     Object term64525;

    public TimeSeries_add_1505136783237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64443 = Class.forName((String) "java.io.ObjectOutputStream$HandleTable");
        term64407 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term64407, term64407.getClass(), "timePeriodClass", term64443);
        term64525 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term64554 = newInstance(Class.forName("org.jfree.data.time.Second"));
        setField(term64525, term64525.getClass(), "period", term64554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term64525;
        callMethod(klass, "add", argTypes, term64407, args);
    }

};


