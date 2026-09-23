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

public class DefaultIntervalCategoryDataset_equals_1175823543165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41634;
     Object term41802;
     Object term42820;
     Object term42823;

    public DefaultIntervalCategoryDataset_equals_1175823543165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41634 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term41490 = (Object[]) newArray("java.lang.Comparable", 50);
        Object term41688 = newInstance(Class.forName("java.nio.HeapFloatBuffer"));
        setElement(term41490, 0, term41688);
        setElement(term41490, 1, term41688);
        setElement(term41490, 2, term41688);
        setElement(term41490, 3, term41688);
        setElement(term41490, 4, term41688);
        setElement(term41490, 5, term41688);
        setElement(term41490, 6, term41688);
        setElement(term41490, 7, term41688);
        setElement(term41490, 8, term41688);
        setElement(term41490, 9, term41688);
        setElement(term41490, 10, term41688);
        setElement(term41490, 11, term41688);
        setElement(term41490, 12, term41688);
        setElement(term41490, 13, term41688);
        setElement(term41490, 14, term41688);
        setElement(term41490, 15, term41688);
        setElement(term41490, 16, term41688);
        setElement(term41490, 17, term41688);
        setElement(term41490, 18, term41688);
        setElement(term41490, 19, term41688);
        setElement(term41490, 20, term41688);
        setElement(term41490, 21, term41688);
        setElement(term41490, 22, term41688);
        setElement(term41490, 23, term41688);
        setElement(term41490, 24, term41688);
        setElement(term41490, 25, term41688);
        setElement(term41490, 26, term41688);
        setElement(term41490, 27, term41688);
        setElement(term41490, 28, term41688);
        setElement(term41490, 29, term41688);
        setElement(term41490, 30, term41688);
        setElement(term41490, 31, term41688);
        setElement(term41490, 32, term41688);
        setElement(term41490, 33, term41688);
        setElement(term41490, 34, term41688);
        setElement(term41490, 35, term41688);
        setElement(term41490, 36, term41688);
        setElement(term41490, 37, term41688);
        setElement(term41490, 38, term41688);
        setElement(term41490, 39, term41688);
        setElement(term41490, 40, term41688);
        setElement(term41490, 41, term41688);
        setElement(term41490, 42, term41688);
        setElement(term41490, 43, term41688);
        setElement(term41490, 44, term41688);
        setElement(term41490, 45, term41688);
        setElement(term41490, 46, term41688);
        setElement(term41490, 47, term41688);
        setElement(term41490, 48, term41688);
        setElement(term41490, 49, term41688);
        setField(term41634, term41634.getClass(), "seriesKeys", term41490);
        term41802 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        setField(term41802, term41802.getClass(), "seriesKeys", null);
        term42820 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term42821 = (Object[]) newArray("java.lang.Comparable", 50);
        Object term42822 = newInstance(Class.forName("java.nio.HeapFloatBuffer"));
        setField(term42822, term42822.getClass(), "hb", null);
        setIntField(term42822, term42822.getClass(), "offset", 0);
        setBooleanField(term42822, term42822.getClass(), "isReadOnly", false);
        setIntField(term42822, term42822.getClass(), "mark", 0);
        setIntField(term42822, term42822.getClass(), "position", 0);
        setIntField(term42822, term42822.getClass(), "limit", 0);
        setIntField(term42822, term42822.getClass(), "capacity", 0);
        setLongField(term42822, term42822.getClass(), "address", 0L);
        setElement(term42821, 0, term42822);
        setElement(term42821, 1, term42822);
        setElement(term42821, 2, term42822);
        setElement(term42821, 3, term42822);
        setElement(term42821, 4, term42822);
        setElement(term42821, 5, term42822);
        setElement(term42821, 6, term42822);
        setElement(term42821, 7, term42822);
        setElement(term42821, 8, term42822);
        setElement(term42821, 9, term42822);
        setElement(term42821, 10, term42822);
        setElement(term42821, 11, term42822);
        setElement(term42821, 12, term42822);
        setElement(term42821, 13, term42822);
        setElement(term42821, 14, term42822);
        setElement(term42821, 15, term42822);
        setElement(term42821, 16, term42822);
        setElement(term42821, 17, term42822);
        setElement(term42821, 18, term42822);
        setElement(term42821, 19, term42822);
        setElement(term42821, 20, term42822);
        setElement(term42821, 21, term42822);
        setElement(term42821, 22, term42822);
        setElement(term42821, 23, term42822);
        setElement(term42821, 24, term42822);
        setElement(term42821, 25, term42822);
        setElement(term42821, 26, term42822);
        setElement(term42821, 27, term42822);
        setElement(term42821, 28, term42822);
        setElement(term42821, 29, term42822);
        setElement(term42821, 30, term42822);
        setElement(term42821, 31, term42822);
        setElement(term42821, 32, term42822);
        setElement(term42821, 33, term42822);
        setElement(term42821, 34, term42822);
        setElement(term42821, 35, term42822);
        setElement(term42821, 36, term42822);
        setElement(term42821, 37, term42822);
        setElement(term42821, 38, term42822);
        setElement(term42821, 39, term42822);
        setElement(term42821, 40, term42822);
        setElement(term42821, 41, term42822);
        setElement(term42821, 42, term42822);
        setElement(term42821, 43, term42822);
        setElement(term42821, 44, term42822);
        setElement(term42821, 45, term42822);
        setElement(term42821, 46, term42822);
        setElement(term42821, 47, term42822);
        setElement(term42821, 48, term42822);
        setElement(term42821, 49, term42822);
        setField(term42820, term42820.getClass(), "seriesKeys", term42821);
        setField(term42820, term42820.getClass(), "categoryKeys", null);
        setField(term42820, term42820.getClass(), "startData", null);
        setField(term42820, term42820.getClass(), "endData", null);
        setField(term42820, term42820.getClass(), "group", null);
        setField(term42820, term42820.getClass(), "listenerList", null);
        term42823 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        setField(term42823, term42823.getClass(), "seriesKeys", null);
        setField(term42823, term42823.getClass(), "categoryKeys", null);
        setField(term42823, term42823.getClass(), "startData", null);
        setField(term42823, term42823.getClass(), "endData", null);
        setField(term42823, term42823.getClass(), "group", null);
        setField(term42823, term42823.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term41802;
        Object retValue = callMethod(klass, "equals", argTypes, term41634, args);
        assertTrue(recursiveEquals(term41634, term42820));
        assertTrue(recursiveEquals(term41802, term42823));
        assertTrue(recursiveEquals(retValue, false));
    }

};


