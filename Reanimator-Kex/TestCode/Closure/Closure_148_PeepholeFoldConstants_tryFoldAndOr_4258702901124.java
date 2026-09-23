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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264410;
     Object term264502;
     Object term264594;
     Object term264664;
     Object term264705;
     Object term264706;
     Object term264707;
     Object term264708;
     Object term264665;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264410 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term264502 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term264502, term264502.getClass(), "parent", null);
        setIntField(term264502, term264502.getClass(), "type", 0);
        term264594 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term264594, term264594.getClass(), "type", 0);
        term264664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term264705 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term264705, term264705.getClass(), "currentTraversal", null);
        term264706 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term264706, term264706.getClass(), "number", 0.0);
        setIntField(term264706, term264706.getClass(), "type", 0);
        setField(term264706, term264706.getClass(), "next", null);
        setField(term264706, term264706.getClass(), "first", null);
        setField(term264706, term264706.getClass(), "last", null);
        setField(term264706, term264706.getClass(), "propListHead", null);
        setIntField(term264706, term264706.getClass(), "sourcePosition", 0);
        setField(term264706, term264706.getClass(), "jsType", null);
        setField(term264706, term264706.getClass(), "parent", null);
        term264707 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term264707, term264707.getClass(), "number", 0.0);
        setIntField(term264707, term264707.getClass(), "type", 0);
        setField(term264707, term264707.getClass(), "next", null);
        setField(term264707, term264707.getClass(), "first", null);
        setField(term264707, term264707.getClass(), "last", null);
        setField(term264707, term264707.getClass(), "propListHead", null);
        setIntField(term264707, term264707.getClass(), "sourcePosition", 0);
        setField(term264707, term264707.getClass(), "jsType", null);
        setField(term264707, term264707.getClass(), "parent", null);
        term264708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term264708, term264708.getClass(), "type", 0);
        setField(term264708, term264708.getClass(), "next", null);
        setField(term264708, term264708.getClass(), "first", null);
        setField(term264708, term264708.getClass(), "last", null);
        setField(term264708, term264708.getClass(), "propListHead", null);
        setIntField(term264708, term264708.getClass(), "sourcePosition", 0);
        setField(term264708, term264708.getClass(), "jsType", null);
        setField(term264708, term264708.getClass(), "parent", null);
        term264665 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term264665, term264665.getClass(), "number", 0.0);
        setIntField(term264665, term264665.getClass(), "type", 0);
        setField(term264665, term264665.getClass(), "next", null);
        setField(term264665, term264665.getClass(), "first", null);
        setField(term264665, term264665.getClass(), "last", null);
        setField(term264665, term264665.getClass(), "propListHead", null);
        setIntField(term264665, term264665.getClass(), "sourcePosition", 0);
        setField(term264665, term264665.getClass(), "jsType", null);
        setField(term264665, term264665.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term264502;
        args[1] = term264594;
        args[2] = term264664;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term264410, args);
        assertTrue(recursiveEquals(term264410, term264705));
        assertTrue(recursiveEquals(term264502, term264706));
        assertTrue(recursiveEquals(term264594, term264707));
        assertTrue(recursiveEquals(term264664, term264708));
        assertTrue(recursiveEquals(retValue, term264665));
    }

};


