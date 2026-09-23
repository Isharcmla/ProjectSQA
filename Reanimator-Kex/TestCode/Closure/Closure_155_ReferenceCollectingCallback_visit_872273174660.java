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

public class ReferenceCollectingCallback_visit_872273174660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173304;
     Object term173534;
     Object term173488;
     Object term174311;
     Object term174312;
     Object term174313;

    public ReferenceCollectingCallback_visit_872273174660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173304 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term173534 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term173534, term173534.getClass(), "type", 0);
        term173488 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term173488, term173488.getClass(), "type", 98);
        setField(term173488, term173488.getClass(), "first", term173534);
        term174311 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term174311, term174311.getClass(), "referenceMap", null);
        setField(term174311, term174311.getClass(), "blockStack", null);
        setField(term174311, term174311.getClass(), "behavior", null);
        setField(term174311, term174311.getClass(), "compiler", null);
        setField(term174311, term174311.getClass(), "varFilter", null);
        term174312 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term174312, term174312.getClass(), "number", 0.0);
        setIntField(term174312, term174312.getClass(), "type", 0);
        setField(term174312, term174312.getClass(), "next", null);
        setField(term174312, term174312.getClass(), "first", null);
        setField(term174312, term174312.getClass(), "last", null);
        setField(term174312, term174312.getClass(), "propListHead", null);
        setIntField(term174312, term174312.getClass(), "sourcePosition", 0);
        setField(term174312, term174312.getClass(), "jsType", null);
        setField(term174312, term174312.getClass(), "parent", null);
        term174313 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term174314 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term174313, term174313.getClass(), "str", null);
        setIntField(term174313, term174313.getClass(), "type", 98);
        setField(term174313, term174313.getClass(), "next", null);
        setDoubleField(term174314, term174314.getClass(), "number", 0.0);
        setIntField(term174314, term174314.getClass(), "type", 0);
        setField(term174314, term174314.getClass(), "next", null);
        setField(term174314, term174314.getClass(), "first", null);
        setField(term174314, term174314.getClass(), "last", null);
        setField(term174314, term174314.getClass(), "propListHead", null);
        setIntField(term174314, term174314.getClass(), "sourcePosition", 0);
        setField(term174314, term174314.getClass(), "jsType", null);
        setField(term174314, term174314.getClass(), "parent", null);
        setField(term174313, term174313.getClass(), "first", term174314);
        setField(term174313, term174313.getClass(), "last", null);
        setField(term174313, term174313.getClass(), "propListHead", null);
        setIntField(term174313, term174313.getClass(), "sourcePosition", 0);
        setField(term174313, term174313.getClass(), "jsType", null);
        setField(term174313, term174313.getClass(), "parent", null);
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
        args[1] = term173534;
        args[2] = term173488;
        callMethod(klass, "visit", argTypes, term173304, args);
        assertTrue(recursiveEquals(term173304, term174311));
        assertTrue(recursiveEquals(term173534, term174313));
        assertTrue(recursiveEquals(term173488, null));
    }

};


