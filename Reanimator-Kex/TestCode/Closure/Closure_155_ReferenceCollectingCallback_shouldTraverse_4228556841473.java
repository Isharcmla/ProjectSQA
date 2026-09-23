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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_shouldTraverse_4228556841473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434380;
     Object term434526;
     Object term434618;
     Object term435512;
     Object term435516;
     Object term435517;

    public ReferenceCollectingCallback_shouldTraverse_4228556841473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term434434 = new ArrayDeque();
        term434380 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term434380, term434380.getClass(), "blockStack", term434434);
        term434526 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term434526, term434526.getClass(), "type", 111);
        term434618 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term434618, term434618.getClass(), "type", 0);
        ArrayDeque term435513 = new ArrayDeque();
        term435512 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term435512, term435512.getClass(), "referenceMap", null);
        setField(term435512, term435512.getClass(), "blockStack", term435513);
        setField(term435512, term435512.getClass(), "behavior", null);
        setField(term435512, term435512.getClass(), "compiler", null);
        setField(term435512, term435512.getClass(), "varFilter", null);
        term435516 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term435516, term435516.getClass(), "str", null);
        setIntField(term435516, term435516.getClass(), "type", 0);
        setField(term435516, term435516.getClass(), "next", null);
        setField(term435516, term435516.getClass(), "first", null);
        setField(term435516, term435516.getClass(), "last", null);
        setField(term435516, term435516.getClass(), "propListHead", null);
        setIntField(term435516, term435516.getClass(), "sourcePosition", 0);
        setField(term435516, term435516.getClass(), "jsType", null);
        setField(term435516, term435516.getClass(), "parent", null);
        term435517 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term435517, term435517.getClass(), "number", 0.0);
        setIntField(term435517, term435517.getClass(), "type", 111);
        setField(term435517, term435517.getClass(), "next", null);
        setField(term435517, term435517.getClass(), "first", null);
        setField(term435517, term435517.getClass(), "last", null);
        setField(term435517, term435517.getClass(), "propListHead", null);
        setIntField(term435517, term435517.getClass(), "sourcePosition", 0);
        setField(term435517, term435517.getClass(), "jsType", null);
        setField(term435517, term435517.getClass(), "parent", null);
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
        args[1] = term434526;
        args[2] = term434618;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term434380, args);
        assertTrue(recursiveEquals(term434380, term435512));
        assertTrue(recursiveEquals(term434526, term435517));
        assertTrue(recursiveEquals(term434618, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


