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

public class TypeCheck_visit_859524784663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178600;
     Object term178692;
     Object term178784;
     Object term179346;
     Object term179347;
     Object term179348;

    public TypeCheck_visit_859524784663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178600 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term178692 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term178692, term178692.getClass(), "type", 38);
        term178784 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term178784, term178784.getClass(), "type", 83);
        term179346 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term179346, term179346.getClass(), "compiler", null);
        setField(term179346, term179346.getClass(), "validator", null);
        setField(term179346, term179346.getClass(), "reverseInterpreter", null);
        setField(term179346, term179346.getClass(), "typeRegistry", null);
        setField(term179346, term179346.getClass(), "topScope", null);
        setField(term179346, term179346.getClass(), "scopeCreator", null);
        setField(term179346, term179346.getClass(), "reportMissingOverride", null);
        setBooleanField(term179346, term179346.getClass(), "reportUnknownTypes", false);
        setBooleanField(term179346, term179346.getClass(), "reportMissingProperties", false);
        setField(term179346, term179346.getClass(), "inferJSDocInfo", null);
        setIntField(term179346, term179346.getClass(), "typedCount", 0);
        setIntField(term179346, term179346.getClass(), "nullCount", 0);
        setIntField(term179346, term179346.getClass(), "unknownCount", 0);
        setBooleanField(term179346, term179346.getClass(), "inExterns", false);
        setIntField(term179346, term179346.getClass(), "noTypeCheckSection", 0);
        setField(term179346, term179346.getClass(), "editDistance", null);
        term179347 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term179347, term179347.getClass(), "str", null);
        setIntField(term179347, term179347.getClass(), "type", 38);
        setField(term179347, term179347.getClass(), "next", null);
        setField(term179347, term179347.getClass(), "first", null);
        setField(term179347, term179347.getClass(), "last", null);
        setField(term179347, term179347.getClass(), "propListHead", null);
        setIntField(term179347, term179347.getClass(), "sourcePosition", 0);
        setField(term179347, term179347.getClass(), "jsType", null);
        setField(term179347, term179347.getClass(), "parent", null);
        term179348 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term179348, term179348.getClass(), "str", null);
        setIntField(term179348, term179348.getClass(), "type", 83);
        setField(term179348, term179348.getClass(), "next", null);
        setField(term179348, term179348.getClass(), "first", null);
        setField(term179348, term179348.getClass(), "last", null);
        setField(term179348, term179348.getClass(), "propListHead", null);
        setIntField(term179348, term179348.getClass(), "sourcePosition", 0);
        setField(term179348, term179348.getClass(), "jsType", null);
        setField(term179348, term179348.getClass(), "parent", null);
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
        args[1] = term178692;
        args[2] = term178784;
        callMethod(klass, "visit", argTypes, term178600, args);
        assertTrue(recursiveEquals(term178600, term179346));
        assertTrue(recursiveEquals(term178692, term179348));
        assertTrue(recursiveEquals(term178784, null));
    }

};


