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
import java.lang.String;

public class DefaultBoxAndWhiskerCategoryDataset_getMaxRegularValue_34494220891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15204;
     Object enum3;

    public DefaultBoxAndWhiskerCategoryDataset_getMaxRegularValue_34494220891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15204 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term15268 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term15204, term15204.getClass(), "data", term15268);
        Class<? extends Object> term16066 = Class.forName((String) "java.util.Locale$IsoCountryCode");
        Field term16065 = ((Class) term16066).getDeclaredField((String) "PART1_ALPHA2");
        ((Field) term16065).setAccessible(true);
        enum3 = ((Field) term16065).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = enum3;
        args[1] = null;
        try {
            callMethod(klass, "getMaxRegularValue", argTypes, term15204, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


