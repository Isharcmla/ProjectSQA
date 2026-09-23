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

public class DefaultBoxAndWhiskerCategoryDataset_getMedianValue_99625467081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11970;
     Object term12110;

    public DefaultBoxAndWhiskerCategoryDataset_getMedianValue_99625467081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11970 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term12034 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term11970, term11970.getClass(), "data", term12034);
        term12110 = newInstance(Class.forName("org.jfree.data.xy.XIntervalDataItem"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = term12110;
        args[1] = null;
        try {
            callMethod(klass, "getMedianValue", argTypes, term11970, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


