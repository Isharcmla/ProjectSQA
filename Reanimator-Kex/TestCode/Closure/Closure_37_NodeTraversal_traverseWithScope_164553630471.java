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

public class NodeTraversal_traverseWithScope_164553630471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4335;

    public NodeTraversal_traverseWithScope_164553630471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4335 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term4335, term4335.getClass(), "compiler", null);
        setField(term4335, term4335.getClass(), "callback", null);
        setField(term4335, term4335.getClass(), "curNode", null);
        setField(term4335, term4335.getClass(), "scopes", null);
        setField(term4335, term4335.getClass(), "scopeRoots", null);
        setField(term4335, term4335.getClass(), "cfgs", null);
        setField(term4335, term4335.getClass(), "sourceName", null);
        setField(term4335, term4335.getClass(), "inputId", null);
        setField(term4335, term4335.getClass(), "scopeCreator", null);
        setField(term4335, term4335.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "traverseWithScope", argTypes, term4335, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


