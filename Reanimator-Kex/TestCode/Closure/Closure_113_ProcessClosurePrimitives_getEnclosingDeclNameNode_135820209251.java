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
import java.util.ArrayDeque;

public class ProcessClosurePrimitives_getEnclosingDeclNameNode_135820209251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73404;
     Object term73494;

    public ProcessClosurePrimitives_getEnclosingDeclNameNode_135820209251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73404 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        ArrayDeque term73548 = new ArrayDeque();
        term73494 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term73494, term73494.getClass(), "scopeRoots", term73548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term73494;
        callMethod(klass, "getEnclosingDeclNameNode", argTypes, term73404, args);
    }

};


