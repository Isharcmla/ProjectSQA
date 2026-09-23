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

public class TypeCheck_shouldTraverse_435604074486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123027;
     Object term123187;
     Object term123489;
     Object term123491;

    public TypeCheck_shouldTraverse_435604074486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123027 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term123117 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term123027, term123027.getClass(), "validator", term123117);
        setIntField(term123027, term123027.getClass(), "noTypeCheckSection", 0);
        term123187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term123187, term123187.getClass(), "type", 118);
        setField(term123187, term123187.getClass(), "propListHead", null);
        term123489 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term123490 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term123489, term123489.getClass(), "compiler", null);
        setField(term123490, term123490.getClass(), "compiler", null);
        setField(term123490, term123490.getClass(), "typeRegistry", null);
        setField(term123490, term123490.getClass(), "allValueTypes", null);
        setBooleanField(term123490, term123490.getClass(), "shouldReport", true);
        setField(term123490, term123490.getClass(), "nullOrUndefined", null);
        setField(term123490, term123490.getClass(), "mismatches", null);
        setField(term123489, term123489.getClass(), "validator", term123490);
        setField(term123489, term123489.getClass(), "reverseInterpreter", null);
        setField(term123489, term123489.getClass(), "typeRegistry", null);
        setField(term123489, term123489.getClass(), "topScope", null);
        setField(term123489, term123489.getClass(), "scopeCreator", null);
        setField(term123489, term123489.getClass(), "reportMissingOverride", null);
        setField(term123489, term123489.getClass(), "reportUnknownTypes", null);
        setBooleanField(term123489, term123489.getClass(), "reportMissingProperties", false);
        setField(term123489, term123489.getClass(), "inferJSDocInfo", null);
        setIntField(term123489, term123489.getClass(), "typedCount", 0);
        setIntField(term123489, term123489.getClass(), "nullCount", 0);
        setIntField(term123489, term123489.getClass(), "unknownCount", 0);
        setBooleanField(term123489, term123489.getClass(), "inExterns", false);
        setIntField(term123489, term123489.getClass(), "noTypeCheckSection", 0);
        term123491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term123491, term123491.getClass(), "type", 118);
        setField(term123491, term123491.getClass(), "next", null);
        setField(term123491, term123491.getClass(), "first", null);
        setField(term123491, term123491.getClass(), "last", null);
        setField(term123491, term123491.getClass(), "propListHead", null);
        setIntField(term123491, term123491.getClass(), "sourcePosition", 0);
        setField(term123491, term123491.getClass(), "jsType", null);
        setField(term123491, term123491.getClass(), "parent", null);
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
        args[1] = term123187;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term123027, args);
        assertTrue(recursiveEquals(term123027, term123489));
        assertTrue(recursiveEquals(term123187, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


