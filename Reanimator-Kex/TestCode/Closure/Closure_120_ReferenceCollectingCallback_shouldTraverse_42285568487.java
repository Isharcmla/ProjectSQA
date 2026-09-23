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

public class ReferenceCollectingCallback_shouldTraverse_42285568487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11009;
     Object term11101;
     Object term11193;
     Object term11730;
     Object term11731;
     Object term11732;

    public ReferenceCollectingCallback_shouldTraverse_42285568487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11009 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term11101 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term11193 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term11193, term11193.getClass(), "type", 4);
        term11730 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term11730, term11730.getClass(), "referenceMap", null);
        setField(term11730, term11730.getClass(), "blockStack", null);
        setField(term11730, term11730.getClass(), "behavior", null);
        setField(term11730, term11730.getClass(), "compiler", null);
        setField(term11730, term11730.getClass(), "varFilter", null);
        term11731 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term11731, term11731.getClass(), "str", null);
        setIntField(term11731, term11731.getClass(), "type", 4);
        setField(term11731, term11731.getClass(), "next", null);
        setField(term11731, term11731.getClass(), "first", null);
        setField(term11731, term11731.getClass(), "last", null);
        setField(term11731, term11731.getClass(), "propListHead", null);
        setIntField(term11731, term11731.getClass(), "sourcePosition", 0);
        setField(term11731, term11731.getClass(), "jsType", null);
        setField(term11731, term11731.getClass(), "parent", null);
        term11732 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term11732, term11732.getClass(), "str", null);
        setIntField(term11732, term11732.getClass(), "type", 0);
        setField(term11732, term11732.getClass(), "next", null);
        setField(term11732, term11732.getClass(), "first", null);
        setField(term11732, term11732.getClass(), "last", null);
        setField(term11732, term11732.getClass(), "propListHead", null);
        setIntField(term11732, term11732.getClass(), "sourcePosition", 0);
        setField(term11732, term11732.getClass(), "jsType", null);
        setField(term11732, term11732.getClass(), "parent", null);
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
        args[1] = term11101;
        args[2] = term11193;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term11009, args);
        assertTrue(recursiveEquals(term11009, term11730));
        assertTrue(recursiveEquals(term11101, term11732));
        assertTrue(recursiveEquals(term11193, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


