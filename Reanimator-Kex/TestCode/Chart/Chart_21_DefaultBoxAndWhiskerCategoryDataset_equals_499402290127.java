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

public class DefaultBoxAndWhiskerCategoryDataset_equals_499402290127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23632;
     Object term23760;
     Object term27198;
     Object term27199;

    public DefaultBoxAndWhiskerCategoryDataset_equals_499402290127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23632 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        term23760 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        term27198 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        setField(term27198, term27198.getClass(), "data", null);
        setDoubleField(term27198, term27198.getClass(), "minimumRangeValue", 0.0);
        setIntField(term27198, term27198.getClass(), "minimumRangeValueRow", 0);
        setIntField(term27198, term27198.getClass(), "minimumRangeValueColumn", 0);
        setDoubleField(term27198, term27198.getClass(), "maximumRangeValue", 0.0);
        setIntField(term27198, term27198.getClass(), "maximumRangeValueRow", 0);
        setIntField(term27198, term27198.getClass(), "maximumRangeValueColumn", 0);
        setField(term27198, term27198.getClass(), "rangeBounds", null);
        setField(term27198, term27198.getClass(), "group", null);
        setField(term27198, term27198.getClass(), "listenerList", null);
        term27199 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        setField(term27199, term27199.getClass(), "data", null);
        setDoubleField(term27199, term27199.getClass(), "minimumRangeValue", 0.0);
        setIntField(term27199, term27199.getClass(), "minimumRangeValueRow", 0);
        setIntField(term27199, term27199.getClass(), "minimumRangeValueColumn", 0);
        setDoubleField(term27199, term27199.getClass(), "maximumRangeValue", 0.0);
        setIntField(term27199, term27199.getClass(), "maximumRangeValueRow", 0);
        setIntField(term27199, term27199.getClass(), "maximumRangeValueColumn", 0);
        setField(term27199, term27199.getClass(), "rangeBounds", null);
        setField(term27199, term27199.getClass(), "group", null);
        setField(term27199, term27199.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23760;
        Object retValue = callMethod(klass, "equals", argTypes, term23632, args);
        assertTrue(recursiveEquals(term23632, term27198));
        assertTrue(recursiveEquals(term23760, term27199));
        assertTrue(recursiveEquals(retValue, true));
    }

};


