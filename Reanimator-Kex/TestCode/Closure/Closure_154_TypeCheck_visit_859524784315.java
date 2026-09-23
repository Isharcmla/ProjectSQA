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

public class TypeCheck_visit_859524784315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87828;
     Object term87898;
     Object term87914;
     Object term87915;

    public TypeCheck_visit_859524784315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87828 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term87898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87898, term87898.getClass(), "type", 113);
        term87914 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term87914, term87914.getClass(), "compiler", null);
        setField(term87914, term87914.getClass(), "validator", null);
        setField(term87914, term87914.getClass(), "reverseInterpreter", null);
        setField(term87914, term87914.getClass(), "typeRegistry", null);
        setField(term87914, term87914.getClass(), "topScope", null);
        setField(term87914, term87914.getClass(), "scopeCreator", null);
        setField(term87914, term87914.getClass(), "reportMissingOverride", null);
        setField(term87914, term87914.getClass(), "reportUnknownTypes", null);
        setBooleanField(term87914, term87914.getClass(), "reportMissingProperties", false);
        setField(term87914, term87914.getClass(), "inferJSDocInfo", null);
        setIntField(term87914, term87914.getClass(), "typedCount", 0);
        setIntField(term87914, term87914.getClass(), "nullCount", 0);
        setIntField(term87914, term87914.getClass(), "unknownCount", 0);
        setBooleanField(term87914, term87914.getClass(), "inExterns", false);
        setIntField(term87914, term87914.getClass(), "noTypeCheckSection", 0);
        term87915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87915, term87915.getClass(), "type", 113);
        setField(term87915, term87915.getClass(), "next", null);
        setField(term87915, term87915.getClass(), "first", null);
        setField(term87915, term87915.getClass(), "last", null);
        setField(term87915, term87915.getClass(), "propListHead", null);
        setIntField(term87915, term87915.getClass(), "sourcePosition", 0);
        setField(term87915, term87915.getClass(), "jsType", null);
        setField(term87915, term87915.getClass(), "parent", null);
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
        args[1] = term87898;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term87828, args);
        assertTrue(recursiveEquals(term87828, term87914));
        assertTrue(recursiveEquals(term87898, null));
    }

};


