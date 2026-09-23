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

public class ReferenceCollectingCallback_visit_872273174739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197313;
     Object term197543;
     Object term197497;
     Object term197563;
     Object term197564;
     Object term197565;

    public ReferenceCollectingCallback_visit_872273174739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197313 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term197543 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term197543, term197543.getClass(), "type", 0);
        term197497 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term197497, term197497.getClass(), "type", 100);
        setField(term197497, term197497.getClass(), "first", term197543);
        term197563 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term197563, term197563.getClass(), "referenceMap", null);
        setField(term197563, term197563.getClass(), "blockStack", null);
        setField(term197563, term197563.getClass(), "behavior", null);
        setField(term197563, term197563.getClass(), "compiler", null);
        setField(term197563, term197563.getClass(), "varFilter", null);
        term197564 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term197564, term197564.getClass(), "number", 0.0);
        setIntField(term197564, term197564.getClass(), "type", 0);
        setField(term197564, term197564.getClass(), "next", null);
        setField(term197564, term197564.getClass(), "first", null);
        setField(term197564, term197564.getClass(), "last", null);
        setField(term197564, term197564.getClass(), "propListHead", null);
        setIntField(term197564, term197564.getClass(), "sourcePosition", 0);
        setField(term197564, term197564.getClass(), "jsType", null);
        setField(term197564, term197564.getClass(), "parent", null);
        term197565 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term197566 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term197565, term197565.getClass(), "str", null);
        setIntField(term197565, term197565.getClass(), "type", 100);
        setField(term197565, term197565.getClass(), "next", null);
        setDoubleField(term197566, term197566.getClass(), "number", 0.0);
        setIntField(term197566, term197566.getClass(), "type", 0);
        setField(term197566, term197566.getClass(), "next", null);
        setField(term197566, term197566.getClass(), "first", null);
        setField(term197566, term197566.getClass(), "last", null);
        setField(term197566, term197566.getClass(), "propListHead", null);
        setIntField(term197566, term197566.getClass(), "sourcePosition", 0);
        setField(term197566, term197566.getClass(), "jsType", null);
        setField(term197566, term197566.getClass(), "parent", null);
        setField(term197565, term197565.getClass(), "first", term197566);
        setField(term197565, term197565.getClass(), "last", null);
        setField(term197565, term197565.getClass(), "propListHead", null);
        setIntField(term197565, term197565.getClass(), "sourcePosition", 0);
        setField(term197565, term197565.getClass(), "jsType", null);
        setField(term197565, term197565.getClass(), "parent", null);
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
        args[1] = term197543;
        args[2] = term197497;
        callMethod(klass, "visit", argTypes, term197313, args);
        assertTrue(recursiveEquals(term197313, term197563));
        assertTrue(recursiveEquals(term197543, term197565));
        assertTrue(recursiveEquals(term197497, null));
    }

};


