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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3652913;
     Object term3653005;
     Object term3653574;
     Object term3653575;
     Object term3653419;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3652913 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3653005 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3653097 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3653189 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3653281 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3653411 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3653005, term3653005.getClass(), "type", 37);
        setIntField(term3653097, term3653097.getClass(), "type", 35);
        setIntField(term3653281, term3653281.getClass(), "type", 40);
        setField(term3653281, term3653281.getClass(), "str", "substr");
        setField(term3653189, term3653189.getClass(), "next", term3653281);
        setIntField(term3653189, term3653189.getClass(), "type", 40);
        setField(term3653097, term3653097.getClass(), "first", term3653189);
        setIntField(term3653411, term3653411.getClass(), "type", 40);
        setField(term3653097, term3653097.getClass(), "next", term3653411);
        setField(term3653005, term3653005.getClass(), "first", term3653097);
        term3653574 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3653574, term3653574.getClass(), "currentTraversal", null);
        term3653575 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3653576 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3653577 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3653578 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3653579 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term3653575, term3653575.getClass(), "number", 0.0);
        setIntField(term3653575, term3653575.getClass(), "type", 37);
        setField(term3653575, term3653575.getClass(), "next", null);
        setField(term3653576, term3653576.getClass(), "str", null);
        setIntField(term3653576, term3653576.getClass(), "type", 35);
        setDoubleField(term3653577, term3653577.getClass(), "number", 0.0);
        setIntField(term3653577, term3653577.getClass(), "type", 40);
        setField(term3653577, term3653577.getClass(), "next", null);
        setField(term3653577, term3653577.getClass(), "first", null);
        setField(term3653577, term3653577.getClass(), "last", null);
        setField(term3653577, term3653577.getClass(), "propListHead", null);
        setIntField(term3653577, term3653577.getClass(), "sourcePosition", 0);
        setField(term3653577, term3653577.getClass(), "jsType", null);
        setField(term3653577, term3653577.getClass(), "parent", null);
        setField(term3653576, term3653576.getClass(), "next", term3653577);
        setField(term3653578, term3653578.getClass(), "str", null);
        setIntField(term3653578, term3653578.getClass(), "type", 40);
        setField(term3653579, term3653579.getClass(), "str", "");
        setIntField(term3653579, term3653579.getClass(), "type", 40);
        setField(term3653579, term3653579.getClass(), "next", null);
        setField(term3653579, term3653579.getClass(), "first", null);
        setField(term3653579, term3653579.getClass(), "last", null);
        setField(term3653579, term3653579.getClass(), "propListHead", null);
        setIntField(term3653579, term3653579.getClass(), "sourcePosition", 0);
        setField(term3653579, term3653579.getClass(), "jsType", null);
        setField(term3653579, term3653579.getClass(), "parent", null);
        setField(term3653578, term3653578.getClass(), "next", term3653579);
        setField(term3653578, term3653578.getClass(), "first", null);
        setField(term3653578, term3653578.getClass(), "last", null);
        setField(term3653578, term3653578.getClass(), "propListHead", null);
        setIntField(term3653578, term3653578.getClass(), "sourcePosition", 0);
        setField(term3653578, term3653578.getClass(), "jsType", null);
        setField(term3653578, term3653578.getClass(), "parent", null);
        setField(term3653576, term3653576.getClass(), "first", term3653578);
        setField(term3653576, term3653576.getClass(), "last", null);
        setField(term3653576, term3653576.getClass(), "propListHead", null);
        setIntField(term3653576, term3653576.getClass(), "sourcePosition", 0);
        setField(term3653576, term3653576.getClass(), "jsType", null);
        setField(term3653576, term3653576.getClass(), "parent", null);
        setField(term3653575, term3653575.getClass(), "first", term3653576);
        setField(term3653575, term3653575.getClass(), "last", null);
        setField(term3653575, term3653575.getClass(), "propListHead", null);
        setIntField(term3653575, term3653575.getClass(), "sourcePosition", 0);
        setField(term3653575, term3653575.getClass(), "jsType", null);
        setField(term3653575, term3653575.getClass(), "parent", null);
        term3653419 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3653422 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3653424 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3653428 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3653430 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term3653419, term3653419.getClass(), "number", 0.0);
        setIntField(term3653419, term3653419.getClass(), "type", 37);
        setField(term3653419, term3653419.getClass(), "next", null);
        setField(term3653422, term3653422.getClass(), "str", null);
        setIntField(term3653422, term3653422.getClass(), "type", 35);
        setDoubleField(term3653424, term3653424.getClass(), "number", 0.0);
        setIntField(term3653424, term3653424.getClass(), "type", 40);
        setField(term3653424, term3653424.getClass(), "next", null);
        setField(term3653424, term3653424.getClass(), "first", null);
        setField(term3653424, term3653424.getClass(), "last", null);
        setField(term3653424, term3653424.getClass(), "propListHead", null);
        setIntField(term3653424, term3653424.getClass(), "sourcePosition", 0);
        setField(term3653424, term3653424.getClass(), "jsType", null);
        setField(term3653424, term3653424.getClass(), "parent", null);
        setField(term3653422, term3653422.getClass(), "next", term3653424);
        setField(term3653428, term3653428.getClass(), "str", null);
        setIntField(term3653428, term3653428.getClass(), "type", 40);
        setField(term3653430, term3653430.getClass(), "str", "");
        setIntField(term3653430, term3653430.getClass(), "type", 40);
        setField(term3653430, term3653430.getClass(), "next", null);
        setField(term3653430, term3653430.getClass(), "first", null);
        setField(term3653430, term3653430.getClass(), "last", null);
        setField(term3653430, term3653430.getClass(), "propListHead", null);
        setIntField(term3653430, term3653430.getClass(), "sourcePosition", 0);
        setField(term3653430, term3653430.getClass(), "jsType", null);
        setField(term3653430, term3653430.getClass(), "parent", null);
        setField(term3653428, term3653428.getClass(), "next", term3653430);
        setField(term3653428, term3653428.getClass(), "first", null);
        setField(term3653428, term3653428.getClass(), "last", null);
        setField(term3653428, term3653428.getClass(), "propListHead", null);
        setIntField(term3653428, term3653428.getClass(), "sourcePosition", 0);
        setField(term3653428, term3653428.getClass(), "jsType", null);
        setField(term3653428, term3653428.getClass(), "parent", null);
        setField(term3653422, term3653422.getClass(), "first", term3653428);
        setField(term3653422, term3653422.getClass(), "last", null);
        setField(term3653422, term3653422.getClass(), "propListHead", null);
        setIntField(term3653422, term3653422.getClass(), "sourcePosition", 0);
        setField(term3653422, term3653422.getClass(), "jsType", null);
        setField(term3653422, term3653422.getClass(), "parent", null);
        setField(term3653419, term3653419.getClass(), "first", term3653422);
        setField(term3653419, term3653419.getClass(), "last", null);
        setField(term3653419, term3653419.getClass(), "propListHead", null);
        setIntField(term3653419, term3653419.getClass(), "sourcePosition", 0);
        setField(term3653419, term3653419.getClass(), "jsType", null);
        setField(term3653419, term3653419.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3653005;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3652913, args);
        assertTrue(recursiveEquals(term3652913, term3653574));
        assertTrue(recursiveEquals(term3653005, term3653575));
        assertTrue(recursiveEquals(retValue, term3653419));
    }

};


