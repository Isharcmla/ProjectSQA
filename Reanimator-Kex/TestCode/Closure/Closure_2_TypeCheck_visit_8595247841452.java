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

public class TypeCheck_visit_8595247841452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462690;
     Object term462782;
     Object term462874;
     Object term462898;
     Object term462899;
     Object term462900;

    public TypeCheck_visit_8595247841452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462690 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term462782 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term462782, term462782.getClass(), "type", 38);
        term462874 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term462874, term462874.getClass(), "type", 83);
        term462898 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term462898, term462898.getClass(), "compiler", null);
        setField(term462898, term462898.getClass(), "validator", null);
        setField(term462898, term462898.getClass(), "reverseInterpreter", null);
        setField(term462898, term462898.getClass(), "typeRegistry", null);
        setField(term462898, term462898.getClass(), "topScope", null);
        setField(term462898, term462898.getClass(), "scopeCreator", null);
        setField(term462898, term462898.getClass(), "reportMissingOverride", null);
        setField(term462898, term462898.getClass(), "reportUnknownTypes", null);
        setBooleanField(term462898, term462898.getClass(), "reportMissingProperties", false);
        setField(term462898, term462898.getClass(), "inferJSDocInfo", null);
        setIntField(term462898, term462898.getClass(), "typedCount", 0);
        setIntField(term462898, term462898.getClass(), "nullCount", 0);
        setIntField(term462898, term462898.getClass(), "unknownCount", 0);
        setBooleanField(term462898, term462898.getClass(), "inExterns", false);
        setIntField(term462898, term462898.getClass(), "noTypeCheckSection", 0);
        term462899 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term462899, term462899.getClass(), "str", null);
        setIntField(term462899, term462899.getClass(), "type", 38);
        setField(term462899, term462899.getClass(), "next", null);
        setField(term462899, term462899.getClass(), "first", null);
        setField(term462899, term462899.getClass(), "last", null);
        setField(term462899, term462899.getClass(), "propListHead", null);
        setIntField(term462899, term462899.getClass(), "sourcePosition", 0);
        setField(term462899, term462899.getClass(), "jsType", null);
        setField(term462899, term462899.getClass(), "parent", null);
        term462900 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term462900, term462900.getClass(), "str", null);
        setIntField(term462900, term462900.getClass(), "type", 83);
        setField(term462900, term462900.getClass(), "next", null);
        setField(term462900, term462900.getClass(), "first", null);
        setField(term462900, term462900.getClass(), "last", null);
        setField(term462900, term462900.getClass(), "propListHead", null);
        setIntField(term462900, term462900.getClass(), "sourcePosition", 0);
        setField(term462900, term462900.getClass(), "jsType", null);
        setField(term462900, term462900.getClass(), "parent", null);
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
        args[1] = term462782;
        args[2] = term462874;
        callMethod(klass, "visit", argTypes, term462690, args);
        assertTrue(recursiveEquals(term462690, term462898));
        assertTrue(recursiveEquals(term462782, term462900));
        assertTrue(recursiveEquals(term462874, null));
    }

};


