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

public class TypeCheck_visit_859524784860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237796;
     Object term237888;
     Object term237913;
     Object term237914;

    public TypeCheck_visit_859524784860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237796 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term237888 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term237888, term237888.getClass(), "type", 115);
        term237913 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term237913, term237913.getClass(), "compiler", null);
        setField(term237913, term237913.getClass(), "validator", null);
        setField(term237913, term237913.getClass(), "reverseInterpreter", null);
        setField(term237913, term237913.getClass(), "typeRegistry", null);
        setField(term237913, term237913.getClass(), "topScope", null);
        setField(term237913, term237913.getClass(), "scopeCreator", null);
        setField(term237913, term237913.getClass(), "reportMissingOverride", null);
        setField(term237913, term237913.getClass(), "reportUnknownTypes", null);
        setBooleanField(term237913, term237913.getClass(), "reportMissingProperties", false);
        setField(term237913, term237913.getClass(), "inferJSDocInfo", null);
        setIntField(term237913, term237913.getClass(), "typedCount", 0);
        setIntField(term237913, term237913.getClass(), "nullCount", 0);
        setIntField(term237913, term237913.getClass(), "unknownCount", 0);
        setBooleanField(term237913, term237913.getClass(), "inExterns", false);
        setIntField(term237913, term237913.getClass(), "noTypeCheckSection", 0);
        term237914 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term237914, term237914.getClass(), "str", null);
        setIntField(term237914, term237914.getClass(), "type", 115);
        setField(term237914, term237914.getClass(), "next", null);
        setField(term237914, term237914.getClass(), "first", null);
        setField(term237914, term237914.getClass(), "last", null);
        setField(term237914, term237914.getClass(), "propListHead", null);
        setIntField(term237914, term237914.getClass(), "sourcePosition", 0);
        setField(term237914, term237914.getClass(), "jsType", null);
        setField(term237914, term237914.getClass(), "parent", null);
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
        args[1] = term237888;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term237796, args);
        assertTrue(recursiveEquals(term237796, term237913));
        assertTrue(recursiveEquals(term237888, null));
    }

};


