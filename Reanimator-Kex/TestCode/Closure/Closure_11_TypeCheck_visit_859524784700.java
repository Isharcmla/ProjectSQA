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

public class TypeCheck_visit_859524784700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178804;
     Object term178896;
     Object term178913;
     Object term178914;

    public TypeCheck_visit_859524784700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178804 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term178896 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term178896, term178896.getClass(), "type", 77);
        term178913 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term178913, term178913.getClass(), "compiler", null);
        setField(term178913, term178913.getClass(), "validator", null);
        setField(term178913, term178913.getClass(), "reverseInterpreter", null);
        setField(term178913, term178913.getClass(), "typeRegistry", null);
        setField(term178913, term178913.getClass(), "topScope", null);
        setField(term178913, term178913.getClass(), "scopeCreator", null);
        setField(term178913, term178913.getClass(), "reportMissingOverride", null);
        setField(term178913, term178913.getClass(), "reportUnknownTypes", null);
        setBooleanField(term178913, term178913.getClass(), "reportMissingProperties", false);
        setField(term178913, term178913.getClass(), "inferJSDocInfo", null);
        setIntField(term178913, term178913.getClass(), "typedCount", 0);
        setIntField(term178913, term178913.getClass(), "nullCount", 0);
        setIntField(term178913, term178913.getClass(), "unknownCount", 0);
        setBooleanField(term178913, term178913.getClass(), "inExterns", false);
        setIntField(term178913, term178913.getClass(), "noTypeCheckSection", 0);
        term178914 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term178914, term178914.getClass(), "number", 0.0);
        setIntField(term178914, term178914.getClass(), "type", 77);
        setField(term178914, term178914.getClass(), "next", null);
        setField(term178914, term178914.getClass(), "first", null);
        setField(term178914, term178914.getClass(), "last", null);
        setField(term178914, term178914.getClass(), "propListHead", null);
        setIntField(term178914, term178914.getClass(), "sourcePosition", 0);
        setField(term178914, term178914.getClass(), "jsType", null);
        setField(term178914, term178914.getClass(), "parent", null);
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
        args[1] = term178896;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term178804, args);
        assertTrue(recursiveEquals(term178804, term178913));
        assertTrue(recursiveEquals(term178896, null));
    }

};


