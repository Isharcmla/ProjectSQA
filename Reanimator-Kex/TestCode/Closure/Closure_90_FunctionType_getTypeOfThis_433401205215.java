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

public class FunctionType_getTypeOfThis_433401205215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119402;
     Object term119523;
     Object term119511;

    public FunctionType_getTypeOfThis_433401205215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term119502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term119402, term119402.getClass(), "typeOfThis", term119502);
        term119523 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term119524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term119523, term119523.getClass(), "call", null);
        setField(term119523, term119523.getClass(), "prototype", null);
        setField(term119523, term119523.getClass(), "kind", null);
        setField(term119524, term119524.getClass(), "call", null);
        setField(term119524, term119524.getClass(), "prototype", null);
        setField(term119524, term119524.getClass(), "kind", null);
        setField(term119524, term119524.getClass(), "typeOfThis", null);
        setField(term119524, term119524.getClass(), "source", null);
        setField(term119524, term119524.getClass(), "implementedInterfaces", null);
        setField(term119524, term119524.getClass(), "subTypes", null);
        setField(term119524, term119524.getClass(), "templateTypeName", null);
        setField(term119524, term119524.getClass(), "className", null);
        setField(term119524, term119524.getClass(), "properties", null);
        setBooleanField(term119524, term119524.getClass(), "nativeType", false);
        setField(term119524, term119524.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term119524, term119524.getClass(), "prettyPrint", false);
        setBooleanField(term119524, term119524.getClass(), "visited", false);
        setField(term119524, term119524.getClass(), "docInfo", null);
        setBooleanField(term119524, term119524.getClass(), "unknown", false);
        setBooleanField(term119524, term119524.getClass(), "resolved", false);
        setField(term119524, term119524.getClass(), "resolveResult", null);
        setField(term119524, term119524.getClass(), "registry", null);
        setField(term119523, term119523.getClass(), "typeOfThis", term119524);
        setField(term119523, term119523.getClass(), "source", null);
        setField(term119523, term119523.getClass(), "implementedInterfaces", null);
        setField(term119523, term119523.getClass(), "subTypes", null);
        setField(term119523, term119523.getClass(), "templateTypeName", null);
        setField(term119523, term119523.getClass(), "className", null);
        setField(term119523, term119523.getClass(), "properties", null);
        setBooleanField(term119523, term119523.getClass(), "nativeType", false);
        setField(term119523, term119523.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term119523, term119523.getClass(), "prettyPrint", false);
        setBooleanField(term119523, term119523.getClass(), "visited", false);
        setField(term119523, term119523.getClass(), "docInfo", null);
        setBooleanField(term119523, term119523.getClass(), "unknown", false);
        setBooleanField(term119523, term119523.getClass(), "resolved", false);
        setField(term119523, term119523.getClass(), "resolveResult", null);
        setField(term119523, term119523.getClass(), "registry", null);
        term119511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term119511, term119511.getClass(), "call", null);
        setField(term119511, term119511.getClass(), "prototype", null);
        setField(term119511, term119511.getClass(), "kind", null);
        setField(term119511, term119511.getClass(), "typeOfThis", null);
        setField(term119511, term119511.getClass(), "source", null);
        setField(term119511, term119511.getClass(), "implementedInterfaces", null);
        setField(term119511, term119511.getClass(), "subTypes", null);
        setField(term119511, term119511.getClass(), "templateTypeName", null);
        setField(term119511, term119511.getClass(), "className", null);
        setField(term119511, term119511.getClass(), "properties", null);
        setBooleanField(term119511, term119511.getClass(), "nativeType", false);
        setField(term119511, term119511.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term119511, term119511.getClass(), "prettyPrint", false);
        setBooleanField(term119511, term119511.getClass(), "visited", false);
        setField(term119511, term119511.getClass(), "docInfo", null);
        setBooleanField(term119511, term119511.getClass(), "unknown", false);
        setBooleanField(term119511, term119511.getClass(), "resolved", false);
        setField(term119511, term119511.getClass(), "resolveResult", null);
        setField(term119511, term119511.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTypeOfThis", argTypes, term119402, args);
        assertTrue(recursiveEquals(term119402, term119523));
        assertTrue(recursiveEquals(retValue, term119511));
    }

};


