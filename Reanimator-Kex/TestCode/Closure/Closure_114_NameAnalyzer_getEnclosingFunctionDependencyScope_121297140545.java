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

public class NameAnalyzer_getEnclosingFunctionDependencyScope_121297140545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2138;

    public NameAnalyzer_getEnclosingFunctionDependencyScope_121297140545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2138 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term2138, term2138.getClass(), "compiler", null);
        setField(term2138, term2138.getClass(), "allNames", null);
        setField(term2138, term2138.getClass(), "referenceGraph", null);
        setField(term2138, term2138.getClass(), "scopes", null);
        setBooleanField(term2138, term2138.getClass(), "removeUnreferenced", false);
        setField(term2138, term2138.getClass(), "globalNames", null);
        setField(term2138, term2138.getClass(), "changeProxy", null);
        setField(term2138, term2138.getClass(), "externalNames", null);
        setField(term2138, term2138.getClass(), "refNodes", null);
        setField(term2138, term2138.getClass(), "aliases", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getEnclosingFunctionDependencyScope", argTypes, term2138, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


