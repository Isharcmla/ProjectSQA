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

public class TimeSeries_add_1505136783259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78083;
     Object term78201;

    public TimeSeries_add_1505136783259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term78119 = Class.forName((String) "java.util.concurrent.SynchronousQueue$TransferQueue");
        term78083 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term78083, term78083.getClass(), "timePeriodClass", term78119);
        term78201 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term78230 = newInstance(Class.forName("org.jfree.data.time.Minute"));
        setField(term78201, term78201.getClass(), "period", term78230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term78201;
        callMethod(klass, "add", argTypes, term78083, args);
    }

};


