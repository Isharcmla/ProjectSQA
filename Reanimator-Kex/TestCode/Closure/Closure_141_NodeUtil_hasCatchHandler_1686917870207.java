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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_hasCatchHandler_1686917870207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3116;

    public NodeUtil_hasCatchHandler_1686917870207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3129 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3139 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3116, term3116.getClass(), "type", 2108571355);
        setIntField(term3118, term3118.getClass(), "type", 2079590265);
        setIntField(term3120, term3120.getClass(), "type", 0);
        setField(term3120, term3120.getClass(), "next", null);
        setField(term3120, term3120.getClass(), "first", null);
        setField(term3120, term3120.getClass(), "last", null);
        setField(term3120, term3120.getClass(), "propListHead", null);
        setIntField(term3120, term3120.getClass(), "sourcePosition", 0);
        setField(term3120, term3120.getClass(), "jsType", null);
        setField(term3120, term3120.getClass(), "parent", null);
        setField(term3118, term3118.getClass(), "next", term3120);
        setIntField(term3123, term3123.getClass(), "type", 0);
        setField(term3123, term3123.getClass(), "next", null);
        setField(term3123, term3123.getClass(), "first", null);
        setField(term3123, term3123.getClass(), "last", null);
        setField(term3123, term3123.getClass(), "propListHead", null);
        setIntField(term3123, term3123.getClass(), "sourcePosition", 0);
        setField(term3123, term3123.getClass(), "jsType", null);
        setField(term3123, term3123.getClass(), "parent", null);
        setField(term3118, term3118.getClass(), "first", term3123);
        setIntField(term3126, term3126.getClass(), "type", 0);
        setField(term3126, term3126.getClass(), "next", null);
        setField(term3126, term3126.getClass(), "first", null);
        setField(term3126, term3126.getClass(), "last", null);
        setField(term3126, term3126.getClass(), "propListHead", null);
        setIntField(term3126, term3126.getClass(), "sourcePosition", 0);
        setField(term3126, term3126.getClass(), "jsType", null);
        setField(term3126, term3126.getClass(), "parent", null);
        setField(term3118, term3118.getClass(), "last", term3126);
        setField(term3129, term3129.getClass(), "next", null);
        setIntField(term3129, term3129.getClass(), "type", 0);
        setIntField(term3129, term3129.getClass(), "intValue", 0);
        setField(term3129, term3129.getClass(), "objectValue", null);
        setField(term3118, term3118.getClass(), "propListHead", term3129);
        setIntField(term3118, term3118.getClass(), "sourcePosition", 270928865);
        setField(term3118, term3118.getClass(), "jsType", null);
        setField(term3118, term3118.getClass(), "parent", null);
        setField(term3116, term3116.getClass(), "next", term3118);
        setIntField(term3133, term3133.getClass(), "type", 0);
        setField(term3133, term3133.getClass(), "next", null);
        setField(term3133, term3133.getClass(), "first", null);
        setField(term3133, term3133.getClass(), "last", null);
        setField(term3133, term3133.getClass(), "propListHead", null);
        setIntField(term3133, term3133.getClass(), "sourcePosition", 0);
        setField(term3133, term3133.getClass(), "jsType", null);
        setField(term3133, term3133.getClass(), "parent", null);
        setField(term3116, term3116.getClass(), "first", term3133);
        setIntField(term3136, term3136.getClass(), "type", 0);
        setField(term3136, term3136.getClass(), "next", null);
        setField(term3136, term3136.getClass(), "first", null);
        setField(term3136, term3136.getClass(), "last", null);
        setField(term3136, term3136.getClass(), "propListHead", null);
        setIntField(term3136, term3136.getClass(), "sourcePosition", 0);
        setField(term3136, term3136.getClass(), "jsType", null);
        setField(term3136, term3136.getClass(), "parent", null);
        setField(term3116, term3116.getClass(), "last", term3136);
        setField(term3139, term3139.getClass(), "next", null);
        setIntField(term3139, term3139.getClass(), "type", 0);
        setIntField(term3139, term3139.getClass(), "intValue", 0);
        setField(term3139, term3139.getClass(), "objectValue", null);
        setField(term3116, term3116.getClass(), "propListHead", term3139);
        setIntField(term3116, term3116.getClass(), "sourcePosition", -308526089);
        setField(term3116, term3116.getClass(), "jsType", null);
        setField(term3116, term3116.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3116;
        try {
            callMethod(klass, "hasCatchHandler", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


