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

public class ReferenceCollectingCallback_visit_872273174309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64727;
     Object term64957;
     Object term64911;
     Object term65366;
     Object term65367;
     Object term65368;

    public ReferenceCollectingCallback_visit_872273174309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64727 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term64957 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term64957, term64957.getClass(), "type", 98);
        term64911 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term64911, term64911.getClass(), "type", 98);
        setField(term64911, term64911.getClass(), "first", term64957);
        term65366 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term65366, term65366.getClass(), "referenceMap", null);
        setField(term65366, term65366.getClass(), "blockStack", null);
        setField(term65366, term65366.getClass(), "behavior", null);
        setField(term65366, term65366.getClass(), "compiler", null);
        setField(term65366, term65366.getClass(), "varFilter", null);
        term65367 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term65367, term65367.getClass(), "number", 0.0);
        setIntField(term65367, term65367.getClass(), "type", 98);
        setField(term65367, term65367.getClass(), "next", null);
        setField(term65367, term65367.getClass(), "first", null);
        setField(term65367, term65367.getClass(), "last", null);
        setField(term65367, term65367.getClass(), "propListHead", null);
        setIntField(term65367, term65367.getClass(), "sourcePosition", 0);
        setField(term65367, term65367.getClass(), "jsType", null);
        setField(term65367, term65367.getClass(), "parent", null);
        term65368 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65369 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term65368, term65368.getClass(), "number", 0.0);
        setIntField(term65368, term65368.getClass(), "type", 98);
        setField(term65368, term65368.getClass(), "next", null);
        setDoubleField(term65369, term65369.getClass(), "number", 0.0);
        setIntField(term65369, term65369.getClass(), "type", 98);
        setField(term65369, term65369.getClass(), "next", null);
        setField(term65369, term65369.getClass(), "first", null);
        setField(term65369, term65369.getClass(), "last", null);
        setField(term65369, term65369.getClass(), "propListHead", null);
        setIntField(term65369, term65369.getClass(), "sourcePosition", 0);
        setField(term65369, term65369.getClass(), "jsType", null);
        setField(term65369, term65369.getClass(), "parent", null);
        setField(term65368, term65368.getClass(), "first", term65369);
        setField(term65368, term65368.getClass(), "last", null);
        setField(term65368, term65368.getClass(), "propListHead", null);
        setIntField(term65368, term65368.getClass(), "sourcePosition", 0);
        setField(term65368, term65368.getClass(), "jsType", null);
        setField(term65368, term65368.getClass(), "parent", null);
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
        args[1] = term64957;
        args[2] = term64911;
        callMethod(klass, "visit", argTypes, term64727, args);
        assertTrue(recursiveEquals(term64727, term65366));
        assertTrue(recursiveEquals(term64957, term65368));
        assertTrue(recursiveEquals(term64911, null));
    }

};


