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

public class TypeCheck_checkEnumInitializer_1123305787118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32460;
     Object term32530;
     Object term32709;
     Object term32710;

    public TypeCheck_checkEnumInitializer_1123305787118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32460 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term32530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32530, term32530.getClass(), "type", 64);
        term32709 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term32709, term32709.getClass(), "compiler", null);
        setField(term32709, term32709.getClass(), "validator", null);
        setField(term32709, term32709.getClass(), "reverseInterpreter", null);
        setField(term32709, term32709.getClass(), "typeRegistry", null);
        setField(term32709, term32709.getClass(), "topScope", null);
        setField(term32709, term32709.getClass(), "scopeCreator", null);
        setField(term32709, term32709.getClass(), "reportMissingOverride", null);
        setField(term32709, term32709.getClass(), "reportUnknownTypes", null);
        setBooleanField(term32709, term32709.getClass(), "reportMissingProperties", false);
        setField(term32709, term32709.getClass(), "inferJSDocInfo", null);
        setIntField(term32709, term32709.getClass(), "typedCount", 0);
        setIntField(term32709, term32709.getClass(), "nullCount", 0);
        setIntField(term32709, term32709.getClass(), "unknownCount", 0);
        setBooleanField(term32709, term32709.getClass(), "inExterns", false);
        setIntField(term32709, term32709.getClass(), "noTypeCheckSection", 0);
        term32710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32710, term32710.getClass(), "type", 64);
        setField(term32710, term32710.getClass(), "next", null);
        setField(term32710, term32710.getClass(), "first", null);
        setField(term32710, term32710.getClass(), "last", null);
        setField(term32710, term32710.getClass(), "propListHead", null);
        setIntField(term32710, term32710.getClass(), "sourcePosition", 0);
        setField(term32710, term32710.getClass(), "jsType", null);
        setField(term32710, term32710.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term32530;
        args[2] = null;
        callMethod(klass, "checkEnumInitializer", argTypes, term32460, args);
        assertTrue(recursiveEquals(term32460, term32709));
        assertTrue(recursiveEquals(term32530, null));
    }

};


