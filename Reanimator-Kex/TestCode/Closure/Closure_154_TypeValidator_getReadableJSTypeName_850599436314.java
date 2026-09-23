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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class TypeValidator_getReadableJSTypeName_850599436314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113542;
     Object term113612;
     Object term113813;
     Object term113814;

    public TypeValidator_getReadableJSTypeName_850599436314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113542 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term113612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113716 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term113612, term113612.getClass(), "type", 42);
        setField(term113612, term113612.getClass(), "jsType", term113716);
        term113813 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term113813, term113813.getClass(), "compiler", null);
        setField(term113813, term113813.getClass(), "typeRegistry", null);
        setField(term113813, term113813.getClass(), "allValueTypes", null);
        setBooleanField(term113813, term113813.getClass(), "shouldReport", false);
        setField(term113813, term113813.getClass(), "nullOrUndefined", null);
        setField(term113813, term113813.getClass(), "mismatches", null);
        term113814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113815 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term113814, term113814.getClass(), "type", 42);
        setField(term113814, term113814.getClass(), "next", null);
        setField(term113814, term113814.getClass(), "first", null);
        setField(term113814, term113814.getClass(), "last", null);
        setField(term113814, term113814.getClass(), "propListHead", null);
        setIntField(term113814, term113814.getClass(), "sourcePosition", 0);
        setField(term113815, term113815.getClass(), "call", null);
        setField(term113815, term113815.getClass(), "prototype", null);
        setField(term113815, term113815.getClass(), "kind", null);
        setField(term113815, term113815.getClass(), "typeOfThis", null);
        setField(term113815, term113815.getClass(), "source", null);
        setField(term113815, term113815.getClass(), "implementedInterfaces", null);
        setField(term113815, term113815.getClass(), "subTypes", null);
        setField(term113815, term113815.getClass(), "templateTypeName", null);
        setField(term113815, term113815.getClass(), "className", null);
        setField(term113815, term113815.getClass(), "properties", null);
        setBooleanField(term113815, term113815.getClass(), "nativeType", false);
        setField(term113815, term113815.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term113815, term113815.getClass(), "prettyPrint", false);
        setBooleanField(term113815, term113815.getClass(), "visited", false);
        setField(term113815, term113815.getClass(), "docInfo", null);
        setBooleanField(term113815, term113815.getClass(), "unknown", false);
        setBooleanField(term113815, term113815.getClass(), "resolved", false);
        setField(term113815, term113815.getClass(), "resolveResult", null);
        setField(term113815, term113815.getClass(), "registry", null);
        setField(term113814, term113814.getClass(), "jsType", term113815);
        setField(term113814, term113814.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term113612;
        args[1] = true;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term113542, args);
        assertTrue(recursiveEquals(term113542, term113813));
        assertTrue(recursiveEquals(term113612, term113814));
        assertTrue(recursiveEquals(retValue, "this"));
    }

};


