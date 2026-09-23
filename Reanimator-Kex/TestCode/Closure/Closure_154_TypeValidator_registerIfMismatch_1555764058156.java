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

public class TypeValidator_registerIfMismatch_1555764058156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41888;
     Object term42044;
     Object term42067;
     Object term42068;
     Object term42069;

    public TypeValidator_registerIfMismatch_1555764058156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41888 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term42044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term42067 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term42067, term42067.getClass(), "compiler", null);
        setField(term42067, term42067.getClass(), "typeRegistry", null);
        setField(term42067, term42067.getClass(), "allValueTypes", null);
        setBooleanField(term42067, term42067.getClass(), "shouldReport", false);
        setField(term42067, term42067.getClass(), "nullOrUndefined", null);
        setField(term42067, term42067.getClass(), "mismatches", null);
        term42068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term42068, term42068.getClass(), "call", null);
        setField(term42068, term42068.getClass(), "prototype", null);
        setField(term42068, term42068.getClass(), "kind", null);
        setField(term42068, term42068.getClass(), "typeOfThis", null);
        setField(term42068, term42068.getClass(), "source", null);
        setField(term42068, term42068.getClass(), "implementedInterfaces", null);
        setField(term42068, term42068.getClass(), "subTypes", null);
        setField(term42068, term42068.getClass(), "templateTypeName", null);
        setField(term42068, term42068.getClass(), "className", null);
        setField(term42068, term42068.getClass(), "properties", null);
        setBooleanField(term42068, term42068.getClass(), "nativeType", false);
        setField(term42068, term42068.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term42068, term42068.getClass(), "prettyPrint", false);
        setBooleanField(term42068, term42068.getClass(), "visited", false);
        setField(term42068, term42068.getClass(), "docInfo", null);
        setBooleanField(term42068, term42068.getClass(), "unknown", false);
        setBooleanField(term42068, term42068.getClass(), "resolved", false);
        setField(term42068, term42068.getClass(), "resolveResult", null);
        setField(term42068, term42068.getClass(), "registry", null);
        term42069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term42069, term42069.getClass(), "call", null);
        setField(term42069, term42069.getClass(), "prototype", null);
        setField(term42069, term42069.getClass(), "kind", null);
        setField(term42069, term42069.getClass(), "typeOfThis", null);
        setField(term42069, term42069.getClass(), "source", null);
        setField(term42069, term42069.getClass(), "implementedInterfaces", null);
        setField(term42069, term42069.getClass(), "subTypes", null);
        setField(term42069, term42069.getClass(), "templateTypeName", null);
        setField(term42069, term42069.getClass(), "className", null);
        setField(term42069, term42069.getClass(), "properties", null);
        setBooleanField(term42069, term42069.getClass(), "nativeType", false);
        setField(term42069, term42069.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term42069, term42069.getClass(), "prettyPrint", false);
        setBooleanField(term42069, term42069.getClass(), "visited", false);
        setField(term42069, term42069.getClass(), "docInfo", null);
        setBooleanField(term42069, term42069.getClass(), "unknown", false);
        setBooleanField(term42069, term42069.getClass(), "resolved", false);
        setField(term42069, term42069.getClass(), "resolveResult", null);
        setField(term42069, term42069.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term42044;
        args[1] = term42044;
        callMethod(klass, "registerIfMismatch", argTypes, term41888, args);
        assertTrue(recursiveEquals(term41888, term42067));
        assertTrue(recursiveEquals(term42044, term42068));
        assertTrue(recursiveEquals(term42044, term42069));
    }

};


