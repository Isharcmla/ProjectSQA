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

public class NameAnalyzer_getEnclosingFunctionDependencyScope_72238346245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2389;

    public NameAnalyzer_getEnclosingFunctionDependencyScope_72238346245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2389 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term2389, term2389.getClass(), "compiler", null);
        setField(term2389, term2389.getClass(), "allNames", null);
        setField(term2389, term2389.getClass(), "referenceGraph", null);
        setField(term2389, term2389.getClass(), "scopes", null);
        setBooleanField(term2389, term2389.getClass(), "removeUnreferenced", false);
        setField(term2389, term2389.getClass(), "globalNames", null);
        setField(term2389, term2389.getClass(), "changeProxy", null);
        setField(term2389, term2389.getClass(), "externalNames", null);
        setField(term2389, term2389.getClass(), "refNodes", null);
        setField(term2389, term2389.getClass(), "aliases", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getEnclosingFunctionDependencyScope", argTypes, term2389, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


