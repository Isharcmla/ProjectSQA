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

public class TimeSeries_add_1505136783252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73440;
     Object term73558;

    public TimeSeries_add_1505136783252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term73476 = Class.forName((String) "javax.servlet.Servlet");
        term73440 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term73440, term73440.getClass(), "timePeriodClass", term73476);
        term73558 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term73585 = newInstance(Class.forName("org.jfree.data.time.Year"));
        setField(term73558, term73558.getClass(), "period", term73585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term73558;
        callMethod(klass, "add", argTypes, term73440, args);
    }

};


