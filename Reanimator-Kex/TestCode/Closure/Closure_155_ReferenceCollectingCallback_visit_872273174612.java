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
import java.lang.Object;

public class ReferenceCollectingCallback_visit_872273174612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160668;
     Object term160898;
     Object term160852;
     Object term160918;
     Object term160919;
     Object term160920;

    public ReferenceCollectingCallback_visit_872273174612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160668 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term160898 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term160898, term160898.getClass(), "type", 0);
        term160852 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term160852, term160852.getClass(), "type", 101);
        setField(term160852, term160852.getClass(), "first", term160898);
        term160918 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term160918, term160918.getClass(), "referenceMap", null);
        setField(term160918, term160918.getClass(), "blockStack", null);
        setField(term160918, term160918.getClass(), "behavior", null);
        setField(term160918, term160918.getClass(), "compiler", null);
        setField(term160918, term160918.getClass(), "varFilter", null);
        term160919 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term160919, term160919.getClass(), "number", 0.0);
        setIntField(term160919, term160919.getClass(), "type", 0);
        setField(term160919, term160919.getClass(), "next", null);
        setField(term160919, term160919.getClass(), "first", null);
        setField(term160919, term160919.getClass(), "last", null);
        setField(term160919, term160919.getClass(), "propListHead", null);
        setIntField(term160919, term160919.getClass(), "sourcePosition", 0);
        setField(term160919, term160919.getClass(), "jsType", null);
        setField(term160919, term160919.getClass(), "parent", null);
        term160920 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term160921 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term160920, term160920.getClass(), "str", null);
        setIntField(term160920, term160920.getClass(), "type", 101);
        setField(term160920, term160920.getClass(), "next", null);
        setDoubleField(term160921, term160921.getClass(), "number", 0.0);
        setIntField(term160921, term160921.getClass(), "type", 0);
        setField(term160921, term160921.getClass(), "next", null);
        setField(term160921, term160921.getClass(), "first", null);
        setField(term160921, term160921.getClass(), "last", null);
        setField(term160921, term160921.getClass(), "propListHead", null);
        setIntField(term160921, term160921.getClass(), "sourcePosition", 0);
        setField(term160921, term160921.getClass(), "jsType", null);
        setField(term160921, term160921.getClass(), "parent", null);
        setField(term160920, term160920.getClass(), "first", term160921);
        setField(term160920, term160920.getClass(), "last", null);
        setField(term160920, term160920.getClass(), "propListHead", null);
        setIntField(term160920, term160920.getClass(), "sourcePosition", 0);
        setField(term160920, term160920.getClass(), "jsType", null);
        setField(term160920, term160920.getClass(), "parent", null);
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
        args[1] = term160898;
        args[2] = term160852;
        callMethod(klass, "visit", argTypes, term160668, args);
        assertTrue(recursiveEquals(term160668, term160918));
        assertTrue(recursiveEquals(term160898, term160920));
        assertTrue(recursiveEquals(term160852, null));
    }

};


