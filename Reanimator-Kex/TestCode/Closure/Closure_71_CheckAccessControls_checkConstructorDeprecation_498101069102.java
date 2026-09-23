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

public class CheckAccessControls_checkConstructorDeprecation_498101069102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27101;
     Object term27171;
     Object term28378;
     Object term28379;

    public CheckAccessControls_checkConstructorDeprecation_498101069102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27101 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term27171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term27171, term27171.getClass(), "jsType", term27275);
        term28378 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term28378, term28378.getClass(), "compiler", null);
        setField(term28378, term28378.getClass(), "validator", null);
        setIntField(term28378, term28378.getClass(), "deprecatedDepth", 0);
        setIntField(term28378, term28378.getClass(), "methodDepth", 0);
        setField(term28378, term28378.getClass(), "currentClass", null);
        setField(term28378, term28378.getClass(), "initializedConstantProperties", null);
        term28379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term28379, term28379.getClass(), "type", 0);
        setField(term28379, term28379.getClass(), "next", null);
        setField(term28379, term28379.getClass(), "first", null);
        setField(term28379, term28379.getClass(), "last", null);
        setField(term28379, term28379.getClass(), "propListHead", null);
        setIntField(term28379, term28379.getClass(), "sourcePosition", 0);
        setField(term28380, term28380.getClass(), "call", null);
        setField(term28380, term28380.getClass(), "prototype", null);
        setField(term28380, term28380.getClass(), "kind", null);
        setField(term28380, term28380.getClass(), "typeOfThis", null);
        setField(term28380, term28380.getClass(), "source", null);
        setField(term28380, term28380.getClass(), "implementedInterfaces", null);
        setField(term28380, term28380.getClass(), "subTypes", null);
        setField(term28380, term28380.getClass(), "templateTypeName", null);
        setField(term28380, term28380.getClass(), "className", null);
        setField(term28380, term28380.getClass(), "properties", null);
        setBooleanField(term28380, term28380.getClass(), "nativeType", false);
        setField(term28380, term28380.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term28380, term28380.getClass(), "prettyPrint", false);
        setBooleanField(term28380, term28380.getClass(), "visited", false);
        setField(term28380, term28380.getClass(), "docInfo", null);
        setBooleanField(term28380, term28380.getClass(), "unknown", false);
        setBooleanField(term28380, term28380.getClass(), "resolved", false);
        setField(term28380, term28380.getClass(), "resolveResult", null);
        setField(term28380, term28380.getClass(), "registry", null);
        setField(term28379, term28379.getClass(), "jsType", term28380);
        setField(term28379, term28379.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term27171;
        args[2] = null;
        callMethod(klass, "checkConstructorDeprecation", argTypes, term27101, args);
        assertTrue(recursiveEquals(term27101, term28378));
        assertTrue(recursiveEquals(term27171, null));
    }

};


