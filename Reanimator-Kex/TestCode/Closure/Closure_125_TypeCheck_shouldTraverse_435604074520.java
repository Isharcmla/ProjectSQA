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

public class TypeCheck_shouldTraverse_435604074520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136202;
     Object term136384;
     Object term136410;
     Object term136412;

    public TypeCheck_shouldTraverse_435604074520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136202 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term136292 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term136202, term136202.getClass(), "validator", term136292);
        setIntField(term136202, term136202.getClass(), "noTypeCheckSection", 0);
        term136384 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term136384, term136384.getClass(), "type", 86);
        setField(term136384, term136384.getClass(), "propListHead", null);
        term136410 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term136411 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term136410, term136410.getClass(), "compiler", null);
        setField(term136411, term136411.getClass(), "compiler", null);
        setField(term136411, term136411.getClass(), "typeRegistry", null);
        setField(term136411, term136411.getClass(), "allValueTypes", null);
        setBooleanField(term136411, term136411.getClass(), "shouldReport", true);
        setField(term136411, term136411.getClass(), "nullOrUndefined", null);
        setField(term136411, term136411.getClass(), "mismatches", null);
        setField(term136410, term136410.getClass(), "validator", term136411);
        setField(term136410, term136410.getClass(), "reverseInterpreter", null);
        setField(term136410, term136410.getClass(), "typeRegistry", null);
        setField(term136410, term136410.getClass(), "topScope", null);
        setField(term136410, term136410.getClass(), "scopeCreator", null);
        setField(term136410, term136410.getClass(), "reportMissingOverride", null);
        setBooleanField(term136410, term136410.getClass(), "reportUnknownTypes", false);
        setBooleanField(term136410, term136410.getClass(), "reportMissingProperties", false);
        setField(term136410, term136410.getClass(), "inferJSDocInfo", null);
        setIntField(term136410, term136410.getClass(), "typedCount", 0);
        setIntField(term136410, term136410.getClass(), "nullCount", 0);
        setIntField(term136410, term136410.getClass(), "unknownCount", 0);
        setBooleanField(term136410, term136410.getClass(), "inExterns", false);
        setIntField(term136410, term136410.getClass(), "noTypeCheckSection", 0);
        setField(term136410, term136410.getClass(), "editDistance", null);
        term136412 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term136412, term136412.getClass(), "number", 0.0);
        setIntField(term136412, term136412.getClass(), "type", 86);
        setField(term136412, term136412.getClass(), "next", null);
        setField(term136412, term136412.getClass(), "first", null);
        setField(term136412, term136412.getClass(), "last", null);
        setField(term136412, term136412.getClass(), "propListHead", null);
        setIntField(term136412, term136412.getClass(), "sourcePosition", 0);
        setField(term136412, term136412.getClass(), "jsType", null);
        setField(term136412, term136412.getClass(), "parent", null);
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
        args[1] = term136384;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term136202, args);
        assertTrue(recursiveEquals(term136202, term136410));
        assertTrue(recursiveEquals(term136384, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


