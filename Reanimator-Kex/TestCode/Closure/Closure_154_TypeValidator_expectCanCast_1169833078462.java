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
import java.lang.String;
import java.lang.Object;

public class TypeValidator_expectCanCast_1169833078462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230548;
     Object term230658;
     Object term230916;
     Object term231376;
     Object term231377;
     Object term231378;

    public TypeValidator_expectCanCast_1169833078462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230548 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term231383 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term231382 = ((Class) term231383).getDeclaredField((String) "INTERFACE");
        ((Field) term231382).setAccessible(true);
        Object enum123 = ((Field) term231382).get((Object) null);
        term230658 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term230658, term230658.getClass(), "kind", enum123);
        term230916 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term230916, term230916.getClass(), "unknown", false);
        term231376 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term231376, term231376.getClass(), "compiler", null);
        setField(term231376, term231376.getClass(), "typeRegistry", null);
        setField(term231376, term231376.getClass(), "allValueTypes", null);
        setBooleanField(term231376, term231376.getClass(), "shouldReport", false);
        setField(term231376, term231376.getClass(), "nullOrUndefined", null);
        setField(term231376, term231376.getClass(), "mismatches", null);
        term231377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term231377, term231377.getClass(), "call", null);
        setField(term231377, term231377.getClass(), "prototype", null);
        setField(term231377, term231377.getClass(), "kind", null);
        setField(term231377, term231377.getClass(), "typeOfThis", null);
        setField(term231377, term231377.getClass(), "source", null);
        setField(term231377, term231377.getClass(), "implementedInterfaces", null);
        setField(term231377, term231377.getClass(), "subTypes", null);
        setField(term231377, term231377.getClass(), "templateTypeName", null);
        setField(term231377, term231377.getClass(), "className", null);
        setField(term231377, term231377.getClass(), "properties", null);
        setBooleanField(term231377, term231377.getClass(), "nativeType", false);
        setField(term231377, term231377.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term231377, term231377.getClass(), "prettyPrint", false);
        setBooleanField(term231377, term231377.getClass(), "visited", false);
        setField(term231377, term231377.getClass(), "docInfo", null);
        setBooleanField(term231377, term231377.getClass(), "unknown", false);
        setBooleanField(term231377, term231377.getClass(), "resolved", false);
        setField(term231377, term231377.getClass(), "resolveResult", null);
        setField(term231377, term231377.getClass(), "registry", null);
        Class<? extends Object> term231677 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term231676 = ((Class) term231677).getDeclaredField((String) "INTERFACE");
        ((Field) term231676).setAccessible(true);
        Object enum124 = ((Field) term231676).get((Object) null);
        term231378 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term231378, term231378.getClass(), "call", null);
        setField(term231378, term231378.getClass(), "prototype", null);
        setField(term231378, term231378.getClass(), "kind", enum124);
        setField(term231378, term231378.getClass(), "typeOfThis", null);
        setField(term231378, term231378.getClass(), "source", null);
        setField(term231378, term231378.getClass(), "implementedInterfaces", null);
        setField(term231378, term231378.getClass(), "subTypes", null);
        setField(term231378, term231378.getClass(), "templateTypeName", null);
        setField(term231378, term231378.getClass(), "className", null);
        setField(term231378, term231378.getClass(), "properties", null);
        setBooleanField(term231378, term231378.getClass(), "nativeType", false);
        setField(term231378, term231378.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term231378, term231378.getClass(), "prettyPrint", false);
        setBooleanField(term231378, term231378.getClass(), "visited", false);
        setField(term231378, term231378.getClass(), "docInfo", null);
        setBooleanField(term231378, term231378.getClass(), "unknown", false);
        setBooleanField(term231378, term231378.getClass(), "resolved", false);
        setField(term231378, term231378.getClass(), "resolveResult", null);
        setField(term231378, term231378.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term230658;
        args[3] = term230916;
        callMethod(klass, "expectCanCast", argTypes, term230548, args);
        assertTrue(recursiveEquals(term230548, term231376));
        assertTrue(recursiveEquals(term230658, null));
        assertTrue(recursiveEquals(term230916, null));
    }

};


