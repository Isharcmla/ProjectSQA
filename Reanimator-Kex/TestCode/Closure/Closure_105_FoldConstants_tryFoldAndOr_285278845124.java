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

public class FoldConstants_tryFoldAndOr_285278845124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18865;
     Object term18957;
     Object term19049;
     Object term19141;
     Object term30245;
     Object term30246;
     Object term30247;
     Object term30248;

    public FoldConstants_tryFoldAndOr_285278845124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18865 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term18957 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term18957, term18957.getClass(), "type", -2147483610);
        term19049 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term19049, term19049.getClass(), "type", -2147483610);
        term19141 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term30245 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term30245, term30245.getClass(), "compiler", null);
        term30246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term30246, term30246.getClass(), "number", 0.0);
        setIntField(term30246, term30246.getClass(), "type", -2147483610);
        setField(term30246, term30246.getClass(), "next", null);
        setField(term30246, term30246.getClass(), "first", null);
        setField(term30246, term30246.getClass(), "last", null);
        setField(term30246, term30246.getClass(), "propListHead", null);
        setIntField(term30246, term30246.getClass(), "sourcePosition", 0);
        setField(term30246, term30246.getClass(), "jsType", null);
        setField(term30246, term30246.getClass(), "parent", null);
        term30247 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term30247, term30247.getClass(), "number", 0.0);
        setIntField(term30247, term30247.getClass(), "type", -2147483610);
        setField(term30247, term30247.getClass(), "next", null);
        setField(term30247, term30247.getClass(), "first", null);
        setField(term30247, term30247.getClass(), "last", null);
        setField(term30247, term30247.getClass(), "propListHead", null);
        setIntField(term30247, term30247.getClass(), "sourcePosition", 0);
        setField(term30247, term30247.getClass(), "jsType", null);
        setField(term30247, term30247.getClass(), "parent", null);
        term30248 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term30248, term30248.getClass(), "number", 0.0);
        setIntField(term30248, term30248.getClass(), "type", 0);
        setField(term30248, term30248.getClass(), "next", null);
        setField(term30248, term30248.getClass(), "first", null);
        setField(term30248, term30248.getClass(), "last", null);
        setField(term30248, term30248.getClass(), "propListHead", null);
        setIntField(term30248, term30248.getClass(), "sourcePosition", 0);
        setField(term30248, term30248.getClass(), "jsType", null);
        setField(term30248, term30248.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[4] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term18957;
        args[2] = term19049;
        args[3] = term19141;
        args[4] = null;
        callMethod(klass, "tryFoldAndOr", argTypes, term18865, args);
        assertTrue(recursiveEquals(term18865, term30245));
        assertTrue(recursiveEquals(term18957, term30247));
        assertTrue(recursiveEquals(term19049, term30248));
        assertTrue(recursiveEquals(term19141, null));
    }

};


