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

public class NodeTraversal_pushScope_116121512986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5668;

    public NodeTraversal_pushScope_116121512986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5668 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term5668, term5668.getClass(), "compiler", null);
        setField(term5668, term5668.getClass(), "callback", null);
        setField(term5668, term5668.getClass(), "curNode", null);
        setField(term5668, term5668.getClass(), "scopes", null);
        setField(term5668, term5668.getClass(), "scopeRoots", null);
        setField(term5668, term5668.getClass(), "cfgs", null);
        setField(term5668, term5668.getClass(), "sourceName", null);
        setField(term5668, term5668.getClass(), "inputId", null);
        setField(term5668, term5668.getClass(), "scopeCreator", null);
        setField(term5668, term5668.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "pushScope", argTypes, term5668, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


