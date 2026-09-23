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

public class TypeValidator_expectActualObject_1065784155224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72052;
     Object term72156;
     Object term72167;
     Object term72168;

    public TypeValidator_expectActualObject_1065784155224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72052 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term72156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term72167 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term72167, term72167.getClass(), "compiler", null);
        setField(term72167, term72167.getClass(), "typeRegistry", null);
        setField(term72167, term72167.getClass(), "allValueTypes", null);
        setBooleanField(term72167, term72167.getClass(), "shouldReport", false);
        setField(term72167, term72167.getClass(), "nullOrUndefined", null);
        setField(term72167, term72167.getClass(), "mismatches", null);
        term72168 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term72168, term72168.getClass(), "call", null);
        setField(term72168, term72168.getClass(), "prototype", null);
        setField(term72168, term72168.getClass(), "kind", null);
        setField(term72168, term72168.getClass(), "typeOfThis", null);
        setField(term72168, term72168.getClass(), "source", null);
        setField(term72168, term72168.getClass(), "implementedInterfaces", null);
        setField(term72168, term72168.getClass(), "subTypes", null);
        setField(term72168, term72168.getClass(), "templateTypeName", null);
        setField(term72168, term72168.getClass(), "className", null);
        setField(term72168, term72168.getClass(), "properties", null);
        setBooleanField(term72168, term72168.getClass(), "nativeType", false);
        setField(term72168, term72168.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term72168, term72168.getClass(), "prettyPrint", false);
        setBooleanField(term72168, term72168.getClass(), "visited", false);
        setField(term72168, term72168.getClass(), "docInfo", null);
        setBooleanField(term72168, term72168.getClass(), "unknown", false);
        setBooleanField(term72168, term72168.getClass(), "resolved", false);
        setField(term72168, term72168.getClass(), "resolveResult", null);
        setField(term72168, term72168.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term72156;
        args[3] = null;
        callMethod(klass, "expectActualObject", argTypes, term72052, args);
        assertTrue(recursiveEquals(term72052, term72167));
        assertTrue(recursiveEquals(term72156, null));
    }

};


