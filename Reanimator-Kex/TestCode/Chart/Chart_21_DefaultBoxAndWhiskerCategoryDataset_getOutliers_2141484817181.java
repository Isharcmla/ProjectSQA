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
import java.lang.NullPointerException;
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DefaultBoxAndWhiskerCategoryDataset_getOutliers_2141484817181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40220;
     Object term40378;
     Object term40432;

    public DefaultBoxAndWhiskerCategoryDataset_getOutliers_2141484817181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40220 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term40284 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term40220, term40220.getClass(), "data", term40284);
        term40378 = newInstance(Class.forName("org.jfree.data.statistics.SimpleHistogramBin"));
        term40432 = newInstance(Class.forName("java.nio.HeapCharBufferR"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = term40378;
        args[1] = term40432;
        try {
            callMethod(klass, "getOutliers", argTypes, term40220, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


