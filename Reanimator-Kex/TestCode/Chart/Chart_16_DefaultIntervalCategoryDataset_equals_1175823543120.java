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

public class DefaultIntervalCategoryDataset_equals_1175823543120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23213;
     Object term23327;
     Object term23493;
     Object term23494;

    public DefaultIntervalCategoryDataset_equals_1175823543120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23213 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        term23327 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        term23493 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        setField(term23493, term23493.getClass(), "seriesKeys", null);
        setField(term23493, term23493.getClass(), "categoryKeys", null);
        setField(term23493, term23493.getClass(), "startData", null);
        setField(term23493, term23493.getClass(), "endData", null);
        setField(term23493, term23493.getClass(), "group", null);
        setField(term23493, term23493.getClass(), "listenerList", null);
        term23494 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        setField(term23494, term23494.getClass(), "seriesKeys", null);
        setField(term23494, term23494.getClass(), "categoryKeys", null);
        setField(term23494, term23494.getClass(), "startData", null);
        setField(term23494, term23494.getClass(), "endData", null);
        setField(term23494, term23494.getClass(), "group", null);
        setField(term23494, term23494.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23327;
        Object retValue = callMethod(klass, "equals", argTypes, term23213, args);
        assertTrue(recursiveEquals(term23213, term23493));
        assertTrue(recursiveEquals(term23327, term23494));
        assertTrue(recursiveEquals(retValue, true));
    }

};


