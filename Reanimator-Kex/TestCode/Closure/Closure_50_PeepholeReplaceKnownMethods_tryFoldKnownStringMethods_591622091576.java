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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3533796;
     Object term3533888;
     Object term3534387;
     Object term3534388;
     Object term3534286;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3533796 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3533888 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3533980 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3534072 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3534164 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3534272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3533888, term3533888.getClass(), "type", 37);
        setIntField(term3533980, term3533980.getClass(), "type", 35);
        setIntField(term3534164, term3534164.getClass(), "type", 40);
        setField(term3534164, term3534164.getClass(), "str", "");
        setField(term3534072, term3534072.getClass(), "next", term3534164);
        setIntField(term3534072, term3534072.getClass(), "type", 40);
        setField(term3533980, term3533980.getClass(), "first", term3534072);
        setIntField(term3534272, term3534272.getClass(), "type", 40);
        setField(term3533980, term3533980.getClass(), "next", term3534272);
        setField(term3533888, term3533888.getClass(), "first", term3533980);
        term3534387 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3534387, term3534387.getClass(), "currentTraversal", null);
        term3534388 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3534389 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3534390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3534391 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3534392 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term3534388, term3534388.getClass(), "number", 0.0);
        setIntField(term3534388, term3534388.getClass(), "type", 37);
        setField(term3534388, term3534388.getClass(), "next", null);
        setField(term3534389, term3534389.getClass(), "str", null);
        setIntField(term3534389, term3534389.getClass(), "type", 35);
        setIntField(term3534390, term3534390.getClass(), "type", 40);
        setField(term3534390, term3534390.getClass(), "next", null);
        setField(term3534390, term3534390.getClass(), "first", null);
        setField(term3534390, term3534390.getClass(), "last", null);
        setField(term3534390, term3534390.getClass(), "propListHead", null);
        setIntField(term3534390, term3534390.getClass(), "sourcePosition", 0);
        setField(term3534390, term3534390.getClass(), "jsType", null);
        setField(term3534390, term3534390.getClass(), "parent", null);
        setField(term3534389, term3534389.getClass(), "next", term3534390);
        setField(term3534391, term3534391.getClass(), "str", null);
        setIntField(term3534391, term3534391.getClass(), "type", 40);
        setField(term3534392, term3534392.getClass(), "str", "");
        setIntField(term3534392, term3534392.getClass(), "type", 40);
        setField(term3534392, term3534392.getClass(), "next", null);
        setField(term3534392, term3534392.getClass(), "first", null);
        setField(term3534392, term3534392.getClass(), "last", null);
        setField(term3534392, term3534392.getClass(), "propListHead", null);
        setIntField(term3534392, term3534392.getClass(), "sourcePosition", 0);
        setField(term3534392, term3534392.getClass(), "jsType", null);
        setField(term3534392, term3534392.getClass(), "parent", null);
        setField(term3534391, term3534391.getClass(), "next", term3534392);
        setField(term3534391, term3534391.getClass(), "first", null);
        setField(term3534391, term3534391.getClass(), "last", null);
        setField(term3534391, term3534391.getClass(), "propListHead", null);
        setIntField(term3534391, term3534391.getClass(), "sourcePosition", 0);
        setField(term3534391, term3534391.getClass(), "jsType", null);
        setField(term3534391, term3534391.getClass(), "parent", null);
        setField(term3534389, term3534389.getClass(), "first", term3534391);
        setField(term3534389, term3534389.getClass(), "last", null);
        setField(term3534389, term3534389.getClass(), "propListHead", null);
        setIntField(term3534389, term3534389.getClass(), "sourcePosition", 0);
        setField(term3534389, term3534389.getClass(), "jsType", null);
        setField(term3534389, term3534389.getClass(), "parent", null);
        setField(term3534388, term3534388.getClass(), "first", term3534389);
        setField(term3534388, term3534388.getClass(), "last", null);
        setField(term3534388, term3534388.getClass(), "propListHead", null);
        setIntField(term3534388, term3534388.getClass(), "sourcePosition", 0);
        setField(term3534388, term3534388.getClass(), "jsType", null);
        setField(term3534388, term3534388.getClass(), "parent", null);
        term3534286 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3534289 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3534291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3534294 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3534296 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term3534286, term3534286.getClass(), "number", 0.0);
        setIntField(term3534286, term3534286.getClass(), "type", 37);
        setField(term3534286, term3534286.getClass(), "next", null);
        setField(term3534289, term3534289.getClass(), "str", null);
        setIntField(term3534289, term3534289.getClass(), "type", 35);
        setIntField(term3534291, term3534291.getClass(), "type", 40);
        setField(term3534291, term3534291.getClass(), "next", null);
        setField(term3534291, term3534291.getClass(), "first", null);
        setField(term3534291, term3534291.getClass(), "last", null);
        setField(term3534291, term3534291.getClass(), "propListHead", null);
        setIntField(term3534291, term3534291.getClass(), "sourcePosition", 0);
        setField(term3534291, term3534291.getClass(), "jsType", null);
        setField(term3534291, term3534291.getClass(), "parent", null);
        setField(term3534289, term3534289.getClass(), "next", term3534291);
        setField(term3534294, term3534294.getClass(), "str", null);
        setIntField(term3534294, term3534294.getClass(), "type", 40);
        setField(term3534296, term3534296.getClass(), "str", "");
        setIntField(term3534296, term3534296.getClass(), "type", 40);
        setField(term3534296, term3534296.getClass(), "next", null);
        setField(term3534296, term3534296.getClass(), "first", null);
        setField(term3534296, term3534296.getClass(), "last", null);
        setField(term3534296, term3534296.getClass(), "propListHead", null);
        setIntField(term3534296, term3534296.getClass(), "sourcePosition", 0);
        setField(term3534296, term3534296.getClass(), "jsType", null);
        setField(term3534296, term3534296.getClass(), "parent", null);
        setField(term3534294, term3534294.getClass(), "next", term3534296);
        setField(term3534294, term3534294.getClass(), "first", null);
        setField(term3534294, term3534294.getClass(), "last", null);
        setField(term3534294, term3534294.getClass(), "propListHead", null);
        setIntField(term3534294, term3534294.getClass(), "sourcePosition", 0);
        setField(term3534294, term3534294.getClass(), "jsType", null);
        setField(term3534294, term3534294.getClass(), "parent", null);
        setField(term3534289, term3534289.getClass(), "first", term3534294);
        setField(term3534289, term3534289.getClass(), "last", null);
        setField(term3534289, term3534289.getClass(), "propListHead", null);
        setIntField(term3534289, term3534289.getClass(), "sourcePosition", 0);
        setField(term3534289, term3534289.getClass(), "jsType", null);
        setField(term3534289, term3534289.getClass(), "parent", null);
        setField(term3534286, term3534286.getClass(), "first", term3534289);
        setField(term3534286, term3534286.getClass(), "last", null);
        setField(term3534286, term3534286.getClass(), "propListHead", null);
        setIntField(term3534286, term3534286.getClass(), "sourcePosition", 0);
        setField(term3534286, term3534286.getClass(), "jsType", null);
        setField(term3534286, term3534286.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3533888;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3533796, args);
        assertTrue(recursiveEquals(term3533796, term3534387));
        assertTrue(recursiveEquals(term3533888, term3534388));
        assertTrue(recursiveEquals(retValue, term3534286));
    }

};


