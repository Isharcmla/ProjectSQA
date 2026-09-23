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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3553954;
     Object term3554046;
     Object term3555136;
     Object term3555137;
     Object term3554965;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3553954 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3554046 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3554138 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3554230 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3554360 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3554138, term3554138.getClass(), "type", 35);
        setField(term3554230, term3554230.getClass(), "next", term3554230);
        setIntField(term3554230, term3554230.getClass(), "type", 40);
        setField(term3554230, term3554230.getClass(), "str", "");
        setField(term3554138, term3554138.getClass(), "first", term3554230);
        setIntField(term3554360, term3554360.getClass(), "type", 40);
        setField(term3554138, term3554138.getClass(), "next", term3554360);
        setField(term3554046, term3554046.getClass(), "first", term3554138);
        setIntField(term3554046, term3554046.getClass(), "type", 37);
        term3555136 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3555136, term3555136.getClass(), "currentTraversal", null);
        term3555137 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3555138 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3555139 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3555140 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3555137, term3555137.getClass(), "str", null);
        setIntField(term3555137, term3555137.getClass(), "type", 37);
        setField(term3555137, term3555137.getClass(), "next", null);
        setField(term3555138, term3555138.getClass(), "str", null);
        setIntField(term3555138, term3555138.getClass(), "type", 35);
        setDoubleField(term3555139, term3555139.getClass(), "number", 0.0);
        setIntField(term3555139, term3555139.getClass(), "type", 40);
        setField(term3555139, term3555139.getClass(), "next", null);
        setField(term3555139, term3555139.getClass(), "first", null);
        setField(term3555139, term3555139.getClass(), "last", null);
        setField(term3555139, term3555139.getClass(), "propListHead", null);
        setIntField(term3555139, term3555139.getClass(), "sourcePosition", 0);
        setField(term3555139, term3555139.getClass(), "jsType", null);
        setField(term3555139, term3555139.getClass(), "parent", null);
        setField(term3555138, term3555138.getClass(), "next", term3555139);
        setField(term3555140, term3555140.getClass(), "str", "");
        setIntField(term3555140, term3555140.getClass(), "type", 40);
        setField(term3555140, term3555140.getClass(), "next", term3555140);
        setField(term3555140, term3555140.getClass(), "first", null);
        setField(term3555140, term3555140.getClass(), "last", null);
        setField(term3555140, term3555140.getClass(), "propListHead", null);
        setIntField(term3555140, term3555140.getClass(), "sourcePosition", 0);
        setField(term3555140, term3555140.getClass(), "jsType", null);
        setField(term3555140, term3555140.getClass(), "parent", null);
        setField(term3555138, term3555138.getClass(), "first", term3555140);
        setField(term3555138, term3555138.getClass(), "last", null);
        setField(term3555138, term3555138.getClass(), "propListHead", null);
        setIntField(term3555138, term3555138.getClass(), "sourcePosition", 0);
        setField(term3555138, term3555138.getClass(), "jsType", null);
        setField(term3555138, term3555138.getClass(), "parent", null);
        setField(term3555137, term3555137.getClass(), "first", term3555138);
        setField(term3555137, term3555137.getClass(), "last", null);
        setField(term3555137, term3555137.getClass(), "propListHead", null);
        setIntField(term3555137, term3555137.getClass(), "sourcePosition", 0);
        setField(term3555137, term3555137.getClass(), "jsType", null);
        setField(term3555137, term3555137.getClass(), "parent", null);
        term3554965 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3554967 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3554969 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3554973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3554965, term3554965.getClass(), "str", null);
        setIntField(term3554965, term3554965.getClass(), "type", 37);
        setField(term3554965, term3554965.getClass(), "next", null);
        setField(term3554967, term3554967.getClass(), "str", null);
        setIntField(term3554967, term3554967.getClass(), "type", 35);
        setDoubleField(term3554969, term3554969.getClass(), "number", 0.0);
        setIntField(term3554969, term3554969.getClass(), "type", 40);
        setField(term3554969, term3554969.getClass(), "next", null);
        setField(term3554969, term3554969.getClass(), "first", null);
        setField(term3554969, term3554969.getClass(), "last", null);
        setField(term3554969, term3554969.getClass(), "propListHead", null);
        setIntField(term3554969, term3554969.getClass(), "sourcePosition", 0);
        setField(term3554969, term3554969.getClass(), "jsType", null);
        setField(term3554969, term3554969.getClass(), "parent", null);
        setField(term3554967, term3554967.getClass(), "next", term3554969);
        setField(term3554973, term3554973.getClass(), "str", "");
        setIntField(term3554973, term3554973.getClass(), "type", 40);
        setField(term3554973, term3554973.getClass(), "next", term3554973);
        setField(term3554973, term3554973.getClass(), "first", null);
        setField(term3554973, term3554973.getClass(), "last", null);
        setField(term3554973, term3554973.getClass(), "propListHead", null);
        setIntField(term3554973, term3554973.getClass(), "sourcePosition", 0);
        setField(term3554973, term3554973.getClass(), "jsType", null);
        setField(term3554973, term3554973.getClass(), "parent", null);
        setField(term3554967, term3554967.getClass(), "first", term3554973);
        setField(term3554967, term3554967.getClass(), "last", null);
        setField(term3554967, term3554967.getClass(), "propListHead", null);
        setIntField(term3554967, term3554967.getClass(), "sourcePosition", 0);
        setField(term3554967, term3554967.getClass(), "jsType", null);
        setField(term3554967, term3554967.getClass(), "parent", null);
        setField(term3554965, term3554965.getClass(), "first", term3554967);
        setField(term3554965, term3554965.getClass(), "last", null);
        setField(term3554965, term3554965.getClass(), "propListHead", null);
        setIntField(term3554965, term3554965.getClass(), "sourcePosition", 0);
        setField(term3554965, term3554965.getClass(), "jsType", null);
        setField(term3554965, term3554965.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3554046;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3553954, args);
        assertTrue(recursiveEquals(term3553954, term3555136));
        assertTrue(recursiveEquals(term3554046, term3555137));
        assertTrue(recursiveEquals(retValue, term3554965));
    }

};


