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

public class ReferenceCollectingCallback_visit_872273174389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89924;
     Object term90070;
     Object term90162;

    public ReferenceCollectingCallback_visit_872273174389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term89978 = new ArrayDeque();
        term89924 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term89924, term89924.getClass(), "blockStack", term89978);
        term90070 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term90070, term90070.getClass(), "type", 100);
        term90162 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term90162, term90162.getClass(), "type", 100);
        setField(term90162, term90162.getClass(), "first", null);
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
        args[1] = term90070;
        args[2] = term90162;
        try {
            callMethod(klass, "visit", argTypes, term89924, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


