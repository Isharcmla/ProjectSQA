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
import java.lang.Object;

public class NodeUtil_callHasLocalResult_370414859183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562;

    public NodeUtil_callHasLocalResult_370414859183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term562, term562.getClass(), "type", -542712742);
        setIntField(term564, term564.getClass(), "type", 479531250);
        setIntField(term566, term566.getClass(), "type", 0);
        setField(term566, term566.getClass(), "next", null);
        setField(term566, term566.getClass(), "first", null);
        setField(term566, term566.getClass(), "last", null);
        setField(term566, term566.getClass(), "propListHead", null);
        setIntField(term566, term566.getClass(), "sourcePosition", 0);
        setField(term566, term566.getClass(), "jsType", null);
        setField(term566, term566.getClass(), "parent", null);
        setField(term564, term564.getClass(), "next", term566);
        setIntField(term569, term569.getClass(), "type", 0);
        setField(term569, term569.getClass(), "next", null);
        setField(term569, term569.getClass(), "first", null);
        setField(term569, term569.getClass(), "last", null);
        setField(term569, term569.getClass(), "propListHead", null);
        setIntField(term569, term569.getClass(), "sourcePosition", 0);
        setField(term569, term569.getClass(), "jsType", null);
        setField(term569, term569.getClass(), "parent", null);
        setField(term564, term564.getClass(), "first", term569);
        setIntField(term572, term572.getClass(), "type", 0);
        setField(term572, term572.getClass(), "next", null);
        setField(term572, term572.getClass(), "first", null);
        setField(term572, term572.getClass(), "last", null);
        setField(term572, term572.getClass(), "propListHead", null);
        setIntField(term572, term572.getClass(), "sourcePosition", 0);
        setField(term572, term572.getClass(), "jsType", null);
        setField(term572, term572.getClass(), "parent", null);
        setField(term564, term564.getClass(), "last", term572);
        setField(term564, term564.getClass(), "propListHead", null);
        setIntField(term564, term564.getClass(), "sourcePosition", 0);
        setField(term564, term564.getClass(), "jsType", null);
        setField(term564, term564.getClass(), "parent", null);
        setField(term562, term562.getClass(), "next", term564);
        setIntField(term576, term576.getClass(), "type", 0);
        setField(term576, term576.getClass(), "next", null);
        setField(term576, term576.getClass(), "first", null);
        setField(term576, term576.getClass(), "last", null);
        setField(term576, term576.getClass(), "propListHead", null);
        setIntField(term576, term576.getClass(), "sourcePosition", 0);
        setField(term576, term576.getClass(), "jsType", null);
        setField(term576, term576.getClass(), "parent", null);
        setField(term562, term562.getClass(), "first", term576);
        setIntField(term579, term579.getClass(), "type", 0);
        setField(term579, term579.getClass(), "next", null);
        setField(term579, term579.getClass(), "first", null);
        setField(term579, term579.getClass(), "last", null);
        setField(term579, term579.getClass(), "propListHead", null);
        setIntField(term579, term579.getClass(), "sourcePosition", 0);
        setField(term579, term579.getClass(), "jsType", null);
        setField(term579, term579.getClass(), "parent", null);
        setField(term562, term562.getClass(), "last", term579);
        setField(term562, term562.getClass(), "propListHead", null);
        setIntField(term562, term562.getClass(), "sourcePosition", 0);
        setField(term562, term562.getClass(), "jsType", null);
        setField(term562, term562.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term562;
        try {
            callMethod(klass, "callHasLocalResult", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


