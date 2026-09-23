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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term787591;
     Object term787683;
     Object term787867;
     Object term787959;
     Object term788042;
     Object term788043;
     Object term788045;
     Object term788046;
     Object term787970;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term787591 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term787683 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term787775 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term787775, term787775.getClass(), "type", 113);
        setField(term787683, term787683.getClass(), "parent", term787775);
        setIntField(term787683, term787683.getClass(), "type", 0);
        term787867 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term787867, term787867.getClass(), "type", 76);
        term787959 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term787959, term787959.getClass(), "type", 47);
        term788042 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term788042, term788042.getClass(), "currentTraversal", null);
        term788043 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term788044 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term788043, term788043.getClass(), "number", 0.0);
        setIntField(term788043, term788043.getClass(), "type", 0);
        setField(term788043, term788043.getClass(), "next", null);
        setField(term788043, term788043.getClass(), "first", null);
        setField(term788043, term788043.getClass(), "last", null);
        setField(term788043, term788043.getClass(), "propListHead", null);
        setIntField(term788043, term788043.getClass(), "sourcePosition", 0);
        setField(term788043, term788043.getClass(), "jsType", null);
        setDoubleField(term788044, term788044.getClass(), "number", 0.0);
        setIntField(term788044, term788044.getClass(), "type", 113);
        setField(term788044, term788044.getClass(), "next", null);
        setField(term788044, term788044.getClass(), "first", null);
        setField(term788044, term788044.getClass(), "last", null);
        setField(term788044, term788044.getClass(), "propListHead", null);
        setIntField(term788044, term788044.getClass(), "sourcePosition", 0);
        setField(term788044, term788044.getClass(), "jsType", null);
        setField(term788044, term788044.getClass(), "parent", null);
        setField(term788043, term788043.getClass(), "parent", term788044);
        term788045 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term788045, term788045.getClass(), "str", null);
        setIntField(term788045, term788045.getClass(), "type", 76);
        setField(term788045, term788045.getClass(), "next", null);
        setField(term788045, term788045.getClass(), "first", null);
        setField(term788045, term788045.getClass(), "last", null);
        setField(term788045, term788045.getClass(), "propListHead", null);
        setIntField(term788045, term788045.getClass(), "sourcePosition", 0);
        setField(term788045, term788045.getClass(), "jsType", null);
        setField(term788045, term788045.getClass(), "parent", null);
        term788046 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term788046, term788046.getClass(), "number", 0.0);
        setIntField(term788046, term788046.getClass(), "type", 47);
        setField(term788046, term788046.getClass(), "next", null);
        setField(term788046, term788046.getClass(), "first", null);
        setField(term788046, term788046.getClass(), "last", null);
        setField(term788046, term788046.getClass(), "propListHead", null);
        setIntField(term788046, term788046.getClass(), "sourcePosition", 0);
        setField(term788046, term788046.getClass(), "jsType", null);
        setField(term788046, term788046.getClass(), "parent", null);
        term787970 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term787974 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term787970, term787970.getClass(), "number", 0.0);
        setIntField(term787970, term787970.getClass(), "type", 0);
        setField(term787970, term787970.getClass(), "next", null);
        setField(term787970, term787970.getClass(), "first", null);
        setField(term787970, term787970.getClass(), "last", null);
        setField(term787970, term787970.getClass(), "propListHead", null);
        setIntField(term787970, term787970.getClass(), "sourcePosition", 0);
        setField(term787970, term787970.getClass(), "jsType", null);
        setDoubleField(term787974, term787974.getClass(), "number", 0.0);
        setIntField(term787974, term787974.getClass(), "type", 113);
        setField(term787974, term787974.getClass(), "next", null);
        setField(term787974, term787974.getClass(), "first", null);
        setField(term787974, term787974.getClass(), "last", null);
        setField(term787974, term787974.getClass(), "propListHead", null);
        setIntField(term787974, term787974.getClass(), "sourcePosition", 0);
        setField(term787974, term787974.getClass(), "jsType", null);
        setField(term787974, term787974.getClass(), "parent", null);
        setField(term787970, term787970.getClass(), "parent", term787974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term787683;
        args[1] = term787867;
        args[2] = term787959;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term787591, args);
        assertTrue(recursiveEquals(term787591, term788042));
        assertTrue(recursiveEquals(term787683, term788043));
        assertTrue(recursiveEquals(term787867, term788045));
        assertTrue(recursiveEquals(term787959, term788046));
        assertTrue(recursiveEquals(retValue, term787970));
    }

};


