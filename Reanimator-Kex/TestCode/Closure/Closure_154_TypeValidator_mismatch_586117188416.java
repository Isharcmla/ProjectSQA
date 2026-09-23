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

public class TypeValidator_mismatch_586117188416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193877;
     Object term194167;
     Object enum84;

    public TypeValidator_mismatch_586117188416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193877 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term193981 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term193595 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        Object term194077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setElement(term193595, 0, term194077);
        setField(term193981, term193981.getClass(), "nativeTypes", term193595);
        setField(term193877, term193877.getClass(), "typeRegistry", term193981);
        term194167 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Class<? extends Object> term194874 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term194873 = ((Class) term194874).getDeclaredField((String) "ARRAY_TYPE");
        ((Field) term194873).setAccessible(true);
        enum84 = ((Field) term194873).get((Object) null);
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
        args[0] = term194167;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = enum84;
        try {
            callMethod(klass, "mismatch", argTypes, term193877, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


