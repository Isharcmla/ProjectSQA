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

public class DefaultIntervalCategoryDataset_init_1531871137121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23329;
     Object term23517;
     Object term23524;

    public DefaultIntervalCategoryDataset_init_1531871137121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23477 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term23338 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
        Object[] term23339 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
        setField(term23477, term23477.getClass(), "group", null);
        setField(term23477, term23477.getClass(), "listenerList", null);
        setField(term23477, term23477.getClass(), "startData", term23338);
        setField(term23477, term23477.getClass(), "endData", term23339);
        term23329 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
        term23517 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term23518 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
        Object term23519 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term23522 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term23523 = (Object[]) newArray("java.lang.Object", 0);
        setField(term23517, term23517.getClass(), "seriesKeys", null);
        setField(term23517, term23517.getClass(), "categoryKeys", null);
        setField(term23517, term23517.getClass(), "startData", term23518);
        setField(term23517, term23517.getClass(), "endData", null);
        setField(term23519, term23519.getClass(), "id", "NOID");
        setField(term23517, term23517.getClass(), "group", term23519);
        setField(term23522, term23522.getClass(), "listenerList", term23523);
        setField(term23517, term23517.getClass(), "listenerList", term23522);
        term23524 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0).getClass();
        argTypes[1] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term23329;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23517));
        assertTrue(recursiveEquals(term23329, term23524));
    }

};


