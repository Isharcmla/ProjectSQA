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
import org.jfree.data.UnknownKeyException;
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Byte;

public class DefaultBoxAndWhiskerCategoryDataset_getOutliers_2141484817238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56180;
     Object enum22;
     Object term56410;

    public DefaultBoxAndWhiskerCategoryDataset_getOutliers_2141484817238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term56296 = new ArrayList();
        term56180 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term56244 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term56244, term56244.getClass(), "rowKeys", term56296);
        setField(term56180, term56180.getClass(), "data", term56244);
        Class<? extends Object> term57974 = Class.forName((String) "java.util.Locale$IsoCountryCode");
        Field term57973 = ((Class) term57974).getDeclaredField((String) "PART1_ALPHA2");
        ((Field) term57973).setAccessible(true);
        enum22 = ((Field) term57973).get((Object) null);
        term56410 = new Byte((byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = enum22;
        args[1] = term56410;
        try {
            callMethod(klass, "getOutliers", argTypes, term56180, args);
            assertTrue(false);
        }
        catch (UnknownKeyException e) {
        }

    }

};


