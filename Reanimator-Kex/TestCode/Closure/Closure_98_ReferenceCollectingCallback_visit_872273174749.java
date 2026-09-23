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

public class ReferenceCollectingCallback_visit_872273174749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199854;
     Object term200084;
     Object term200038;
     Object term200650;
     Object term200651;
     Object term200652;

    public ReferenceCollectingCallback_visit_872273174749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199854 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term200084 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term200084, term200084.getClass(), "type", 0);
        term200038 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term200038, term200038.getClass(), "type", 98);
        setField(term200038, term200038.getClass(), "first", term200084);
        term200650 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term200650, term200650.getClass(), "referenceMap", null);
        setField(term200650, term200650.getClass(), "blockStack", null);
        setField(term200650, term200650.getClass(), "behavior", null);
        setField(term200650, term200650.getClass(), "compiler", null);
        setField(term200650, term200650.getClass(), "varFilter", null);
        term200651 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term200651, term200651.getClass(), "number", 0.0);
        setIntField(term200651, term200651.getClass(), "type", 0);
        setField(term200651, term200651.getClass(), "next", null);
        setField(term200651, term200651.getClass(), "first", null);
        setField(term200651, term200651.getClass(), "last", null);
        setField(term200651, term200651.getClass(), "propListHead", null);
        setIntField(term200651, term200651.getClass(), "sourcePosition", 0);
        setField(term200651, term200651.getClass(), "jsType", null);
        setField(term200651, term200651.getClass(), "parent", null);
        term200652 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term200653 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term200652, term200652.getClass(), "str", null);
        setIntField(term200652, term200652.getClass(), "type", 98);
        setField(term200652, term200652.getClass(), "next", null);
        setDoubleField(term200653, term200653.getClass(), "number", 0.0);
        setIntField(term200653, term200653.getClass(), "type", 0);
        setField(term200653, term200653.getClass(), "next", null);
        setField(term200653, term200653.getClass(), "first", null);
        setField(term200653, term200653.getClass(), "last", null);
        setField(term200653, term200653.getClass(), "propListHead", null);
        setIntField(term200653, term200653.getClass(), "sourcePosition", 0);
        setField(term200653, term200653.getClass(), "jsType", null);
        setField(term200653, term200653.getClass(), "parent", null);
        setField(term200652, term200652.getClass(), "first", term200653);
        setField(term200652, term200652.getClass(), "last", null);
        setField(term200652, term200652.getClass(), "propListHead", null);
        setIntField(term200652, term200652.getClass(), "sourcePosition", 0);
        setField(term200652, term200652.getClass(), "jsType", null);
        setField(term200652, term200652.getClass(), "parent", null);
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
        args[1] = term200084;
        args[2] = term200038;
        callMethod(klass, "visit", argTypes, term199854, args);
        assertTrue(recursiveEquals(term199854, term200650));
        assertTrue(recursiveEquals(term200084, term200652));
        assertTrue(recursiveEquals(term200038, null));
    }

};


