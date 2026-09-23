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

public class FunctionType_getDebugHashCodeStringOf_167476349165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84124;
     Object term84136;
     Object term84137;

    public FunctionType_getDebugHashCodeStringOf_167476349165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84124 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term84136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term84136, term84136.getClass(), "call", null);
        setField(term84136, term84136.getClass(), "prototype", null);
        setField(term84136, term84136.getClass(), "kind", null);
        setField(term84136, term84136.getClass(), "typeOfThis", null);
        setField(term84136, term84136.getClass(), "source", null);
        setField(term84136, term84136.getClass(), "implementedInterfaces", null);
        setField(term84136, term84136.getClass(), "subTypes", null);
        setField(term84136, term84136.getClass(), "templateTypeName", null);
        setField(term84136, term84136.getClass(), "className", null);
        setField(term84136, term84136.getClass(), "properties", null);
        setBooleanField(term84136, term84136.getClass(), "nativeType", false);
        setField(term84136, term84136.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term84136, term84136.getClass(), "prettyPrint", false);
        setBooleanField(term84136, term84136.getClass(), "visited", false);
        setField(term84136, term84136.getClass(), "docInfo", null);
        setBooleanField(term84136, term84136.getClass(), "unknown", false);
        setBooleanField(term84136, term84136.getClass(), "resolved", false);
        setField(term84136, term84136.getClass(), "resolveResult", null);
        setField(term84136, term84136.getClass(), "registry", null);
        term84137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term84137, term84137.getClass(), "call", null);
        setField(term84137, term84137.getClass(), "prototype", null);
        setField(term84137, term84137.getClass(), "kind", null);
        setField(term84137, term84137.getClass(), "typeOfThis", null);
        setField(term84137, term84137.getClass(), "source", null);
        setField(term84137, term84137.getClass(), "implementedInterfaces", null);
        setField(term84137, term84137.getClass(), "subTypes", null);
        setField(term84137, term84137.getClass(), "templateTypeName", null);
        setField(term84137, term84137.getClass(), "className", null);
        setField(term84137, term84137.getClass(), "properties", null);
        setBooleanField(term84137, term84137.getClass(), "nativeType", false);
        setField(term84137, term84137.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term84137, term84137.getClass(), "prettyPrint", false);
        setBooleanField(term84137, term84137.getClass(), "visited", false);
        setField(term84137, term84137.getClass(), "docInfo", null);
        setBooleanField(term84137, term84137.getClass(), "unknown", false);
        setBooleanField(term84137, term84137.getClass(), "resolved", false);
        setField(term84137, term84137.getClass(), "resolveResult", null);
        setField(term84137, term84137.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term84124;
        Object retValue = callMethod(klass, "getDebugHashCodeStringOf", argTypes, term84124, args);
        assertTrue(recursiveEquals(term84124, term84136));
        assertTrue(recursiveEquals(term84124, term84137));
        assertTrue(recursiveEquals(retValue, "me"));
    }

};


