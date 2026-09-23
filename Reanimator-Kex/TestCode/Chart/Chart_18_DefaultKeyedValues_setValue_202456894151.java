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

public class DefaultKeyedValues_setValue_202456894151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5273;
     Object enum1;

    public DefaultKeyedValues_setValue_202456894151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5273 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        Class<? extends Object> term5996 = Class.forName((String) "java.nio.file.AccessMode");
        Field term5995 = ((Class) term5996).getDeclaredField((String) "READ");
        ((Field) term5995).setAccessible(true);
        enum1 = ((Field) term5995).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = enum1;
        args[1] = null;
        try {
            callMethod(klass, "setValue", argTypes, term5273, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


