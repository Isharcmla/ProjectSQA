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

public class ReferenceCollectingCallback_visit_872273174238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56950;
     Object term57180;
     Object term57134;
     Object term57898;
     Object term57899;
     Object term57900;

    public ReferenceCollectingCallback_visit_872273174238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56950 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term57180 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term57180, term57180.getClass(), "type", 100);
        term57134 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term57134, term57134.getClass(), "type", 100);
        setField(term57134, term57134.getClass(), "first", term57180);
        term57898 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term57898, term57898.getClass(), "referenceMap", null);
        setField(term57898, term57898.getClass(), "blockStack", null);
        setField(term57898, term57898.getClass(), "behavior", null);
        setField(term57898, term57898.getClass(), "compiler", null);
        setField(term57898, term57898.getClass(), "varFilter", null);
        term57899 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term57899, term57899.getClass(), "number", 0.0);
        setIntField(term57899, term57899.getClass(), "type", 100);
        setField(term57899, term57899.getClass(), "next", null);
        setField(term57899, term57899.getClass(), "first", null);
        setField(term57899, term57899.getClass(), "last", null);
        setField(term57899, term57899.getClass(), "propListHead", null);
        setIntField(term57899, term57899.getClass(), "sourcePosition", 0);
        setField(term57899, term57899.getClass(), "jsType", null);
        setField(term57899, term57899.getClass(), "parent", null);
        term57900 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57901 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term57900, term57900.getClass(), "number", 0.0);
        setIntField(term57900, term57900.getClass(), "type", 100);
        setField(term57900, term57900.getClass(), "next", null);
        setDoubleField(term57901, term57901.getClass(), "number", 0.0);
        setIntField(term57901, term57901.getClass(), "type", 100);
        setField(term57901, term57901.getClass(), "next", null);
        setField(term57901, term57901.getClass(), "first", null);
        setField(term57901, term57901.getClass(), "last", null);
        setField(term57901, term57901.getClass(), "propListHead", null);
        setIntField(term57901, term57901.getClass(), "sourcePosition", 0);
        setField(term57901, term57901.getClass(), "jsType", null);
        setField(term57901, term57901.getClass(), "parent", null);
        setField(term57900, term57900.getClass(), "first", term57901);
        setField(term57900, term57900.getClass(), "last", null);
        setField(term57900, term57900.getClass(), "propListHead", null);
        setIntField(term57900, term57900.getClass(), "sourcePosition", 0);
        setField(term57900, term57900.getClass(), "jsType", null);
        setField(term57900, term57900.getClass(), "parent", null);
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
        args[1] = term57180;
        args[2] = term57134;
        callMethod(klass, "visit", argTypes, term56950, args);
        assertTrue(recursiveEquals(term56950, term57898));
        assertTrue(recursiveEquals(term57180, term57900));
        assertTrue(recursiveEquals(term57134, null));
    }

};


