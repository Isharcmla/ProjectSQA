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

public class CheckAccessControls_normalizeClassType_359864257139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37376;
     Object term37494;
     Object term37639;
     Object term37640;
     Object term37598;

    public CheckAccessControls_normalizeClassType_359864257139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37376 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term37494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term37594 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term37494, term37494.getClass(), "unknown", false);
        setField(term37494, term37494.getClass(), "ownerFunction", term37594);
        term37639 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term37639, term37639.getClass(), "compiler", null);
        setField(term37639, term37639.getClass(), "validator", null);
        setIntField(term37639, term37639.getClass(), "deprecatedDepth", 0);
        setIntField(term37639, term37639.getClass(), "methodDepth", 0);
        setField(term37639, term37639.getClass(), "currentClass", null);
        setField(term37639, term37639.getClass(), "initializedConstantProperties", null);
        term37640 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term37641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term37641, term37641.getClass(), "call", null);
        setField(term37641, term37641.getClass(), "prototype", null);
        setField(term37641, term37641.getClass(), "kind", null);
        setField(term37641, term37641.getClass(), "typeOfThis", null);
        setField(term37641, term37641.getClass(), "source", null);
        setField(term37641, term37641.getClass(), "implementedInterfaces", null);
        setField(term37641, term37641.getClass(), "subTypes", null);
        setField(term37641, term37641.getClass(), "templateTypeName", null);
        setField(term37641, term37641.getClass(), "className", null);
        setField(term37641, term37641.getClass(), "properties", null);
        setBooleanField(term37641, term37641.getClass(), "nativeType", false);
        setField(term37641, term37641.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term37641, term37641.getClass(), "prettyPrint", false);
        setBooleanField(term37641, term37641.getClass(), "visited", false);
        setField(term37641, term37641.getClass(), "docInfo", null);
        setBooleanField(term37641, term37641.getClass(), "unknown", false);
        setBooleanField(term37641, term37641.getClass(), "resolved", false);
        setField(term37641, term37641.getClass(), "resolveResult", null);
        setField(term37641, term37641.getClass(), "registry", null);
        setField(term37640, term37640.getClass(), "ownerFunction", term37641);
        setField(term37640, term37640.getClass(), "className", null);
        setField(term37640, term37640.getClass(), "properties", null);
        setBooleanField(term37640, term37640.getClass(), "nativeType", false);
        setField(term37640, term37640.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term37640, term37640.getClass(), "prettyPrint", false);
        setBooleanField(term37640, term37640.getClass(), "visited", false);
        setField(term37640, term37640.getClass(), "docInfo", null);
        setBooleanField(term37640, term37640.getClass(), "unknown", false);
        setBooleanField(term37640, term37640.getClass(), "resolved", false);
        setField(term37640, term37640.getClass(), "resolveResult", null);
        setField(term37640, term37640.getClass(), "registry", null);
        term37598 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term37599 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term37599, term37599.getClass(), "call", null);
        setField(term37599, term37599.getClass(), "prototype", null);
        setField(term37599, term37599.getClass(), "kind", null);
        setField(term37599, term37599.getClass(), "typeOfThis", null);
        setField(term37599, term37599.getClass(), "source", null);
        setField(term37599, term37599.getClass(), "implementedInterfaces", null);
        setField(term37599, term37599.getClass(), "subTypes", null);
        setField(term37599, term37599.getClass(), "templateTypeName", null);
        setField(term37599, term37599.getClass(), "className", null);
        setField(term37599, term37599.getClass(), "properties", null);
        setBooleanField(term37599, term37599.getClass(), "nativeType", false);
        setField(term37599, term37599.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term37599, term37599.getClass(), "prettyPrint", false);
        setBooleanField(term37599, term37599.getClass(), "visited", false);
        setField(term37599, term37599.getClass(), "docInfo", null);
        setBooleanField(term37599, term37599.getClass(), "unknown", false);
        setBooleanField(term37599, term37599.getClass(), "resolved", false);
        setField(term37599, term37599.getClass(), "resolveResult", null);
        setField(term37599, term37599.getClass(), "registry", null);
        setField(term37598, term37598.getClass(), "ownerFunction", term37599);
        setField(term37598, term37598.getClass(), "className", null);
        setField(term37598, term37598.getClass(), "properties", null);
        setBooleanField(term37598, term37598.getClass(), "nativeType", false);
        setField(term37598, term37598.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term37598, term37598.getClass(), "prettyPrint", false);
        setBooleanField(term37598, term37598.getClass(), "visited", false);
        setField(term37598, term37598.getClass(), "docInfo", null);
        setBooleanField(term37598, term37598.getClass(), "unknown", false);
        setBooleanField(term37598, term37598.getClass(), "resolved", false);
        setField(term37598, term37598.getClass(), "resolveResult", null);
        setField(term37598, term37598.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term37494;
        Object retValue = callMethod(klass, "normalizeClassType", argTypes, term37376, args);
        assertTrue(recursiveEquals(term37376, term37639));
        assertTrue(recursiveEquals(term37494, term37640));
        assertTrue(recursiveEquals(retValue, term37598));
    }

};


