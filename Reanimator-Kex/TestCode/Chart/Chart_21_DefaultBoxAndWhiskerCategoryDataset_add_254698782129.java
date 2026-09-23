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

public class DefaultBoxAndWhiskerCategoryDataset_add_254698782129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23902;
     Object enum5;

    public DefaultBoxAndWhiskerCategoryDataset_add_254698782129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23902 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term23966 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term23902, term23902.getClass(), "data", term23966);
        Class<? extends Object> term27746 = Class.forName((String) "java.lang.invoke.LambdaForm$Kind");
        Field term27745 = ((Class) term27746).getDeclaredField((String) "GENERIC");
        ((Field) term27745).setAccessible(true);
        enum5 = ((Field) term27745).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.data.statistics.BoxAndWhiskerItem");
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = enum5;
        args[2] = null;
        try {
            callMethod(klass, "add", argTypes, term23902, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


