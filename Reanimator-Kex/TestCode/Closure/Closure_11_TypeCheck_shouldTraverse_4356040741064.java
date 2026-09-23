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

public class TypeCheck_shouldTraverse_4356040741064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304643;
     Object term304803;
     Object term304828;
     Object term304830;

    public TypeCheck_shouldTraverse_4356040741064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304643 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term304733 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term304643, term304643.getClass(), "validator", term304733);
        setIntField(term304643, term304643.getClass(), "noTypeCheckSection", 0);
        term304803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term304803, term304803.getClass(), "type", 86);
        setField(term304803, term304803.getClass(), "propListHead", null);
        term304828 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term304829 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term304828, term304828.getClass(), "compiler", null);
        setField(term304829, term304829.getClass(), "compiler", null);
        setField(term304829, term304829.getClass(), "typeRegistry", null);
        setField(term304829, term304829.getClass(), "allValueTypes", null);
        setBooleanField(term304829, term304829.getClass(), "shouldReport", true);
        setField(term304829, term304829.getClass(), "nullOrUndefined", null);
        setField(term304829, term304829.getClass(), "mismatches", null);
        setField(term304828, term304828.getClass(), "validator", term304829);
        setField(term304828, term304828.getClass(), "reverseInterpreter", null);
        setField(term304828, term304828.getClass(), "typeRegistry", null);
        setField(term304828, term304828.getClass(), "topScope", null);
        setField(term304828, term304828.getClass(), "scopeCreator", null);
        setField(term304828, term304828.getClass(), "reportMissingOverride", null);
        setField(term304828, term304828.getClass(), "reportUnknownTypes", null);
        setBooleanField(term304828, term304828.getClass(), "reportMissingProperties", false);
        setField(term304828, term304828.getClass(), "inferJSDocInfo", null);
        setIntField(term304828, term304828.getClass(), "typedCount", 0);
        setIntField(term304828, term304828.getClass(), "nullCount", 0);
        setIntField(term304828, term304828.getClass(), "unknownCount", 0);
        setBooleanField(term304828, term304828.getClass(), "inExterns", false);
        setIntField(term304828, term304828.getClass(), "noTypeCheckSection", 0);
        term304830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term304830, term304830.getClass(), "type", 86);
        setField(term304830, term304830.getClass(), "next", null);
        setField(term304830, term304830.getClass(), "first", null);
        setField(term304830, term304830.getClass(), "last", null);
        setField(term304830, term304830.getClass(), "propListHead", null);
        setIntField(term304830, term304830.getClass(), "sourcePosition", 0);
        setField(term304830, term304830.getClass(), "jsType", null);
        setField(term304830, term304830.getClass(), "parent", null);
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
        args[1] = term304803;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term304643, args);
        assertTrue(recursiveEquals(term304643, term304828));
        assertTrue(recursiveEquals(term304803, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


