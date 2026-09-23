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

public class ReferenceCollectingCallback_visit_872273174316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66785;
     Object term66931;
     Object term67023;

    public ReferenceCollectingCallback_visit_872273174316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term66839 = new ArrayDeque();
        term66785 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term66785, term66785.getClass(), "blockStack", term66839);
        term66931 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term66931, term66931.getClass(), "type", 98);
        term67023 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term67023, term67023.getClass(), "type", 98);
        setField(term67023, term67023.getClass(), "first", null);
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
        args[1] = term66931;
        args[2] = term67023;
        try {
            callMethod(klass, "visit", argTypes, term66785, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


