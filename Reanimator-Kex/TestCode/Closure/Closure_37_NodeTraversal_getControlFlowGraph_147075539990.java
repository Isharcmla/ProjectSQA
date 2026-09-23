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

public class NodeTraversal_getControlFlowGraph_147075539990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5992;

    public NodeTraversal_getControlFlowGraph_147075539990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5992 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term5992, term5992.getClass(), "compiler", null);
        setField(term5992, term5992.getClass(), "callback", null);
        setField(term5992, term5992.getClass(), "curNode", null);
        setField(term5992, term5992.getClass(), "scopes", null);
        setField(term5992, term5992.getClass(), "scopeRoots", null);
        setField(term5992, term5992.getClass(), "cfgs", null);
        setField(term5992, term5992.getClass(), "sourceName", null);
        setField(term5992, term5992.getClass(), "inputId", null);
        setField(term5992, term5992.getClass(), "scopeCreator", null);
        setField(term5992, term5992.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getControlFlowGraph", argTypes, term5992, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


