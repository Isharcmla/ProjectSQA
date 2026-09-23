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

public class TypeCheck_shouldTraverse_435604074558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147621;
     Object term147803;
     Object term147827;
     Object term147829;

    public TypeCheck_shouldTraverse_435604074558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147621 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term147711 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term147621, term147621.getClass(), "validator", term147711);
        setIntField(term147621, term147621.getClass(), "noTypeCheckSection", 0);
        term147803 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term147803, term147803.getClass(), "type", 86);
        setField(term147803, term147803.getClass(), "propListHead", null);
        term147827 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term147828 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term147827, term147827.getClass(), "compiler", null);
        setField(term147828, term147828.getClass(), "compiler", null);
        setField(term147828, term147828.getClass(), "typeRegistry", null);
        setField(term147828, term147828.getClass(), "allValueTypes", null);
        setBooleanField(term147828, term147828.getClass(), "shouldReport", true);
        setField(term147828, term147828.getClass(), "nullOrUndefined", null);
        setField(term147828, term147828.getClass(), "mismatches", null);
        setField(term147827, term147827.getClass(), "validator", term147828);
        setField(term147827, term147827.getClass(), "reverseInterpreter", null);
        setField(term147827, term147827.getClass(), "typeRegistry", null);
        setField(term147827, term147827.getClass(), "topScope", null);
        setField(term147827, term147827.getClass(), "scopeCreator", null);
        setField(term147827, term147827.getClass(), "reportMissingOverride", null);
        setField(term147827, term147827.getClass(), "reportUnknownTypes", null);
        setBooleanField(term147827, term147827.getClass(), "reportMissingProperties", false);
        setField(term147827, term147827.getClass(), "inferJSDocInfo", null);
        setIntField(term147827, term147827.getClass(), "typedCount", 0);
        setIntField(term147827, term147827.getClass(), "nullCount", 0);
        setIntField(term147827, term147827.getClass(), "unknownCount", 0);
        setBooleanField(term147827, term147827.getClass(), "inExterns", false);
        setIntField(term147827, term147827.getClass(), "noTypeCheckSection", 0);
        term147829 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term147829, term147829.getClass(), "str", null);
        setIntField(term147829, term147829.getClass(), "type", 86);
        setField(term147829, term147829.getClass(), "next", null);
        setField(term147829, term147829.getClass(), "first", null);
        setField(term147829, term147829.getClass(), "last", null);
        setField(term147829, term147829.getClass(), "propListHead", null);
        setIntField(term147829, term147829.getClass(), "sourcePosition", 0);
        setField(term147829, term147829.getClass(), "jsType", null);
        setField(term147829, term147829.getClass(), "parent", null);
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
        args[1] = term147803;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term147621, args);
        assertTrue(recursiveEquals(term147621, term147827));
        assertTrue(recursiveEquals(term147803, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


