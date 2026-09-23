package org.jfree.data.statistics;

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
import java.lang.IllegalArgumentException;
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DefaultBoxAndWhiskerCategoryDataset_add_120033744776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2192;

    public DefaultBoxAndWhiskerCategoryDataset_add_120033744776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2192 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        setField(term2192, term2192.getClass(), "data", null);
        setDoubleField(term2192, term2192.getClass(), "minimumRangeValue", 0.0);
        setIntField(term2192, term2192.getClass(), "minimumRangeValueRow", 0);
        setIntField(term2192, term2192.getClass(), "minimumRangeValueColumn", 0);
        setDoubleField(term2192, term2192.getClass(), "maximumRangeValue", 0.0);
        setIntField(term2192, term2192.getClass(), "maximumRangeValueRow", 0);
        setIntField(term2192, term2192.getClass(), "maximumRangeValueColumn", 0);
        setField(term2192, term2192.getClass(), "rangeBounds", null);
        setField(term2192, term2192.getClass(), "group", null);
        setField(term2192, term2192.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "add", argTypes, term2192, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


