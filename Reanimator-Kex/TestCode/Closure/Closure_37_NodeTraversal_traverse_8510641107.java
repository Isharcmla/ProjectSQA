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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeTraversal_traverse_8510641107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19520;

    public NodeTraversal_traverse_8510641107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19520 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term19596 = newInstance(Class.forName("com.google.javascript.rhino.InputId"));
        Object term19704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19784 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term19520, term19520.getClass(), "inputId", term19596);
        setField(term19520, term19520.getClass(), "sourceName", "");
        setField(term19520, term19520.getClass(), "curNode", term19704);
        setField(term19520, term19520.getClass(), "compiler", term19784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "traverse", argTypes, term19520, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


