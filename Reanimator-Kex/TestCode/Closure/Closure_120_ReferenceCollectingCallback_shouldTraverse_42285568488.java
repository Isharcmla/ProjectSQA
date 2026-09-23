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

public class ReferenceCollectingCallback_shouldTraverse_42285568488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11328;
     Object term11420;
     Object term11512;
     Object term11751;
     Object term11752;
     Object term11753;

    public ReferenceCollectingCallback_shouldTraverse_42285568488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11328 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term11420 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term11512 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term11512, term11512.getClass(), "type", 4);
        term11751 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term11751, term11751.getClass(), "referenceMap", null);
        setField(term11751, term11751.getClass(), "blockStack", null);
        setField(term11751, term11751.getClass(), "behavior", null);
        setField(term11751, term11751.getClass(), "compiler", null);
        setField(term11751, term11751.getClass(), "varFilter", null);
        term11752 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term11752, term11752.getClass(), "number", 0.0);
        setIntField(term11752, term11752.getClass(), "type", 4);
        setField(term11752, term11752.getClass(), "next", null);
        setField(term11752, term11752.getClass(), "first", null);
        setField(term11752, term11752.getClass(), "last", null);
        setField(term11752, term11752.getClass(), "propListHead", null);
        setIntField(term11752, term11752.getClass(), "sourcePosition", 0);
        setField(term11752, term11752.getClass(), "jsType", null);
        setField(term11752, term11752.getClass(), "parent", null);
        term11753 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term11753, term11753.getClass(), "number", 0.0);
        setIntField(term11753, term11753.getClass(), "type", 0);
        setField(term11753, term11753.getClass(), "next", null);
        setField(term11753, term11753.getClass(), "first", null);
        setField(term11753, term11753.getClass(), "last", null);
        setField(term11753, term11753.getClass(), "propListHead", null);
        setIntField(term11753, term11753.getClass(), "sourcePosition", 0);
        setField(term11753, term11753.getClass(), "jsType", null);
        setField(term11753, term11753.getClass(), "parent", null);
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
        args[1] = term11420;
        args[2] = term11512;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term11328, args);
        assertTrue(recursiveEquals(term11328, term11751));
        assertTrue(recursiveEquals(term11420, term11753));
        assertTrue(recursiveEquals(term11512, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


