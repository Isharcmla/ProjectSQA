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

public class NodeTraversal_traverseInnerNode_128213290173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4653;

    public NodeTraversal_traverseInnerNode_128213290173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4653 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term4653, term4653.getClass(), "compiler", null);
        setField(term4653, term4653.getClass(), "callback", null);
        setField(term4653, term4653.getClass(), "curNode", null);
        setField(term4653, term4653.getClass(), "scopes", null);
        setField(term4653, term4653.getClass(), "scopeRoots", null);
        setField(term4653, term4653.getClass(), "cfgs", null);
        setField(term4653, term4653.getClass(), "sourceName", null);
        setField(term4653, term4653.getClass(), "inputId", null);
        setField(term4653, term4653.getClass(), "scopeCreator", null);
        setField(term4653, term4653.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "traverseInnerNode", argTypes, term4653, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


