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

public class TimeSeries_add_1505136783244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68631;
     Object term68749;

    public TimeSeries_add_1505136783244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68667 = Class.forName((String) "java.io.SerializablePermission");
        term68631 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term68631, term68631.getClass(), "timePeriodClass", term68667);
        term68749 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term68778 = newInstance(Class.forName("org.jfree.data.time.Second"));
        setField(term68749, term68749.getClass(), "period", term68778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term68749;
        callMethod(klass, "add", argTypes, term68631, args);
    }

};


