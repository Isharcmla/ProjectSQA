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

public class ReferenceCollectingCallback_visit_872273174638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167570;
     Object term167800;
     Object term167754;
     Object term168118;
     Object term168119;
     Object term168120;

    public ReferenceCollectingCallback_visit_872273174638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167570 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term167800 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term167800, term167800.getClass(), "type", 0);
        term167754 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term167754, term167754.getClass(), "type", 108);
        setField(term167754, term167754.getClass(), "first", term167800);
        term168118 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term168118, term168118.getClass(), "referenceMap", null);
        setField(term168118, term168118.getClass(), "blockStack", null);
        setField(term168118, term168118.getClass(), "behavior", null);
        setField(term168118, term168118.getClass(), "compiler", null);
        setField(term168118, term168118.getClass(), "varFilter", null);
        term168119 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term168119, term168119.getClass(), "str", null);
        setIntField(term168119, term168119.getClass(), "type", 0);
        setField(term168119, term168119.getClass(), "next", null);
        setField(term168119, term168119.getClass(), "first", null);
        setField(term168119, term168119.getClass(), "last", null);
        setField(term168119, term168119.getClass(), "propListHead", null);
        setIntField(term168119, term168119.getClass(), "sourcePosition", 0);
        setField(term168119, term168119.getClass(), "jsType", null);
        setField(term168119, term168119.getClass(), "parent", null);
        term168120 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term168121 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term168120, term168120.getClass(), "number", 0.0);
        setIntField(term168120, term168120.getClass(), "type", 108);
        setField(term168120, term168120.getClass(), "next", null);
        setField(term168121, term168121.getClass(), "str", null);
        setIntField(term168121, term168121.getClass(), "type", 0);
        setField(term168121, term168121.getClass(), "next", null);
        setField(term168121, term168121.getClass(), "first", null);
        setField(term168121, term168121.getClass(), "last", null);
        setField(term168121, term168121.getClass(), "propListHead", null);
        setIntField(term168121, term168121.getClass(), "sourcePosition", 0);
        setField(term168121, term168121.getClass(), "jsType", null);
        setField(term168121, term168121.getClass(), "parent", null);
        setField(term168120, term168120.getClass(), "first", term168121);
        setField(term168120, term168120.getClass(), "last", null);
        setField(term168120, term168120.getClass(), "propListHead", null);
        setIntField(term168120, term168120.getClass(), "sourcePosition", 0);
        setField(term168120, term168120.getClass(), "jsType", null);
        setField(term168120, term168120.getClass(), "parent", null);
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
        args[1] = term167800;
        args[2] = term167754;
        callMethod(klass, "visit", argTypes, term167570, args);
        assertTrue(recursiveEquals(term167570, term168118));
        assertTrue(recursiveEquals(term167800, term168120));
        assertTrue(recursiveEquals(term167754, null));
    }

};


