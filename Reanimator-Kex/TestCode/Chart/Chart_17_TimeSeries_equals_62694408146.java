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

public class TimeSeries_equals_62694408146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27432;
     Object term27836;
     Object term27837;

    public TimeSeries_equals_62694408146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27432 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        term27836 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term27836, term27836.getClass(), "domain", null);
        setField(term27836, term27836.getClass(), "range", null);
        setField(term27836, term27836.getClass(), "timePeriodClass", null);
        setField(term27836, term27836.getClass(), "data", null);
        setIntField(term27836, term27836.getClass(), "maximumItemCount", 0);
        setLongField(term27836, term27836.getClass(), "maximumItemAge", 0L);
        setField(term27836, term27836.getClass(), "key", null);
        setField(term27836, term27836.getClass(), "description", null);
        setField(term27836, term27836.getClass(), "listeners", null);
        setField(term27836, term27836.getClass(), "propertyChangeSupport", null);
        setBooleanField(term27836, term27836.getClass(), "notify", false);
        term27837 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term27837, term27837.getClass(), "domain", null);
        setField(term27837, term27837.getClass(), "range", null);
        setField(term27837, term27837.getClass(), "timePeriodClass", null);
        setField(term27837, term27837.getClass(), "data", null);
        setIntField(term27837, term27837.getClass(), "maximumItemCount", 0);
        setLongField(term27837, term27837.getClass(), "maximumItemAge", 0L);
        setField(term27837, term27837.getClass(), "key", null);
        setField(term27837, term27837.getClass(), "description", null);
        setField(term27837, term27837.getClass(), "listeners", null);
        setField(term27837, term27837.getClass(), "propertyChangeSupport", null);
        setBooleanField(term27837, term27837.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27432;
        Object retValue = callMethod(klass, "equals", argTypes, term27432, args);
        assertTrue(recursiveEquals(term27432, term27836));
        assertTrue(recursiveEquals(term27432, term27837));
        assertTrue(recursiveEquals(retValue, true));
    }

};


