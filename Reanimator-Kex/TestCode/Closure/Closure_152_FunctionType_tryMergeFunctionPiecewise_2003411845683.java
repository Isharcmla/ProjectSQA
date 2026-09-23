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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_tryMergeFunctionPiecewise_2003411845683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term707528;
     Object term708224;

    public FunctionType_tryMergeFunctionPiecewise_2003411845683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term709652 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term709651 = ((Class) term709652).getDeclaredField((String) "INTERFACE");
        ((Field) term709651).setAccessible(true);
        Object enum1077 = ((Field) term709651).get((Object) null);
        term707528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term707622 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term707692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term707762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term707862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term708114 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term707762, term707762.getClass(), "jsType", null);
        setField(term707762, term707762.getClass(), "next", null);
        setField(term707692, term707692.getClass(), "first", term707762);
        setField(term707622, term707622.getClass(), "parameters", term707692);
        setField(term707862, term707862.getClass(), "kind", enum1077);
        setField(term707862, term707862.getClass(), "registry", term708114);
        setField(term707622, term707622.getClass(), "returnType", term707862);
        setField(term707528, term707528.getClass(), "call", term707622);
        Class<? extends Object> term709946 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term709945 = ((Class) term709946).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term709945).setAccessible(true);
        Object enum1078 = ((Field) term709945).get((Object) null);
        term708224 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term708318 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term708388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term708458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term708568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term708458, term708458.getClass(), "jsType", null);
        setField(term708458, term708458.getClass(), "next", null);
        setField(term708388, term708388.getClass(), "first", term708458);
        setField(term708318, term708318.getClass(), "parameters", term708388);
        setField(term708568, term708568.getClass(), "kind", enum1078);
        setField(term708318, term708318.getClass(), "returnType", term708568);
        setField(term708224, term708224.getClass(), "call", term708318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term708224;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term707528, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


