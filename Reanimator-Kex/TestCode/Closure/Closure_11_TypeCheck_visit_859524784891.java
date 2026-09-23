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

public class TypeCheck_visit_859524784891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233177;
     Object term233247;
     Object term233428;
     Object term233429;

    public TypeCheck_visit_859524784891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233177 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term233247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term233247, term233247.getClass(), "type", 110);
        term233428 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term233428, term233428.getClass(), "compiler", null);
        setField(term233428, term233428.getClass(), "validator", null);
        setField(term233428, term233428.getClass(), "reverseInterpreter", null);
        setField(term233428, term233428.getClass(), "typeRegistry", null);
        setField(term233428, term233428.getClass(), "topScope", null);
        setField(term233428, term233428.getClass(), "scopeCreator", null);
        setField(term233428, term233428.getClass(), "reportMissingOverride", null);
        setField(term233428, term233428.getClass(), "reportUnknownTypes", null);
        setBooleanField(term233428, term233428.getClass(), "reportMissingProperties", false);
        setField(term233428, term233428.getClass(), "inferJSDocInfo", null);
        setIntField(term233428, term233428.getClass(), "typedCount", 0);
        setIntField(term233428, term233428.getClass(), "nullCount", 0);
        setIntField(term233428, term233428.getClass(), "unknownCount", 0);
        setBooleanField(term233428, term233428.getClass(), "inExterns", false);
        setIntField(term233428, term233428.getClass(), "noTypeCheckSection", 0);
        term233429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term233429, term233429.getClass(), "type", 110);
        setField(term233429, term233429.getClass(), "next", null);
        setField(term233429, term233429.getClass(), "first", null);
        setField(term233429, term233429.getClass(), "last", null);
        setField(term233429, term233429.getClass(), "propListHead", null);
        setIntField(term233429, term233429.getClass(), "sourcePosition", 0);
        setField(term233429, term233429.getClass(), "jsType", null);
        setField(term233429, term233429.getClass(), "parent", null);
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
        args[1] = term233247;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term233177, args);
        assertTrue(recursiveEquals(term233177, term233428));
        assertTrue(recursiveEquals(term233247, null));
    }

};


