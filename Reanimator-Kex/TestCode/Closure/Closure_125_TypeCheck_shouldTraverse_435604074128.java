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

public class TypeCheck_shouldTraverse_435604074128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30923;
     Object term30993;
     Object term31008;
     Object term31009;

    public TypeCheck_shouldTraverse_435604074128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30923 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term30993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term31008 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term31008, term31008.getClass(), "compiler", null);
        setField(term31008, term31008.getClass(), "validator", null);
        setField(term31008, term31008.getClass(), "reverseInterpreter", null);
        setField(term31008, term31008.getClass(), "typeRegistry", null);
        setField(term31008, term31008.getClass(), "topScope", null);
        setField(term31008, term31008.getClass(), "scopeCreator", null);
        setField(term31008, term31008.getClass(), "reportMissingOverride", null);
        setBooleanField(term31008, term31008.getClass(), "reportUnknownTypes", false);
        setBooleanField(term31008, term31008.getClass(), "reportMissingProperties", false);
        setField(term31008, term31008.getClass(), "inferJSDocInfo", null);
        setIntField(term31008, term31008.getClass(), "typedCount", 0);
        setIntField(term31008, term31008.getClass(), "nullCount", 0);
        setIntField(term31008, term31008.getClass(), "unknownCount", 0);
        setBooleanField(term31008, term31008.getClass(), "inExterns", false);
        setIntField(term31008, term31008.getClass(), "noTypeCheckSection", 0);
        setField(term31008, term31008.getClass(), "editDistance", null);
        term31009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31009, term31009.getClass(), "type", 0);
        setField(term31009, term31009.getClass(), "next", null);
        setField(term31009, term31009.getClass(), "first", null);
        setField(term31009, term31009.getClass(), "last", null);
        setField(term31009, term31009.getClass(), "propListHead", null);
        setIntField(term31009, term31009.getClass(), "sourcePosition", 0);
        setField(term31009, term31009.getClass(), "jsType", null);
        setField(term31009, term31009.getClass(), "parent", null);
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
        args[1] = term30993;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term30923, args);
        assertTrue(recursiveEquals(term30923, term31008));
        assertTrue(recursiveEquals(term30993, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


