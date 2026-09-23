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
import java.lang.Object;
import java.util.ArrayDeque;

public class NodeTraversal_pushScope_1161215129244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63933;

    public NodeTraversal_pushScope_1161215129244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term64057 = new ArrayDeque();
        term63933 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term64003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term63933, term63933.getClass(), "curNode", term64003);
        setField(term63933, term63933.getClass(), "scopeRoots", term64057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "pushScope", argTypes, term63933, args);
    }

};


