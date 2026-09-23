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

public class ReferenceCollectingCallback_visit_872273174717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254491;
     Object term254637;
     Object term254729;

    public ReferenceCollectingCallback_visit_872273174717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term254545 = new ArrayDeque();
        term254491 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term254491, term254491.getClass(), "blockStack", term254545);
        term254637 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term254637, term254637.getClass(), "type", 100);
        term254729 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term254799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term254729, term254729.getClass(), "type", 100);
        setField(term254729, term254729.getClass(), "first", term254799);
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
        args[1] = term254637;
        args[2] = term254729;
        try {
            callMethod(klass, "visit", argTypes, term254491, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


