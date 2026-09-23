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

public class FoldConstants_tryFoldBlock_1167048042217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56242;
     Object term56312;
     Object term56728;
     Object term56729;

    public FoldConstants_tryFoldBlock_1167048042217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56242 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term56312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term56522, term56522.getClass(), "next", term56592);
        setIntField(term56522, term56522.getClass(), "type", 68);
        setField(term56452, term56452.getClass(), "next", term56522);
        setIntField(term56452, term56452.getClass(), "type", 69);
        setField(term56382, term56382.getClass(), "next", term56452);
        setIntField(term56382, term56382.getClass(), "type", 60);
        setField(term56312, term56312.getClass(), "first", term56382);
        term56728 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term56728, term56728.getClass(), "compiler", null);
        term56729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56729, term56729.getClass(), "type", 0);
        setField(term56729, term56729.getClass(), "next", null);
        setIntField(term56730, term56730.getClass(), "type", 60);
        setIntField(term56731, term56731.getClass(), "type", 69);
        setIntField(term56732, term56732.getClass(), "type", 68);
        setIntField(term56733, term56733.getClass(), "type", 0);
        setField(term56733, term56733.getClass(), "next", null);
        setField(term56733, term56733.getClass(), "first", null);
        setField(term56733, term56733.getClass(), "last", null);
        setField(term56733, term56733.getClass(), "propListHead", null);
        setIntField(term56733, term56733.getClass(), "sourcePosition", 0);
        setField(term56733, term56733.getClass(), "jsType", null);
        setField(term56733, term56733.getClass(), "parent", null);
        setField(term56732, term56732.getClass(), "next", term56733);
        setField(term56732, term56732.getClass(), "first", null);
        setField(term56732, term56732.getClass(), "last", null);
        setField(term56732, term56732.getClass(), "propListHead", null);
        setIntField(term56732, term56732.getClass(), "sourcePosition", 0);
        setField(term56732, term56732.getClass(), "jsType", null);
        setField(term56732, term56732.getClass(), "parent", null);
        setField(term56731, term56731.getClass(), "next", term56732);
        setField(term56731, term56731.getClass(), "first", null);
        setField(term56731, term56731.getClass(), "last", null);
        setField(term56731, term56731.getClass(), "propListHead", null);
        setIntField(term56731, term56731.getClass(), "sourcePosition", 0);
        setField(term56731, term56731.getClass(), "jsType", null);
        setField(term56731, term56731.getClass(), "parent", null);
        setField(term56730, term56730.getClass(), "next", term56731);
        setField(term56730, term56730.getClass(), "first", null);
        setField(term56730, term56730.getClass(), "last", null);
        setField(term56730, term56730.getClass(), "propListHead", null);
        setIntField(term56730, term56730.getClass(), "sourcePosition", 0);
        setField(term56730, term56730.getClass(), "jsType", null);
        setField(term56730, term56730.getClass(), "parent", null);
        setField(term56729, term56729.getClass(), "first", term56730);
        setField(term56729, term56729.getClass(), "last", null);
        setField(term56729, term56729.getClass(), "propListHead", null);
        setIntField(term56729, term56729.getClass(), "sourcePosition", 0);
        setField(term56729, term56729.getClass(), "jsType", null);
        setField(term56729, term56729.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term56312;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term56242, args);
        assertTrue(recursiveEquals(term56242, term56728));
        assertTrue(recursiveEquals(term56312, null));
    }

};


