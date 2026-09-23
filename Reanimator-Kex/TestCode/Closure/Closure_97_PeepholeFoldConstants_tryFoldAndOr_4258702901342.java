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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442261;
     Object term442353;
     Object term442537;
     Object term442607;
     Object term442707;
     Object term442708;
     Object term442710;
     Object term442711;
     Object term442664;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442261 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term442353 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term442445 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term442353, term442353.getClass(), "parent", term442445);
        setIntField(term442353, term442353.getClass(), "type", 0);
        term442537 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term442537, term442537.getClass(), "type", 0);
        term442607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term442707 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term442707, term442707.getClass(), "currentTraversal", null);
        term442708 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term442709 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term442708, term442708.getClass(), "number", 0.0);
        setIntField(term442708, term442708.getClass(), "type", 0);
        setField(term442708, term442708.getClass(), "next", null);
        setField(term442708, term442708.getClass(), "first", null);
        setField(term442708, term442708.getClass(), "last", null);
        setField(term442708, term442708.getClass(), "propListHead", null);
        setIntField(term442708, term442708.getClass(), "sourcePosition", 0);
        setField(term442708, term442708.getClass(), "jsType", null);
        setDoubleField(term442709, term442709.getClass(), "number", 0.0);
        setIntField(term442709, term442709.getClass(), "type", 0);
        setField(term442709, term442709.getClass(), "next", null);
        setField(term442709, term442709.getClass(), "first", null);
        setField(term442709, term442709.getClass(), "last", null);
        setField(term442709, term442709.getClass(), "propListHead", null);
        setIntField(term442709, term442709.getClass(), "sourcePosition", 0);
        setField(term442709, term442709.getClass(), "jsType", null);
        setField(term442709, term442709.getClass(), "parent", null);
        setField(term442708, term442708.getClass(), "parent", term442709);
        term442710 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term442710, term442710.getClass(), "str", null);
        setIntField(term442710, term442710.getClass(), "type", 0);
        setField(term442710, term442710.getClass(), "next", null);
        setField(term442710, term442710.getClass(), "first", null);
        setField(term442710, term442710.getClass(), "last", null);
        setField(term442710, term442710.getClass(), "propListHead", null);
        setIntField(term442710, term442710.getClass(), "sourcePosition", 0);
        setField(term442710, term442710.getClass(), "jsType", null);
        setField(term442710, term442710.getClass(), "parent", null);
        term442711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term442711, term442711.getClass(), "type", 0);
        setField(term442711, term442711.getClass(), "next", null);
        setField(term442711, term442711.getClass(), "first", null);
        setField(term442711, term442711.getClass(), "last", null);
        setField(term442711, term442711.getClass(), "propListHead", null);
        setIntField(term442711, term442711.getClass(), "sourcePosition", 0);
        setField(term442711, term442711.getClass(), "jsType", null);
        setField(term442711, term442711.getClass(), "parent", null);
        term442664 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term442668 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term442664, term442664.getClass(), "number", 0.0);
        setIntField(term442664, term442664.getClass(), "type", 0);
        setField(term442664, term442664.getClass(), "next", null);
        setField(term442664, term442664.getClass(), "first", null);
        setField(term442664, term442664.getClass(), "last", null);
        setField(term442664, term442664.getClass(), "propListHead", null);
        setIntField(term442664, term442664.getClass(), "sourcePosition", 0);
        setField(term442664, term442664.getClass(), "jsType", null);
        setDoubleField(term442668, term442668.getClass(), "number", 0.0);
        setIntField(term442668, term442668.getClass(), "type", 0);
        setField(term442668, term442668.getClass(), "next", null);
        setField(term442668, term442668.getClass(), "first", null);
        setField(term442668, term442668.getClass(), "last", null);
        setField(term442668, term442668.getClass(), "propListHead", null);
        setIntField(term442668, term442668.getClass(), "sourcePosition", 0);
        setField(term442668, term442668.getClass(), "jsType", null);
        setField(term442668, term442668.getClass(), "parent", null);
        setField(term442664, term442664.getClass(), "parent", term442668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term442353;
        args[1] = term442537;
        args[2] = term442607;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term442261, args);
        assertTrue(recursiveEquals(term442261, term442707));
        assertTrue(recursiveEquals(term442353, term442708));
        assertTrue(recursiveEquals(term442537, term442710));
        assertTrue(recursiveEquals(term442607, term442711));
        assertTrue(recursiveEquals(retValue, term442664));
    }

};


