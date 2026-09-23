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

public class TimeSeries_add_1505136783239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65950;
     Object term66068;

    public TimeSeries_add_1505136783239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65986 = Class.forName((String) "java.util.regex.Pattern");
        term65950 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term65950, term65950.getClass(), "timePeriodClass", term65986);
        term66068 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term66095 = newInstance(Class.forName("org.jfree.data.time.Hour"));
        setField(term66068, term66068.getClass(), "period", term66095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term66068;
        callMethod(klass, "add", argTypes, term65950, args);
    }

};


