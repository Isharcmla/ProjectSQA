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

public class TypeCheck_shouldTraverse_435604074468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142878;
     Object term143038;
     Object term143062;
     Object term143064;

    public TypeCheck_shouldTraverse_435604074468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142878 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term142968 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term142878, term142878.getClass(), "validator", term142968);
        setIntField(term142878, term142878.getClass(), "noTypeCheckSection", 0);
        term143038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term143038, term143038.getClass(), "type", 132);
        setField(term143038, term143038.getClass(), "propListHead", null);
        term143062 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term143063 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term143062, term143062.getClass(), "compiler", null);
        setField(term143063, term143063.getClass(), "compiler", null);
        setField(term143063, term143063.getClass(), "typeRegistry", null);
        setField(term143063, term143063.getClass(), "allValueTypes", null);
        setBooleanField(term143063, term143063.getClass(), "shouldReport", true);
        setField(term143063, term143063.getClass(), "nullOrUndefined", null);
        setField(term143063, term143063.getClass(), "mismatches", null);
        setField(term143062, term143062.getClass(), "validator", term143063);
        setField(term143062, term143062.getClass(), "reverseInterpreter", null);
        setField(term143062, term143062.getClass(), "typeRegistry", null);
        setField(term143062, term143062.getClass(), "topScope", null);
        setField(term143062, term143062.getClass(), "scopeCreator", null);
        setField(term143062, term143062.getClass(), "reportMissingOverride", null);
        setField(term143062, term143062.getClass(), "reportUnknownTypes", null);
        setBooleanField(term143062, term143062.getClass(), "reportMissingProperties", false);
        setField(term143062, term143062.getClass(), "inferJSDocInfo", null);
        setIntField(term143062, term143062.getClass(), "typedCount", 0);
        setIntField(term143062, term143062.getClass(), "nullCount", 0);
        setIntField(term143062, term143062.getClass(), "unknownCount", 0);
        setBooleanField(term143062, term143062.getClass(), "inExterns", false);
        setIntField(term143062, term143062.getClass(), "noTypeCheckSection", 0);
        term143064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term143064, term143064.getClass(), "type", 132);
        setField(term143064, term143064.getClass(), "next", null);
        setField(term143064, term143064.getClass(), "first", null);
        setField(term143064, term143064.getClass(), "last", null);
        setField(term143064, term143064.getClass(), "propListHead", null);
        setIntField(term143064, term143064.getClass(), "sourcePosition", 0);
        setField(term143064, term143064.getClass(), "jsType", null);
        setField(term143064, term143064.getClass(), "parent", null);
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
        args[1] = term143038;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term142878, args);
        assertTrue(recursiveEquals(term142878, term143062));
        assertTrue(recursiveEquals(term143038, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


