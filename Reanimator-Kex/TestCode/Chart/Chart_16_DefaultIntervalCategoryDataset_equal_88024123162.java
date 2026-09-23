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

public class DefaultIntervalCategoryDataset_equal_88024123162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term921;
     Object term928;
     Object term9426;
     Object term9433;

    public DefaultIntervalCategoryDataset_equal_88024123162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term921 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 6);
        Object[] term922 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term923 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term924 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term925 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term926 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term927 = (Object[]) newArray("java.lang.Number", 5);
        setElement(term921, 0, term922);
        setElement(term921, 1, term923);
        setElement(term921, 2, term924);
        setElement(term921, 3, term925);
        setElement(term921, 4, term926);
        setElement(term921, 5, term927);
        term928 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
        term9426 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 6);
        Object[] term9427 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term9428 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term9429 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term9430 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term9431 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term9432 = (Object[]) newArray("java.lang.Number", 5);
        setElement(term9426, 0, term9427);
        setElement(term9426, 1, term9428);
        setElement(term9426, 2, term9429);
        setElement(term9426, 3, term9430);
        setElement(term9426, 4, term9431);
        setElement(term9426, 5, term9432);
        term9433 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0).getClass();
        argTypes[1] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term921;
        args[1] = term928;
        Object retValue = callMethod(klass, "equal", argTypes, null, args);
        assertTrue(recursiveEquals(term921, term9426));
        assertTrue(recursiveEquals(term928, term9433));
        assertTrue(recursiveEquals(retValue, false));
    }

};


