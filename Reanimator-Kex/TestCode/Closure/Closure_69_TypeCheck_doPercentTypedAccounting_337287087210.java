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

public class TypeCheck_doPercentTypedAccounting_337287087210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60660;
     Object term60730;
     Object term61117;
     Object term61118;

    public TypeCheck_doPercentTypedAccounting_337287087210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60660 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term60730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term60730, term60730.getClass(), "jsType", term60824);
        term61117 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term61117, term61117.getClass(), "compiler", null);
        setField(term61117, term61117.getClass(), "validator", null);
        setField(term61117, term61117.getClass(), "reverseInterpreter", null);
        setField(term61117, term61117.getClass(), "typeRegistry", null);
        setField(term61117, term61117.getClass(), "topScope", null);
        setField(term61117, term61117.getClass(), "scopeCreator", null);
        setField(term61117, term61117.getClass(), "reportMissingOverride", null);
        setField(term61117, term61117.getClass(), "reportUnknownTypes", null);
        setBooleanField(term61117, term61117.getClass(), "reportMissingProperties", false);
        setField(term61117, term61117.getClass(), "inferJSDocInfo", null);
        setIntField(term61117, term61117.getClass(), "typedCount", 1);
        setIntField(term61117, term61117.getClass(), "nullCount", 0);
        setIntField(term61117, term61117.getClass(), "unknownCount", 0);
        setBooleanField(term61117, term61117.getClass(), "inExterns", false);
        setIntField(term61117, term61117.getClass(), "noTypeCheckSection", 0);
        term61118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61119 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setIntField(term61118, term61118.getClass(), "type", 0);
        setField(term61118, term61118.getClass(), "next", null);
        setField(term61118, term61118.getClass(), "first", null);
        setField(term61118, term61118.getClass(), "last", null);
        setField(term61118, term61118.getClass(), "propListHead", null);
        setIntField(term61118, term61118.getClass(), "sourcePosition", 0);
        setField(term61119, term61119.getClass(), "parameters", null);
        setField(term61119, term61119.getClass(), "returnType", null);
        setBooleanField(term61119, term61119.getClass(), "returnTypeInferred", false);
        setBooleanField(term61119, term61119.getClass(), "resolved", false);
        setField(term61119, term61119.getClass(), "resolveResult", null);
        setField(term61119, term61119.getClass(), "registry", null);
        setField(term61118, term61118.getClass(), "jsType", term61119);
        setField(term61118, term61118.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term60730;
        callMethod(klass, "doPercentTypedAccounting", argTypes, term60660, args);
        assertTrue(recursiveEquals(term60660, term61117));
        assertTrue(recursiveEquals(term60730, null));
    }

};


