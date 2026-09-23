package org.jfree.data.category;

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
import static org.jfree.data.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.category.EqualityUtils.*;
import java.lang.Object;

public class DefaultIntervalCategoryDataset_equals_1175823543176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62795;
     Object term62909;
     Object term62928;
     Object term62941;

    public DefaultIntervalCategoryDataset_equals_1175823543176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62795 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term62640 = (Object[]) newArray("java.lang.Comparable", 0);
        Object[] term62642 = (Object[]) newArray("java.lang.Comparable", 0);
        Object[] term62644 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 9);
        Object[] term62645 = (Object[]) newArray("java.lang.Number", 0);
        setField(term62795, term62795.getClass(), "seriesKeys", term62640);
        setField(term62795, term62795.getClass(), "categoryKeys", term62642);
        setElement(term62644, 0, term62645);
        setElement(term62644, 1, term62645);
        setElement(term62644, 2, term62645);
        setElement(term62644, 3, term62645);
        setElement(term62644, 4, term62645);
        setElement(term62644, 5, term62645);
        setElement(term62644, 6, term62645);
        setElement(term62644, 7, term62645);
        setElement(term62644, 8, term62645);
        setField(term62795, term62795.getClass(), "startData", term62644);
        term62909 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        setField(term62909, term62909.getClass(), "seriesKeys", null);
        setField(term62909, term62909.getClass(), "categoryKeys", null);
        setField(term62909, term62909.getClass(), "startData", null);
        term62928 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term62929 = (Object[]) newArray("java.lang.Comparable", 0);
        Object[] term62930 = (Object[]) newArray("java.lang.Comparable", 0);
        Object[] term62931 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 9);
        Object[] term62932 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term62933 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term62934 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term62935 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term62936 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term62937 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term62938 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term62939 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term62940 = (Object[]) newArray("java.lang.Number", 0);
        setField(term62928, term62928.getClass(), "seriesKeys", term62929);
        setField(term62928, term62928.getClass(), "categoryKeys", term62930);
        setElement(term62931, 0, term62932);
        setElement(term62931, 1, term62933);
        setElement(term62931, 2, term62934);
        setElement(term62931, 3, term62935);
        setElement(term62931, 4, term62936);
        setElement(term62931, 5, term62937);
        setElement(term62931, 6, term62938);
        setElement(term62931, 7, term62939);
        setElement(term62931, 8, term62940);
        setField(term62928, term62928.getClass(), "startData", term62931);
        setField(term62928, term62928.getClass(), "endData", null);
        setField(term62928, term62928.getClass(), "group", null);
        setField(term62928, term62928.getClass(), "listenerList", null);
        term62941 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        setField(term62941, term62941.getClass(), "seriesKeys", null);
        setField(term62941, term62941.getClass(), "categoryKeys", null);
        setField(term62941, term62941.getClass(), "startData", null);
        setField(term62941, term62941.getClass(), "endData", null);
        setField(term62941, term62941.getClass(), "group", null);
        setField(term62941, term62941.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term62909;
        Object retValue = callMethod(klass, "equals", argTypes, term62795, args);
        assertTrue(recursiveEquals(term62795, term62928));
        assertTrue(recursiveEquals(term62909, term62941));
        assertTrue(recursiveEquals(retValue, false));
    }

};


