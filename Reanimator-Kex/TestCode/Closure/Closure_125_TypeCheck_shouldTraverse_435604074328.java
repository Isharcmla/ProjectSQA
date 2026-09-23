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

public class TypeCheck_shouldTraverse_435604074328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80062;
     Object term80222;
     Object term80265;
     Object term80267;

    public TypeCheck_shouldTraverse_435604074328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80062 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term80152 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term80062, term80062.getClass(), "validator", term80152);
        setIntField(term80062, term80062.getClass(), "noTypeCheckSection", 0);
        term80222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80222, term80222.getClass(), "type", 125);
        setField(term80222, term80222.getClass(), "propListHead", null);
        term80265 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term80266 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term80265, term80265.getClass(), "compiler", null);
        setField(term80266, term80266.getClass(), "compiler", null);
        setField(term80266, term80266.getClass(), "typeRegistry", null);
        setField(term80266, term80266.getClass(), "allValueTypes", null);
        setBooleanField(term80266, term80266.getClass(), "shouldReport", true);
        setField(term80266, term80266.getClass(), "nullOrUndefined", null);
        setField(term80266, term80266.getClass(), "mismatches", null);
        setField(term80265, term80265.getClass(), "validator", term80266);
        setField(term80265, term80265.getClass(), "reverseInterpreter", null);
        setField(term80265, term80265.getClass(), "typeRegistry", null);
        setField(term80265, term80265.getClass(), "topScope", null);
        setField(term80265, term80265.getClass(), "scopeCreator", null);
        setField(term80265, term80265.getClass(), "reportMissingOverride", null);
        setBooleanField(term80265, term80265.getClass(), "reportUnknownTypes", false);
        setBooleanField(term80265, term80265.getClass(), "reportMissingProperties", false);
        setField(term80265, term80265.getClass(), "inferJSDocInfo", null);
        setIntField(term80265, term80265.getClass(), "typedCount", 0);
        setIntField(term80265, term80265.getClass(), "nullCount", 0);
        setIntField(term80265, term80265.getClass(), "unknownCount", 0);
        setBooleanField(term80265, term80265.getClass(), "inExterns", false);
        setIntField(term80265, term80265.getClass(), "noTypeCheckSection", 0);
        setField(term80265, term80265.getClass(), "editDistance", null);
        term80267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80267, term80267.getClass(), "type", 125);
        setField(term80267, term80267.getClass(), "next", null);
        setField(term80267, term80267.getClass(), "first", null);
        setField(term80267, term80267.getClass(), "last", null);
        setField(term80267, term80267.getClass(), "propListHead", null);
        setIntField(term80267, term80267.getClass(), "sourcePosition", 0);
        setField(term80267, term80267.getClass(), "jsType", null);
        setField(term80267, term80267.getClass(), "parent", null);
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
        args[1] = term80222;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term80062, args);
        assertTrue(recursiveEquals(term80062, term80265));
        assertTrue(recursiveEquals(term80222, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


