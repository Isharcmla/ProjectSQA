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

public class ReferenceCollectingCallback_shouldTraverse_422855684692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183153;
     Object term183245;
     Object term183337;
     Object term183611;
     Object term183612;
     Object term183613;

    public ReferenceCollectingCallback_shouldTraverse_422855684692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183153 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term183245 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term183337 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term183337, term183337.getClass(), "type", 4);
        term183611 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term183611, term183611.getClass(), "referenceMap", null);
        setField(term183611, term183611.getClass(), "blockStack", null);
        setField(term183611, term183611.getClass(), "behavior", null);
        setField(term183611, term183611.getClass(), "compiler", null);
        setField(term183611, term183611.getClass(), "varFilter", null);
        term183612 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term183612, term183612.getClass(), "str", null);
        setIntField(term183612, term183612.getClass(), "type", 4);
        setField(term183612, term183612.getClass(), "next", null);
        setField(term183612, term183612.getClass(), "first", null);
        setField(term183612, term183612.getClass(), "last", null);
        setField(term183612, term183612.getClass(), "propListHead", null);
        setIntField(term183612, term183612.getClass(), "sourcePosition", 0);
        setField(term183612, term183612.getClass(), "jsType", null);
        setField(term183612, term183612.getClass(), "parent", null);
        term183613 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term183613, term183613.getClass(), "str", null);
        setIntField(term183613, term183613.getClass(), "type", 0);
        setField(term183613, term183613.getClass(), "next", null);
        setField(term183613, term183613.getClass(), "first", null);
        setField(term183613, term183613.getClass(), "last", null);
        setField(term183613, term183613.getClass(), "propListHead", null);
        setIntField(term183613, term183613.getClass(), "sourcePosition", 0);
        setField(term183613, term183613.getClass(), "jsType", null);
        setField(term183613, term183613.getClass(), "parent", null);
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
        args[1] = term183245;
        args[2] = term183337;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term183153, args);
        assertTrue(recursiveEquals(term183153, term183611));
        assertTrue(recursiveEquals(term183245, term183613));
        assertTrue(recursiveEquals(term183337, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


