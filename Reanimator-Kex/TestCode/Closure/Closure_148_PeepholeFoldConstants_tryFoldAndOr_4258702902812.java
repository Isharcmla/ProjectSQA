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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term816197;
     Object term816289;
     Object term816473;
     Object term816565;
     Object term816735;
     Object term816736;
     Object term816738;
     Object term816739;
     Object term816662;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term816197 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term816289 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term816381 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term816381, term816381.getClass(), "type", 114);
        setField(term816289, term816289.getClass(), "parent", term816381);
        setIntField(term816289, term816289.getClass(), "type", 0);
        term816473 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term816473, term816473.getClass(), "type", 50);
        term816565 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term816565, term816565.getClass(), "type", 47);
        term816735 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term816735, term816735.getClass(), "currentTraversal", null);
        term816736 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term816737 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term816736, term816736.getClass(), "number", 0.0);
        setIntField(term816736, term816736.getClass(), "type", 0);
        setField(term816736, term816736.getClass(), "next", null);
        setField(term816736, term816736.getClass(), "first", null);
        setField(term816736, term816736.getClass(), "last", null);
        setField(term816736, term816736.getClass(), "propListHead", null);
        setIntField(term816736, term816736.getClass(), "sourcePosition", 0);
        setField(term816736, term816736.getClass(), "jsType", null);
        setDoubleField(term816737, term816737.getClass(), "number", 0.0);
        setIntField(term816737, term816737.getClass(), "type", 114);
        setField(term816737, term816737.getClass(), "next", null);
        setField(term816737, term816737.getClass(), "first", null);
        setField(term816737, term816737.getClass(), "last", null);
        setField(term816737, term816737.getClass(), "propListHead", null);
        setIntField(term816737, term816737.getClass(), "sourcePosition", 0);
        setField(term816737, term816737.getClass(), "jsType", null);
        setField(term816737, term816737.getClass(), "parent", null);
        setField(term816736, term816736.getClass(), "parent", term816737);
        term816738 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term816738, term816738.getClass(), "number", 0.0);
        setIntField(term816738, term816738.getClass(), "type", 50);
        setField(term816738, term816738.getClass(), "next", null);
        setField(term816738, term816738.getClass(), "first", null);
        setField(term816738, term816738.getClass(), "last", null);
        setField(term816738, term816738.getClass(), "propListHead", null);
        setIntField(term816738, term816738.getClass(), "sourcePosition", 0);
        setField(term816738, term816738.getClass(), "jsType", null);
        setField(term816738, term816738.getClass(), "parent", null);
        term816739 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term816739, term816739.getClass(), "str", null);
        setIntField(term816739, term816739.getClass(), "type", 47);
        setField(term816739, term816739.getClass(), "next", null);
        setField(term816739, term816739.getClass(), "first", null);
        setField(term816739, term816739.getClass(), "last", null);
        setField(term816739, term816739.getClass(), "propListHead", null);
        setIntField(term816739, term816739.getClass(), "sourcePosition", 0);
        setField(term816739, term816739.getClass(), "jsType", null);
        setField(term816739, term816739.getClass(), "parent", null);
        term816662 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term816666 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term816662, term816662.getClass(), "number", 0.0);
        setIntField(term816662, term816662.getClass(), "type", 0);
        setField(term816662, term816662.getClass(), "next", null);
        setField(term816662, term816662.getClass(), "first", null);
        setField(term816662, term816662.getClass(), "last", null);
        setField(term816662, term816662.getClass(), "propListHead", null);
        setIntField(term816662, term816662.getClass(), "sourcePosition", 0);
        setField(term816662, term816662.getClass(), "jsType", null);
        setDoubleField(term816666, term816666.getClass(), "number", 0.0);
        setIntField(term816666, term816666.getClass(), "type", 114);
        setField(term816666, term816666.getClass(), "next", null);
        setField(term816666, term816666.getClass(), "first", null);
        setField(term816666, term816666.getClass(), "last", null);
        setField(term816666, term816666.getClass(), "propListHead", null);
        setIntField(term816666, term816666.getClass(), "sourcePosition", 0);
        setField(term816666, term816666.getClass(), "jsType", null);
        setField(term816666, term816666.getClass(), "parent", null);
        setField(term816662, term816662.getClass(), "parent", term816666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term816289;
        args[1] = term816473;
        args[2] = term816565;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term816197, args);
        assertTrue(recursiveEquals(term816197, term816735));
        assertTrue(recursiveEquals(term816289, term816736));
        assertTrue(recursiveEquals(term816473, term816738));
        assertTrue(recursiveEquals(term816565, term816739));
        assertTrue(recursiveEquals(retValue, term816662));
    }

};


