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

public class FunctionType_getAllImplementedInterfaces_572683533431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337896;

    public FunctionType_getAllImplementedInterfaces_572683533431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term339334 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term339333 = ((Class) term339334).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term339333).setAccessible(true);
        Object enum582 = ((Field) term339333).get((Object) null);
        Object term338352 = newInstance(Class.forName("java.lang.Object"));
        Object term338390 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term338314 = new ArrayList();
        ((ArrayList) term338314).add(term338352);
        ((ArrayList) term338314).add(term338390);
        term337896 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term338162 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term338262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term337896, term337896.getClass(), "kind", enum582);
        setField(term338162, term338162.getClass(), "implicitPrototypeFallback", term338262);
        setField(term337896, term337896.getClass(), "prototype", term338162);
        setField(term337896, term337896.getClass(), "implementedInterfaces", term338314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term337896, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


