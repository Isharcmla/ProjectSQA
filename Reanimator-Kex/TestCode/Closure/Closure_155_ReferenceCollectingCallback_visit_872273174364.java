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

public class ReferenceCollectingCallback_visit_872273174364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85087;
     Object term85233;
     Object term85325;

    public ReferenceCollectingCallback_visit_872273174364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term85141 = new ArrayDeque();
        term85087 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term85087, term85087.getClass(), "blockStack", term85141);
        term85233 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term85233, term85233.getClass(), "type", 101);
        term85325 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term85325, term85325.getClass(), "type", 101);
        setField(term85325, term85325.getClass(), "first", null);
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
        args[1] = term85233;
        args[2] = term85325;
        try {
            callMethod(klass, "visit", argTypes, term85087, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


