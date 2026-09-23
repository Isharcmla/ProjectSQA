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

public class TypeCheck_visit_8595247841276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378115;
     Object term378207;
     Object term378299;
     Object term378339;
     Object term378340;
     Object term378341;

    public TypeCheck_visit_8595247841276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378115 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term378207 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term378207, term378207.getClass(), "type", 38);
        term378299 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term378299, term378299.getClass(), "type", 105);
        term378339 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term378339, term378339.getClass(), "compiler", null);
        setField(term378339, term378339.getClass(), "validator", null);
        setField(term378339, term378339.getClass(), "reverseInterpreter", null);
        setField(term378339, term378339.getClass(), "typeRegistry", null);
        setField(term378339, term378339.getClass(), "topScope", null);
        setField(term378339, term378339.getClass(), "scopeCreator", null);
        setField(term378339, term378339.getClass(), "reportMissingOverride", null);
        setField(term378339, term378339.getClass(), "reportUnknownTypes", null);
        setBooleanField(term378339, term378339.getClass(), "reportMissingProperties", false);
        setField(term378339, term378339.getClass(), "inferJSDocInfo", null);
        setIntField(term378339, term378339.getClass(), "typedCount", 0);
        setIntField(term378339, term378339.getClass(), "nullCount", 0);
        setIntField(term378339, term378339.getClass(), "unknownCount", 0);
        setBooleanField(term378339, term378339.getClass(), "inExterns", false);
        setIntField(term378339, term378339.getClass(), "noTypeCheckSection", 0);
        term378340 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term378340, term378340.getClass(), "str", null);
        setIntField(term378340, term378340.getClass(), "type", 38);
        setField(term378340, term378340.getClass(), "next", null);
        setField(term378340, term378340.getClass(), "first", null);
        setField(term378340, term378340.getClass(), "last", null);
        setField(term378340, term378340.getClass(), "propListHead", null);
        setIntField(term378340, term378340.getClass(), "sourcePosition", 0);
        setField(term378340, term378340.getClass(), "jsType", null);
        setField(term378340, term378340.getClass(), "parent", null);
        term378341 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term378341, term378341.getClass(), "str", null);
        setIntField(term378341, term378341.getClass(), "type", 105);
        setField(term378341, term378341.getClass(), "next", null);
        setField(term378341, term378341.getClass(), "first", null);
        setField(term378341, term378341.getClass(), "last", null);
        setField(term378341, term378341.getClass(), "propListHead", null);
        setIntField(term378341, term378341.getClass(), "sourcePosition", 0);
        setField(term378341, term378341.getClass(), "jsType", null);
        setField(term378341, term378341.getClass(), "parent", null);
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
        args[1] = term378207;
        args[2] = term378299;
        callMethod(klass, "visit", argTypes, term378115, args);
        assertTrue(recursiveEquals(term378115, term378339));
        assertTrue(recursiveEquals(term378207, term378341));
        assertTrue(recursiveEquals(term378299, null));
    }

};


