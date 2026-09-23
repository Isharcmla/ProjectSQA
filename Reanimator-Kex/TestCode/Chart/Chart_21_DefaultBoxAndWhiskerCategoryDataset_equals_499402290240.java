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

public class DefaultBoxAndWhiskerCategoryDataset_equals_499402290240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58321;
     Object term58449;
     Object term58536;
     Object term58537;

    public DefaultBoxAndWhiskerCategoryDataset_equals_499402290240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58321 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        setField(term58321, term58321.getClass(), "data", null);
        term58449 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term58513 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term58449, term58449.getClass(), "data", term58513);
        term58536 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        setField(term58536, term58536.getClass(), "data", null);
        setDoubleField(term58536, term58536.getClass(), "minimumRangeValue", 0.0);
        setIntField(term58536, term58536.getClass(), "minimumRangeValueRow", 0);
        setIntField(term58536, term58536.getClass(), "minimumRangeValueColumn", 0);
        setDoubleField(term58536, term58536.getClass(), "maximumRangeValue", 0.0);
        setIntField(term58536, term58536.getClass(), "maximumRangeValueRow", 0);
        setIntField(term58536, term58536.getClass(), "maximumRangeValueColumn", 0);
        setField(term58536, term58536.getClass(), "rangeBounds", null);
        setField(term58536, term58536.getClass(), "group", null);
        setField(term58536, term58536.getClass(), "listenerList", null);
        term58537 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term58538 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term58538, term58538.getClass(), "rowKeys", null);
        setField(term58538, term58538.getClass(), "columnKeys", null);
        setField(term58538, term58538.getClass(), "rows", null);
        setField(term58537, term58537.getClass(), "data", term58538);
        setDoubleField(term58537, term58537.getClass(), "minimumRangeValue", 0.0);
        setIntField(term58537, term58537.getClass(), "minimumRangeValueRow", 0);
        setIntField(term58537, term58537.getClass(), "minimumRangeValueColumn", 0);
        setDoubleField(term58537, term58537.getClass(), "maximumRangeValue", 0.0);
        setIntField(term58537, term58537.getClass(), "maximumRangeValueRow", 0);
        setIntField(term58537, term58537.getClass(), "maximumRangeValueColumn", 0);
        setField(term58537, term58537.getClass(), "rangeBounds", null);
        setField(term58537, term58537.getClass(), "group", null);
        setField(term58537, term58537.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term58449;
        Object retValue = callMethod(klass, "equals", argTypes, term58321, args);
        assertTrue(recursiveEquals(term58321, term58536));
        assertTrue(recursiveEquals(term58449, term58537));
        assertTrue(recursiveEquals(retValue, false));
    }

};


