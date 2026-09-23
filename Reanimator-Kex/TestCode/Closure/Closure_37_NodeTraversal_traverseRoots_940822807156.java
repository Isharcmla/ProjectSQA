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
import java.util.ArrayList;

public class NodeTraversal_traverseRoots_940822807156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33276;
     Object term33328;
     Object term33335;
     Object term33336;

    public NodeTraversal_traverseRoots_940822807156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33276 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term33328 = new ArrayList();
        term33335 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term33335, term33335.getClass(), "compiler", null);
        setField(term33335, term33335.getClass(), "callback", null);
        setField(term33335, term33335.getClass(), "curNode", null);
        setField(term33335, term33335.getClass(), "scopes", null);
        setField(term33335, term33335.getClass(), "scopeRoots", null);
        setField(term33335, term33335.getClass(), "cfgs", null);
        setField(term33335, term33335.getClass(), "sourceName", null);
        setField(term33335, term33335.getClass(), "inputId", null);
        setField(term33335, term33335.getClass(), "scopeCreator", null);
        setField(term33335, term33335.getClass(), "scopeCallback", null);
        term33336 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term33328;
        callMethod(klass, "traverseRoots", argTypes, term33276, args);
        assertTrue(recursiveEquals(term33276, term33335));
        assertTrue(recursiveEquals(term33328, term33336));
    }

};


