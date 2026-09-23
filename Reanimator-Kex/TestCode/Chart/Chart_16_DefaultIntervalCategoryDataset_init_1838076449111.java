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

public class DefaultIntervalCategoryDataset_init_1838076449111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21880;
     Object term22047;
     Object term22054;

    public DefaultIntervalCategoryDataset_init_1838076449111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22025 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        setField(term22025, term22025.getClass(), "group", null);
        setField(term22025, term22025.getClass(), "listenerList", null);
        setField(term22025, term22025.getClass(), "startData", null);
        setField(term22025, term22025.getClass(), "endData", null);
        term21880 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
        term22047 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term22048 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
        Object term22049 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term22052 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term22053 = (Object[]) newArray("java.lang.Object", 0);
        setField(term22047, term22047.getClass(), "seriesKeys", null);
        setField(term22047, term22047.getClass(), "categoryKeys", null);
        setField(term22047, term22047.getClass(), "startData", term22048);
        setField(term22047, term22047.getClass(), "endData", null);
        setField(term22049, term22049.getClass(), "id", "NOID");
        setField(term22047, term22047.getClass(), "group", term22049);
        setField(term22052, term22052.getClass(), "listenerList", term22053);
        setField(term22047, term22047.getClass(), "listenerList", term22052);
        term22054 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0).getClass();
        argTypes[3] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term21880;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22047));
        assertTrue(recursiveEquals(term21880, term22054));
    }

};


