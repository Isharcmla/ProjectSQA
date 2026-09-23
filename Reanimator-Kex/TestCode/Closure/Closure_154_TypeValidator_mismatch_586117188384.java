package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TypeValidator_mismatch_586117188384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159082;
     Object enum44;

    public TypeValidator_mismatch_586117188384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159082 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term159186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term158810 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term159292 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term159384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setElement(term158810, 0, term159292);
        setElement(term158810, 1, term159384);
        setField(term159186, term159186.getClass(), "nativeTypes", term158810);
        setField(term159082, term159082.getClass(), "typeRegistry", term159186);
        Class<? extends Object> term160088 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term160087 = ((Class) term160088).getDeclaredField((String) "ARRAY_TYPE");
        ((Field) term160087).setAccessible(true);
        enum44 = ((Field) term160087).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = enum44;
        try {
            callMethod(klass, "mismatch", argTypes, term159082, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


