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

public class DefaultKeyedValues2D_removeValue_102645854283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12335;
     Object enum5;

    public DefaultKeyedValues2D_removeValue_102645854283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12335 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setBooleanField(term12335, term12335.getClass(), "sortRowKeys", true);
        Class<? extends Object> term12954 = Class.forName((String) "java.lang.module.ModuleDescriptor$Modifier");
        Field term12953 = ((Class) term12954).getDeclaredField((String) "OPEN");
        ((Field) term12953).setAccessible(true);
        enum5 = ((Field) term12953).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = enum5;
        args[1] = null;
        try {
            callMethod(klass, "removeValue", argTypes, term12335, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


