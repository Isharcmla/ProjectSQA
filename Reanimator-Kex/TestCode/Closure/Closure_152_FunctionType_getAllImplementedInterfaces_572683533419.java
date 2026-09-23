package com.google.javascript.rhino.jstype;

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
import java.lang.ClassCastException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class FunctionType_getAllImplementedInterfaces_572683533419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335643;

    public FunctionType_getAllImplementedInterfaces_572683533419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term336910 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term336909 = ((Class) term336910).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term336909).setAccessible(true);
        Object enum574 = ((Field) term336909).get((Object) null);
        Object term335999 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term335961 = new ArrayList();
        ((ArrayList) term335961).add(term335999);
        term335643 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term335909 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term335643, term335643.getClass(), "kind", enum574);
        setField(term335909, term335909.getClass(), "implicitPrototypeFallback", null);
        setField(term335643, term335643.getClass(), "prototype", term335909);
        setField(term335643, term335643.getClass(), "implementedInterfaces", term335961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term335643, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


