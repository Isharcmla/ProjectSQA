package org.mockito.internal.configuration;

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
import static org.mockito.internal.configuration.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class SpyAnnotationEngine_assertNoAnnotations_13720361647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347;
     Object term348;
     Object term481;

    public SpyAnnotationEngine_assertNoAnnotations_13720361647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term347 = newInstance(Class.forName("org.mockito.internal.configuration.SpyAnnotationEngine"));
        Class<? extends Object> term1438 = Class.forName((String) "org.objenesis.instantiator.basic.ProxyingInstantiator");
        term348 = ((Class) term1438).getDeclaredField((String) "INDEX_UTF8_CONSTRUCTOR_NAME");
        ((Field) term348).setAccessible(true);
        term481 = (Object[]) newArray("java.lang.Class", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.configuration.SpyAnnotationEngine");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.lang.reflect.Field");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Class"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term348;
        args[2] = term481;
        try {
            callMethod(klass, "assertNoAnnotations", argTypes, term347, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


