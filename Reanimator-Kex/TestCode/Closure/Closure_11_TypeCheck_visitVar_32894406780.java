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

public class TypeCheck_visitVar_32894406780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200488;
     Object term200558;
     Object term200839;
     Object term200840;

    public TypeCheck_visitVar_32894406780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200488 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term200558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term200558, term200558.getClass(), "first", null);
        term200839 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term200839, term200839.getClass(), "compiler", null);
        setField(term200839, term200839.getClass(), "validator", null);
        setField(term200839, term200839.getClass(), "reverseInterpreter", null);
        setField(term200839, term200839.getClass(), "typeRegistry", null);
        setField(term200839, term200839.getClass(), "topScope", null);
        setField(term200839, term200839.getClass(), "scopeCreator", null);
        setField(term200839, term200839.getClass(), "reportMissingOverride", null);
        setField(term200839, term200839.getClass(), "reportUnknownTypes", null);
        setBooleanField(term200839, term200839.getClass(), "reportMissingProperties", false);
        setField(term200839, term200839.getClass(), "inferJSDocInfo", null);
        setIntField(term200839, term200839.getClass(), "typedCount", 0);
        setIntField(term200839, term200839.getClass(), "nullCount", 0);
        setIntField(term200839, term200839.getClass(), "unknownCount", 0);
        setBooleanField(term200839, term200839.getClass(), "inExterns", false);
        setIntField(term200839, term200839.getClass(), "noTypeCheckSection", 0);
        term200840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term200840, term200840.getClass(), "type", 0);
        setField(term200840, term200840.getClass(), "next", null);
        setField(term200840, term200840.getClass(), "first", null);
        setField(term200840, term200840.getClass(), "last", null);
        setField(term200840, term200840.getClass(), "propListHead", null);
        setIntField(term200840, term200840.getClass(), "sourcePosition", 0);
        setField(term200840, term200840.getClass(), "jsType", null);
        setField(term200840, term200840.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term200558;
        callMethod(klass, "visitVar", argTypes, term200488, args);
        assertTrue(recursiveEquals(term200488, term200839));
        assertTrue(recursiveEquals(term200558, null));
    }

};


