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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class FunctionType_getTypeOfThis_433401205143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70048;
     Object term70416;
     Object term70406;

    public FunctionType_getTypeOfThis_433401205143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70048 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term70148 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term70048, term70048.getClass(), "typeOfThis", term70148);
        term70416 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term70417 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term70416, term70416.getClass(), "call", null);
        setField(term70416, term70416.getClass(), "prototype", null);
        setField(term70416, term70416.getClass(), "kind", null);
        setField(term70417, term70417.getClass(), "call", null);
        setField(term70417, term70417.getClass(), "prototype", null);
        setField(term70417, term70417.getClass(), "kind", null);
        setField(term70417, term70417.getClass(), "typeOfThis", null);
        setField(term70417, term70417.getClass(), "source", null);
        setField(term70417, term70417.getClass(), "implementedInterfaces", null);
        setField(term70417, term70417.getClass(), "subTypes", null);
        setField(term70417, term70417.getClass(), "templateTypeName", null);
        setField(term70417, term70417.getClass(), "className", null);
        setField(term70417, term70417.getClass(), "properties", null);
        setField(term70417, term70417.getClass(), "implicitPrototype", null);
        setBooleanField(term70417, term70417.getClass(), "nativeType", false);
        setBooleanField(term70417, term70417.getClass(), "visited", false);
        setField(term70417, term70417.getClass(), "docInfo", null);
        setBooleanField(term70417, term70417.getClass(), "unknown", false);
        setBooleanField(term70417, term70417.getClass(), "resolved", false);
        setField(term70417, term70417.getClass(), "resolveResult", null);
        setField(term70417, term70417.getClass(), "registry", null);
        setField(term70416, term70416.getClass(), "typeOfThis", term70417);
        setField(term70416, term70416.getClass(), "source", null);
        setField(term70416, term70416.getClass(), "implementedInterfaces", null);
        setField(term70416, term70416.getClass(), "subTypes", null);
        setField(term70416, term70416.getClass(), "templateTypeName", null);
        setField(term70416, term70416.getClass(), "className", null);
        setField(term70416, term70416.getClass(), "properties", null);
        setField(term70416, term70416.getClass(), "implicitPrototype", null);
        setBooleanField(term70416, term70416.getClass(), "nativeType", false);
        setBooleanField(term70416, term70416.getClass(), "visited", false);
        setField(term70416, term70416.getClass(), "docInfo", null);
        setBooleanField(term70416, term70416.getClass(), "unknown", false);
        setBooleanField(term70416, term70416.getClass(), "resolved", false);
        setField(term70416, term70416.getClass(), "resolveResult", null);
        setField(term70416, term70416.getClass(), "registry", null);
        term70406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term70406, term70406.getClass(), "call", null);
        setField(term70406, term70406.getClass(), "prototype", null);
        setField(term70406, term70406.getClass(), "kind", null);
        setField(term70406, term70406.getClass(), "typeOfThis", null);
        setField(term70406, term70406.getClass(), "source", null);
        setField(term70406, term70406.getClass(), "implementedInterfaces", null);
        setField(term70406, term70406.getClass(), "subTypes", null);
        setField(term70406, term70406.getClass(), "templateTypeName", null);
        setField(term70406, term70406.getClass(), "className", null);
        setField(term70406, term70406.getClass(), "properties", null);
        setField(term70406, term70406.getClass(), "implicitPrototype", null);
        setBooleanField(term70406, term70406.getClass(), "nativeType", false);
        setBooleanField(term70406, term70406.getClass(), "visited", false);
        setField(term70406, term70406.getClass(), "docInfo", null);
        setBooleanField(term70406, term70406.getClass(), "unknown", false);
        setBooleanField(term70406, term70406.getClass(), "resolved", false);
        setField(term70406, term70406.getClass(), "resolveResult", null);
        setField(term70406, term70406.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTypeOfThis", argTypes, term70048, args);
        assertTrue(recursiveEquals(term70048, term70416));
        assertTrue(recursiveEquals(retValue, term70406));
    }

};


