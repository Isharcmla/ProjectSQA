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
import java.lang.NullPointerException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class KeyedObjects2D_removeObject_137307733179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14801;
     Object enum5;

    public KeyedObjects2D_removeObject_137307733179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14801 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Class<? extends Object> term15400 = Class.forName((String) "java.util.Locale$IsoCountryCode");
        Field term15399 = ((Class) term15400).getDeclaredField((String) "PART1_ALPHA2");
        ((Field) term15399).setAccessible(true);
        enum5 = ((Field) term15399).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = enum5;
        args[1] = enum5;
        try {
            callMethod(klass, "removeObject", argTypes, term14801, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


