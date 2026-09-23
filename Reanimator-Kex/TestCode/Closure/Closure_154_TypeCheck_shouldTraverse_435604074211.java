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

public class TypeCheck_shouldTraverse_435604074211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59867;
     Object term59959;
     Object term60403;
     Object term60404;

    public TypeCheck_shouldTraverse_435604074211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59867 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term59959 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term60403 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term60403, term60403.getClass(), "compiler", null);
        setField(term60403, term60403.getClass(), "validator", null);
        setField(term60403, term60403.getClass(), "reverseInterpreter", null);
        setField(term60403, term60403.getClass(), "typeRegistry", null);
        setField(term60403, term60403.getClass(), "topScope", null);
        setField(term60403, term60403.getClass(), "scopeCreator", null);
        setField(term60403, term60403.getClass(), "reportMissingOverride", null);
        setField(term60403, term60403.getClass(), "reportUnknownTypes", null);
        setBooleanField(term60403, term60403.getClass(), "reportMissingProperties", false);
        setField(term60403, term60403.getClass(), "inferJSDocInfo", null);
        setIntField(term60403, term60403.getClass(), "typedCount", 0);
        setIntField(term60403, term60403.getClass(), "nullCount", 0);
        setIntField(term60403, term60403.getClass(), "unknownCount", 0);
        setBooleanField(term60403, term60403.getClass(), "inExterns", false);
        setIntField(term60403, term60403.getClass(), "noTypeCheckSection", 0);
        term60404 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term60404, term60404.getClass(), "number", 0.0);
        setIntField(term60404, term60404.getClass(), "type", 0);
        setField(term60404, term60404.getClass(), "next", null);
        setField(term60404, term60404.getClass(), "first", null);
        setField(term60404, term60404.getClass(), "last", null);
        setField(term60404, term60404.getClass(), "propListHead", null);
        setIntField(term60404, term60404.getClass(), "sourcePosition", 0);
        setField(term60404, term60404.getClass(), "jsType", null);
        setField(term60404, term60404.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term59959;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term59867, args);
        assertTrue(recursiveEquals(term59867, term60403));
        assertTrue(recursiveEquals(term59959, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


