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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4854902;
     Object term4854994;
     Object term4855754;
     Object term4855755;
     Object term4855430;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4854902 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4854994 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4855086 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4855178 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4855270 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4855400 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4855086, term4855086.getClass(), "type", 35);
        setIntField(term4855270, term4855270.getClass(), "type", 40);
        setField(term4855270, term4855270.getClass(), "str", "indexOf");
        setField(term4855178, term4855178.getClass(), "next", term4855270);
        setIntField(term4855178, term4855178.getClass(), "type", 40);
        setField(term4855178, term4855178.getClass(), "str", null);
        setField(term4855086, term4855086.getClass(), "first", term4855178);
        setIntField(term4855400, term4855400.getClass(), "type", 44);
        setField(term4855400, term4855400.getClass(), "next", term4855270);
        setField(term4855086, term4855086.getClass(), "next", term4855400);
        setField(term4854994, term4854994.getClass(), "first", term4855086);
        setIntField(term4854994, term4854994.getClass(), "type", 37);
        term4855754 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4855754, term4855754.getClass(), "currentTraversal", null);
        term4855755 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4855756 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4855757 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4855758 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4855760 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4855755, term4855755.getClass(), "str", null);
        setIntField(term4855755, term4855755.getClass(), "type", 37);
        setField(term4855755, term4855755.getClass(), "next", null);
        setField(term4855756, term4855756.getClass(), "str", null);
        setIntField(term4855756, term4855756.getClass(), "type", 35);
        setDoubleField(term4855757, term4855757.getClass(), "number", 0.0);
        setIntField(term4855757, term4855757.getClass(), "type", 44);
        setField(term4855758, term4855758.getClass(), "str", "");
        setIntField(term4855758, term4855758.getClass(), "type", 40);
        setField(term4855758, term4855758.getClass(), "next", null);
        setField(term4855758, term4855758.getClass(), "first", null);
        setField(term4855758, term4855758.getClass(), "last", null);
        setField(term4855758, term4855758.getClass(), "propListHead", null);
        setIntField(term4855758, term4855758.getClass(), "sourcePosition", 0);
        setField(term4855758, term4855758.getClass(), "jsType", null);
        setField(term4855758, term4855758.getClass(), "parent", null);
        setField(term4855757, term4855757.getClass(), "next", term4855758);
        setField(term4855757, term4855757.getClass(), "first", null);
        setField(term4855757, term4855757.getClass(), "last", null);
        setField(term4855757, term4855757.getClass(), "propListHead", null);
        setIntField(term4855757, term4855757.getClass(), "sourcePosition", 0);
        setField(term4855757, term4855757.getClass(), "jsType", null);
        setField(term4855757, term4855757.getClass(), "parent", null);
        setField(term4855756, term4855756.getClass(), "next", term4855757);
        setField(term4855760, term4855760.getClass(), "str", null);
        setIntField(term4855760, term4855760.getClass(), "type", 40);
        setField(term4855760, term4855760.getClass(), "next", term4855758);
        setField(term4855760, term4855760.getClass(), "first", null);
        setField(term4855760, term4855760.getClass(), "last", null);
        setField(term4855760, term4855760.getClass(), "propListHead", null);
        setIntField(term4855760, term4855760.getClass(), "sourcePosition", 0);
        setField(term4855760, term4855760.getClass(), "jsType", null);
        setField(term4855760, term4855760.getClass(), "parent", null);
        setField(term4855756, term4855756.getClass(), "first", term4855760);
        setField(term4855756, term4855756.getClass(), "last", null);
        setField(term4855756, term4855756.getClass(), "propListHead", null);
        setIntField(term4855756, term4855756.getClass(), "sourcePosition", 0);
        setField(term4855756, term4855756.getClass(), "jsType", null);
        setField(term4855756, term4855756.getClass(), "parent", null);
        setField(term4855755, term4855755.getClass(), "first", term4855756);
        setField(term4855755, term4855755.getClass(), "last", null);
        setField(term4855755, term4855755.getClass(), "propListHead", null);
        setIntField(term4855755, term4855755.getClass(), "sourcePosition", 0);
        setField(term4855755, term4855755.getClass(), "jsType", null);
        setField(term4855755, term4855755.getClass(), "parent", null);
        term4855430 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4855432 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4855434 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4855437 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4855442 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4855430, term4855430.getClass(), "str", null);
        setIntField(term4855430, term4855430.getClass(), "type", 37);
        setField(term4855430, term4855430.getClass(), "next", null);
        setField(term4855432, term4855432.getClass(), "str", null);
        setIntField(term4855432, term4855432.getClass(), "type", 35);
        setDoubleField(term4855434, term4855434.getClass(), "number", 0.0);
        setIntField(term4855434, term4855434.getClass(), "type", 44);
        setField(term4855437, term4855437.getClass(), "str", "");
        setIntField(term4855437, term4855437.getClass(), "type", 40);
        setField(term4855437, term4855437.getClass(), "next", null);
        setField(term4855437, term4855437.getClass(), "first", null);
        setField(term4855437, term4855437.getClass(), "last", null);
        setField(term4855437, term4855437.getClass(), "propListHead", null);
        setIntField(term4855437, term4855437.getClass(), "sourcePosition", 0);
        setField(term4855437, term4855437.getClass(), "jsType", null);
        setField(term4855437, term4855437.getClass(), "parent", null);
        setField(term4855434, term4855434.getClass(), "next", term4855437);
        setField(term4855434, term4855434.getClass(), "first", null);
        setField(term4855434, term4855434.getClass(), "last", null);
        setField(term4855434, term4855434.getClass(), "propListHead", null);
        setIntField(term4855434, term4855434.getClass(), "sourcePosition", 0);
        setField(term4855434, term4855434.getClass(), "jsType", null);
        setField(term4855434, term4855434.getClass(), "parent", null);
        setField(term4855432, term4855432.getClass(), "next", term4855434);
        setField(term4855442, term4855442.getClass(), "str", null);
        setIntField(term4855442, term4855442.getClass(), "type", 40);
        setField(term4855442, term4855442.getClass(), "next", term4855437);
        setField(term4855442, term4855442.getClass(), "first", null);
        setField(term4855442, term4855442.getClass(), "last", null);
        setField(term4855442, term4855442.getClass(), "propListHead", null);
        setIntField(term4855442, term4855442.getClass(), "sourcePosition", 0);
        setField(term4855442, term4855442.getClass(), "jsType", null);
        setField(term4855442, term4855442.getClass(), "parent", null);
        setField(term4855432, term4855432.getClass(), "first", term4855442);
        setField(term4855432, term4855432.getClass(), "last", null);
        setField(term4855432, term4855432.getClass(), "propListHead", null);
        setIntField(term4855432, term4855432.getClass(), "sourcePosition", 0);
        setField(term4855432, term4855432.getClass(), "jsType", null);
        setField(term4855432, term4855432.getClass(), "parent", null);
        setField(term4855430, term4855430.getClass(), "first", term4855432);
        setField(term4855430, term4855430.getClass(), "last", null);
        setField(term4855430, term4855430.getClass(), "propListHead", null);
        setIntField(term4855430, term4855430.getClass(), "sourcePosition", 0);
        setField(term4855430, term4855430.getClass(), "jsType", null);
        setField(term4855430, term4855430.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4854994;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4854902, args);
        assertTrue(recursiveEquals(term4854902, term4855754));
        assertTrue(recursiveEquals(term4854994, term4855755));
        assertTrue(recursiveEquals(retValue, term4855430));
    }

};


