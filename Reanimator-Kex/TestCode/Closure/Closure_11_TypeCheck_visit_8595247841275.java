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

public class TypeCheck_visit_8595247841275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377919;
     Object term378011;
     Object term378316;
     Object term378317;

    public TypeCheck_visit_8595247841275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377919 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term378011 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term378011, term378011.getClass(), "type", 110);
        term378316 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term378316, term378316.getClass(), "compiler", null);
        setField(term378316, term378316.getClass(), "validator", null);
        setField(term378316, term378316.getClass(), "reverseInterpreter", null);
        setField(term378316, term378316.getClass(), "typeRegistry", null);
        setField(term378316, term378316.getClass(), "topScope", null);
        setField(term378316, term378316.getClass(), "scopeCreator", null);
        setField(term378316, term378316.getClass(), "reportMissingOverride", null);
        setField(term378316, term378316.getClass(), "reportUnknownTypes", null);
        setBooleanField(term378316, term378316.getClass(), "reportMissingProperties", false);
        setField(term378316, term378316.getClass(), "inferJSDocInfo", null);
        setIntField(term378316, term378316.getClass(), "typedCount", 0);
        setIntField(term378316, term378316.getClass(), "nullCount", 0);
        setIntField(term378316, term378316.getClass(), "unknownCount", 0);
        setBooleanField(term378316, term378316.getClass(), "inExterns", false);
        setIntField(term378316, term378316.getClass(), "noTypeCheckSection", 0);
        term378317 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term378317, term378317.getClass(), "number", 0.0);
        setIntField(term378317, term378317.getClass(), "type", 110);
        setField(term378317, term378317.getClass(), "next", null);
        setField(term378317, term378317.getClass(), "first", null);
        setField(term378317, term378317.getClass(), "last", null);
        setField(term378317, term378317.getClass(), "propListHead", null);
        setIntField(term378317, term378317.getClass(), "sourcePosition", 0);
        setField(term378317, term378317.getClass(), "jsType", null);
        setField(term378317, term378317.getClass(), "parent", null);
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
        args[1] = term378011;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term377919, args);
        assertTrue(recursiveEquals(term377919, term378316));
        assertTrue(recursiveEquals(term378011, null));
    }

};


