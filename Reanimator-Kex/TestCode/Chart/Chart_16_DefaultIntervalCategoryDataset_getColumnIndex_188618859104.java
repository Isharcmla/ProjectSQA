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
import java.lang.NullPointerException;
import static org.jfree.data.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DefaultIntervalCategoryDataset_getColumnIndex_188618859104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20142;
     Object term20214;

    public DefaultIntervalCategoryDataset_getColumnIndex_188618859104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20142 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        term20214 = newInstance(Class.forName("org.jfree.chart.axis.DateTickUnit"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = term20214;
        try {
            callMethod(klass, "getColumnIndex", argTypes, term20142, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


