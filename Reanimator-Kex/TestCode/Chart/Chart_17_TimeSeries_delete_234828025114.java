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

public class TimeSeries_delete_234828025114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20620;
     Object term21033;

    public TimeSeries_delete_234828025114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20620 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        term21033 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term21033, term21033.getClass(), "domain", null);
        setField(term21033, term21033.getClass(), "range", null);
        setField(term21033, term21033.getClass(), "timePeriodClass", null);
        setField(term21033, term21033.getClass(), "data", null);
        setIntField(term21033, term21033.getClass(), "maximumItemCount", 0);
        setLongField(term21033, term21033.getClass(), "maximumItemAge", 0L);
        setField(term21033, term21033.getClass(), "key", null);
        setField(term21033, term21033.getClass(), "description", null);
        setField(term21033, term21033.getClass(), "listeners", null);
        setField(term21033, term21033.getClass(), "propertyChangeSupport", null);
        setBooleanField(term21033, term21033.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = -2147483648;
        args[1] = 1074266112;
        callMethod(klass, "delete", argTypes, term20620, args);
        assertTrue(recursiveEquals(term20620, term21033));
    }

};


