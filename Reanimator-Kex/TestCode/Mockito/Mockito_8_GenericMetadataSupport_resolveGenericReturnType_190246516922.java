package org.mockito.internal.util.reflection;

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
import static org.mockito.internal.util.reflection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class GenericMetadataSupport_resolveGenericReturnType_190246516922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;

    public GenericMetadataSupport_resolveGenericReturnType_190246516922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3483 = Class.forName((String) "java.util.stream.ReduceOps$CountingSink$OfDouble");
        Class term3708 = double.class;
        Object[] term3709 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term3709, 0, term3708);
        term2 = ((Class) term3483).getDeclaredMethod((String) "accept", (Class[]) term3709);
        ((Method) term2).setAccessible(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.util.reflection.GenericMetadataSupport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Method");
        Object[] args = new Object[1];
        args[0] = term2;
        try {
            callMethod(klass, "resolveGenericReturnType", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


