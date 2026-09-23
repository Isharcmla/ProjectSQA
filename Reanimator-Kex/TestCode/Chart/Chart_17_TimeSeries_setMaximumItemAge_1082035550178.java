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
import static org.jfree.data.time.EqualityUtils.*;
import java.util.ArrayList;

public class TimeSeries_setMaximumItemAge_1082035550178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34108;
     Object term34332;

    public TimeSeries_setMaximumItemAge_1082035550178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term34160 = new ArrayList();
        term34108 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setLongField(term34108, term34108.getClass(), "maximumItemAge", 0L);
        setField(term34108, term34108.getClass(), "data", term34160);
        ArrayList term34333 = new ArrayList();
        term34332 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term34332, term34332.getClass(), "domain", null);
        setField(term34332, term34332.getClass(), "range", null);
        setField(term34332, term34332.getClass(), "timePeriodClass", null);
        setField(term34332, term34332.getClass(), "data", term34333);
        setIntField(term34332, term34332.getClass(), "maximumItemCount", 0);
        setLongField(term34332, term34332.getClass(), "maximumItemAge", 0L);
        setField(term34332, term34332.getClass(), "key", null);
        setField(term34332, term34332.getClass(), "description", null);
        setField(term34332, term34332.getClass(), "listeners", null);
        setField(term34332, term34332.getClass(), "propertyChangeSupport", null);
        setBooleanField(term34332, term34332.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        callMethod(klass, "setMaximumItemAge", argTypes, term34108, args);
        assertTrue(recursiveEquals(term34108, term34332));
    }

};


