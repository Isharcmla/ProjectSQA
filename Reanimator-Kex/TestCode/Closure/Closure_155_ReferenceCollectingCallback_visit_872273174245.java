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

public class ReferenceCollectingCallback_visit_872273174245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58728;
     Object term58958;
     Object term58912;
     Object term59567;
     Object term59568;
     Object term59569;

    public ReferenceCollectingCallback_visit_872273174245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58728 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term58958 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term58958, term58958.getClass(), "type", 108);
        term58912 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term58912, term58912.getClass(), "type", 108);
        setField(term58912, term58912.getClass(), "first", term58958);
        term59567 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term59567, term59567.getClass(), "referenceMap", null);
        setField(term59567, term59567.getClass(), "blockStack", null);
        setField(term59567, term59567.getClass(), "behavior", null);
        setField(term59567, term59567.getClass(), "compiler", null);
        setField(term59567, term59567.getClass(), "varFilter", null);
        term59568 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term59568, term59568.getClass(), "str", null);
        setIntField(term59568, term59568.getClass(), "type", 108);
        setField(term59568, term59568.getClass(), "next", null);
        setField(term59568, term59568.getClass(), "first", null);
        setField(term59568, term59568.getClass(), "last", null);
        setField(term59568, term59568.getClass(), "propListHead", null);
        setIntField(term59568, term59568.getClass(), "sourcePosition", 0);
        setField(term59568, term59568.getClass(), "jsType", null);
        setField(term59568, term59568.getClass(), "parent", null);
        term59569 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term59570 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term59569, term59569.getClass(), "str", null);
        setIntField(term59569, term59569.getClass(), "type", 108);
        setField(term59569, term59569.getClass(), "next", null);
        setField(term59570, term59570.getClass(), "str", null);
        setIntField(term59570, term59570.getClass(), "type", 108);
        setField(term59570, term59570.getClass(), "next", null);
        setField(term59570, term59570.getClass(), "first", null);
        setField(term59570, term59570.getClass(), "last", null);
        setField(term59570, term59570.getClass(), "propListHead", null);
        setIntField(term59570, term59570.getClass(), "sourcePosition", 0);
        setField(term59570, term59570.getClass(), "jsType", null);
        setField(term59570, term59570.getClass(), "parent", null);
        setField(term59569, term59569.getClass(), "first", term59570);
        setField(term59569, term59569.getClass(), "last", null);
        setField(term59569, term59569.getClass(), "propListHead", null);
        setIntField(term59569, term59569.getClass(), "sourcePosition", 0);
        setField(term59569, term59569.getClass(), "jsType", null);
        setField(term59569, term59569.getClass(), "parent", null);
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
        args[1] = term58958;
        args[2] = term58912;
        callMethod(klass, "visit", argTypes, term58728, args);
        assertTrue(recursiveEquals(term58728, term59567));
        assertTrue(recursiveEquals(term58958, term59569));
        assertTrue(recursiveEquals(term58912, null));
    }

};


