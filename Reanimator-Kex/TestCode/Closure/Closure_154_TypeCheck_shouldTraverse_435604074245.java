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

public class TypeCheck_shouldTraverse_435604074245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67212;
     Object term67372;
     Object term67396;
     Object term67398;

    public TypeCheck_shouldTraverse_435604074245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67212 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term67302 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term67212, term67212.getClass(), "validator", term67302);
        setIntField(term67212, term67212.getClass(), "noTypeCheckSection", 0);
        term67372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67372, term67372.getClass(), "type", 118);
        setField(term67372, term67372.getClass(), "propListHead", null);
        term67396 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term67397 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term67396, term67396.getClass(), "compiler", null);
        setField(term67397, term67397.getClass(), "compiler", null);
        setField(term67397, term67397.getClass(), "typeRegistry", null);
        setField(term67397, term67397.getClass(), "allValueTypes", null);
        setBooleanField(term67397, term67397.getClass(), "shouldReport", true);
        setField(term67397, term67397.getClass(), "nullOrUndefined", null);
        setField(term67397, term67397.getClass(), "mismatches", null);
        setField(term67396, term67396.getClass(), "validator", term67397);
        setField(term67396, term67396.getClass(), "reverseInterpreter", null);
        setField(term67396, term67396.getClass(), "typeRegistry", null);
        setField(term67396, term67396.getClass(), "topScope", null);
        setField(term67396, term67396.getClass(), "scopeCreator", null);
        setField(term67396, term67396.getClass(), "reportMissingOverride", null);
        setField(term67396, term67396.getClass(), "reportUnknownTypes", null);
        setBooleanField(term67396, term67396.getClass(), "reportMissingProperties", false);
        setField(term67396, term67396.getClass(), "inferJSDocInfo", null);
        setIntField(term67396, term67396.getClass(), "typedCount", 0);
        setIntField(term67396, term67396.getClass(), "nullCount", 0);
        setIntField(term67396, term67396.getClass(), "unknownCount", 0);
        setBooleanField(term67396, term67396.getClass(), "inExterns", false);
        setIntField(term67396, term67396.getClass(), "noTypeCheckSection", 0);
        term67398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67398, term67398.getClass(), "type", 118);
        setField(term67398, term67398.getClass(), "next", null);
        setField(term67398, term67398.getClass(), "first", null);
        setField(term67398, term67398.getClass(), "last", null);
        setField(term67398, term67398.getClass(), "propListHead", null);
        setIntField(term67398, term67398.getClass(), "sourcePosition", 0);
        setField(term67398, term67398.getClass(), "jsType", null);
        setField(term67398, term67398.getClass(), "parent", null);
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
        args[1] = term67372;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term67212, args);
        assertTrue(recursiveEquals(term67212, term67396));
        assertTrue(recursiveEquals(term67372, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


