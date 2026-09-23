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

public class TypeCheck_visitVar_32894406234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58127;
     Object term58197;
     Object term58231;
     Object term58232;

    public TypeCheck_visitVar_32894406234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58127 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term58197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term58197, term58197.getClass(), "first", null);
        term58231 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term58231, term58231.getClass(), "compiler", null);
        setField(term58231, term58231.getClass(), "validator", null);
        setField(term58231, term58231.getClass(), "reverseInterpreter", null);
        setField(term58231, term58231.getClass(), "typeRegistry", null);
        setField(term58231, term58231.getClass(), "topScope", null);
        setField(term58231, term58231.getClass(), "scopeCreator", null);
        setField(term58231, term58231.getClass(), "reportMissingOverride", null);
        setField(term58231, term58231.getClass(), "reportUnknownTypes", null);
        setBooleanField(term58231, term58231.getClass(), "reportMissingProperties", false);
        setField(term58231, term58231.getClass(), "inferJSDocInfo", null);
        setIntField(term58231, term58231.getClass(), "typedCount", 0);
        setIntField(term58231, term58231.getClass(), "nullCount", 0);
        setIntField(term58231, term58231.getClass(), "unknownCount", 0);
        setBooleanField(term58231, term58231.getClass(), "inExterns", false);
        setIntField(term58231, term58231.getClass(), "noTypeCheckSection", 0);
        term58232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58232, term58232.getClass(), "type", 0);
        setField(term58232, term58232.getClass(), "next", null);
        setField(term58232, term58232.getClass(), "first", null);
        setField(term58232, term58232.getClass(), "last", null);
        setField(term58232, term58232.getClass(), "propListHead", null);
        setIntField(term58232, term58232.getClass(), "sourcePosition", 0);
        setField(term58232, term58232.getClass(), "jsType", null);
        setField(term58232, term58232.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term58197;
        callMethod(klass, "visitVar", argTypes, term58127, args);
        assertTrue(recursiveEquals(term58127, term58231));
        assertTrue(recursiveEquals(term58197, null));
    }

};


