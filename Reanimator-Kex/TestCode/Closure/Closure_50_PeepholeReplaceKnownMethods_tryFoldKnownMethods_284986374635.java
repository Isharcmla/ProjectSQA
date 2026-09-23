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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3568073;
     Object term3568165;
     Object term3569698;
     Object term3569699;
     Object term3569306;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3568073 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3568165 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3568257 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3568349 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3568441 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3568609 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3568257, term3568257.getClass(), "type", 35);
        setIntField(term3568441, term3568441.getClass(), "type", 40);
        setField(term3568441, term3568441.getClass(), "str", "charAt");
        setField(term3568349, term3568349.getClass(), "next", term3568441);
        setIntField(term3568349, term3568349.getClass(), "type", 40);
        setField(term3568349, term3568349.getClass(), "str", "substring");
        setField(term3568257, term3568257.getClass(), "first", term3568349);
        setIntField(term3568609, term3568609.getClass(), "type", 39);
        setField(term3568609, term3568609.getClass(), "next", null);
        setDoubleField(term3568609, term3568609.getClass(), "number", 7.0751594329796321E18);
        setField(term3568257, term3568257.getClass(), "next", term3568609);
        setField(term3568165, term3568165.getClass(), "first", term3568257);
        setIntField(term3568165, term3568165.getClass(), "type", 37);
        term3569698 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3569698, term3569698.getClass(), "currentTraversal", null);
        term3569699 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3569700 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3569701 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3569702 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3569705 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3569699, term3569699.getClass(), "str", null);
        setIntField(term3569699, term3569699.getClass(), "type", 37);
        setField(term3569699, term3569699.getClass(), "next", null);
        setField(term3569700, term3569700.getClass(), "str", null);
        setIntField(term3569700, term3569700.getClass(), "type", 35);
        setDoubleField(term3569701, term3569701.getClass(), "number", 7.0751594329796321E18);
        setIntField(term3569701, term3569701.getClass(), "type", 39);
        setField(term3569701, term3569701.getClass(), "next", null);
        setField(term3569701, term3569701.getClass(), "first", null);
        setField(term3569701, term3569701.getClass(), "last", null);
        setField(term3569701, term3569701.getClass(), "propListHead", null);
        setIntField(term3569701, term3569701.getClass(), "sourcePosition", 0);
        setField(term3569701, term3569701.getClass(), "jsType", null);
        setField(term3569701, term3569701.getClass(), "parent", null);
        setField(term3569700, term3569700.getClass(), "next", term3569701);
        setField(term3569702, term3569702.getClass(), "str", "substring");
        setIntField(term3569702, term3569702.getClass(), "type", 40);
        setField(term3569705, term3569705.getClass(), "str", "");
        setIntField(term3569705, term3569705.getClass(), "type", 40);
        setField(term3569705, term3569705.getClass(), "next", null);
        setField(term3569705, term3569705.getClass(), "first", null);
        setField(term3569705, term3569705.getClass(), "last", null);
        setField(term3569705, term3569705.getClass(), "propListHead", null);
        setIntField(term3569705, term3569705.getClass(), "sourcePosition", 0);
        setField(term3569705, term3569705.getClass(), "jsType", null);
        setField(term3569705, term3569705.getClass(), "parent", null);
        setField(term3569702, term3569702.getClass(), "next", term3569705);
        setField(term3569702, term3569702.getClass(), "first", null);
        setField(term3569702, term3569702.getClass(), "last", null);
        setField(term3569702, term3569702.getClass(), "propListHead", null);
        setIntField(term3569702, term3569702.getClass(), "sourcePosition", 0);
        setField(term3569702, term3569702.getClass(), "jsType", null);
        setField(term3569702, term3569702.getClass(), "parent", null);
        setField(term3569700, term3569700.getClass(), "first", term3569702);
        setField(term3569700, term3569700.getClass(), "last", null);
        setField(term3569700, term3569700.getClass(), "propListHead", null);
        setIntField(term3569700, term3569700.getClass(), "sourcePosition", 0);
        setField(term3569700, term3569700.getClass(), "jsType", null);
        setField(term3569700, term3569700.getClass(), "parent", null);
        setField(term3569699, term3569699.getClass(), "first", term3569700);
        setField(term3569699, term3569699.getClass(), "last", null);
        setField(term3569699, term3569699.getClass(), "propListHead", null);
        setIntField(term3569699, term3569699.getClass(), "sourcePosition", 0);
        setField(term3569699, term3569699.getClass(), "jsType", null);
        setField(term3569699, term3569699.getClass(), "parent", null);
        term3569306 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3569308 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3569310 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3569314 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3569327 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3569306, term3569306.getClass(), "str", null);
        setIntField(term3569306, term3569306.getClass(), "type", 37);
        setField(term3569306, term3569306.getClass(), "next", null);
        setField(term3569308, term3569308.getClass(), "str", null);
        setIntField(term3569308, term3569308.getClass(), "type", 35);
        setDoubleField(term3569310, term3569310.getClass(), "number", 7.0751594329796321E18);
        setIntField(term3569310, term3569310.getClass(), "type", 39);
        setField(term3569310, term3569310.getClass(), "next", null);
        setField(term3569310, term3569310.getClass(), "first", null);
        setField(term3569310, term3569310.getClass(), "last", null);
        setField(term3569310, term3569310.getClass(), "propListHead", null);
        setIntField(term3569310, term3569310.getClass(), "sourcePosition", 0);
        setField(term3569310, term3569310.getClass(), "jsType", null);
        setField(term3569310, term3569310.getClass(), "parent", null);
        setField(term3569308, term3569308.getClass(), "next", term3569310);
        setField(term3569314, term3569314.getClass(), "str", "substring");
        setIntField(term3569314, term3569314.getClass(), "type", 40);
        setField(term3569327, term3569327.getClass(), "str", "");
        setIntField(term3569327, term3569327.getClass(), "type", 40);
        setField(term3569327, term3569327.getClass(), "next", null);
        setField(term3569327, term3569327.getClass(), "first", null);
        setField(term3569327, term3569327.getClass(), "last", null);
        setField(term3569327, term3569327.getClass(), "propListHead", null);
        setIntField(term3569327, term3569327.getClass(), "sourcePosition", 0);
        setField(term3569327, term3569327.getClass(), "jsType", null);
        setField(term3569327, term3569327.getClass(), "parent", null);
        setField(term3569314, term3569314.getClass(), "next", term3569327);
        setField(term3569314, term3569314.getClass(), "first", null);
        setField(term3569314, term3569314.getClass(), "last", null);
        setField(term3569314, term3569314.getClass(), "propListHead", null);
        setIntField(term3569314, term3569314.getClass(), "sourcePosition", 0);
        setField(term3569314, term3569314.getClass(), "jsType", null);
        setField(term3569314, term3569314.getClass(), "parent", null);
        setField(term3569308, term3569308.getClass(), "first", term3569314);
        setField(term3569308, term3569308.getClass(), "last", null);
        setField(term3569308, term3569308.getClass(), "propListHead", null);
        setIntField(term3569308, term3569308.getClass(), "sourcePosition", 0);
        setField(term3569308, term3569308.getClass(), "jsType", null);
        setField(term3569308, term3569308.getClass(), "parent", null);
        setField(term3569306, term3569306.getClass(), "first", term3569308);
        setField(term3569306, term3569306.getClass(), "last", null);
        setField(term3569306, term3569306.getClass(), "propListHead", null);
        setIntField(term3569306, term3569306.getClass(), "sourcePosition", 0);
        setField(term3569306, term3569306.getClass(), "jsType", null);
        setField(term3569306, term3569306.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3568165;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3568073, args);
        assertTrue(recursiveEquals(term3568073, term3569698));
        assertTrue(recursiveEquals(term3568165, term3569699));
        assertTrue(recursiveEquals(retValue, term3569306));
    }

};


