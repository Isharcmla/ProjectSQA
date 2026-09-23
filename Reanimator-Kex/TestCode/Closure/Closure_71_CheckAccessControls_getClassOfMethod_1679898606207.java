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

public class CheckAccessControls_getClassOfMethod_1679898606207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59888;
     Object term59980;
     Object term60166;
     Object term60208;
     Object term60209;
     Object term60210;
     Object term60186;

    public CheckAccessControls_getClassOfMethod_1679898606207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59888 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term59980 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setIntField(term59980, term59980.getClass(), "type", 38);
        setField(term59980, term59980.getClass(), "jsType", term60074);
        term60166 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term60166, term60166.getClass(), "type", 38);
        term60208 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term60208, term60208.getClass(), "compiler", null);
        setField(term60208, term60208.getClass(), "validator", null);
        setIntField(term60208, term60208.getClass(), "deprecatedDepth", 0);
        setIntField(term60208, term60208.getClass(), "methodDepth", 0);
        setField(term60208, term60208.getClass(), "currentClass", null);
        setField(term60208, term60208.getClass(), "initializedConstantProperties", null);
        term60209 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term60209, term60209.getClass(), "number", 0.0);
        setIntField(term60209, term60209.getClass(), "type", 38);
        setField(term60209, term60209.getClass(), "next", null);
        setField(term60209, term60209.getClass(), "first", null);
        setField(term60209, term60209.getClass(), "last", null);
        setField(term60209, term60209.getClass(), "propListHead", null);
        setIntField(term60209, term60209.getClass(), "sourcePosition", 0);
        setField(term60209, term60209.getClass(), "jsType", null);
        setField(term60209, term60209.getClass(), "parent", null);
        term60210 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setDoubleField(term60210, term60210.getClass(), "number", 0.0);
        setIntField(term60210, term60210.getClass(), "type", 38);
        setField(term60210, term60210.getClass(), "next", null);
        setField(term60210, term60210.getClass(), "first", null);
        setField(term60210, term60210.getClass(), "last", null);
        setField(term60210, term60210.getClass(), "propListHead", null);
        setIntField(term60210, term60210.getClass(), "sourcePosition", 0);
        setField(term60211, term60211.getClass(), "parameters", null);
        setField(term60211, term60211.getClass(), "returnType", null);
        setBooleanField(term60211, term60211.getClass(), "returnTypeInferred", false);
        setBooleanField(term60211, term60211.getClass(), "resolved", false);
        setField(term60211, term60211.getClass(), "resolveResult", null);
        setField(term60211, term60211.getClass(), "registry", null);
        setField(term60210, term60210.getClass(), "jsType", term60211);
        setField(term60210, term60210.getClass(), "parent", null);
        term60186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term60186, term60186.getClass(), "parameters", null);
        setField(term60186, term60186.getClass(), "returnType", null);
        setBooleanField(term60186, term60186.getClass(), "returnTypeInferred", false);
        setBooleanField(term60186, term60186.getClass(), "resolved", false);
        setField(term60186, term60186.getClass(), "resolveResult", null);
        setField(term60186, term60186.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term59980;
        args[1] = term60166;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term59888, args);
        assertTrue(recursiveEquals(term59888, term60208));
        assertTrue(recursiveEquals(term59980, term60209));
        assertTrue(recursiveEquals(term60166, term60210));
        assertTrue(recursiveEquals(retValue, term60186));
    }

};


