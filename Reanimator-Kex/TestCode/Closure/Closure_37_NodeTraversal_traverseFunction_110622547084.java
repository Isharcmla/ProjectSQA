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

public class NodeTraversal_traverseFunction_110622547084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5471;

    public NodeTraversal_traverseFunction_110622547084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5471 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term5471, term5471.getClass(), "compiler", null);
        setField(term5471, term5471.getClass(), "callback", null);
        setField(term5471, term5471.getClass(), "curNode", null);
        setField(term5471, term5471.getClass(), "scopes", null);
        setField(term5471, term5471.getClass(), "scopeRoots", null);
        setField(term5471, term5471.getClass(), "cfgs", null);
        setField(term5471, term5471.getClass(), "sourceName", null);
        setField(term5471, term5471.getClass(), "inputId", null);
        setField(term5471, term5471.getClass(), "scopeCreator", null);
        setField(term5471, term5471.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "traverseFunction", argTypes, term5471, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


