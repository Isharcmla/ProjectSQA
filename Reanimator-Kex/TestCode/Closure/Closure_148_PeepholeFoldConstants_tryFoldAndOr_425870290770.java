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

public class PeepholeFoldConstants_tryFoldAndOr_425870290770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174077;
     Object term174169;
     Object term174353;
     Object term174423;
     Object term174502;
     Object term174503;
     Object term174505;
     Object term174506;
     Object term174459;

    public PeepholeFoldConstants_tryFoldAndOr_425870290770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174077 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term174169 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term174261 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term174169, term174169.getClass(), "parent", term174261);
        setIntField(term174169, term174169.getClass(), "type", 0);
        term174353 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term174353, term174353.getClass(), "type", 0);
        term174423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term174502 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term174502, term174502.getClass(), "currentTraversal", null);
        term174503 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term174504 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term174503, term174503.getClass(), "number", 0.0);
        setIntField(term174503, term174503.getClass(), "type", 0);
        setField(term174503, term174503.getClass(), "next", null);
        setField(term174503, term174503.getClass(), "first", null);
        setField(term174503, term174503.getClass(), "last", null);
        setField(term174503, term174503.getClass(), "propListHead", null);
        setIntField(term174503, term174503.getClass(), "sourcePosition", 0);
        setField(term174503, term174503.getClass(), "jsType", null);
        setDoubleField(term174504, term174504.getClass(), "number", 0.0);
        setIntField(term174504, term174504.getClass(), "type", 0);
        setField(term174504, term174504.getClass(), "next", null);
        setField(term174504, term174504.getClass(), "first", null);
        setField(term174504, term174504.getClass(), "last", null);
        setField(term174504, term174504.getClass(), "propListHead", null);
        setIntField(term174504, term174504.getClass(), "sourcePosition", 0);
        setField(term174504, term174504.getClass(), "jsType", null);
        setField(term174504, term174504.getClass(), "parent", null);
        setField(term174503, term174503.getClass(), "parent", term174504);
        term174505 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term174505, term174505.getClass(), "str", null);
        setIntField(term174505, term174505.getClass(), "type", 0);
        setField(term174505, term174505.getClass(), "next", null);
        setField(term174505, term174505.getClass(), "first", null);
        setField(term174505, term174505.getClass(), "last", null);
        setField(term174505, term174505.getClass(), "propListHead", null);
        setIntField(term174505, term174505.getClass(), "sourcePosition", 0);
        setField(term174505, term174505.getClass(), "jsType", null);
        setField(term174505, term174505.getClass(), "parent", null);
        term174506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term174506, term174506.getClass(), "type", 0);
        setField(term174506, term174506.getClass(), "next", null);
        setField(term174506, term174506.getClass(), "first", null);
        setField(term174506, term174506.getClass(), "last", null);
        setField(term174506, term174506.getClass(), "propListHead", null);
        setIntField(term174506, term174506.getClass(), "sourcePosition", 0);
        setField(term174506, term174506.getClass(), "jsType", null);
        setField(term174506, term174506.getClass(), "parent", null);
        term174459 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term174463 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term174459, term174459.getClass(), "number", 0.0);
        setIntField(term174459, term174459.getClass(), "type", 0);
        setField(term174459, term174459.getClass(), "next", null);
        setField(term174459, term174459.getClass(), "first", null);
        setField(term174459, term174459.getClass(), "last", null);
        setField(term174459, term174459.getClass(), "propListHead", null);
        setIntField(term174459, term174459.getClass(), "sourcePosition", 0);
        setField(term174459, term174459.getClass(), "jsType", null);
        setDoubleField(term174463, term174463.getClass(), "number", 0.0);
        setIntField(term174463, term174463.getClass(), "type", 0);
        setField(term174463, term174463.getClass(), "next", null);
        setField(term174463, term174463.getClass(), "first", null);
        setField(term174463, term174463.getClass(), "last", null);
        setField(term174463, term174463.getClass(), "propListHead", null);
        setIntField(term174463, term174463.getClass(), "sourcePosition", 0);
        setField(term174463, term174463.getClass(), "jsType", null);
        setField(term174463, term174463.getClass(), "parent", null);
        setField(term174459, term174459.getClass(), "parent", term174463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term174169;
        args[1] = term174353;
        args[2] = term174423;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term174077, args);
        assertTrue(recursiveEquals(term174077, term174502));
        assertTrue(recursiveEquals(term174169, term174503));
        assertTrue(recursiveEquals(term174353, term174505));
        assertTrue(recursiveEquals(term174423, term174506));
        assertTrue(recursiveEquals(retValue, term174459));
    }

};


