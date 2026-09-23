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

public class NodeTraversal_getLineNumber_66119140575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4813;
     Object term10918;

    public NodeTraversal_getLineNumber_66119140575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4813 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term4813, term4813.getClass(), "compiler", null);
        setField(term4813, term4813.getClass(), "callback", null);
        setField(term4813, term4813.getClass(), "curNode", null);
        setField(term4813, term4813.getClass(), "scopes", null);
        setField(term4813, term4813.getClass(), "scopeRoots", null);
        setField(term4813, term4813.getClass(), "cfgs", null);
        setField(term4813, term4813.getClass(), "sourceName", null);
        setField(term4813, term4813.getClass(), "inputId", null);
        setField(term4813, term4813.getClass(), "scopeCreator", null);
        setField(term4813, term4813.getClass(), "scopeCallback", null);
        term10918 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term10918, term10918.getClass(), "compiler", null);
        setField(term10918, term10918.getClass(), "callback", null);
        setField(term10918, term10918.getClass(), "curNode", null);
        setField(term10918, term10918.getClass(), "scopes", null);
        setField(term10918, term10918.getClass(), "scopeRoots", null);
        setField(term10918, term10918.getClass(), "cfgs", null);
        setField(term10918, term10918.getClass(), "sourceName", null);
        setField(term10918, term10918.getClass(), "inputId", null);
        setField(term10918, term10918.getClass(), "scopeCreator", null);
        setField(term10918, term10918.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLineNumber", argTypes, term4813, args);
        assertTrue(recursiveEquals(term4813, term10918));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


