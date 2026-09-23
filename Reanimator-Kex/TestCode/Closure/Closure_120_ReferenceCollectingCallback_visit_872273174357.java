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

public class ReferenceCollectingCallback_visit_872273174357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78676;
     Object term78822;
     Object term78914;

    public ReferenceCollectingCallback_visit_872273174357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term78730 = new ArrayDeque();
        term78676 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term78676, term78676.getClass(), "blockStack", term78730);
        term78822 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term78822, term78822.getClass(), "type", 98);
        term78914 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term78914, term78914.getClass(), "type", 98);
        setField(term78914, term78914.getClass(), "first", null);
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
        args[1] = term78822;
        args[2] = term78914;
        try {
            callMethod(klass, "visit", argTypes, term78676, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


