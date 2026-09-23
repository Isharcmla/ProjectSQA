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

public class ReferenceCollectingCallback_visit_872273174724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192257;
     Object term192403;
     Object term192495;

    public ReferenceCollectingCallback_visit_872273174724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term192311 = new ArrayDeque();
        term192257 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term192257, term192257.getClass(), "blockStack", term192311);
        term192403 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term192403, term192403.getClass(), "type", 111);
        term192495 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term192495, term192495.getClass(), "type", 111);
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
        args[1] = term192403;
        args[2] = term192495;
        try {
            callMethod(klass, "visit", argTypes, term192257, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


