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

public class TypeCheck_shouldTraverse_435604074822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222000;
     Object term222182;
     Object term222207;
     Object term222209;

    public TypeCheck_shouldTraverse_435604074822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222000 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term222090 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term222000, term222000.getClass(), "validator", term222090);
        setIntField(term222000, term222000.getClass(), "noTypeCheckSection", 0);
        term222182 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term222182, term222182.getClass(), "type", 125);
        setField(term222182, term222182.getClass(), "propListHead", null);
        term222207 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term222208 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term222207, term222207.getClass(), "compiler", null);
        setField(term222208, term222208.getClass(), "compiler", null);
        setField(term222208, term222208.getClass(), "typeRegistry", null);
        setField(term222208, term222208.getClass(), "allValueTypes", null);
        setBooleanField(term222208, term222208.getClass(), "shouldReport", true);
        setField(term222208, term222208.getClass(), "nullOrUndefined", null);
        setField(term222208, term222208.getClass(), "mismatches", null);
        setField(term222207, term222207.getClass(), "validator", term222208);
        setField(term222207, term222207.getClass(), "reverseInterpreter", null);
        setField(term222207, term222207.getClass(), "typeRegistry", null);
        setField(term222207, term222207.getClass(), "topScope", null);
        setField(term222207, term222207.getClass(), "scopeCreator", null);
        setField(term222207, term222207.getClass(), "reportMissingOverride", null);
        setField(term222207, term222207.getClass(), "reportUnknownTypes", null);
        setBooleanField(term222207, term222207.getClass(), "reportMissingProperties", false);
        setField(term222207, term222207.getClass(), "inferJSDocInfo", null);
        setIntField(term222207, term222207.getClass(), "typedCount", 0);
        setIntField(term222207, term222207.getClass(), "nullCount", 0);
        setIntField(term222207, term222207.getClass(), "unknownCount", 0);
        setBooleanField(term222207, term222207.getClass(), "inExterns", false);
        setIntField(term222207, term222207.getClass(), "noTypeCheckSection", 0);
        term222209 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term222209, term222209.getClass(), "number", 0.0);
        setIntField(term222209, term222209.getClass(), "type", 125);
        setField(term222209, term222209.getClass(), "next", null);
        setField(term222209, term222209.getClass(), "first", null);
        setField(term222209, term222209.getClass(), "last", null);
        setField(term222209, term222209.getClass(), "propListHead", null);
        setIntField(term222209, term222209.getClass(), "sourcePosition", 0);
        setField(term222209, term222209.getClass(), "jsType", null);
        setField(term222209, term222209.getClass(), "parent", null);
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
        args[1] = term222182;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term222000, args);
        assertTrue(recursiveEquals(term222000, term222207));
        assertTrue(recursiveEquals(term222182, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


