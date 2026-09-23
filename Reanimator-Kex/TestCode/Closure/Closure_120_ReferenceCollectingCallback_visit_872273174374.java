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

public class ReferenceCollectingCallback_visit_872273174374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83575;
     Object term83805;
     Object term83759;
     Object term84359;
     Object term84360;
     Object term84361;

    public ReferenceCollectingCallback_visit_872273174374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83575 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term83805 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term83805, term83805.getClass(), "type", 101);
        term83759 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term83759, term83759.getClass(), "type", 101);
        setField(term83759, term83759.getClass(), "first", term83805);
        term84359 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term84359, term84359.getClass(), "referenceMap", null);
        setField(term84359, term84359.getClass(), "blockStack", null);
        setField(term84359, term84359.getClass(), "behavior", null);
        setField(term84359, term84359.getClass(), "compiler", null);
        setField(term84359, term84359.getClass(), "varFilter", null);
        term84360 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term84360, term84360.getClass(), "str", null);
        setIntField(term84360, term84360.getClass(), "type", 101);
        setField(term84360, term84360.getClass(), "next", null);
        setField(term84360, term84360.getClass(), "first", null);
        setField(term84360, term84360.getClass(), "last", null);
        setField(term84360, term84360.getClass(), "propListHead", null);
        setIntField(term84360, term84360.getClass(), "sourcePosition", 0);
        setField(term84360, term84360.getClass(), "jsType", null);
        setField(term84360, term84360.getClass(), "parent", null);
        term84361 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term84362 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term84361, term84361.getClass(), "str", null);
        setIntField(term84361, term84361.getClass(), "type", 101);
        setField(term84361, term84361.getClass(), "next", null);
        setField(term84362, term84362.getClass(), "str", null);
        setIntField(term84362, term84362.getClass(), "type", 101);
        setField(term84362, term84362.getClass(), "next", null);
        setField(term84362, term84362.getClass(), "first", null);
        setField(term84362, term84362.getClass(), "last", null);
        setField(term84362, term84362.getClass(), "propListHead", null);
        setIntField(term84362, term84362.getClass(), "sourcePosition", 0);
        setField(term84362, term84362.getClass(), "jsType", null);
        setField(term84362, term84362.getClass(), "parent", null);
        setField(term84361, term84361.getClass(), "first", term84362);
        setField(term84361, term84361.getClass(), "last", null);
        setField(term84361, term84361.getClass(), "propListHead", null);
        setIntField(term84361, term84361.getClass(), "sourcePosition", 0);
        setField(term84361, term84361.getClass(), "jsType", null);
        setField(term84361, term84361.getClass(), "parent", null);
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
        args[1] = term83805;
        args[2] = term83759;
        callMethod(klass, "visit", argTypes, term83575, args);
        assertTrue(recursiveEquals(term83575, term84359));
        assertTrue(recursiveEquals(term83805, term84361));
        assertTrue(recursiveEquals(term83759, null));
    }

};


