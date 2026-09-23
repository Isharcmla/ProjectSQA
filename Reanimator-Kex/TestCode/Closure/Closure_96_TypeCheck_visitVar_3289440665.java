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

public class TypeCheck_visitVar_3289440665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15647;

    public TypeCheck_visitVar_3289440665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15647 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term15647, term15647.getClass(), "compiler", null);
        setField(term15647, term15647.getClass(), "validator", null);
        setField(term15647, term15647.getClass(), "reverseInterpreter", null);
        setField(term15647, term15647.getClass(), "typeRegistry", null);
        setField(term15647, term15647.getClass(), "topScope", null);
        setField(term15647, term15647.getClass(), "scopeCreator", null);
        setField(term15647, term15647.getClass(), "reportMissingOverride", null);
        setField(term15647, term15647.getClass(), "reportUnknownTypes", null);
        setBooleanField(term15647, term15647.getClass(), "reportMissingProperties", false);
        setField(term15647, term15647.getClass(), "inferJSDocInfo", null);
        setIntField(term15647, term15647.getClass(), "typedCount", 0);
        setIntField(term15647, term15647.getClass(), "nullCount", 0);
        setIntField(term15647, term15647.getClass(), "unknownCount", 0);
        setBooleanField(term15647, term15647.getClass(), "inExterns", false);
        setIntField(term15647, term15647.getClass(), "noTypeCheckSection", 0);
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
            callMethod(klass, "visitVar", argTypes, term15647, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


