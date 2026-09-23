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

public class ReferenceCollectingCallback_visit_872273174726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192925;
     Object term193155;
     Object term193109;
     Object term193707;
     Object term193708;
     Object term193709;

    public ReferenceCollectingCallback_visit_872273174726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192925 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term193155 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term193155, term193155.getClass(), "type", 0);
        term193109 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term193109, term193109.getClass(), "type", 101);
        setField(term193109, term193109.getClass(), "first", term193155);
        term193707 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term193707, term193707.getClass(), "referenceMap", null);
        setField(term193707, term193707.getClass(), "blockStack", null);
        setField(term193707, term193707.getClass(), "behavior", null);
        setField(term193707, term193707.getClass(), "compiler", null);
        setField(term193707, term193707.getClass(), "varFilter", null);
        term193708 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term193708, term193708.getClass(), "number", 0.0);
        setIntField(term193708, term193708.getClass(), "type", 0);
        setField(term193708, term193708.getClass(), "next", null);
        setField(term193708, term193708.getClass(), "first", null);
        setField(term193708, term193708.getClass(), "last", null);
        setField(term193708, term193708.getClass(), "propListHead", null);
        setIntField(term193708, term193708.getClass(), "sourcePosition", 0);
        setField(term193708, term193708.getClass(), "jsType", null);
        setField(term193708, term193708.getClass(), "parent", null);
        term193709 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term193710 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term193709, term193709.getClass(), "str", null);
        setIntField(term193709, term193709.getClass(), "type", 101);
        setField(term193709, term193709.getClass(), "next", null);
        setDoubleField(term193710, term193710.getClass(), "number", 0.0);
        setIntField(term193710, term193710.getClass(), "type", 0);
        setField(term193710, term193710.getClass(), "next", null);
        setField(term193710, term193710.getClass(), "first", null);
        setField(term193710, term193710.getClass(), "last", null);
        setField(term193710, term193710.getClass(), "propListHead", null);
        setIntField(term193710, term193710.getClass(), "sourcePosition", 0);
        setField(term193710, term193710.getClass(), "jsType", null);
        setField(term193710, term193710.getClass(), "parent", null);
        setField(term193709, term193709.getClass(), "first", term193710);
        setField(term193709, term193709.getClass(), "last", null);
        setField(term193709, term193709.getClass(), "propListHead", null);
        setIntField(term193709, term193709.getClass(), "sourcePosition", 0);
        setField(term193709, term193709.getClass(), "jsType", null);
        setField(term193709, term193709.getClass(), "parent", null);
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
        args[1] = term193155;
        args[2] = term193109;
        callMethod(klass, "visit", argTypes, term192925, args);
        assertTrue(recursiveEquals(term192925, term193707));
        assertTrue(recursiveEquals(term193155, term193709));
        assertTrue(recursiveEquals(term193109, null));
    }

};


