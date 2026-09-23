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

public class ReferenceCollectingCallback_visit_872273174631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166028;
     Object term166258;
     Object term166212;
     Object term166643;
     Object term166644;
     Object term166645;

    public ReferenceCollectingCallback_visit_872273174631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166028 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term166258 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term166258, term166258.getClass(), "type", 0);
        term166212 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term166212, term166212.getClass(), "type", 100);
        setField(term166212, term166212.getClass(), "first", term166258);
        term166643 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term166643, term166643.getClass(), "referenceMap", null);
        setField(term166643, term166643.getClass(), "blockStack", null);
        setField(term166643, term166643.getClass(), "behavior", null);
        setField(term166643, term166643.getClass(), "compiler", null);
        setField(term166643, term166643.getClass(), "varFilter", null);
        term166644 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term166644, term166644.getClass(), "str", null);
        setIntField(term166644, term166644.getClass(), "type", 0);
        setField(term166644, term166644.getClass(), "next", null);
        setField(term166644, term166644.getClass(), "first", null);
        setField(term166644, term166644.getClass(), "last", null);
        setField(term166644, term166644.getClass(), "propListHead", null);
        setIntField(term166644, term166644.getClass(), "sourcePosition", 0);
        setField(term166644, term166644.getClass(), "jsType", null);
        setField(term166644, term166644.getClass(), "parent", null);
        term166645 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term166646 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term166645, term166645.getClass(), "number", 0.0);
        setIntField(term166645, term166645.getClass(), "type", 100);
        setField(term166645, term166645.getClass(), "next", null);
        setField(term166646, term166646.getClass(), "str", null);
        setIntField(term166646, term166646.getClass(), "type", 0);
        setField(term166646, term166646.getClass(), "next", null);
        setField(term166646, term166646.getClass(), "first", null);
        setField(term166646, term166646.getClass(), "last", null);
        setField(term166646, term166646.getClass(), "propListHead", null);
        setIntField(term166646, term166646.getClass(), "sourcePosition", 0);
        setField(term166646, term166646.getClass(), "jsType", null);
        setField(term166646, term166646.getClass(), "parent", null);
        setField(term166645, term166645.getClass(), "first", term166646);
        setField(term166645, term166645.getClass(), "last", null);
        setField(term166645, term166645.getClass(), "propListHead", null);
        setIntField(term166645, term166645.getClass(), "sourcePosition", 0);
        setField(term166645, term166645.getClass(), "jsType", null);
        setField(term166645, term166645.getClass(), "parent", null);
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
        args[1] = term166258;
        args[2] = term166212;
        callMethod(klass, "visit", argTypes, term166028, args);
        assertTrue(recursiveEquals(term166028, term166643));
        assertTrue(recursiveEquals(term166258, term166645));
        assertTrue(recursiveEquals(term166212, null));
    }

};


