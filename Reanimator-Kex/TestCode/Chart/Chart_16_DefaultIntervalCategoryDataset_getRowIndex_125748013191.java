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

public class DefaultIntervalCategoryDataset_getRowIndex_125748013191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16457;
     Object term18285;

    public DefaultIntervalCategoryDataset_getRowIndex_125748013191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16457 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term16332 = (Object[]) newArray("java.lang.Comparable", 0);
        setField(term16457, term16457.getClass(), "seriesKeys", term16332);
        term18285 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term18286 = (Object[]) newArray("java.lang.Comparable", 0);
        setField(term18285, term18285.getClass(), "seriesKeys", term18286);
        setField(term18285, term18285.getClass(), "categoryKeys", null);
        setField(term18285, term18285.getClass(), "startData", null);
        setField(term18285, term18285.getClass(), "endData", null);
        setField(term18285, term18285.getClass(), "group", null);
        setField(term18285, term18285.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getRowIndex", argTypes, term16457, args);
        assertTrue(recursiveEquals(term16457, term18285));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


