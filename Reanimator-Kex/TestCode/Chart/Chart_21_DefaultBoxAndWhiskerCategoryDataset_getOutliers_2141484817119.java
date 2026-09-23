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
import java.lang.Object;

public class DefaultBoxAndWhiskerCategoryDataset_getOutliers_2141484817119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21667;
     Object term21789;

    public DefaultBoxAndWhiskerCategoryDataset_getOutliers_2141484817119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21667 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term21731 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term21667, term21667.getClass(), "data", term21731);
        term21789 = newInstance(Class.forName("java.nio.DirectIntBufferRS"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = term21789;
        args[1] = null;
        try {
            callMethod(klass, "getOutliers", argTypes, term21667, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


