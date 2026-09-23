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
import java.lang.String;

public class DefaultIntervalCategoryDataset_getColumnIndex_188618859159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35419;
     Object enum12;
     Object term39888;
     Object enum13;

    public DefaultIntervalCategoryDataset_getColumnIndex_188618859159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35419 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term35294 = (Object[]) newArray("java.lang.Comparable", 489);
        setField(term35419, term35419.getClass(), "categoryKeys", term35294);
        Class<? extends Object> term39894 = Class.forName((String) "java.lang.StackWalker$Option");
        Field term39893 = ((Class) term39894).getDeclaredField((String) "RETAIN_CLASS_REFERENCE");
        ((Field) term39893).setAccessible(true);
        enum12 = ((Field) term39893).get((Object) null);
        term39888 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term39889 = (Object[]) newArray("java.lang.Comparable", 489);
        setField(term39888, term39888.getClass(), "seriesKeys", null);
        setField(term39888, term39888.getClass(), "categoryKeys", term39889);
        setField(term39888, term39888.getClass(), "startData", null);
        setField(term39888, term39888.getClass(), "endData", null);
        setField(term39888, term39888.getClass(), "group", null);
        setField(term39888, term39888.getClass(), "listenerList", null);
        Class<? extends Object> term40107 = Class.forName((String) "java.lang.StackWalker$Option");
        Field term40106 = ((Class) term40107).getDeclaredField((String) "RETAIN_CLASS_REFERENCE");
        ((Field) term40106).setAccessible(true);
        enum13 = ((Field) term40106).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = enum12;
        Object retValue = callMethod(klass, "getColumnIndex", argTypes, term35419, args);
        assertTrue(recursiveEquals(term35419, term39888));
        assertTrue(recursiveEquals(enum12, enum13));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


