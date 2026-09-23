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

public class TypeCheck_visit_859524784982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264822;
     Object term264914;
     Object term265204;
     Object term265205;

    public TypeCheck_visit_859524784982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264822 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term264914 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term264914, term264914.getClass(), "type", 147);
        term265204 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term265204, term265204.getClass(), "compiler", null);
        setField(term265204, term265204.getClass(), "validator", null);
        setField(term265204, term265204.getClass(), "reverseInterpreter", null);
        setField(term265204, term265204.getClass(), "typeRegistry", null);
        setField(term265204, term265204.getClass(), "topScope", null);
        setField(term265204, term265204.getClass(), "scopeCreator", null);
        setField(term265204, term265204.getClass(), "reportMissingOverride", null);
        setField(term265204, term265204.getClass(), "reportUnknownTypes", null);
        setBooleanField(term265204, term265204.getClass(), "reportMissingProperties", false);
        setField(term265204, term265204.getClass(), "inferJSDocInfo", null);
        setIntField(term265204, term265204.getClass(), "typedCount", 0);
        setIntField(term265204, term265204.getClass(), "nullCount", 1);
        setIntField(term265204, term265204.getClass(), "unknownCount", 0);
        setBooleanField(term265204, term265204.getClass(), "inExterns", false);
        setIntField(term265204, term265204.getClass(), "noTypeCheckSection", 0);
        term265205 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term265205, term265205.getClass(), "number", 0.0);
        setIntField(term265205, term265205.getClass(), "type", 147);
        setField(term265205, term265205.getClass(), "next", null);
        setField(term265205, term265205.getClass(), "first", null);
        setField(term265205, term265205.getClass(), "last", null);
        setField(term265205, term265205.getClass(), "propListHead", null);
        setIntField(term265205, term265205.getClass(), "sourcePosition", 0);
        setField(term265205, term265205.getClass(), "jsType", null);
        setField(term265205, term265205.getClass(), "parent", null);
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
        args[1] = term264914;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term264822, args);
        assertTrue(recursiveEquals(term264822, term265204));
        assertTrue(recursiveEquals(term264914, null));
    }

};


