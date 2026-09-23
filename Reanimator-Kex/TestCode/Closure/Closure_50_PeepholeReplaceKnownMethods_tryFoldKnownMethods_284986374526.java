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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3501078;
     Object term3501170;
     Object term3502614;
     Object term3502615;
     Object term3502319;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3501078 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3501170 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3501262 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3501354 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3501446 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3501576 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3501262, term3501262.getClass(), "type", 35);
        setIntField(term3501446, term3501446.getClass(), "type", 40);
        setField(term3501446, term3501446.getClass(), "str", "charCodeAt");
        setField(term3501354, term3501354.getClass(), "next", term3501446);
        setIntField(term3501354, term3501354.getClass(), "type", 40);
        setField(term3501262, term3501262.getClass(), "first", term3501354);
        setIntField(term3501576, term3501576.getClass(), "type", 44);
        setField(term3501262, term3501262.getClass(), "next", term3501576);
        setField(term3501170, term3501170.getClass(), "first", term3501262);
        setIntField(term3501170, term3501170.getClass(), "type", 37);
        term3502614 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3502614, term3502614.getClass(), "currentTraversal", null);
        term3502615 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3502616 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3502617 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3502618 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3502619 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3502615, term3502615.getClass(), "str", null);
        setIntField(term3502615, term3502615.getClass(), "type", 37);
        setField(term3502615, term3502615.getClass(), "next", null);
        setField(term3502616, term3502616.getClass(), "str", null);
        setIntField(term3502616, term3502616.getClass(), "type", 35);
        setField(term3502617, term3502617.getClass(), "str", null);
        setIntField(term3502617, term3502617.getClass(), "type", 44);
        setField(term3502617, term3502617.getClass(), "next", null);
        setField(term3502617, term3502617.getClass(), "first", null);
        setField(term3502617, term3502617.getClass(), "last", null);
        setField(term3502617, term3502617.getClass(), "propListHead", null);
        setIntField(term3502617, term3502617.getClass(), "sourcePosition", 0);
        setField(term3502617, term3502617.getClass(), "jsType", null);
        setField(term3502617, term3502617.getClass(), "parent", null);
        setField(term3502616, term3502616.getClass(), "next", term3502617);
        setField(term3502618, term3502618.getClass(), "str", null);
        setIntField(term3502618, term3502618.getClass(), "type", 40);
        setField(term3502619, term3502619.getClass(), "str", "");
        setIntField(term3502619, term3502619.getClass(), "type", 40);
        setField(term3502619, term3502619.getClass(), "next", null);
        setField(term3502619, term3502619.getClass(), "first", null);
        setField(term3502619, term3502619.getClass(), "last", null);
        setField(term3502619, term3502619.getClass(), "propListHead", null);
        setIntField(term3502619, term3502619.getClass(), "sourcePosition", 0);
        setField(term3502619, term3502619.getClass(), "jsType", null);
        setField(term3502619, term3502619.getClass(), "parent", null);
        setField(term3502618, term3502618.getClass(), "next", term3502619);
        setField(term3502618, term3502618.getClass(), "first", null);
        setField(term3502618, term3502618.getClass(), "last", null);
        setField(term3502618, term3502618.getClass(), "propListHead", null);
        setIntField(term3502618, term3502618.getClass(), "sourcePosition", 0);
        setField(term3502618, term3502618.getClass(), "jsType", null);
        setField(term3502618, term3502618.getClass(), "parent", null);
        setField(term3502616, term3502616.getClass(), "first", term3502618);
        setField(term3502616, term3502616.getClass(), "last", null);
        setField(term3502616, term3502616.getClass(), "propListHead", null);
        setIntField(term3502616, term3502616.getClass(), "sourcePosition", 0);
        setField(term3502616, term3502616.getClass(), "jsType", null);
        setField(term3502616, term3502616.getClass(), "parent", null);
        setField(term3502615, term3502615.getClass(), "first", term3502616);
        setField(term3502615, term3502615.getClass(), "last", null);
        setField(term3502615, term3502615.getClass(), "propListHead", null);
        setIntField(term3502615, term3502615.getClass(), "sourcePosition", 0);
        setField(term3502615, term3502615.getClass(), "jsType", null);
        setField(term3502615, term3502615.getClass(), "parent", null);
        term3502319 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3502321 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3502323 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3502326 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3502328 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3502319, term3502319.getClass(), "str", null);
        setIntField(term3502319, term3502319.getClass(), "type", 37);
        setField(term3502319, term3502319.getClass(), "next", null);
        setField(term3502321, term3502321.getClass(), "str", null);
        setIntField(term3502321, term3502321.getClass(), "type", 35);
        setField(term3502323, term3502323.getClass(), "str", null);
        setIntField(term3502323, term3502323.getClass(), "type", 44);
        setField(term3502323, term3502323.getClass(), "next", null);
        setField(term3502323, term3502323.getClass(), "first", null);
        setField(term3502323, term3502323.getClass(), "last", null);
        setField(term3502323, term3502323.getClass(), "propListHead", null);
        setIntField(term3502323, term3502323.getClass(), "sourcePosition", 0);
        setField(term3502323, term3502323.getClass(), "jsType", null);
        setField(term3502323, term3502323.getClass(), "parent", null);
        setField(term3502321, term3502321.getClass(), "next", term3502323);
        setField(term3502326, term3502326.getClass(), "str", null);
        setIntField(term3502326, term3502326.getClass(), "type", 40);
        setField(term3502328, term3502328.getClass(), "str", "");
        setIntField(term3502328, term3502328.getClass(), "type", 40);
        setField(term3502328, term3502328.getClass(), "next", null);
        setField(term3502328, term3502328.getClass(), "first", null);
        setField(term3502328, term3502328.getClass(), "last", null);
        setField(term3502328, term3502328.getClass(), "propListHead", null);
        setIntField(term3502328, term3502328.getClass(), "sourcePosition", 0);
        setField(term3502328, term3502328.getClass(), "jsType", null);
        setField(term3502328, term3502328.getClass(), "parent", null);
        setField(term3502326, term3502326.getClass(), "next", term3502328);
        setField(term3502326, term3502326.getClass(), "first", null);
        setField(term3502326, term3502326.getClass(), "last", null);
        setField(term3502326, term3502326.getClass(), "propListHead", null);
        setIntField(term3502326, term3502326.getClass(), "sourcePosition", 0);
        setField(term3502326, term3502326.getClass(), "jsType", null);
        setField(term3502326, term3502326.getClass(), "parent", null);
        setField(term3502321, term3502321.getClass(), "first", term3502326);
        setField(term3502321, term3502321.getClass(), "last", null);
        setField(term3502321, term3502321.getClass(), "propListHead", null);
        setIntField(term3502321, term3502321.getClass(), "sourcePosition", 0);
        setField(term3502321, term3502321.getClass(), "jsType", null);
        setField(term3502321, term3502321.getClass(), "parent", null);
        setField(term3502319, term3502319.getClass(), "first", term3502321);
        setField(term3502319, term3502319.getClass(), "last", null);
        setField(term3502319, term3502319.getClass(), "propListHead", null);
        setIntField(term3502319, term3502319.getClass(), "sourcePosition", 0);
        setField(term3502319, term3502319.getClass(), "jsType", null);
        setField(term3502319, term3502319.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3501170;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3501078, args);
        assertTrue(recursiveEquals(term3501078, term3502614));
        assertTrue(recursiveEquals(term3501170, term3502615));
        assertTrue(recursiveEquals(retValue, term3502319));
    }

};


