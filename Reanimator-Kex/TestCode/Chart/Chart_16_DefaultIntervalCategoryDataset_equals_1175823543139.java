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

public class DefaultIntervalCategoryDataset_equals_1175823543139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28187;
     Object term28191;
     Object term28192;

    public DefaultIntervalCategoryDataset_equals_1175823543139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28187 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        term28191 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        setField(term28191, term28191.getClass(), "seriesKeys", null);
        setField(term28191, term28191.getClass(), "categoryKeys", null);
        setField(term28191, term28191.getClass(), "startData", null);
        setField(term28191, term28191.getClass(), "endData", null);
        setField(term28191, term28191.getClass(), "group", null);
        setField(term28191, term28191.getClass(), "listenerList", null);
        term28192 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        setField(term28192, term28192.getClass(), "seriesKeys", null);
        setField(term28192, term28192.getClass(), "categoryKeys", null);
        setField(term28192, term28192.getClass(), "startData", null);
        setField(term28192, term28192.getClass(), "endData", null);
        setField(term28192, term28192.getClass(), "group", null);
        setField(term28192, term28192.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term28187;
        Object retValue = callMethod(klass, "equals", argTypes, term28187, args);
        assertTrue(recursiveEquals(term28187, term28191));
        assertTrue(recursiveEquals(term28187, term28192));
        assertTrue(recursiveEquals(retValue, true));
    }

};


