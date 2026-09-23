package org.jfree.data;

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
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KeyedObjects2D_addObject_195538428161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11391;
     Object term11467;

    public KeyedObjects2D_addObject_195538428161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11391 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        term11467 = newInstance(Class.forName("org.jfree.data.xy.XIntervalDataItem"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term11467;
        args[2] = null;
        try {
            callMethod(klass, "addObject", argTypes, term11391, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


