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

public class TypeValidator_mismatch_1931343499186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59192;
     Object term59348;
     Object term59376;
     Object term59377;
     Object term59378;

    public TypeValidator_mismatch_1931343499186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59192 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term59348 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term59348, term59348.getClass(), "unknown", false);
        term59376 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term59376, term59376.getClass(), "compiler", null);
        setField(term59376, term59376.getClass(), "typeRegistry", null);
        setField(term59376, term59376.getClass(), "allValueTypes", null);
        setBooleanField(term59376, term59376.getClass(), "shouldReport", false);
        setField(term59376, term59376.getClass(), "nullOrUndefined", null);
        setField(term59376, term59376.getClass(), "mismatches", null);
        term59377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term59377, term59377.getClass(), "call", null);
        setField(term59377, term59377.getClass(), "prototype", null);
        setField(term59377, term59377.getClass(), "kind", null);
        setField(term59377, term59377.getClass(), "typeOfThis", null);
        setField(term59377, term59377.getClass(), "source", null);
        setField(term59377, term59377.getClass(), "implementedInterfaces", null);
        setField(term59377, term59377.getClass(), "subTypes", null);
        setField(term59377, term59377.getClass(), "templateTypeName", null);
        setField(term59377, term59377.getClass(), "className", null);
        setField(term59377, term59377.getClass(), "properties", null);
        setBooleanField(term59377, term59377.getClass(), "nativeType", false);
        setField(term59377, term59377.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term59377, term59377.getClass(), "prettyPrint", false);
        setBooleanField(term59377, term59377.getClass(), "visited", false);
        setField(term59377, term59377.getClass(), "docInfo", null);
        setBooleanField(term59377, term59377.getClass(), "unknown", false);
        setBooleanField(term59377, term59377.getClass(), "resolved", false);
        setField(term59377, term59377.getClass(), "resolveResult", null);
        setField(term59377, term59377.getClass(), "registry", null);
        term59378 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term59378, term59378.getClass(), "call", null);
        setField(term59378, term59378.getClass(), "prototype", null);
        setField(term59378, term59378.getClass(), "kind", null);
        setField(term59378, term59378.getClass(), "typeOfThis", null);
        setField(term59378, term59378.getClass(), "source", null);
        setField(term59378, term59378.getClass(), "implementedInterfaces", null);
        setField(term59378, term59378.getClass(), "subTypes", null);
        setField(term59378, term59378.getClass(), "templateTypeName", null);
        setField(term59378, term59378.getClass(), "className", null);
        setField(term59378, term59378.getClass(), "properties", null);
        setBooleanField(term59378, term59378.getClass(), "nativeType", false);
        setField(term59378, term59378.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term59378, term59378.getClass(), "prettyPrint", false);
        setBooleanField(term59378, term59378.getClass(), "visited", false);
        setField(term59378, term59378.getClass(), "docInfo", null);
        setBooleanField(term59378, term59378.getClass(), "unknown", false);
        setBooleanField(term59378, term59378.getClass(), "resolved", false);
        setField(term59378, term59378.getClass(), "resolveResult", null);
        setField(term59378, term59378.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term59348;
        args[4] = term59348;
        callMethod(klass, "mismatch", argTypes, term59192, args);
        assertTrue(recursiveEquals(term59192, term59376));
        assertTrue(recursiveEquals(term59348, null));
        assertTrue(recursiveEquals(term59348, null));
    }

};


