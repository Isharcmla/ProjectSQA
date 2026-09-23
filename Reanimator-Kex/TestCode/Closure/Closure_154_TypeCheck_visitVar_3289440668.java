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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TypeCheck_visitVar_3289440668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6528;

    public TypeCheck_visitVar_3289440668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6528 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term6528, term6528.getClass(), "compiler", null);
        setField(term6528, term6528.getClass(), "validator", null);
        setField(term6528, term6528.getClass(), "reverseInterpreter", null);
        setField(term6528, term6528.getClass(), "typeRegistry", null);
        setField(term6528, term6528.getClass(), "topScope", null);
        setField(term6528, term6528.getClass(), "scopeCreator", null);
        setField(term6528, term6528.getClass(), "reportMissingOverride", null);
        setField(term6528, term6528.getClass(), "reportUnknownTypes", null);
        setBooleanField(term6528, term6528.getClass(), "reportMissingProperties", false);
        setField(term6528, term6528.getClass(), "inferJSDocInfo", null);
        setIntField(term6528, term6528.getClass(), "typedCount", 0);
        setIntField(term6528, term6528.getClass(), "nullCount", 0);
        setIntField(term6528, term6528.getClass(), "unknownCount", 0);
        setBooleanField(term6528, term6528.getClass(), "inExterns", false);
        setIntField(term6528, term6528.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "visitVar", argTypes, term6528, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


