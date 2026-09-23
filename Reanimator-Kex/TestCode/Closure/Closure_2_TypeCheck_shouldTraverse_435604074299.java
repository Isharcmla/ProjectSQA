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

public class TypeCheck_shouldTraverse_435604074299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74429;
     Object term74589;
     Object term74894;
     Object term74896;

    public TypeCheck_shouldTraverse_435604074299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74429 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term74519 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term74429, term74429.getClass(), "validator", term74519);
        setIntField(term74429, term74429.getClass(), "noTypeCheckSection", 0);
        term74589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74589, term74589.getClass(), "type", 132);
        setField(term74589, term74589.getClass(), "propListHead", null);
        term74894 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term74895 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term74894, term74894.getClass(), "compiler", null);
        setField(term74895, term74895.getClass(), "compiler", null);
        setField(term74895, term74895.getClass(), "typeRegistry", null);
        setField(term74895, term74895.getClass(), "allValueTypes", null);
        setBooleanField(term74895, term74895.getClass(), "shouldReport", true);
        setField(term74895, term74895.getClass(), "nullOrUndefined", null);
        setField(term74895, term74895.getClass(), "mismatches", null);
        setField(term74894, term74894.getClass(), "validator", term74895);
        setField(term74894, term74894.getClass(), "reverseInterpreter", null);
        setField(term74894, term74894.getClass(), "typeRegistry", null);
        setField(term74894, term74894.getClass(), "topScope", null);
        setField(term74894, term74894.getClass(), "scopeCreator", null);
        setField(term74894, term74894.getClass(), "reportMissingOverride", null);
        setField(term74894, term74894.getClass(), "reportUnknownTypes", null);
        setBooleanField(term74894, term74894.getClass(), "reportMissingProperties", false);
        setField(term74894, term74894.getClass(), "inferJSDocInfo", null);
        setIntField(term74894, term74894.getClass(), "typedCount", 0);
        setIntField(term74894, term74894.getClass(), "nullCount", 0);
        setIntField(term74894, term74894.getClass(), "unknownCount", 0);
        setBooleanField(term74894, term74894.getClass(), "inExterns", false);
        setIntField(term74894, term74894.getClass(), "noTypeCheckSection", 0);
        term74896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74896, term74896.getClass(), "type", 132);
        setField(term74896, term74896.getClass(), "next", null);
        setField(term74896, term74896.getClass(), "first", null);
        setField(term74896, term74896.getClass(), "last", null);
        setField(term74896, term74896.getClass(), "propListHead", null);
        setIntField(term74896, term74896.getClass(), "sourcePosition", 0);
        setField(term74896, term74896.getClass(), "jsType", null);
        setField(term74896, term74896.getClass(), "parent", null);
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
        args[1] = term74589;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term74429, args);
        assertTrue(recursiveEquals(term74429, term74894));
        assertTrue(recursiveEquals(term74589, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


