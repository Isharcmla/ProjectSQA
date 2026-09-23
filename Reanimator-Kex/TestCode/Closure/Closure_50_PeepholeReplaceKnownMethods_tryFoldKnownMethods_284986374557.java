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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3520348;
     Object term3520440;
     Object term3522730;
     Object term3522731;
     Object term3522532;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3520348 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3520440 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3520532 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3520624 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3520716 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3520846 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3520532, term3520532.getClass(), "type", 35);
        setIntField(term3520716, term3520716.getClass(), "type", 40);
        setField(term3520716, term3520716.getClass(), "str", "");
        setField(term3520624, term3520624.getClass(), "next", term3520716);
        setIntField(term3520624, term3520624.getClass(), "type", 40);
        setField(term3520532, term3520532.getClass(), "first", term3520624);
        setIntField(term3520846, term3520846.getClass(), "type", 44);
        setField(term3520532, term3520532.getClass(), "next", term3520846);
        setField(term3520440, term3520440.getClass(), "first", term3520532);
        setIntField(term3520440, term3520440.getClass(), "type", 37);
        term3522730 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3522730, term3522730.getClass(), "currentTraversal", null);
        term3522731 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3522732 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3522733 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3522734 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3522735 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3522731, term3522731.getClass(), "str", null);
        setIntField(term3522731, term3522731.getClass(), "type", 37);
        setField(term3522731, term3522731.getClass(), "next", null);
        setField(term3522732, term3522732.getClass(), "str", null);
        setIntField(term3522732, term3522732.getClass(), "type", 35);
        setDoubleField(term3522733, term3522733.getClass(), "number", 0.0);
        setIntField(term3522733, term3522733.getClass(), "type", 44);
        setField(term3522733, term3522733.getClass(), "next", null);
        setField(term3522733, term3522733.getClass(), "first", null);
        setField(term3522733, term3522733.getClass(), "last", null);
        setField(term3522733, term3522733.getClass(), "propListHead", null);
        setIntField(term3522733, term3522733.getClass(), "sourcePosition", 0);
        setField(term3522733, term3522733.getClass(), "jsType", null);
        setField(term3522733, term3522733.getClass(), "parent", null);
        setField(term3522732, term3522732.getClass(), "next", term3522733);
        setField(term3522734, term3522734.getClass(), "str", null);
        setIntField(term3522734, term3522734.getClass(), "type", 40);
        setField(term3522735, term3522735.getClass(), "str", "");
        setIntField(term3522735, term3522735.getClass(), "type", 40);
        setField(term3522735, term3522735.getClass(), "next", null);
        setField(term3522735, term3522735.getClass(), "first", null);
        setField(term3522735, term3522735.getClass(), "last", null);
        setField(term3522735, term3522735.getClass(), "propListHead", null);
        setIntField(term3522735, term3522735.getClass(), "sourcePosition", 0);
        setField(term3522735, term3522735.getClass(), "jsType", null);
        setField(term3522735, term3522735.getClass(), "parent", null);
        setField(term3522734, term3522734.getClass(), "next", term3522735);
        setField(term3522734, term3522734.getClass(), "first", null);
        setField(term3522734, term3522734.getClass(), "last", null);
        setField(term3522734, term3522734.getClass(), "propListHead", null);
        setIntField(term3522734, term3522734.getClass(), "sourcePosition", 0);
        setField(term3522734, term3522734.getClass(), "jsType", null);
        setField(term3522734, term3522734.getClass(), "parent", null);
        setField(term3522732, term3522732.getClass(), "first", term3522734);
        setField(term3522732, term3522732.getClass(), "last", null);
        setField(term3522732, term3522732.getClass(), "propListHead", null);
        setIntField(term3522732, term3522732.getClass(), "sourcePosition", 0);
        setField(term3522732, term3522732.getClass(), "jsType", null);
        setField(term3522732, term3522732.getClass(), "parent", null);
        setField(term3522731, term3522731.getClass(), "first", term3522732);
        setField(term3522731, term3522731.getClass(), "last", null);
        setField(term3522731, term3522731.getClass(), "propListHead", null);
        setIntField(term3522731, term3522731.getClass(), "sourcePosition", 0);
        setField(term3522731, term3522731.getClass(), "jsType", null);
        setField(term3522731, term3522731.getClass(), "parent", null);
        term3522532 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3522534 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3522536 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3522540 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3522542 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3522532, term3522532.getClass(), "str", null);
        setIntField(term3522532, term3522532.getClass(), "type", 37);
        setField(term3522532, term3522532.getClass(), "next", null);
        setField(term3522534, term3522534.getClass(), "str", null);
        setIntField(term3522534, term3522534.getClass(), "type", 35);
        setDoubleField(term3522536, term3522536.getClass(), "number", 0.0);
        setIntField(term3522536, term3522536.getClass(), "type", 44);
        setField(term3522536, term3522536.getClass(), "next", null);
        setField(term3522536, term3522536.getClass(), "first", null);
        setField(term3522536, term3522536.getClass(), "last", null);
        setField(term3522536, term3522536.getClass(), "propListHead", null);
        setIntField(term3522536, term3522536.getClass(), "sourcePosition", 0);
        setField(term3522536, term3522536.getClass(), "jsType", null);
        setField(term3522536, term3522536.getClass(), "parent", null);
        setField(term3522534, term3522534.getClass(), "next", term3522536);
        setField(term3522540, term3522540.getClass(), "str", null);
        setIntField(term3522540, term3522540.getClass(), "type", 40);
        setField(term3522542, term3522542.getClass(), "str", "");
        setIntField(term3522542, term3522542.getClass(), "type", 40);
        setField(term3522542, term3522542.getClass(), "next", null);
        setField(term3522542, term3522542.getClass(), "first", null);
        setField(term3522542, term3522542.getClass(), "last", null);
        setField(term3522542, term3522542.getClass(), "propListHead", null);
        setIntField(term3522542, term3522542.getClass(), "sourcePosition", 0);
        setField(term3522542, term3522542.getClass(), "jsType", null);
        setField(term3522542, term3522542.getClass(), "parent", null);
        setField(term3522540, term3522540.getClass(), "next", term3522542);
        setField(term3522540, term3522540.getClass(), "first", null);
        setField(term3522540, term3522540.getClass(), "last", null);
        setField(term3522540, term3522540.getClass(), "propListHead", null);
        setIntField(term3522540, term3522540.getClass(), "sourcePosition", 0);
        setField(term3522540, term3522540.getClass(), "jsType", null);
        setField(term3522540, term3522540.getClass(), "parent", null);
        setField(term3522534, term3522534.getClass(), "first", term3522540);
        setField(term3522534, term3522534.getClass(), "last", null);
        setField(term3522534, term3522534.getClass(), "propListHead", null);
        setIntField(term3522534, term3522534.getClass(), "sourcePosition", 0);
        setField(term3522534, term3522534.getClass(), "jsType", null);
        setField(term3522534, term3522534.getClass(), "parent", null);
        setField(term3522532, term3522532.getClass(), "first", term3522534);
        setField(term3522532, term3522532.getClass(), "last", null);
        setField(term3522532, term3522532.getClass(), "propListHead", null);
        setIntField(term3522532, term3522532.getClass(), "sourcePosition", 0);
        setField(term3522532, term3522532.getClass(), "jsType", null);
        setField(term3522532, term3522532.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3520440;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3520348, args);
        assertTrue(recursiveEquals(term3520348, term3522730));
        assertTrue(recursiveEquals(term3520440, term3522731));
        assertTrue(recursiveEquals(retValue, term3522532));
    }

};


