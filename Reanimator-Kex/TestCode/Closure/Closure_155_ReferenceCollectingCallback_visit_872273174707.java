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
import java.util.NoSuchElementException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayDeque;
import java.lang.Object;

public class ReferenceCollectingCallback_visit_872273174707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187072;
     Object term187218;
     Object term187304;

    public ReferenceCollectingCallback_visit_872273174707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term187126 = new ArrayDeque();
        term187072 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term187072, term187072.getClass(), "blockStack", term187126);
        term187218 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term187218, term187218.getClass(), "type", 108);
        term187304 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term187374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term187304, term187304.getClass(), "type", 108);
        setField(term187304, term187304.getClass(), "first", term187374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term187218;
        args[2] = term187304;
        try {
            callMethod(klass, "visit", argTypes, term187072, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


