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

public class TypeCheck_shouldTraverse_435604074430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105964;
     Object term106124;
     Object term106149;
     Object term106151;

    public TypeCheck_shouldTraverse_435604074430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105964 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term106054 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term105964, term105964.getClass(), "validator", term106054);
        setIntField(term105964, term105964.getClass(), "noTypeCheckSection", 0);
        term106124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106124, term106124.getClass(), "type", 132);
        setField(term106124, term106124.getClass(), "propListHead", null);
        term106149 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term106150 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term106149, term106149.getClass(), "compiler", null);
        setField(term106150, term106150.getClass(), "compiler", null);
        setField(term106150, term106150.getClass(), "typeRegistry", null);
        setField(term106150, term106150.getClass(), "allValueTypes", null);
        setBooleanField(term106150, term106150.getClass(), "shouldReport", true);
        setField(term106150, term106150.getClass(), "nullOrUndefined", null);
        setField(term106150, term106150.getClass(), "mismatches", null);
        setField(term106149, term106149.getClass(), "validator", term106150);
        setField(term106149, term106149.getClass(), "reverseInterpreter", null);
        setField(term106149, term106149.getClass(), "typeRegistry", null);
        setField(term106149, term106149.getClass(), "topScope", null);
        setField(term106149, term106149.getClass(), "scopeCreator", null);
        setField(term106149, term106149.getClass(), "reportMissingOverride", null);
        setBooleanField(term106149, term106149.getClass(), "reportUnknownTypes", false);
        setBooleanField(term106149, term106149.getClass(), "reportMissingProperties", false);
        setField(term106149, term106149.getClass(), "inferJSDocInfo", null);
        setIntField(term106149, term106149.getClass(), "typedCount", 0);
        setIntField(term106149, term106149.getClass(), "nullCount", 0);
        setIntField(term106149, term106149.getClass(), "unknownCount", 0);
        setBooleanField(term106149, term106149.getClass(), "inExterns", false);
        setIntField(term106149, term106149.getClass(), "noTypeCheckSection", 0);
        setField(term106149, term106149.getClass(), "editDistance", null);
        term106151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106151, term106151.getClass(), "type", 132);
        setField(term106151, term106151.getClass(), "next", null);
        setField(term106151, term106151.getClass(), "first", null);
        setField(term106151, term106151.getClass(), "last", null);
        setField(term106151, term106151.getClass(), "propListHead", null);
        setIntField(term106151, term106151.getClass(), "sourcePosition", 0);
        setField(term106151, term106151.getClass(), "jsType", null);
        setField(term106151, term106151.getClass(), "parent", null);
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
        args[1] = term106124;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term105964, args);
        assertTrue(recursiveEquals(term105964, term106149));
        assertTrue(recursiveEquals(term106124, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


