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

public class ReferenceCollectingCallback_shouldTraverse_4228556841287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390485;
     Object term390631;
     Object term390723;
     Object term391021;
     Object term391025;
     Object term391026;

    public ReferenceCollectingCallback_shouldTraverse_4228556841287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term390539 = new ArrayDeque();
        term390485 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term390485, term390485.getClass(), "blockStack", term390539);
        term390631 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term390631, term390631.getClass(), "type", 111);
        term390723 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term390723, term390723.getClass(), "type", 0);
        ArrayDeque term391022 = new ArrayDeque();
        term391021 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term391021, term391021.getClass(), "referenceMap", null);
        setField(term391021, term391021.getClass(), "blockStack", term391022);
        setField(term391021, term391021.getClass(), "behavior", null);
        setField(term391021, term391021.getClass(), "compiler", null);
        setField(term391021, term391021.getClass(), "varFilter", null);
        term391025 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term391025, term391025.getClass(), "number", 0.0);
        setIntField(term391025, term391025.getClass(), "type", 0);
        setField(term391025, term391025.getClass(), "next", null);
        setField(term391025, term391025.getClass(), "first", null);
        setField(term391025, term391025.getClass(), "last", null);
        setField(term391025, term391025.getClass(), "propListHead", null);
        setIntField(term391025, term391025.getClass(), "sourcePosition", 0);
        setField(term391025, term391025.getClass(), "jsType", null);
        setField(term391025, term391025.getClass(), "parent", null);
        term391026 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term391026, term391026.getClass(), "str", null);
        setIntField(term391026, term391026.getClass(), "type", 111);
        setField(term391026, term391026.getClass(), "next", null);
        setField(term391026, term391026.getClass(), "first", null);
        setField(term391026, term391026.getClass(), "last", null);
        setField(term391026, term391026.getClass(), "propListHead", null);
        setIntField(term391026, term391026.getClass(), "sourcePosition", 0);
        setField(term391026, term391026.getClass(), "jsType", null);
        setField(term391026, term391026.getClass(), "parent", null);
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
        args[1] = term390631;
        args[2] = term390723;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term390485, args);
        assertTrue(recursiveEquals(term390485, term391021));
        assertTrue(recursiveEquals(term390631, term391026));
        assertTrue(recursiveEquals(term390723, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


