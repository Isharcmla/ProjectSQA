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

public class TimeSeries_equals_62694408141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25315;
     Object term26961;
     Object term26962;

    public TimeSeries_equals_62694408141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25315 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        term26961 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term26961, term26961.getClass(), "domain", null);
        setField(term26961, term26961.getClass(), "range", null);
        setField(term26961, term26961.getClass(), "timePeriodClass", null);
        setField(term26961, term26961.getClass(), "data", null);
        setIntField(term26961, term26961.getClass(), "maximumItemCount", 0);
        setLongField(term26961, term26961.getClass(), "maximumItemAge", 0L);
        setField(term26961, term26961.getClass(), "key", null);
        setField(term26961, term26961.getClass(), "description", null);
        setField(term26961, term26961.getClass(), "listeners", null);
        setField(term26961, term26961.getClass(), "propertyChangeSupport", null);
        setBooleanField(term26961, term26961.getClass(), "notify", false);
        term26962 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term26962, term26962.getClass(), "domain", null);
        setField(term26962, term26962.getClass(), "range", null);
        setField(term26962, term26962.getClass(), "timePeriodClass", null);
        setField(term26962, term26962.getClass(), "data", null);
        setIntField(term26962, term26962.getClass(), "maximumItemCount", 0);
        setLongField(term26962, term26962.getClass(), "maximumItemAge", 0L);
        setField(term26962, term26962.getClass(), "key", null);
        setField(term26962, term26962.getClass(), "description", null);
        setField(term26962, term26962.getClass(), "listeners", null);
        setField(term26962, term26962.getClass(), "propertyChangeSupport", null);
        setBooleanField(term26962, term26962.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term25315;
        Object retValue = callMethod(klass, "equals", argTypes, term25315, args);
        assertTrue(recursiveEquals(term25315, term26961));
        assertTrue(recursiveEquals(term25315, term26962));
        assertTrue(recursiveEquals(retValue, true));
    }

};


