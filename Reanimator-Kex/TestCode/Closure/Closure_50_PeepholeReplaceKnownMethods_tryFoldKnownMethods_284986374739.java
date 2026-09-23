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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3636018;
     Object term3636110;
     Object term3638601;
     Object term3638602;
     Object term3638297;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3636018 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3636110 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3636202 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3636294 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3636386 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3636516 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3636202, term3636202.getClass(), "type", 35);
        setIntField(term3636386, term3636386.getClass(), "type", 40);
        setField(term3636386, term3636386.getClass(), "str", "charCodeAt");
        setField(term3636294, term3636294.getClass(), "next", term3636386);
        setIntField(term3636294, term3636294.getClass(), "type", 40);
        setField(term3636202, term3636202.getClass(), "first", term3636294);
        setIntField(term3636516, term3636516.getClass(), "type", 40);
        setField(term3636202, term3636202.getClass(), "next", term3636516);
        setField(term3636110, term3636110.getClass(), "first", term3636202);
        setIntField(term3636110, term3636110.getClass(), "type", 37);
        term3638601 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3638601, term3638601.getClass(), "currentTraversal", null);
        term3638602 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3638603 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3638604 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3638605 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3638606 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3638602, term3638602.getClass(), "str", null);
        setIntField(term3638602, term3638602.getClass(), "type", 37);
        setField(term3638602, term3638602.getClass(), "next", null);
        setField(term3638603, term3638603.getClass(), "str", null);
        setIntField(term3638603, term3638603.getClass(), "type", 35);
        setDoubleField(term3638604, term3638604.getClass(), "number", 0.0);
        setIntField(term3638604, term3638604.getClass(), "type", 40);
        setField(term3638604, term3638604.getClass(), "next", null);
        setField(term3638604, term3638604.getClass(), "first", null);
        setField(term3638604, term3638604.getClass(), "last", null);
        setField(term3638604, term3638604.getClass(), "propListHead", null);
        setIntField(term3638604, term3638604.getClass(), "sourcePosition", 0);
        setField(term3638604, term3638604.getClass(), "jsType", null);
        setField(term3638604, term3638604.getClass(), "parent", null);
        setField(term3638603, term3638603.getClass(), "next", term3638604);
        setField(term3638605, term3638605.getClass(), "str", null);
        setIntField(term3638605, term3638605.getClass(), "type", 40);
        setField(term3638606, term3638606.getClass(), "str", "");
        setIntField(term3638606, term3638606.getClass(), "type", 40);
        setField(term3638606, term3638606.getClass(), "next", null);
        setField(term3638606, term3638606.getClass(), "first", null);
        setField(term3638606, term3638606.getClass(), "last", null);
        setField(term3638606, term3638606.getClass(), "propListHead", null);
        setIntField(term3638606, term3638606.getClass(), "sourcePosition", 0);
        setField(term3638606, term3638606.getClass(), "jsType", null);
        setField(term3638606, term3638606.getClass(), "parent", null);
        setField(term3638605, term3638605.getClass(), "next", term3638606);
        setField(term3638605, term3638605.getClass(), "first", null);
        setField(term3638605, term3638605.getClass(), "last", null);
        setField(term3638605, term3638605.getClass(), "propListHead", null);
        setIntField(term3638605, term3638605.getClass(), "sourcePosition", 0);
        setField(term3638605, term3638605.getClass(), "jsType", null);
        setField(term3638605, term3638605.getClass(), "parent", null);
        setField(term3638603, term3638603.getClass(), "first", term3638605);
        setField(term3638603, term3638603.getClass(), "last", null);
        setField(term3638603, term3638603.getClass(), "propListHead", null);
        setIntField(term3638603, term3638603.getClass(), "sourcePosition", 0);
        setField(term3638603, term3638603.getClass(), "jsType", null);
        setField(term3638603, term3638603.getClass(), "parent", null);
        setField(term3638602, term3638602.getClass(), "first", term3638603);
        setField(term3638602, term3638602.getClass(), "last", null);
        setField(term3638602, term3638602.getClass(), "propListHead", null);
        setIntField(term3638602, term3638602.getClass(), "sourcePosition", 0);
        setField(term3638602, term3638602.getClass(), "jsType", null);
        setField(term3638602, term3638602.getClass(), "parent", null);
        term3638297 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3638299 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3638301 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3638305 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3638307 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3638297, term3638297.getClass(), "str", null);
        setIntField(term3638297, term3638297.getClass(), "type", 37);
        setField(term3638297, term3638297.getClass(), "next", null);
        setField(term3638299, term3638299.getClass(), "str", null);
        setIntField(term3638299, term3638299.getClass(), "type", 35);
        setDoubleField(term3638301, term3638301.getClass(), "number", 0.0);
        setIntField(term3638301, term3638301.getClass(), "type", 40);
        setField(term3638301, term3638301.getClass(), "next", null);
        setField(term3638301, term3638301.getClass(), "first", null);
        setField(term3638301, term3638301.getClass(), "last", null);
        setField(term3638301, term3638301.getClass(), "propListHead", null);
        setIntField(term3638301, term3638301.getClass(), "sourcePosition", 0);
        setField(term3638301, term3638301.getClass(), "jsType", null);
        setField(term3638301, term3638301.getClass(), "parent", null);
        setField(term3638299, term3638299.getClass(), "next", term3638301);
        setField(term3638305, term3638305.getClass(), "str", null);
        setIntField(term3638305, term3638305.getClass(), "type", 40);
        setField(term3638307, term3638307.getClass(), "str", "");
        setIntField(term3638307, term3638307.getClass(), "type", 40);
        setField(term3638307, term3638307.getClass(), "next", null);
        setField(term3638307, term3638307.getClass(), "first", null);
        setField(term3638307, term3638307.getClass(), "last", null);
        setField(term3638307, term3638307.getClass(), "propListHead", null);
        setIntField(term3638307, term3638307.getClass(), "sourcePosition", 0);
        setField(term3638307, term3638307.getClass(), "jsType", null);
        setField(term3638307, term3638307.getClass(), "parent", null);
        setField(term3638305, term3638305.getClass(), "next", term3638307);
        setField(term3638305, term3638305.getClass(), "first", null);
        setField(term3638305, term3638305.getClass(), "last", null);
        setField(term3638305, term3638305.getClass(), "propListHead", null);
        setIntField(term3638305, term3638305.getClass(), "sourcePosition", 0);
        setField(term3638305, term3638305.getClass(), "jsType", null);
        setField(term3638305, term3638305.getClass(), "parent", null);
        setField(term3638299, term3638299.getClass(), "first", term3638305);
        setField(term3638299, term3638299.getClass(), "last", null);
        setField(term3638299, term3638299.getClass(), "propListHead", null);
        setIntField(term3638299, term3638299.getClass(), "sourcePosition", 0);
        setField(term3638299, term3638299.getClass(), "jsType", null);
        setField(term3638299, term3638299.getClass(), "parent", null);
        setField(term3638297, term3638297.getClass(), "first", term3638299);
        setField(term3638297, term3638297.getClass(), "last", null);
        setField(term3638297, term3638297.getClass(), "propListHead", null);
        setIntField(term3638297, term3638297.getClass(), "sourcePosition", 0);
        setField(term3638297, term3638297.getClass(), "jsType", null);
        setField(term3638297, term3638297.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3636110;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3636018, args);
        assertTrue(recursiveEquals(term3636018, term3638601));
        assertTrue(recursiveEquals(term3636110, term3638602));
        assertTrue(recursiveEquals(retValue, term3638297));
    }

};


