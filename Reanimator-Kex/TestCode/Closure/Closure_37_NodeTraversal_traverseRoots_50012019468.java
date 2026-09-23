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

public class NodeTraversal_traverseRoots_50012019468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3997;

    public NodeTraversal_traverseRoots_50012019468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3997 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term3997, term3997.getClass(), "compiler", null);
        setField(term3997, term3997.getClass(), "callback", null);
        setField(term3997, term3997.getClass(), "curNode", null);
        setField(term3997, term3997.getClass(), "scopes", null);
        setField(term3997, term3997.getClass(), "scopeRoots", null);
        setField(term3997, term3997.getClass(), "cfgs", null);
        setField(term3997, term3997.getClass(), "sourceName", null);
        setField(term3997, term3997.getClass(), "inputId", null);
        setField(term3997, term3997.getClass(), "scopeCreator", null);
        setField(term3997, term3997.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "traverseRoots", argTypes, term3997, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


