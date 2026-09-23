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
import java.util.ArrayList;

public class DefaultIntervalCategoryDataset_getColumnKeys_1023460135154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29545;
     Object term37259;
     Object term37254;

    public DefaultIntervalCategoryDataset_getColumnKeys_1023460135154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29545 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        setField(term29545, term29545.getClass(), "categoryKeys", null);
        term37259 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        setField(term37259, term37259.getClass(), "seriesKeys", null);
        setField(term37259, term37259.getClass(), "categoryKeys", null);
        setField(term37259, term37259.getClass(), "startData", null);
        setField(term37259, term37259.getClass(), "endData", null);
        setField(term37259, term37259.getClass(), "group", null);
        setField(term37259, term37259.getClass(), "listenerList", null);
        term37254 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getColumnKeys", argTypes, term29545, args);
        assertTrue(recursiveEquals(term29545, term37259));
        assertTrue(recursiveEquals(retValue, term37254));
    }

};


