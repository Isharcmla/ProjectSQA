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

public class TimeSeries_add_1298291569242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67013;
     Object term67131;

    public TimeSeries_add_1298291569242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term67049 = Class.forName((String) "java.lang.invoke.StringConcatFactory$BytecodeStringBuilderStrategy");
        term67013 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term67013, term67013.getClass(), "timePeriodClass", term67049);
        term67131 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term67159 = newInstance(Class.forName("org.jfree.data.time.Month"));
        setField(term67131, term67131.getClass(), "period", term67159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term67131;
        args[1] = false;
        callMethod(klass, "add", argTypes, term67013, args);
    }

};


