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
import java.lang.String;
import java.lang.Object;

public class KeyedObjects2D_setObject_62401705051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8956;
     Object enum3;

    public KeyedObjects2D_setObject_62401705051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8956 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Class<? extends Object> term9877 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term9876 = ((Class) term9877).getDeclaredField((String) "NANOSECONDS");
        ((Field) term9876).setAccessible(true);
        enum3 = ((Field) term9876).get((Object) null);
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
        args[1] = enum3;
        args[2] = null;
        try {
            callMethod(klass, "setObject", argTypes, term8956, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


