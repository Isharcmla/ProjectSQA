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
import java.lang.Object;

public class DefaultBoxAndWhiskerCategoryDataset_equals_499402290242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58699;
     Object term58891;
     Object term58917;
     Object term58919;

    public DefaultBoxAndWhiskerCategoryDataset_equals_499402290242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58699 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term58763 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term58699, term58699.getClass(), "data", term58763);
        term58891 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        setField(term58891, term58891.getClass(), "data", null);
        term58917 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term58918 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term58918, term58918.getClass(), "rowKeys", null);
        setField(term58918, term58918.getClass(), "columnKeys", null);
        setField(term58918, term58918.getClass(), "rows", null);
        setField(term58917, term58917.getClass(), "data", term58918);
        setDoubleField(term58917, term58917.getClass(), "minimumRangeValue", 0.0);
        setIntField(term58917, term58917.getClass(), "minimumRangeValueRow", 0);
        setIntField(term58917, term58917.getClass(), "minimumRangeValueColumn", 0);
        setDoubleField(term58917, term58917.getClass(), "maximumRangeValue", 0.0);
        setIntField(term58917, term58917.getClass(), "maximumRangeValueRow", 0);
        setIntField(term58917, term58917.getClass(), "maximumRangeValueColumn", 0);
        setField(term58917, term58917.getClass(), "rangeBounds", null);
        setField(term58917, term58917.getClass(), "group", null);
        setField(term58917, term58917.getClass(), "listenerList", null);
        term58919 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        setField(term58919, term58919.getClass(), "data", null);
        setDoubleField(term58919, term58919.getClass(), "minimumRangeValue", 0.0);
        setIntField(term58919, term58919.getClass(), "minimumRangeValueRow", 0);
        setIntField(term58919, term58919.getClass(), "minimumRangeValueColumn", 0);
        setDoubleField(term58919, term58919.getClass(), "maximumRangeValue", 0.0);
        setIntField(term58919, term58919.getClass(), "maximumRangeValueRow", 0);
        setIntField(term58919, term58919.getClass(), "maximumRangeValueColumn", 0);
        setField(term58919, term58919.getClass(), "rangeBounds", null);
        setField(term58919, term58919.getClass(), "group", null);
        setField(term58919, term58919.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term58891;
        Object retValue = callMethod(klass, "equals", argTypes, term58699, args);
        assertTrue(recursiveEquals(term58699, term58917));
        assertTrue(recursiveEquals(term58891, term58919));
        assertTrue(recursiveEquals(retValue, false));
    }

};


