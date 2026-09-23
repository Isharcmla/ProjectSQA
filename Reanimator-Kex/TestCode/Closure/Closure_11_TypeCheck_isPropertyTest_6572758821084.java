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

public class TypeCheck_isPropertyTest_6572758821084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309324;
     Object term309416;
     Object term309646;
     Object term309647;

    public TypeCheck_isPropertyTest_6572758821084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309324 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term309416 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term309508 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term309600 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term309508, term309508.getClass(), "type", 26);
        setField(term309508, term309508.getClass(), "parent", term309600);
        setField(term309416, term309416.getClass(), "parent", term309508);
        term309646 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term309646, term309646.getClass(), "compiler", null);
        setField(term309646, term309646.getClass(), "validator", null);
        setField(term309646, term309646.getClass(), "reverseInterpreter", null);
        setField(term309646, term309646.getClass(), "typeRegistry", null);
        setField(term309646, term309646.getClass(), "topScope", null);
        setField(term309646, term309646.getClass(), "scopeCreator", null);
        setField(term309646, term309646.getClass(), "reportMissingOverride", null);
        setField(term309646, term309646.getClass(), "reportUnknownTypes", null);
        setBooleanField(term309646, term309646.getClass(), "reportMissingProperties", false);
        setField(term309646, term309646.getClass(), "inferJSDocInfo", null);
        setIntField(term309646, term309646.getClass(), "typedCount", 0);
        setIntField(term309646, term309646.getClass(), "nullCount", 0);
        setIntField(term309646, term309646.getClass(), "unknownCount", 0);
        setBooleanField(term309646, term309646.getClass(), "inExterns", false);
        setIntField(term309646, term309646.getClass(), "noTypeCheckSection", 0);
        term309647 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term309648 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term309649 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term309647, term309647.getClass(), "number", 0.0);
        setIntField(term309647, term309647.getClass(), "type", 0);
        setField(term309647, term309647.getClass(), "next", null);
        setField(term309647, term309647.getClass(), "first", null);
        setField(term309647, term309647.getClass(), "last", null);
        setField(term309647, term309647.getClass(), "propListHead", null);
        setIntField(term309647, term309647.getClass(), "sourcePosition", 0);
        setField(term309647, term309647.getClass(), "jsType", null);
        setDoubleField(term309648, term309648.getClass(), "number", 0.0);
        setIntField(term309648, term309648.getClass(), "type", 26);
        setField(term309648, term309648.getClass(), "next", null);
        setField(term309648, term309648.getClass(), "first", null);
        setField(term309648, term309648.getClass(), "last", null);
        setField(term309648, term309648.getClass(), "propListHead", null);
        setIntField(term309648, term309648.getClass(), "sourcePosition", 0);
        setField(term309648, term309648.getClass(), "jsType", null);
        setDoubleField(term309649, term309649.getClass(), "number", 0.0);
        setIntField(term309649, term309649.getClass(), "type", 0);
        setField(term309649, term309649.getClass(), "next", null);
        setField(term309649, term309649.getClass(), "first", null);
        setField(term309649, term309649.getClass(), "last", null);
        setField(term309649, term309649.getClass(), "propListHead", null);
        setIntField(term309649, term309649.getClass(), "sourcePosition", 0);
        setField(term309649, term309649.getClass(), "jsType", null);
        setField(term309649, term309649.getClass(), "parent", null);
        setField(term309648, term309648.getClass(), "parent", term309649);
        setField(term309647, term309647.getClass(), "parent", term309648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term309416;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term309324, args);
        assertTrue(recursiveEquals(term309324, term309646));
        assertTrue(recursiveEquals(term309416, term309647));
        assertTrue(recursiveEquals(retValue, false));
    }

};


