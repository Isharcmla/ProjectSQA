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

public class KeyedObjects2D_getObject_8114537445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4354;
     Object enum1;

    public KeyedObjects2D_getObject_8114537445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4354 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Class<? extends Object> term8131 = Class.forName((String) "java.lang.invoke.LambdaForm$Kind");
        Field term8130 = ((Class) term8131).getDeclaredField((String) "GENERIC");
        ((Field) term8130).setAccessible(true);
        enum1 = ((Field) term8130).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = enum1;
        args[1] = null;
        try {
            callMethod(klass, "getObject", argTypes, term4354, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


