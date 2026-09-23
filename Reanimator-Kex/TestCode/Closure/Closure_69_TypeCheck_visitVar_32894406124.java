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

public class TypeCheck_visitVar_32894406124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34478;
     Object term34548;
     Object term34818;
     Object term34819;

    public TypeCheck_visitVar_32894406124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34478 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term34548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term34548, term34548.getClass(), "first", null);
        term34818 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term34818, term34818.getClass(), "compiler", null);
        setField(term34818, term34818.getClass(), "validator", null);
        setField(term34818, term34818.getClass(), "reverseInterpreter", null);
        setField(term34818, term34818.getClass(), "typeRegistry", null);
        setField(term34818, term34818.getClass(), "topScope", null);
        setField(term34818, term34818.getClass(), "scopeCreator", null);
        setField(term34818, term34818.getClass(), "reportMissingOverride", null);
        setField(term34818, term34818.getClass(), "reportUnknownTypes", null);
        setBooleanField(term34818, term34818.getClass(), "reportMissingProperties", false);
        setField(term34818, term34818.getClass(), "inferJSDocInfo", null);
        setIntField(term34818, term34818.getClass(), "typedCount", 0);
        setIntField(term34818, term34818.getClass(), "nullCount", 0);
        setIntField(term34818, term34818.getClass(), "unknownCount", 0);
        setBooleanField(term34818, term34818.getClass(), "inExterns", false);
        setIntField(term34818, term34818.getClass(), "noTypeCheckSection", 0);
        term34819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34819, term34819.getClass(), "type", 0);
        setField(term34819, term34819.getClass(), "next", null);
        setField(term34819, term34819.getClass(), "first", null);
        setField(term34819, term34819.getClass(), "last", null);
        setField(term34819, term34819.getClass(), "propListHead", null);
        setIntField(term34819, term34819.getClass(), "sourcePosition", 0);
        setField(term34819, term34819.getClass(), "jsType", null);
        setField(term34819, term34819.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term34548;
        callMethod(klass, "visitVar", argTypes, term34478, args);
        assertTrue(recursiveEquals(term34478, term34818));
        assertTrue(recursiveEquals(term34548, null));
    }

};


