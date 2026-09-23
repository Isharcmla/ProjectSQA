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

public class FunctionType_getDebugHashCodeStringOf_167476349137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72375;
     Object term72415;
     Object term72416;

    public FunctionType_getDebugHashCodeStringOf_167476349137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72375 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term72415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term72415, term72415.getClass(), "call", null);
        setField(term72415, term72415.getClass(), "prototype", null);
        setField(term72415, term72415.getClass(), "kind", null);
        setField(term72415, term72415.getClass(), "typeOfThis", null);
        setField(term72415, term72415.getClass(), "source", null);
        setField(term72415, term72415.getClass(), "implementedInterfaces", null);
        setField(term72415, term72415.getClass(), "subTypes", null);
        setField(term72415, term72415.getClass(), "templateTypeName", null);
        setField(term72415, term72415.getClass(), "className", null);
        setField(term72415, term72415.getClass(), "properties", null);
        setField(term72415, term72415.getClass(), "implicitPrototype", null);
        setBooleanField(term72415, term72415.getClass(), "nativeType", false);
        setBooleanField(term72415, term72415.getClass(), "prettyPrint", false);
        setBooleanField(term72415, term72415.getClass(), "visited", false);
        setField(term72415, term72415.getClass(), "docInfo", null);
        setBooleanField(term72415, term72415.getClass(), "unknown", false);
        setBooleanField(term72415, term72415.getClass(), "resolved", false);
        setField(term72415, term72415.getClass(), "resolveResult", null);
        setField(term72415, term72415.getClass(), "registry", null);
        term72416 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term72416, term72416.getClass(), "call", null);
        setField(term72416, term72416.getClass(), "prototype", null);
        setField(term72416, term72416.getClass(), "kind", null);
        setField(term72416, term72416.getClass(), "typeOfThis", null);
        setField(term72416, term72416.getClass(), "source", null);
        setField(term72416, term72416.getClass(), "implementedInterfaces", null);
        setField(term72416, term72416.getClass(), "subTypes", null);
        setField(term72416, term72416.getClass(), "templateTypeName", null);
        setField(term72416, term72416.getClass(), "className", null);
        setField(term72416, term72416.getClass(), "properties", null);
        setField(term72416, term72416.getClass(), "implicitPrototype", null);
        setBooleanField(term72416, term72416.getClass(), "nativeType", false);
        setBooleanField(term72416, term72416.getClass(), "prettyPrint", false);
        setBooleanField(term72416, term72416.getClass(), "visited", false);
        setField(term72416, term72416.getClass(), "docInfo", null);
        setBooleanField(term72416, term72416.getClass(), "unknown", false);
        setBooleanField(term72416, term72416.getClass(), "resolved", false);
        setField(term72416, term72416.getClass(), "resolveResult", null);
        setField(term72416, term72416.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term72375;
        Object retValue = callMethod(klass, "getDebugHashCodeStringOf", argTypes, term72375, args);
        assertTrue(recursiveEquals(term72375, term72415));
        assertTrue(recursiveEquals(term72375, term72416));
        assertTrue(recursiveEquals(retValue, "me"));
    }

};


