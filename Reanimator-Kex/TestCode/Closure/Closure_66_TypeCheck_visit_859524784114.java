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

public class TypeCheck_visit_859524784114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31854;
     Object term31924;
     Object term32208;
     Object term32209;

    public TypeCheck_visit_859524784114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31854 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term31924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31924, term31924.getClass(), "type", 147);
        term32208 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term32208, term32208.getClass(), "compiler", null);
        setField(term32208, term32208.getClass(), "validator", null);
        setField(term32208, term32208.getClass(), "reverseInterpreter", null);
        setField(term32208, term32208.getClass(), "typeRegistry", null);
        setField(term32208, term32208.getClass(), "topScope", null);
        setField(term32208, term32208.getClass(), "scopeCreator", null);
        setField(term32208, term32208.getClass(), "reportMissingOverride", null);
        setField(term32208, term32208.getClass(), "reportUnknownTypes", null);
        setBooleanField(term32208, term32208.getClass(), "reportMissingProperties", false);
        setField(term32208, term32208.getClass(), "inferJSDocInfo", null);
        setIntField(term32208, term32208.getClass(), "typedCount", 0);
        setIntField(term32208, term32208.getClass(), "nullCount", 1);
        setIntField(term32208, term32208.getClass(), "unknownCount", 0);
        setBooleanField(term32208, term32208.getClass(), "inExterns", false);
        setIntField(term32208, term32208.getClass(), "noTypeCheckSection", 0);
        term32209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32209, term32209.getClass(), "type", 147);
        setField(term32209, term32209.getClass(), "next", null);
        setField(term32209, term32209.getClass(), "first", null);
        setField(term32209, term32209.getClass(), "last", null);
        setField(term32209, term32209.getClass(), "propListHead", null);
        setIntField(term32209, term32209.getClass(), "sourcePosition", 0);
        setField(term32209, term32209.getClass(), "jsType", null);
        setField(term32209, term32209.getClass(), "parent", null);
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
        args[1] = term31924;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term31854, args);
        assertTrue(recursiveEquals(term31854, term32208));
        assertTrue(recursiveEquals(term31924, null));
    }

};


