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

public class TypeCheck_visit_859524784600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161537;
     Object term161629;
     Object term161721;
     Object term161744;
     Object term161745;
     Object term161746;

    public TypeCheck_visit_859524784600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161537 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term161629 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term161629, term161629.getClass(), "type", 38);
        term161721 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term161721, term161721.getClass(), "type", 105);
        term161744 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term161744, term161744.getClass(), "compiler", null);
        setField(term161744, term161744.getClass(), "validator", null);
        setField(term161744, term161744.getClass(), "reverseInterpreter", null);
        setField(term161744, term161744.getClass(), "typeRegistry", null);
        setField(term161744, term161744.getClass(), "topScope", null);
        setField(term161744, term161744.getClass(), "scopeCreator", null);
        setField(term161744, term161744.getClass(), "reportMissingOverride", null);
        setBooleanField(term161744, term161744.getClass(), "reportUnknownTypes", false);
        setBooleanField(term161744, term161744.getClass(), "reportMissingProperties", false);
        setField(term161744, term161744.getClass(), "inferJSDocInfo", null);
        setIntField(term161744, term161744.getClass(), "typedCount", 0);
        setIntField(term161744, term161744.getClass(), "nullCount", 0);
        setIntField(term161744, term161744.getClass(), "unknownCount", 0);
        setBooleanField(term161744, term161744.getClass(), "inExterns", false);
        setIntField(term161744, term161744.getClass(), "noTypeCheckSection", 0);
        setField(term161744, term161744.getClass(), "editDistance", null);
        term161745 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term161745, term161745.getClass(), "str", null);
        setIntField(term161745, term161745.getClass(), "type", 38);
        setField(term161745, term161745.getClass(), "next", null);
        setField(term161745, term161745.getClass(), "first", null);
        setField(term161745, term161745.getClass(), "last", null);
        setField(term161745, term161745.getClass(), "propListHead", null);
        setIntField(term161745, term161745.getClass(), "sourcePosition", 0);
        setField(term161745, term161745.getClass(), "jsType", null);
        setField(term161745, term161745.getClass(), "parent", null);
        term161746 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term161746, term161746.getClass(), "str", null);
        setIntField(term161746, term161746.getClass(), "type", 105);
        setField(term161746, term161746.getClass(), "next", null);
        setField(term161746, term161746.getClass(), "first", null);
        setField(term161746, term161746.getClass(), "last", null);
        setField(term161746, term161746.getClass(), "propListHead", null);
        setIntField(term161746, term161746.getClass(), "sourcePosition", 0);
        setField(term161746, term161746.getClass(), "jsType", null);
        setField(term161746, term161746.getClass(), "parent", null);
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
        args[1] = term161629;
        args[2] = term161721;
        callMethod(klass, "visit", argTypes, term161537, args);
        assertTrue(recursiveEquals(term161537, term161744));
        assertTrue(recursiveEquals(term161629, term161746));
        assertTrue(recursiveEquals(term161721, null));
    }

};


