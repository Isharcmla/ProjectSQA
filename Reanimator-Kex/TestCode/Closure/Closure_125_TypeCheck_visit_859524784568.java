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

public class TypeCheck_visit_859524784568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152209;
     Object term152279;
     Object term152349;
     Object term152372;
     Object term152373;
     Object term152374;

    public TypeCheck_visit_859524784568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152209 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term152279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term152279, term152279.getClass(), "type", 38);
        term152349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term152349, term152349.getClass(), "type", 105);
        term152372 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term152372, term152372.getClass(), "compiler", null);
        setField(term152372, term152372.getClass(), "validator", null);
        setField(term152372, term152372.getClass(), "reverseInterpreter", null);
        setField(term152372, term152372.getClass(), "typeRegistry", null);
        setField(term152372, term152372.getClass(), "topScope", null);
        setField(term152372, term152372.getClass(), "scopeCreator", null);
        setField(term152372, term152372.getClass(), "reportMissingOverride", null);
        setBooleanField(term152372, term152372.getClass(), "reportUnknownTypes", false);
        setBooleanField(term152372, term152372.getClass(), "reportMissingProperties", false);
        setField(term152372, term152372.getClass(), "inferJSDocInfo", null);
        setIntField(term152372, term152372.getClass(), "typedCount", 0);
        setIntField(term152372, term152372.getClass(), "nullCount", 0);
        setIntField(term152372, term152372.getClass(), "unknownCount", 0);
        setBooleanField(term152372, term152372.getClass(), "inExterns", false);
        setIntField(term152372, term152372.getClass(), "noTypeCheckSection", 0);
        setField(term152372, term152372.getClass(), "editDistance", null);
        term152373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term152373, term152373.getClass(), "type", 38);
        setField(term152373, term152373.getClass(), "next", null);
        setField(term152373, term152373.getClass(), "first", null);
        setField(term152373, term152373.getClass(), "last", null);
        setField(term152373, term152373.getClass(), "propListHead", null);
        setIntField(term152373, term152373.getClass(), "sourcePosition", 0);
        setField(term152373, term152373.getClass(), "jsType", null);
        setField(term152373, term152373.getClass(), "parent", null);
        term152374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term152374, term152374.getClass(), "type", 105);
        setField(term152374, term152374.getClass(), "next", null);
        setField(term152374, term152374.getClass(), "first", null);
        setField(term152374, term152374.getClass(), "last", null);
        setField(term152374, term152374.getClass(), "propListHead", null);
        setIntField(term152374, term152374.getClass(), "sourcePosition", 0);
        setField(term152374, term152374.getClass(), "jsType", null);
        setField(term152374, term152374.getClass(), "parent", null);
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
        args[1] = term152279;
        args[2] = term152349;
        callMethod(klass, "visit", argTypes, term152209, args);
        assertTrue(recursiveEquals(term152209, term152372));
        assertTrue(recursiveEquals(term152279, term152374));
        assertTrue(recursiveEquals(term152349, null));
    }

};


