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

public class TypeCheck_isPropertyTest_657275882969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260544;
     Object term260636;
     Object term261306;
     Object term261307;

    public TypeCheck_isPropertyTest_657275882969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260544 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term260636 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term260728 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term260820 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term260728, term260728.getClass(), "type", 26);
        setField(term260728, term260728.getClass(), "parent", term260820);
        setField(term260636, term260636.getClass(), "parent", term260728);
        term261306 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term261306, term261306.getClass(), "compiler", null);
        setField(term261306, term261306.getClass(), "validator", null);
        setField(term261306, term261306.getClass(), "reverseInterpreter", null);
        setField(term261306, term261306.getClass(), "typeRegistry", null);
        setField(term261306, term261306.getClass(), "topScope", null);
        setField(term261306, term261306.getClass(), "scopeCreator", null);
        setField(term261306, term261306.getClass(), "reportMissingOverride", null);
        setField(term261306, term261306.getClass(), "reportUnknownTypes", null);
        setBooleanField(term261306, term261306.getClass(), "reportMissingProperties", false);
        setField(term261306, term261306.getClass(), "inferJSDocInfo", null);
        setIntField(term261306, term261306.getClass(), "typedCount", 0);
        setIntField(term261306, term261306.getClass(), "nullCount", 0);
        setIntField(term261306, term261306.getClass(), "unknownCount", 0);
        setBooleanField(term261306, term261306.getClass(), "inExterns", false);
        setIntField(term261306, term261306.getClass(), "noTypeCheckSection", 0);
        term261307 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term261308 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term261309 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term261307, term261307.getClass(), "number", 0.0);
        setIntField(term261307, term261307.getClass(), "type", 0);
        setField(term261307, term261307.getClass(), "next", null);
        setField(term261307, term261307.getClass(), "first", null);
        setField(term261307, term261307.getClass(), "last", null);
        setField(term261307, term261307.getClass(), "propListHead", null);
        setIntField(term261307, term261307.getClass(), "sourcePosition", 0);
        setField(term261307, term261307.getClass(), "jsType", null);
        setDoubleField(term261308, term261308.getClass(), "number", 0.0);
        setIntField(term261308, term261308.getClass(), "type", 26);
        setField(term261308, term261308.getClass(), "next", null);
        setField(term261308, term261308.getClass(), "first", null);
        setField(term261308, term261308.getClass(), "last", null);
        setField(term261308, term261308.getClass(), "propListHead", null);
        setIntField(term261308, term261308.getClass(), "sourcePosition", 0);
        setField(term261308, term261308.getClass(), "jsType", null);
        setField(term261309, term261309.getClass(), "str", null);
        setIntField(term261309, term261309.getClass(), "type", 0);
        setField(term261309, term261309.getClass(), "next", null);
        setField(term261309, term261309.getClass(), "first", null);
        setField(term261309, term261309.getClass(), "last", null);
        setField(term261309, term261309.getClass(), "propListHead", null);
        setIntField(term261309, term261309.getClass(), "sourcePosition", 0);
        setField(term261309, term261309.getClass(), "jsType", null);
        setField(term261309, term261309.getClass(), "parent", null);
        setField(term261308, term261308.getClass(), "parent", term261309);
        setField(term261307, term261307.getClass(), "parent", term261308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term260636;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term260544, args);
        assertTrue(recursiveEquals(term260544, term261306));
        assertTrue(recursiveEquals(term260636, term261307));
        assertTrue(recursiveEquals(retValue, false));
    }

};


