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

public class DefaultIntervalCategoryDataset_getCategoryIndex_127104449969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10258;
     Object term10591;

    public DefaultIntervalCategoryDataset_getCategoryIndex_127104449969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10258 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term10133 = (Object[]) newArray("java.lang.Comparable", 0);
        setField(term10258, term10258.getClass(), "categoryKeys", term10133);
        term10591 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term10592 = (Object[]) newArray("java.lang.Comparable", 0);
        setField(term10591, term10591.getClass(), "seriesKeys", null);
        setField(term10591, term10591.getClass(), "categoryKeys", term10592);
        setField(term10591, term10591.getClass(), "startData", null);
        setField(term10591, term10591.getClass(), "endData", null);
        setField(term10591, term10591.getClass(), "group", null);
        setField(term10591, term10591.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getCategoryIndex", argTypes, term10258, args);
        assertTrue(recursiveEquals(term10258, term10591));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


