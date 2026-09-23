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

public class DefaultKeyedValues2D_removeValue_102645854256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5645;
     Object enum2;

    public DefaultKeyedValues2D_removeValue_102645854256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5645 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        Class<? extends Object> term7320 = Class.forName((String) "java.util.Locale$Category");
        Field term7319 = ((Class) term7320).getDeclaredField((String) "DISPLAY");
        ((Field) term7319).setAccessible(true);
        enum2 = ((Field) term7319).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = enum2;
        args[1] = null;
        try {
            callMethod(klass, "removeValue", argTypes, term5645, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


