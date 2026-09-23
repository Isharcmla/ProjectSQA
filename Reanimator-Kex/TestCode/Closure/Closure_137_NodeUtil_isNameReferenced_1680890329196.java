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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_isNameReferenced_1680890329196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2780;

    public NodeUtil_isNameReferenced_1680890329196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2793 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2803 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2780, term2780.getClass(), "type", -1249782654);
        setIntField(term2782, term2782.getClass(), "type", -2092117838);
        setIntField(term2784, term2784.getClass(), "type", 0);
        setField(term2784, term2784.getClass(), "next", null);
        setField(term2784, term2784.getClass(), "first", null);
        setField(term2784, term2784.getClass(), "last", null);
        setField(term2784, term2784.getClass(), "propListHead", null);
        setIntField(term2784, term2784.getClass(), "sourcePosition", 0);
        setField(term2784, term2784.getClass(), "jsType", null);
        setField(term2784, term2784.getClass(), "parent", null);
        setField(term2782, term2782.getClass(), "next", term2784);
        setIntField(term2787, term2787.getClass(), "type", 0);
        setField(term2787, term2787.getClass(), "next", null);
        setField(term2787, term2787.getClass(), "first", null);
        setField(term2787, term2787.getClass(), "last", null);
        setField(term2787, term2787.getClass(), "propListHead", null);
        setIntField(term2787, term2787.getClass(), "sourcePosition", 0);
        setField(term2787, term2787.getClass(), "jsType", null);
        setField(term2787, term2787.getClass(), "parent", null);
        setField(term2782, term2782.getClass(), "first", term2787);
        setIntField(term2790, term2790.getClass(), "type", 0);
        setField(term2790, term2790.getClass(), "next", null);
        setField(term2790, term2790.getClass(), "first", null);
        setField(term2790, term2790.getClass(), "last", null);
        setField(term2790, term2790.getClass(), "propListHead", null);
        setIntField(term2790, term2790.getClass(), "sourcePosition", 0);
        setField(term2790, term2790.getClass(), "jsType", null);
        setField(term2790, term2790.getClass(), "parent", null);
        setField(term2782, term2782.getClass(), "last", term2790);
        setField(term2793, term2793.getClass(), "next", null);
        setIntField(term2793, term2793.getClass(), "type", 0);
        setIntField(term2793, term2793.getClass(), "intValue", 0);
        setField(term2793, term2793.getClass(), "objectValue", null);
        setField(term2782, term2782.getClass(), "propListHead", term2793);
        setIntField(term2782, term2782.getClass(), "sourcePosition", -1731921726);
        setField(term2782, term2782.getClass(), "jsType", null);
        setField(term2782, term2782.getClass(), "parent", null);
        setField(term2780, term2780.getClass(), "next", term2782);
        setIntField(term2797, term2797.getClass(), "type", 0);
        setField(term2797, term2797.getClass(), "next", null);
        setField(term2797, term2797.getClass(), "first", null);
        setField(term2797, term2797.getClass(), "last", null);
        setField(term2797, term2797.getClass(), "propListHead", null);
        setIntField(term2797, term2797.getClass(), "sourcePosition", 0);
        setField(term2797, term2797.getClass(), "jsType", null);
        setField(term2797, term2797.getClass(), "parent", null);
        setField(term2780, term2780.getClass(), "first", term2797);
        setIntField(term2800, term2800.getClass(), "type", 0);
        setField(term2800, term2800.getClass(), "next", null);
        setField(term2800, term2800.getClass(), "first", null);
        setField(term2800, term2800.getClass(), "last", null);
        setField(term2800, term2800.getClass(), "propListHead", null);
        setIntField(term2800, term2800.getClass(), "sourcePosition", 0);
        setField(term2800, term2800.getClass(), "jsType", null);
        setField(term2800, term2800.getClass(), "parent", null);
        setField(term2780, term2780.getClass(), "last", term2800);
        setField(term2803, term2803.getClass(), "next", null);
        setIntField(term2803, term2803.getClass(), "type", 0);
        setIntField(term2803, term2803.getClass(), "intValue", 0);
        setField(term2803, term2803.getClass(), "objectValue", null);
        setField(term2780, term2780.getClass(), "propListHead", term2803);
        setIntField(term2780, term2780.getClass(), "sourcePosition", 919994471);
        setField(term2780, term2780.getClass(), "jsType", null);
        setField(term2780, term2780.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term2780;
        args[1] = "eZFUvlxvGV";
        args[2] = null;
        try {
            callMethod(klass, "isNameReferenced", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


