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
import java.lang.String;

public class DefaultBoxAndWhiskerCategoryDataset_getMaxOutlier_801195673175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38092;
     Object term38228;
     Object enum7;

    public DefaultBoxAndWhiskerCategoryDataset_getMaxOutlier_801195673175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38092 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term38156 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term38092, term38092.getClass(), "data", term38156);
        term38228 = newInstance(Class.forName("org.jfree.data.time.ohlc.OHLCItem"));
        Class<? extends Object> term38897 = Class.forName((String) "java.lang.module.ModuleDescriptor$Exports$Modifier");
        Field term38896 = ((Class) term38897).getDeclaredField((String) "SYNTHETIC");
        ((Field) term38896).setAccessible(true);
        enum7 = ((Field) term38896).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = term38228;
        args[1] = enum7;
        try {
            callMethod(klass, "getMaxOutlier", argTypes, term38092, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


