package org.jfree.data.statistics;

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
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.statistics.EqualityUtils.*;

public class DefaultBoxAndWhiskerCategoryDataset_equals_499402290124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22982;
     Object term23490;
     Object term23491;

    public DefaultBoxAndWhiskerCategoryDataset_equals_499402290124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22982 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        term23490 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        setField(term23490, term23490.getClass(), "data", null);
        setDoubleField(term23490, term23490.getClass(), "minimumRangeValue", 0.0);
        setIntField(term23490, term23490.getClass(), "minimumRangeValueRow", 0);
        setIntField(term23490, term23490.getClass(), "minimumRangeValueColumn", 0);
        setDoubleField(term23490, term23490.getClass(), "maximumRangeValue", 0.0);
        setIntField(term23490, term23490.getClass(), "maximumRangeValueRow", 0);
        setIntField(term23490, term23490.getClass(), "maximumRangeValueColumn", 0);
        setField(term23490, term23490.getClass(), "rangeBounds", null);
        setField(term23490, term23490.getClass(), "group", null);
        setField(term23490, term23490.getClass(), "listenerList", null);
        term23491 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        setField(term23491, term23491.getClass(), "data", null);
        setDoubleField(term23491, term23491.getClass(), "minimumRangeValue", 0.0);
        setIntField(term23491, term23491.getClass(), "minimumRangeValueRow", 0);
        setIntField(term23491, term23491.getClass(), "minimumRangeValueColumn", 0);
        setDoubleField(term23491, term23491.getClass(), "maximumRangeValue", 0.0);
        setIntField(term23491, term23491.getClass(), "maximumRangeValueRow", 0);
        setIntField(term23491, term23491.getClass(), "maximumRangeValueColumn", 0);
        setField(term23491, term23491.getClass(), "rangeBounds", null);
        setField(term23491, term23491.getClass(), "group", null);
        setField(term23491, term23491.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term22982;
        Object retValue = callMethod(klass, "equals", argTypes, term22982, args);
        assertTrue(recursiveEquals(term22982, term23490));
        assertTrue(recursiveEquals(term22982, term23491));
        assertTrue(recursiveEquals(retValue, true));
    }

};


