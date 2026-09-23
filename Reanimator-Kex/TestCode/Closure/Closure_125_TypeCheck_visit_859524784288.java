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

public class TypeCheck_visit_859524784288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70450;
     Object term70610;
     Object term70893;
     Object term70895;

    public TypeCheck_visit_859524784288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70450 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term70540 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term70450, term70450.getClass(), "validator", term70540);
        setIntField(term70450, term70450.getClass(), "noTypeCheckSection", 0);
        term70610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term70610, term70610.getClass(), "type", 125);
        setField(term70610, term70610.getClass(), "propListHead", null);
        term70893 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term70894 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term70893, term70893.getClass(), "compiler", null);
        setField(term70894, term70894.getClass(), "compiler", null);
        setField(term70894, term70894.getClass(), "typeRegistry", null);
        setField(term70894, term70894.getClass(), "allValueTypes", null);
        setBooleanField(term70894, term70894.getClass(), "shouldReport", true);
        setField(term70894, term70894.getClass(), "nullOrUndefined", null);
        setField(term70894, term70894.getClass(), "mismatches", null);
        setField(term70893, term70893.getClass(), "validator", term70894);
        setField(term70893, term70893.getClass(), "reverseInterpreter", null);
        setField(term70893, term70893.getClass(), "typeRegistry", null);
        setField(term70893, term70893.getClass(), "topScope", null);
        setField(term70893, term70893.getClass(), "scopeCreator", null);
        setField(term70893, term70893.getClass(), "reportMissingOverride", null);
        setBooleanField(term70893, term70893.getClass(), "reportUnknownTypes", false);
        setBooleanField(term70893, term70893.getClass(), "reportMissingProperties", false);
        setField(term70893, term70893.getClass(), "inferJSDocInfo", null);
        setIntField(term70893, term70893.getClass(), "typedCount", 0);
        setIntField(term70893, term70893.getClass(), "nullCount", 0);
        setIntField(term70893, term70893.getClass(), "unknownCount", 0);
        setBooleanField(term70893, term70893.getClass(), "inExterns", false);
        setIntField(term70893, term70893.getClass(), "noTypeCheckSection", 0);
        setField(term70893, term70893.getClass(), "editDistance", null);
        term70895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term70895, term70895.getClass(), "type", 125);
        setField(term70895, term70895.getClass(), "next", null);
        setField(term70895, term70895.getClass(), "first", null);
        setField(term70895, term70895.getClass(), "last", null);
        setField(term70895, term70895.getClass(), "propListHead", null);
        setIntField(term70895, term70895.getClass(), "sourcePosition", 0);
        setField(term70895, term70895.getClass(), "jsType", null);
        setField(term70895, term70895.getClass(), "parent", null);
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
        args[1] = term70610;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term70450, args);
        assertTrue(recursiveEquals(term70450, term70893));
        assertTrue(recursiveEquals(term70610, null));
    }

};


