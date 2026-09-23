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

public class NodeTraversal_getScopeDepth_21177574993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6249;

    public NodeTraversal_getScopeDepth_21177574993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6249 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term6249, term6249.getClass(), "compiler", null);
        setField(term6249, term6249.getClass(), "callback", null);
        setField(term6249, term6249.getClass(), "curNode", null);
        setField(term6249, term6249.getClass(), "scopes", null);
        setField(term6249, term6249.getClass(), "scopeRoots", null);
        setField(term6249, term6249.getClass(), "cfgs", null);
        setField(term6249, term6249.getClass(), "sourceName", null);
        setField(term6249, term6249.getClass(), "inputId", null);
        setField(term6249, term6249.getClass(), "scopeCreator", null);
        setField(term6249, term6249.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getScopeDepth", argTypes, term6249, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


