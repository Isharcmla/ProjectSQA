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
import java.util.ArrayList;
import java.lang.String;

public class DefaultBoxAndWhiskerCategoryDataset_getMedianValue_996254670216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50784;
     Object term50962;
     Object enum18;

    public DefaultBoxAndWhiskerCategoryDataset_getMedianValue_996254670216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term50900 = new ArrayList();
        term50784 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term50848 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term50848, term50848.getClass(), "rowKeys", term50900);
        setField(term50784, term50784.getClass(), "data", term50848);
        term50962 = newInstance(Class.forName("org.jfree.data.xy.XYDataItem"));
        Class<? extends Object> term51495 = Class.forName((String) "java.util.Locale$IsoCountryCode");
        Field term51494 = ((Class) term51495).getDeclaredField((String) "PART1_ALPHA2");
        ((Field) term51494).setAccessible(true);
        enum18 = ((Field) term51494).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = term50962;
        args[1] = enum18;
        try {
            callMethod(klass, "getMedianValue", argTypes, term50784, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


