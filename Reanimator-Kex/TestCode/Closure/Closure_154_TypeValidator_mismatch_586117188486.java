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

public class TypeValidator_mismatch_586117188486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251301;
     Object term251587;
     Object term251699;
     Object enum148;

    public TypeValidator_mismatch_586117188486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251301 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term251405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term251018 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        Object term251497 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setElement(term251018, 0, term251497);
        setField(term251405, term251405.getClass(), "nativeTypes", term251018);
        setField(term251301, term251301.getClass(), "typeRegistry", term251405);
        term251587 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term251587, term251587.getClass(), "sourceName", null);
        term251699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Class<? extends Object> term252405 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term252404 = ((Class) term252405).getDeclaredField((String) "ARRAY_TYPE");
        ((Field) term252404).setAccessible(true);
        enum148 = ((Field) term252404).get((Object) null);
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
        args[0] = term251587;
        args[1] = null;
        args[2] = null;
        args[3] = term251699;
        args[4] = enum148;
        try {
            callMethod(klass, "mismatch", argTypes, term251301, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


