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

public class ReferenceCollectingCallback_visit_872273174549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167938;
     Object term168030;
     Object term168122;
     Object term168154;
     Object term168155;
     Object term168156;

    public ReferenceCollectingCallback_visit_872273174549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167938 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term168030 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term168030, term168030.getClass(), "type", -39);
        term168122 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term168154 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term168154, term168154.getClass(), "referenceMap", null);
        setField(term168154, term168154.getClass(), "blockStack", null);
        setField(term168154, term168154.getClass(), "behavior", null);
        setField(term168154, term168154.getClass(), "compiler", null);
        setField(term168154, term168154.getClass(), "varFilter", null);
        term168155 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term168155, term168155.getClass(), "number", 0.0);
        setIntField(term168155, term168155.getClass(), "type", -39);
        setField(term168155, term168155.getClass(), "next", null);
        setField(term168155, term168155.getClass(), "first", null);
        setField(term168155, term168155.getClass(), "last", null);
        setField(term168155, term168155.getClass(), "propListHead", null);
        setIntField(term168155, term168155.getClass(), "sourcePosition", 0);
        setField(term168155, term168155.getClass(), "jsType", null);
        setField(term168155, term168155.getClass(), "parent", null);
        term168156 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term168156, term168156.getClass(), "str", null);
        setIntField(term168156, term168156.getClass(), "type", 0);
        setField(term168156, term168156.getClass(), "next", null);
        setField(term168156, term168156.getClass(), "first", null);
        setField(term168156, term168156.getClass(), "last", null);
        setField(term168156, term168156.getClass(), "propListHead", null);
        setIntField(term168156, term168156.getClass(), "sourcePosition", 0);
        setField(term168156, term168156.getClass(), "jsType", null);
        setField(term168156, term168156.getClass(), "parent", null);
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
        args[1] = term168030;
        args[2] = term168122;
        callMethod(klass, "visit", argTypes, term167938, args);
        assertTrue(recursiveEquals(term167938, term168154));
        assertTrue(recursiveEquals(term168030, term168156));
        assertTrue(recursiveEquals(term168122, null));
    }

};


